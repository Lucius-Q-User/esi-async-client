import sys
import os
import re
import json
from pathlib import Path

myDir = os.path.dirname(os.path.abspath(__file__))
generateIn = "."
for i in range(len(sys.argv)):
   if sys.argv[i] == "-o" or sys.argv[i] == "--output":
      generateIn = sys.argv[i + 1]
   elif sys.argv[i].startswith("--output="):
      generateIn = sys.argv[i][9:]
os.makedirs(generateIn, exist_ok=True)
os.chdir(generateIn)
def shouldUpdate():
   try:
      tstamp = os.path.getmtime("timestamp.gen")
      return any(os.path.getmtime(os.path.join(myDir, x)) > tstamp for x in os.listdir(myDir));
   except:
      return True
if not shouldUpdate():
   exit(0)
try:
   from mako import exceptions
   from mako.template import Template
except:
   print("Unable to import mako; exiting")
   exit(0)


apiClientTemplate = Template(filename=os.path.join(myDir, "ApiClient.java.mako"))
swg = json.loads(open(os.path.join(myDir, "swagger.json")).read())
apiObjectTemplate = Template(filename=os.path.join(myDir, "ApiObject.java.mako"))
apiObjectItfTemplate = Template(filename=os.path.join(myDir, "ApiObjectItf.java.mako"))
stringEnumTemplate = Template(filename=os.path.join(myDir, "StringEnumTemplate.java.mako"))
parameterObjectTemplate = Template(filename=os.path.join(myDir, "RequestObject.java.mako"))
parameterRefs = {}

for parameter in swg["parameters"]:
   parameterRefs["#/parameters/" + parameter] = swg["parameters"][parameter]

def first_lower(s):
   if len(s) == 0:
      return s
   else:
      return s[0].lower() + s[1:]

def first_upper(s):
   if len(s) == 0:
      return s
   else:
      return s[0].upper() + s[1:]

def toLcaseJava(strn):
   return first_lower(toUcaseJava(strn))
def toUcaseJava(strn):
   return "".join(first_upper(i) for i in re.split("[_-]", strn))
tags = {}
for path in swg["paths"]:
   for method in swg["paths"][path]:
      tag = (swg["paths"][path][method]["tags"][0].replace(" ", ""))
      if tag not in tags:
         tags[tag] = []
      if path not in tags[tag]:
         tags[tag].append(path)
def retTypeKind(path, method):
   rtypes = swg["paths"][path][method]["responses"]
   for code, rtype in rtypes.items():
      code = int(code)
      if code // 100 != 2:
         continue
      if code == 204:
         return "else"
      if rtype["schema"]["type"] == "object":
         return "object"
      if rtype["schema"]["type"] == "array" and rtype["schema"]["items"]["type"] == "object":
         return "object[]"
      return "else"
def getReturnTypeName(path, method):
   rtypes = swg["paths"][path][method]["responses"]
   for code, rtype in rtypes.items():
      code = int(code)
      if code // 100 != 2:
         continue
      if code == 204:
         return "Void"
      if rtype["schema"]["type"] == "integer":
         return "Integer"
      if rtype["schema"]["type"] == "number":
         return first_upper(rtype["schema"]["format"])
      if rtype["schema"]["type"] == "array" and rtype["schema"]["items"]["type"] == "integer":
         if rtype["schema"]["items"]["format"] == "int32":
            return "IntArrayList"
         else:
            return "LongArrayList"
      if rtype["schema"]["type"] == "object":
         par = rtype["schema"]
         title = par["title"]
         tag = toUcaseJava(title)
         tag = generateParameterObject(tag, par["properties"], par["required"] if "required" in par else [], False)
         return tag
      if rtype["schema"]["type"] == "array":
         title = rtype["schema"]["title"]
         par = rtype["schema"]["items"]
         tag = toUcaseJava(title)
         tag = generateParameterObject(tag, par["properties"], par["required"] if "required" in par else [], False)

         return "List<" + tag + ">"

      return "BLANK"
def getReturnDocstring(path, method):
   rtypes = swg["paths"][path][method]["responses"]
   for code, rtype in rtypes.items():
      code = int(code)
      if code // 100 != 2:
         continue
      return swg["paths"][path][method]["responses"][str(code)]["description"]
def generateOOLEnum(enumTag, par, static):
   with open(enumTag + ".java", "w") as enm:
      enm.write(stringEnumTemplate.render(enumTag=enumTag, enumCases=par["enum"], static=static))
generatedEnums = set()

specialSnowflakes = ["FittingItem", "MailRecipient"]

renameEnums = {
   "get_characters_character_id_orders_history_range": "OrderRangeEnum",
   "get_markets_structures_structure_id_range": "OrderRangeEnum",
   "get_markets_region_id_orders_range": "OrderRangeEnum",
   "get_characters_character_id_orders_range": "OrderRangeEnum",
   "get_corporations_corporation_id_orders_history_range": "OrderRangeEnum",
   "get_corporations_corporation_id_orders_range": "OrderRangeEnum",
   "get_corporations_corporation_id_roles_grantable_role": "CorporationRolesEnum",
   "get_corporations_corporation_id_roles_grantable_roles_at_base_grantable_roles_at_base": "CorporationRolesEnum",
   "get_corporations_corporation_id_roles_grantable_roles_at_hq_grantable_roles_at_hq": "CorporationRolesEnum",
   "get_corporations_corporation_id_roles_grantable_roles_at_other_grantable_roles_at_other": "CorporationRolesEnum",
   "get_corporations_corporation_id_roles_role": "CorporationRolesEnum",
   "get_corporations_corporation_id_roles_roles_at_base_roles_at_base": "CorporationRolesEnum",
   "get_corporations_corporation_id_roles_roles_at_hq_roles_at_hq": "CorporationRolesEnum",
   "get_corporations_corporation_id_roles_roles_at_other_roles_at_other": "CorporationRolesEnum",
   "get_corporations_corporation_id_roles_history_new_role": "CorporationRolesEnum",
   "get_corporations_corporation_id_roles_history_old_role": "CorporationRolesEnum",
   "get_corporations_corporation_id_titles_grantable_role": "CorporationRolesEnum",
   "get_corporations_corporation_id_titles_grantable_roles_at_base_grantable_roles_at_base": "CorporationRolesEnum",
   "get_corporations_corporation_id_titles_grantable_roles_at_hq_grantable_roles_at_hq": "CorporationRolesEnum",
   "get_corporations_corporation_id_titles_grantable_roles_at_other_grantable_roles_at_other": "CorporationRolesEnum",
   "get_corporations_corporation_id_titles_role": "CorporationRolesEnum",
   "get_corporations_corporation_id_titles_roles_at_base_roles_at_base": "CorporationRolesEnum",
   "get_corporations_corporation_id_titles_roles_at_hq_roles_at_hq": "CorporationRolesEnum",
   "get_corporations_corporation_id_titles_roles_at_other_roles_at_other": "CorporationRolesEnum",
   "get_characters_character_id_roles_role": "CorporationRolesEnum",
   "get_characters_character_id_roles_roles_at_base_roles_at_base": "CorporationRolesEnum",
   "get_characters_character_id_roles_roles_at_hq_roles_at_hq": "CorporationRolesEnum",
   "get_characters_character_id_roles_roles_at_other_roles_at_other": "CorporationRolesEnum",
   "get_characters_character_id_fleet_role": "FleetRoleEnum",
   "get_fleets_fleet_id_members_role": "FleetRoleEnum",
   "post_fleets_fleet_id_members_role": "FleetRoleEnum",
   "put_fleets_fleet_id_members_member_id_role": "FleetRoleEnum",
   "get_corporations_corporation_id_blueprints_location_flag": "LocationFlagEnum",
   "get_corporations_corporation_id_containers_logs_location_flag": "LocationFlagEnum",
   "get_corporations_corporation_id_assets_location_flag": "LocationFlagEnum",
   "post_characters_character_id_mail_labels_color": "MailLabelColorEnum",
   "get_characters_character_id_mail_labels_color": "MailLabelColorEnum",
   "get_corporations_corporation_id_starbases_starbase_id_anchor": "PostManagementAccessEnum",
   "get_corporations_corporation_id_starbases_starbase_id_fuel_bay_take": "PostManagementAccessEnum",
   "get_corporations_corporation_id_starbases_starbase_id_fuel_bay_view": "PostManagementAccessEnum",
   "get_corporations_corporation_id_starbases_starbase_id_offline": "PostManagementAccessEnum",
   "get_corporations_corporation_id_starbases_starbase_id_online": "PostManagementAccessEnum",
   "get_corporations_corporation_id_starbases_starbase_id_unanchor": "PostManagementAccessEnum",
   "get_characters_character_id_calendar_event_response": "CalendarEventResponseEnum",
   "get_characters_character_id_calendar_event_id_attendees_event_response": "CalendarEventResponseEnum",
   "get_alliances_alliance_id_contacts_contact_type": "ContactTypeEnum",
   "get_characters_character_id_contacts_contact_type": "ContactTypeEnum",
   "get_corporations_corporation_id_contacts_contact_type": "ContactTypeEnum",
   "get_characters_character_id_orders_history_state": "HistoricOrderStateEnum",
   "get_corporations_corporation_id_orders_history_state": "HistoricOrderStateEnum",
   "get_characters_character_id_assets_location_type": "AssetLocationTypeEnum",
   "get_corporations_corporation_id_assets_location_type": "AssetLocationTypeEnum",
   "get_characters_character_id_medals_status": "MedalStatusEnum",
   "get_corporations_corporation_id_medals_issued_status": "MedalStatusEnum",
   "get_characters_character_id_clones_location_type": "CloneLocationTypeEnum",
   "get_characters_character_id_clones_jump_clone_location_type": "CloneLocationTypeEnum",
}

renameObjects  = {
   "PostCorporationsCorporationIdAssetsLocationsPosition": "Coordinate",
   "PostCharactersCharacterIdAssetsLocationsPosition": "Coordinate",
   "GetUniverseSystemsSystemIdPosition": "Coordinate",
   "GetCharactersCharacterIdBookmarksCoordinates": "Coordinate",
   "GetCorporationsCorporationIdBookmarksCoordinates": "Coordinate",
   "GetCorporationsCorporationIdOutpostsOutpostIdCoordinates": "Coordinate",
   "GetKillmailsKillmailIdKillmailHashPosition": "Coordinate",
   "GetUniverseAsteroidBeltsAsteroidBeltIdPosition": "Coordinate",
   "GetUniverseConstellationsConstellationIdPosition": "Coordinate",
   "GetUniverseMoonsMoonIdPosition": "Coordinate",
   "GetUniversePlanetsPlanetIdPosition": "Coordinate",
   "GetUniverseStargatesStargateIdPosition": "Coordinate",
   "GetUniverseStationsStationIdPosition": "Coordinate",
   "GetUniverseStructuresStructureIdPosition": "Coordinate",
   "GetUniverseSystemsSystemIdPosition": "Coordinate",
   "PostFleetsFleetIdWingsCreated": "CreatedWingResponse",
   "PostFleetsFleetIdWingsWingIdSquadsCreated": "CreatedSquadResponse",
   "PostUniverseIdsAlliance": "ResolvedName",
   "PostUniverseIdsCharacter": "ResolvedName",
   "PostUniverseIdsConstellation": "ResolvedName",
   "PostUniverseIdsCorporation": "ResolvedName",
   "PostUniverseIdsFaction": "ResolvedName",
   "PostUniverseIdsAgent": "ResolvedName",
   "PostUniverseIdsInventoryType": "ResolvedName",
   "PostUniverseIdsRegion": "ResolvedName",
   "PostUniverseIdsStation": "ResolvedName",
   "PostUniverseIdsSystem": "ResolvedName",
   "GetCharactersCharacterIdMailMailIdRecipient": "MailRecipient",
   "GetCharactersCharacterIdMailRecipient": "MailRecipient",
   "PostCharactersCharacterIdMailRecipient": "MailRecipient",
   "GetCharactersCharacterIdContractsOk": "ContractInfo",
   "GetCorporationsCorporationIdContractsOk": "ContractInfo",
   "GetContractsPublicRegionIdOk": "PublicContractInfo",
   "GetFwLeaderboardsCorporationsActiveTotalActiveTotal": "FwCorporationLeaderboardEntry",
   "GetFwLeaderboardsCorporationsLastWeekLastWeek": "FwCorporationLeaderboardEntry",
   "GetFwLeaderboardsCorporationsYesterdayYesterday": "FwCorporationLeaderboardEntry",
   "GetFwLeaderboardsCorporationsActiveTotalActiveTotal1": "FwCorporationLeaderboardEntry",
   "GetFwLeaderboardsCorporationsLastWeekLastWeek1": "FwCorporationLeaderboardEntry",
   "GetFwLeaderboardsCorporationsYesterdayYesterday1": "FwCorporationLeaderboardEntry",
   "GetCorporationsCorporationIdIndustryJobsOk": "IndustryJobInfo",
   "GetCharactersCharacterIdIndustryJobsOk": "IndustryJobInfo",
   "GetCharactersCharacterIdSearchOk": "CharacterSearchResult",
   "GetSearchOk": "SearchResult",
   "GetWarsWarIdDefender": "WarParticipantInfo",
   "GetWarsWarIdAggressor": "WarParticipantInfo",
   "GetWarsWarIdAlly": "WarAllyInfo",
   "GetFwLeaderboardsCharactersActiveTotalActiveTotal": "FwCharacterLeaderboardEntry",
   "GetFwLeaderboardsCharactersLastWeekLastWeek": "FwCharacterLeaderboardEntry",
   "GetFwLeaderboardsCharactersYesterdayYesterday": "FwCharacterLeaderboardEntry",
   "GetFwLeaderboardsCharactersActiveTotalActiveTotal1": "FwCharacterLeaderboardEntry",
   "GetFwLeaderboardsCharactersLastWeekLastWeek1": "FwCharacterLeaderboardEntry",
   "GetFwLeaderboardsCharactersYesterdayYesterday1": "FwCharacterLeaderboardEntry",
   "GetFwLeaderboardsActiveTotalActiveTotal": "FwFactionLeaderboardEntry",
   "GetFwLeaderboardsLastWeekLastWeek": "FwFactionLeaderboardEntry",
   "GetFwLeaderboardsYesterdayYesterday": "FwFactionLeaderboardEntry",
   "GetFwLeaderboardsActiveTotalActiveTotal1": "FwFactionLeaderboardEntry",
   "GetFwLeaderboardsLastWeekLastWeek1": "FwFactionLeaderboardEntry",
   "GetFwLeaderboardsYesterdayYesterday1": "FwFactionLeaderboardEntry",
   "GetCorporationsCorporationIdWalletsDivisionJournalOk": "WalletJournalEntry",
   "GetCharactersCharacterIdWalletJournalOk": "WalletJournalEntry",
   "GetCharactersCharacterIdContractsContractIdBidsOk": "AuctionBid",
   "GetContractsPublicBidsContractIdOk": "AuctionBidPublic",
   "GetCorporationsCorporationIdContractsContractIdBidsOk": "AuctionBid",
   "GetCharactersCharacterIdBookmarksOk": "BookmarkInfo",
   "GetCorporationsCorporationIdBookmarksOk": "BookmarkInfo",
   "GetCorporationsCorporationIdDivisionsHangarHangar": "DivisionInfo",
   "GetCorporationsCorporationIdDivisionsWalletWallet": "DivisionInfo",
   "PutFleetsFleetIdWingsWingIdNaming": "FleetUnitName",
   "PutFleetsFleetIdSquadsSquadIdNaming": "FleetUnitName",
   "GetFwStatsKills": "FwStats",
   "GetCharactersCharacterIdFwStatsKills": "FwStats",
   "GetCorporationsCorporationIdFwStatsKills": "FwStats",
   "GetCorporationsCorporationIdFwStatsVictoryPoints": "FwStats",
   "GetCharactersCharacterIdFwStatsVictoryPoints": "FwStats",
   "GetFwStatsVictoryPoints": "FwStats",
   "GetFwLeaderboardsCorporationsKills": "FwCorporationLeaderboard",
   "GetFwLeaderboardsCorporationsVictoryPoints": "FwCorporationLeaderboard",
   "GetFwLeaderboardsCharactersKills": "FwCharacterLeaderboard",
   "GetFwLeaderboardsCharactersVictoryPoints": "FwCharacterLeaderboard",
   "GetFwLeaderboardsKills": "FwFactionLeaderboard",
   "GetFwLeaderboardsVictoryPoints": "FwFactionLeaderboard",
   "GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute": "DgmAttributeValue",
   "GetUniverseTypesTypeIdDogmaAttribute": "DgmAttributeValue",
   "GetCharactersCharacterIdWalletTransactionsOk": "WalletTransaction",
   "GetCorporationsCorporationIdWalletsDivisionTransactionsOk": "WalletTransaction",
   "GetDogmaDynamicItemsTypeIdItemIdDogmaEffect": "DgmEffectValue",
   "GetUniverseTypesTypeIdDogmaEffect": "DgmEffectValue",
   "GetCharactersCharacterIdStandingsOk": "StandingsEntry",
   "GetCorporationsCorporationIdStandingsOk": "StandingsEntry",
   "GetCharactersCharacterIdContractsContractIdItemsOk": "ContractedItem",
   "GetContractsPublicItemsContractIdOk": "ContractedItemEx",
   "GetCorporationsCorporationIdContractsContractIdItemsOk": "ContractedItem",
   "GetCharactersCharacterIdBookmarksItem": "BookmarkedItem",
   "GetCorporationsCorporationIdBookmarksItem": "BookmarkedItem",
   "GetCharactersCharacterIdKillmailsRecentOk": "KillmailRef",
   "GetCorporationsCorporationIdKillmailsRecentOk": "KillmailRef",
   "GetWarsWarIdKillmailsOk": "KillmailRef",
   "GetAlliancesAllianceIdContactsLabelsOk": "ContactLabel",
   "GetCharactersCharacterIdContactsLabelsOk": "ContactLabel",
   "GetCorporationsCorporationIdContactsLabelsOk": "ContactLabel",
   "PostCharactersCharacterIdAssetsNamesOk": "ResolvedAssetName",
   "PostCorporationsCorporationIdAssetsNamesOk": "ResolvedAssetName",
   "PostCharactersCharacterIdAssetsLocationsOk": "ResolvedItemLocation",
   "PostCorporationsCorporationIdAssetsLocationsOk": "ResolvedItemLocation",
   "GetAlliancesAllianceIdContactsOk": "AllianceContact",
   "GetAlliancesAllianceIdIconsOk": "AllianceIcons",
   "GetAlliancesAllianceIdOk": "AllianceInfo",
   "GetCharactersCharacterIdAgentsResearchOk": "ResearchAgentInfo",
   "GetCharactersCharacterIdAssetsOk": "CharacterAssetsEntry",
   "GetCharactersCharacterIdAttributesOk": "CharacterAttributes",
   "GetCharactersCharacterIdBlueprintsOk": "CharacterBlueprint",
   "GetCharactersCharacterIdBookmarksFoldersOk": "CharacterBookmarksFolder",
   "GetCharactersCharacterIdCalendarEventIdAttendeesOk": "EventAttendee",
   "GetCharactersCharacterIdCalendarEventIdOk": "CalendarEvent",
   "GetCharactersCharacterIdCalendarOk": "CalendarInfo",
   "GetCharactersCharacterIdClonesOk": "CloneInfo",
   "GetCharactersCharacterIdContactsOk": "CharacterContact",
   "GetCharactersCharacterIdCorporationhistoryOk": "CorporationHistoryEntry",
   "GetCharactersCharacterIdFatigueOk": "JumpAidsInfo",
   "GetCharactersCharacterIdFittingsOk": "SavedFitting",
   "GetCharactersCharacterIdFleetOk": "ActiveFleetInfo",
   "GetCharactersCharacterIdFwStatsOk": "CharacterFwStats",
   "GetCharactersCharacterIdLocationOk": "CurrentLocation",
   "GetCharactersCharacterIdLoyaltyPointsOk": "LoyaltyPointsInfo",
   "GetCharactersCharacterIdMailLabelsOk": "MailLabels",
   "GetCharactersCharacterIdMailListsOk": "MailingList",
   "GetCharactersCharacterIdMailMailIdOk": "MailContents",
   "GetCharactersCharacterIdMailOk": "MailboxEntry",
   "GetCharactersCharacterIdMedalsOk": "CharacterMedal",
   "GetCharactersCharacterIdMiningOk": "CharacterMiningLedgerEntry",
   "GetCharactersCharacterIdNotificationsContactsOk": "NewContactNotification",
   "GetCharactersCharacterIdNotificationsOk": "NotificationInfo",
   "GetCharactersCharacterIdOk": "CharacterInfo",
   "GetCharactersCharacterIdOnlineOk": "OnlineInfo",
   "GetCharactersCharacterIdOpportunitiesOk": "OpportunityInfo",
   "GetCharactersCharacterIdOrdersHistoryOk": "CharacterOrderHistoryEntry",
   "GetCharactersCharacterIdOrdersOk": "CharacterMarketOrder",
   "GetCharactersCharacterIdPlanetsOk": "PlanetInfo",
   "GetCharactersCharacterIdPlanetsPlanetIdOk": "PlanetContents",
   "GetCharactersCharacterIdPortraitOk": "CharacterPortrait",
   "GetCharactersCharacterIdRolesOk": "CharacterRoles",
   "GetCharactersCharacterIdShipOk": "ActiveShip",
   "GetCharactersCharacterIdSkillqueueOk": "SkillQueueEntry",
   "GetCharactersCharacterIdSkillsOk": "TrainedSkillsInfo",
   "GetCharactersCharacterIdStatsOk": "CharacterStats",
   "GetCharactersCharacterIdTitlesOk": "CharacterTitles",
   "GetCorporationCorporationIdMiningExtractionsOk": "ActiveMoonExtraction",
   "GetCorporationCorporationIdMiningObserversObserverIdOk": "MiningObserverInfo",
   "GetCorporationCorporationIdMiningObserversOk": "MiningObservers",
   "GetCorporationsCorporationIdAlliancehistoryOk": "AllianceHistoryEntry",
   "GetCorporationsCorporationIdAssetsOk": "CorporationAssetsEntry",
   "GetCorporationsCorporationIdBlueprintsOk": "CorporationBlueprint",
   "GetCorporationsCorporationIdBookmarksFoldersOk": "CorporationBookmarkFolder",
   "GetCorporationsCorporationIdContactsOk": "CorporationContact",
   "GetCorporationsCorporationIdContainersLogsOk": "ContainerLogEntry",
   "GetCorporationsCorporationIdCustomsOfficesOk": "CorporationCustomsOffice",
   "GetCorporationsCorporationIdDivisionsOk": "CorporationDivision",
   "GetCorporationsCorporationIdFacilitiesOk": "CorporationFacility",
   "GetCorporationsCorporationIdFwStatsOk": "CorporationFwStatsResponse",
   "GetCorporationsCorporationIdIconsOk": "CorporationIcons",
   "GetCorporationsCorporationIdMedalsIssuedOk": "CorporationIssuedMedals",
   "GetCorporationsCorporationIdMedalsOk": "CorporationMedals",
   "GetCorporationsCorporationIdMembersTitlesOk": "CorporationMemberTitle",
   "GetCorporationsCorporationIdMembertrackingOk": "MemberTrackingInfo",
   "GetCorporationsCorporationIdOk": "CorporationInfo",
   "GetCorporationsCorporationIdOrdersHistoryOk": "CorporationMarketOrderHistoryEntry",
   "GetCorporationsCorporationIdOrdersOk": "CorporationMarketOwner",
   "GetCorporationsCorporationIdOutpostsOutpostIdOk": "OutpostInfo",
   "GetCorporationsCorporationIdRolesHistoryOk": "CorporationRolesHistoryEntry",
   "GetCorporationsCorporationIdRolesOk": "CorporationRoles",
   "GetCorporationsCorporationIdShareholdersOk": "CorporationShareholders",
   "GetCorporationsCorporationIdStarbasesOk": "CorporationPOS",
   "GetCorporationsCorporationIdStarbasesStarbaseIdOk": "CorporationPOSInfo",
   "GetCorporationsCorporationIdStructuresOk": "CorporationStructures",
   "GetCorporationsCorporationIdTitlesOk": "CorporationTitles",
   "GetCorporationsCorporationIdWalletsOk": "CorporationWallets",
   "GetDogmaAttributesAttributeIdOk": "DogmaAttributeInfo",
   "GetDogmaDynamicItemsTypeIdItemIdOk": "DogmaDynamicItemInfo",
   "GetDogmaEffectsEffectIdOk": "DogmaEffectIfno",
   "GetFleetsFleetIdMembersOk": "FleetMemberList",
   "GetFleetsFleetIdOk": "FleetInfo",
   "GetFleetsFleetIdWingsOk": "FleetWings",
   "GetFwLeaderboardsCharactersOk": "FwCharacterLeaderboards",
   "GetFwLeaderboardsCorporationsOk": "FWCorporationLeaderboards",
   "GetFwLeaderboardsOk": "FwFactionLeaderboards",
   "GetFwStatsOk": "GlobalFwStats",
   "GetFwSystemsOk": "FwSystemsList",
   "GetFwWarsOk": "FwActiveWars",
   "GetIncursionsOk": "ActiveIncursions",
   "GetIndustryFacilitiesOk": "IndustryFacilities",
   "GetIndustrySystemsOk": "IndustrySystems",
   "GetInsurancePricesOk": "InsurancePrices",
   "GetKillmailsKillmailIdKillmailHashOk": "KillmailData",
   "GetLoyaltyStoresCorporationIdOffersOk": "LoyaltyStoreOffer",
   "GetMarketsGroupsMarketGroupIdOk": "MarketGroup",
   "GetMarketsPricesOk": "MarketPrices",
   "GetMarketsRegionIdHistoryOk": "MarketHistory",
   "GetMarketsRegionIdOrdersOk": "ActiveMarketOrder",
   "GetMarketsStructuresStructureIdOk": "StructureMarkets",
   "GetOpportunitiesGroupsGroupIdOk": "OpportunityGroup",
   "GetOpportunitiesTasksTaskIdOk": "OpportunityTaks",
   "GetSovereigntyCampaignsOk": "SovereigntyCampaign",
   "GetSovereigntyMapOk": "SovMap",
   "GetSovereigntyStructuresOk": "SovStructures",
   "GetStatusOk": "ServerStatus",
   "GetUniverseAncestriesOk": "AncestryInfo",
   "GetUniverseAsteroidBeltsAsteroidBeltIdOk": "AsteroidBeltInfo",
   "GetUniverseBloodlinesOk": "BloodlineInfo",
   "GetUniverseCategoriesCategoryIdOk": "ItemCategoryInfo",
   "GetUniverseConstellationsConstellationIdOk": "ConstellationInfo",
   "GetUniverseFactionsOk": "UniverseFaction",
   "GetUniverseGraphicsGraphicIdOk": "GhaphicInfo",
   "GetUniverseGroupsGroupIdOk": "ItemGroupInfo",
   "GetUniverseMoonsMoonIdOk": "MoonInfo",
   "GetUniversePlanetsPlanetIdOk": "UniversePlanetInfo",
   "GetUniverseRacesOk": "RaceInfo",
   "GetUniverseRegionsRegionIdOk": "RegionInfo",
   "GetUniverseSchematicsSchematicIdOk": "SchematicInfo",
   "GetUniverseStargatesStargateIdOk": "StargateInfo",
   "GetUniverseStarsStarIdOk": "StarInfo",
   "GetUniverseStationsStationIdOk": "StationInfo",
   "GetUniverseStructuresStructureIdOk": "StructureInfo",
   "GetUniverseSystemJumpsOk": "SystemJumps",
   "GetUniverseSystemKillsOk": "SystemKills",
   "GetUniverseSystemsSystemIdOk": "SystemInfo",
   "GetUniverseTypesTypeIdOk": "TypeInfo",
   "GetWarsWarIdOk": "WarInfo",
   "PostCharactersAffiliationOk": "ResolvedCharacterAffiliation",
   "PostUniverseIdsOk": "ResolvedItemId",
   "PostUniverseNamesOk": "ResolvedItemName",
   "GetCharactersCharacterIdMedalsGraphic": "MedalGraphic",
   "GetCharactersCharacterIdStatsCharacter": "CharacterStatsGeneral",
   "GetCharactersCharacterIdStatsCombat": "CharacterStatsCombat",
   "GetCharactersCharacterIdStatsIndustry": "CharacterStatsIndustry",
   "GetCharactersCharacterIdStatsInventory": "CharacterStatsInventory",
   "GetCharactersCharacterIdStatsIsk": "CharacterStatsIsk",
   "GetCharactersCharacterIdStatsMarket": "CharacterStatsMarket",
   "GetCharactersCharacterIdStatsMining": "CharacterStatsMining",
   "GetCharactersCharacterIdStatsModule": "CharacterStatsModules",
   "GetCharactersCharacterIdStatsOrbital": "CharacterStatsOrbital",
   "GetCharactersCharacterIdStatsPve": "CharacterStatsPve",
   "GetCharactersCharacterIdStatsSocial": "CharacterStatsSocial",
   "GetCharactersCharacterIdStatsTravel": "CharacterStatsTravel",
   "GetCharactersCharacterIdSkillsSkill": "TrainedSkill",
   "PutCharactersCharacterIdCalendarEventIdResponse": "EventResponse",
   "GetCharactersCharacterIdFittingsItem": "FittingItem",
   "PostCharactersCharacterIdFittingsCreated": "FittingCreatedResponse",
   "PostCharactersCharacterIdFittingsFitting": "NewStoredFitting",
   "PostCharactersCharacterIdFittingsItem": "FittingItem",
   "PutFleetsFleetIdNewSettings": "NewFleetSettings",
   "PostFleetsFleetIdMembersInvitation": "FleetInvitation",
   "PutFleetsFleetIdMembersMemberIdMovement": "FleetMovementRequest",
   "GetFleetsFleetIdWingsSquad": "SquadsInWing",
   "GetCharactersCharacterIdClonesHomeLocation": "CloneHomeLocation",
   "GetCharactersCharacterIdClonesJumpClone": "JumpCloneContents",
   "GetIndustrySystemsCostIndice": "SystemCostIndex",
   "GetKillmailsKillmailIdKillmailHashAttacker": "KillAttacker",
   "GetKillmailsKillmailIdKillmailHashVictim": "KillVictim",
   "GetKillmailsKillmailIdKillmailHashItem": "KillItems",
   "GetKillmailsKillmailIdKillmailHashItemsItem": "KillItem",
   "GetLoyaltyStoresCorporationIdOffersRequiredItem": "LpTradeRequiredItem",
   "PostCharactersCharacterIdMailMail": "NewMail",
   "PutCharactersCharacterIdMailMailIdContents": "NewMailContents",
   "PostCharactersCharacterIdMailLabelsLabel": "NewMailLabel",
   "GetCharactersCharacterIdMailLabelsLabel": "MailLabel",
   "GetCharactersCharacterIdPlanetsPlanetIdLink": "PILink",
   "GetCharactersCharacterIdPlanetsPlanetIdPin": "PIPin",
   "GetCharactersCharacterIdPlanetsPlanetIdContent": "PIContext",
   "GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails": "PIExtractor",
   "GetCharactersCharacterIdPlanetsPlanetIdHead": "PIExtractorHead",
   "GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails": "PIFactory",
   "GetCharactersCharacterIdPlanetsPlanetIdRoute": "PIRoute",
   "GetCorporationsCorporationIdOutpostsOutpostIdService": "OutpostService",
   "GetCorporationsCorporationIdStarbasesStarbaseIdFuel": "StarbaseFuel",
   "GetCorporationsCorporationIdStructuresService": "StructureSerivec",
   "GetDogmaEffectsEffectIdModifier": "DgmEffectModifier",
   "GetInsurancePricesLevel": "IsurancePrices",
   "GetSovereigntyCampaignsParticipant": "SovCampaignParticipant",
   "PostUiOpenwindowNewmailNewMail": "NewMailOpenWindow",
   "GetUniverseStargatesStargateIdDestination": "StargateDestination",
   "GetUniverseSystemsSystemIdPlanet": "SystemPlanetInfo",
}

renameFunctions = {
   "getAlliances": "getAlliances",
   "getAlliancesAllianceIdCorporations": "getCorporations",
   "getAlliancesAllianceIdIcons": "getIcons",
   "getAlliancesAllianceId": "getAllianceInfo",
   "getAlliancesAllianceIdContactsLabels": "getAllianceContactLabels",
   "getCharactersCharacterIdContactsLabels": "getCharacterContactLabels",
   "getCorporationsCorporationIdContactsLabels": "getCorporationContactLabels",
   "getCorporationsCorporationIdContracts": "getCorporationContracts",
   "getCorporationsCorporationIdContractsContractIdItems": "getCorporationContractItems",
   "getAlliancesAllianceIdContacts": "getAllianceContacts",
   "getCharactersCharacterIdContacts": "getCharacterIdContacts",
   "getCorporationsCorporationIdContacts": "getCorporationContacts",
   "getCharactersCharacterIdAgentsResearch": "getAgentsResearch",
   "getCharactersCharacterIdCorporationhistory": "getCorpHistory",
   "getCharactersCharacterIdFatigue": "getJumpAids",
   "getCharactersCharacterIdMedals": "getMedals",
   "getCharactersCharacterIdNotificationsContacts": "getContactNotifications",
   "getCharactersCharacterIdStandings": "getStandings",
   "getCharactersCharacterIdTitles": "getTitles",
   "getCharactersCharacterIdBlueprints": "getBlueprints",
   "getCharactersCharacterIdNotifications": "getNotifications",
   "getCharactersCharacterIdPortrait": "getPortrait",
   "getCharactersCharacterIdRoles": "getRoles",
   "getCharactersCharacterIdStats": "getStats",
   "getCharactersCharacterId": "getCharacterInfo",
   "getCharactersCharacterIdAssets": "getCharacterAssets",
   "getCharactersCharacterIdAttributes": "getAttributes",
   "getCharactersCharacterIdBookmarks": "getCharacterBookmarks",
   "getCharactersCharacterIdBookmarksFolders": "getCharacterBookmarkFolders",
   "getCharactersCharacterIdCalendar": "getCalendar",
   "getCharactersCharacterIdCalendarEventId": "getCalendarEventInfo",
   "getCharactersCharacterIdCalendarEventIdAttendees": "getCalendarEventAttendees",
   "getCharactersCharacterIdClones": "getClones",
   "getCharactersCharacterIdContracts": "getCharacterContracts",
   "getCharactersCharacterIdContractsContractIdBids": "getCharacterContractBids",
   "getCharactersCharacterIdContractsContractIdItems": "getCharacterContractItems",
   "getContractsPublicRegionId": "getPublicContracts",
   "getContractsPublicBidsContractId": "getPublicContractBids",
   "getContractsPublicItemsContractId": "getPublicContractItems",
   "getCharactersCharacterIdFittings": "getFittings",
   "getCharactersCharacterIdFleet": "getFleet",
   "getCharactersCharacterIdFwStats": "getFwStats",
   "getCharactersCharacterIdImplants": "getImplants",
   "getCharactersCharacterIdIndustryJobs": "getIndustryJobs",
   "getCharactersCharacterIdKillmailsRecent": "getCharacterRecentKillmails",
   "getCharactersCharacterIdLocation": "getLocation",
   "getCharactersCharacterIdLoyaltyPoints": "getLoyaltyPoints",
   "getCharactersCharacterIdMail": "getMailbox",
   "getCharactersCharacterIdMailLabels": "getMailLabels",
   "getCharactersCharacterIdMailLists": "getMailLists",
   "getCharactersCharacterIdMailMailId": "getMailContents",
   "getCharactersCharacterIdMining": "getMining",
   "getCharactersCharacterIdOnline": "getOnline",
   "getCharactersCharacterIdOpportunities": "getOpportunities",
   "getCharactersCharacterIdOrders": "getOrders",
   "getCharactersCharacterIdOrdersHistory": "getCharacterOrderHistory",
   "getCharactersCharacterIdPlanets": "getPlanets",
   "getCharactersCharacterIdPlanetsPlanetId": "getPlanetInfo",
   "getCharactersCharacterIdSearch": "searchAuthed",
   "getCharactersCharacterIdShip": "getShip",
   "getCharactersCharacterIdSkillqueue": "getSkillqueue",
   "getCharactersCharacterIdSkills": "getSkills",
   "getCharactersCharacterIdWallet": "getWallet",
   "getCharactersCharacterIdWalletJournal": "getWalletJournal",
   "getCharactersCharacterIdWalletTransactions": "getWalletTransactions",
   "getCorporationCorporationIdMiningExtractions": "getMiningExtractions",
   "getCorporationCorporationIdMiningObservers": "getMiningObservers",
   "getCorporationCorporationIdMiningObserversObserverId": "getMiningObserverInfo",
   "getCorporationsCorporationId": "getCorporationInfo",
   "getCorporationsCorporationIdAlliancehistory": "getAlliancehistory",
   "getCorporationsCorporationIdAssets": "getCorporationAssets",
   "getCorporationsCorporationIdBlueprints": "getBlueprints",
   "getCorporationsCorporationIdBookmarks": "getCorporationBookmarks",
   "getCorporationsCorporationIdBookmarksFolders": "getCorporationBookmarkFolders",
   "getCorporationsCorporationIdContainersLogs": "getContainerLogs",
   "getCorporationsCorporationIdContractsContractIdBids": "getContractBids",
   "getCorporationsCorporationIdCustomsOffices": "getCustomsOffices",
   "getCorporationsCorporationIdDivisions": "getDivisions",
   "getCorporationsCorporationIdFacilities": "getFacilities",
   "getCorporationsCorporationIdFwStats": "getCorporationFwStats",
   "getCorporationsCorporationIdIcons": "getIcons",
   "getCorporationsCorporationIdIndustryJobs": "getIndustryJobs",
   "getCorporationsCorporationIdKillmailsRecent": "getCorporationRecentKillmails",
   "getCorporationsCorporationIdMedals": "getMedals",
   "getCorporationsCorporationIdMedalsIssued": "getIssuedMedals",
   "getCorporationsCorporationIdMembers": "getMembers",
   "getCorporationsCorporationIdMembersLimit": "getMemberLimit",
   "getCorporationsCorporationIdMembersTitles": "getMemberTitles",
   "getCorporationsCorporationIdMembertracking": "getMembertracking",
   "getCorporationsCorporationIdOrders": "getOrders",
   "getCorporationsCorporationIdOrdersHistory": "getCorporationOrderHistory",
   "getCorporationsCorporationIdRoles": "getRoles",
   "getCorporationsCorporationIdRolesHistory": "getRolesHistory",
   "getCorporationsCorporationIdShareholders": "getShareholders",
   "getCorporationsCorporationIdStandings": "getStandings",
   "getCorporationsCorporationIdStarbases": "getStarbases",
   "getCorporationsCorporationIdStarbasesStarbaseId": "getStarbaseInfo",
   "getCorporationsCorporationIdStructures": "getStructures",
   "getCorporationsCorporationIdTitles": "getTitles",
   "getCorporationsCorporationIdWallets": "getWallets",
   "getCorporationsCorporationIdWalletsDivisionJournal": "getWalletDivisionJournal",
   "getCorporationsCorporationIdWalletsDivisionTransactions": "getWalletDivisionTransactions",
   "getCorporationsNpccorps": "getsNpccorps",
   "getDogmaAttributes": "getAttributes",
   "getDogmaAttributesAttributeId": "getAttributeInfo",
   "getDogmaDynamicItemsTypeIdItemId": "getDynamicItemStats",
   "getDogmaEffects": "getEffects",
   "getDogmaEffectsEffectId": "getEffectInfo",
   "getFleetsFleetId": "getFleetInfo",
   "getFleetsFleetIdMembers": "getMembers",
   "getFleetsFleetIdWings": "getWings",
   "getFwLeaderboards": "getFwFactionLeaderboards",
   "getFwLeaderboardsCharacters": "getFwCharacterLeaderboards",
   "getFwLeaderboardsCorporations": "getFwCorporationLeaderboards",
   "getFwStats": "getFwStats",
   "getFwSystems": "getFwSystems",
   "getFwWars": "getFwWars",
   "getIncursions": "getIncursions",
   "getIndustryFacilities": "getIndustryFacilities",
   "getIndustrySystems": "getIndustrySystems",
   "getInsurancePrices": "getInsurancePrices",
   "getKillmailsKillmailIdKillmailHash": "getKillmail",
   "getLoyaltyStoresCorporationIdOffers": "getLoyaltyStoreOffers",
   "getMarketsGroups": "getMarketGroups",
   "getMarketsGroupsMarketGroupId": "getMarketGroupInfo",
   "getMarketsPrices": "getMarketPrices",
   "getMarketsRegionIdHistory": "getMarketHistory",
   "getMarketsRegionIdOrders": "getMarketOrders",
   "getMarketsRegionIdTypes": "getMarketTypes",
   "getMarketsStructuresStructureId": "getStructureMarket",
   "getOpportunitiesGroups": "getOpportunityGroups",
   "getOpportunitiesGroupsGroupId": "getOpportunityGroupInfo",
   "getOpportunitiesTasks": "getOpportunityTasks",
   "getOpportunitiesTasksTaskId": "getOpportunityTaskInfo",
   "getRouteOriginDestination": "getRoute",
   "getSearch": "searchUnauthed",
   "getSovereigntyCampaigns": "getSovereigntyCampaigns",
   "getSovereigntyMap": "getSovereigntyMap",
   "getSovereigntyStructures": "getSovereigntyStructures",
   "getStatus": "getStatus",
   "getUniverseAncestries": "getAncestries",
   "getUniverseAsteroidBeltsAsteroidBeltId": "getAsteroidBeltInfo",
   "getUniverseBloodlines": "getBloodlines",
   "getUniverseCategories": "getCategories",
   "getUniverseCategoriesCategoryId": "getCategoryInfo",
   "getUniverseConstellations": "getConstellations",
   "getUniverseConstellationsConstellationId": "getConstellationInfo",
   "getUniverseFactions": "getFactions",
   "getUniverseGraphics": "getGraphics",
   "getUniverseGraphicsGraphicId": "getGraphicInfo",
   "getUniverseGroups": "getGroups",
   "getUniverseGroupsGroupId": "getGroupInfo",
   "getUniverseMoonsMoonId": "getMoonInfo",
   "getUniversePlanetsPlanetId": "getPlanetInfo",
   "getUniverseRaces": "getRaces",
   "getUniverseRegions": "getRegions",
   "getUniverseRegionsRegionId": "getRegionInfo",
   "getUniverseSchematicsSchematicId": "getSchematicInfo",
   "getUniverseStargatesStargateId": "getStargateInfo",
   "getUniverseStarsStarId": "getStarInfo",
   "getUniverseStationsStationId": "getStationInfo",
   "getUniverseStructures": "getStructures",
   "getUniverseStructuresStructureId": "getStructureInfo",
   "getUniverseSystemJumps": "getSystemJumps",
   "getUniverseSystemKills": "getSystemKills",
   "getUniverseSystems": "getSystems",
   "getUniverseSystemsSystemId": "getSystemInfo",
   "getUniverseTypes": "getTypes",
   "getUniverseTypesTypeId": "getTypeInfo",
   "getWars": "getWars",
   "getWarsWarId": "getWarInfo",
   "getWarsWarIdKillmails": "getWarKillmails",
   "deleteCharactersCharacterIdContacts": "deleteCharacterContacts",
   "deleteCharactersCharacterIdFittingsFittingId": "deleteFitting",
   "deleteCharactersCharacterIdMailLabelsLabelId": "deleteMailLabel",
   "deleteCharactersCharacterIdMailMailId": "deleteMail",
   "deleteFleetsFleetIdMembersMemberId": "kickFleetMember",
   "deleteFleetsFleetIdSquadsSquadId": "deleteFleetSquad",
   "deleteFleetsFleetIdWingsWingId": "deleteFleetWing",
   "postCharactersAffiliation": "resolveCharacterAffiliations",
   "postCharactersCharacterIdAssetsLocations": "resolveCharacterAssetLocations",
   "postCharactersCharacterIdAssetsNames": "resolveCharacterAssetNames",
   "postCharactersCharacterIdCspa": "resolveCSPACost",
   "postCorporationsCorporationIdAssetsLocations": "resolveCorporationAssetLocations",
   "postCorporationsCorporationIdAssetsNames": "resolveCorporationAssetNames",
   "postUniverseIds": "resolveIds",
   "postUniverseNames": "resolveNames",
   "putCharactersCharacterIdCalendarEventId": "respondToCalendarEvent",
   "postCharactersCharacterIdContacts": "createContacts",
   "putCharactersCharacterIdContacts": "editContacts",
   "postCharactersCharacterIdFittings": "createFitting",
   "putFleetsFleetId": "updateFleet",
   "putFleetsFleetIdMembersMemberId": "moveFleetMember",
   "putFleetsFleetIdSquadsSquadId": "renameFleetSquad",
   "putFleetsFleetIdWingsWingId": "renameFleetWing",
   "postFleetsFleetIdMembers": "inviteFleetMember",
   "postFleetsFleetIdWings": "createFleetWing",
   "postFleetsFleetIdWingsWingIdSquads": "createFleetSquad",
   "postCharactersCharacterIdMail": "sendMail",
   "postCharactersCharacterIdMailLabels": "createMailLabel",
   "putCharactersCharacterIdMailMailId": "updateMailMetadata",
   "postUiAutopilotWaypoint": "addWaypoint",
   "postUiOpenwindowContract": "openContract",
   "postUiOpenwindowInformation": "openInfoWindow",
   "postUiOpenwindowMarketdetails": "openMarketWindow",
   "postUiOpenwindowNewmail": "openMailCompose",
}

generatedObjects = set()

imports = {
   "Instant": "java.time",
   "List": "java.util",
   "Map": "java.util",
   "IntArrayList": "com.carrotsearch.hppc",
   "LongArrayList": "com.carrotsearch.hppc",
   "JsonProperty": "com.fasterxml.jackson.annotation",
   "JsonCreator": "com.fasterxml.jackson.annotation",
   "JsonValue": "com.fasterxml.jackson.annotation",
   "TypeReference": "com.fasterxml.jackson.core.type",
}

def generateParameterObject(title, properties, required, isRequest):
   if title in renameObjects:
      title = renameObjects[title]
   elif properties != None:
      print(properties, title)
   if title in generatedObjects:
      return title
   with open(title + ".java", "w") as fil:
      try:
         render = parameterObjectTemplate.render(title=title,
                                                 properties=properties,
                                                 required=required,
                                                 toLcaseJava=toLcaseJava,
                                                 toUcaseJava=toUcaseJava,
                                                 generateParameterObject=generateParameterObject,
                                                 isRequest=isRequest, specialSnowflakes=specialSnowflakes,
                                                 renameEnums=renameEnums, generateOOLEnum=generateOOLEnum)
         ipt = [];
         for k, v in imports.items():
            if re.search("\W" + k + "\W", render):
               ipt.append("import " + v + "." + k + ";")
         fil.write(render.replace("{{PUT_IMPORTS_HERE}}", "\n".join(ipt)))
      except:
         print(exceptions.text_error_template().render())
         os._exit(0)
   generatedObjects.add(title)
   return title

def getTypeTag(par, topLevel, nameOverride=None):
   if "schema" in par:
      return getTypeTag(par["schema"], topLevel, par["name"])
   if par["type"] == "integer":
      required = "required" in par and par["required"] == True
      if par["format"] == "int32":
         if required or not topLevel:
            type = "int"
         else:
            type = "Integer"
      elif par["format"] == "int64":
         if required or not topLevel:
            type = "long"
         else:
            type = "Long"
   elif par["type"] == "boolean":
      if "required" in par and par["required"] == True:
         type = "boolean"
      else:
         type = "Boolean"
   elif par["type"] == "number":
      if "required" in par and par["required"] == True:
         type = "double"
      else:
         type = "Double"
   elif par["type"] == "string" and "enum" not in par:
      type = "String"
   elif par["type"] == "string" and "enum" in par:
      enumTag = toUcaseJava(par["name"] if nameOverride == None else nameOverride) + "Enum"
      if "title" in par and  par["title"] in renameEnums:
         enumTag = renameEnums[par["title"]]
      if enumTag not in generatedEnums:
         generateOOLEnum(enumTag, par, False)
         generatedEnums.add(enumTag)
      type = enumTag
   elif par["type"] == "array":
      name = par["name"] if nameOverride == None else nameOverride
      if par["items"]["type"] == "string":
         type = "List<" + getTypeTag(par["items"], False, name) + ">"
      elif par["items"]["type"] == "integer":
         if par["items"]["format"] == "int32":
            type = "IntArrayList"
         elif par["items"]["format"] == "int64":
            type = "LongArrayList"
      elif par["items"]["type"] == "array" and par["items"]["items"]["type"] == "integer":
         type = "List<IntArrayList>"
   elif par["type"] == "object":
      title = par["title"]
      tag = toUcaseJava(title)
      tag = generateParameterObject(tag, par["properties"], par["required"] if "required" in par else [], True)
      type = tag
   return type

def getArgDocstring(path, method):
   parDefs = swg["paths"][path][method]["parameters"]
   ret = []
   for par in parDefs:
      if "$ref" in par:
         if par["$ref"] == "#/parameters/token":
            continue
         if par["$ref"] == "#/parameters/datasource":
            continue
         par = parameterRefs[par["$ref"]]
      if par["name"] == "language":
         continue
      name = toLcaseJava(par["name"])
      doc = par["description"]
      ret.append((doc, name))
   return ret

def getArgNames(path, method, for_paginated=False):
   parDefs = swg["paths"][path][method]["parameters"]
   ret = []
   paginated = False
   for par in parDefs:
      if "$ref" in par:
         if par["$ref"] == "#/parameters/token":
            continue
         if par["$ref"] == "#/parameters/datasource":
            continue
         if par["$ref"] == "#/parameters/page":
            paginated = True
            if for_paginated:
               continue
         if par["$ref"] == "#/parameters/If-None-Match" and for_paginated:
            continue
         par = parameterRefs[par["$ref"]]
      if par["name"] == "language":
         continue
      name = toLcaseJava(par["name"])
      type = getTypeTag(par, True)

      ret.append((type, name))
   return (paginated, ", ".join(type + " " + name for (type, name) in ret))


def getFunctionName(path, method):
   title = toLcaseJava(swg["paths"][path][method]["operationId"])
   if title in renameFunctions:
      return renameFunctions[title]
   else:
      print(title)
      return title


with open("ApiClient.java", "w") as acl:
    acl.write(apiClientTemplate.render(tags=tags, first_lower=first_lower))

for tag, paths in tags.items():
   with open(tag + "Api.java", "w") as apf:
      render = apiObjectItfTemplate.render(tag=tag, paths=paths,
                                           getReturnTypeName=getReturnTypeName, getFunctionName=getFunctionName,
                                           getArgNames=getArgNames, swg=swg, parameterRefs=parameterRefs, retTypeKind=retTypeKind,
                                           toLcaseJava=toLcaseJava, toUcaseJava=toUcaseJava, first_lower=first_lower,
                                           getArgDocstring=getArgDocstring, getReturnDocstring=getReturnDocstring)
      ipt = [];
      for k, v in imports.items():
         if re.search(r'^[^*]*\W(' + k + r')\W', render, re.M):
            ipt.append("import " + v + "." + k + ";")
      apf.write(render.replace("{{PUT_IMPORTS_HERE}}", "\n".join(ipt)))
   with open(tag + "ApiImpl.java", "w") as apf:
      render = apiObjectTemplate.render(tag=tag, paths=paths,
                                        getReturnTypeName=getReturnTypeName, getFunctionName=getFunctionName,
                                        getArgNames=getArgNames, swg=swg, parameterRefs=parameterRefs, retTypeKind=retTypeKind,
                                        toLcaseJava=toLcaseJava, toUcaseJava=toUcaseJava, first_lower=first_lower)
      ipt = [];
      for k, v in imports.items():
         if re.search(r'^[^*]*\W(' + k + r')\W', render, re.M):
            ipt.append("import " + v + "." + k + ";")
      apf.write(render.replace("{{PUT_IMPORTS_HERE}}", "\n".join(ipt)))

Path('timestamp.gen').touch()
