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
            return "int[]"
         else:
            return "long[]"
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

generatedEnums = set()

specialSnowflakes = ["FittingItem", "MailRecipient"]

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
generatedObjects = set()



def generateParameterObject(title, properties, required, isRequest):
   if title in renameObjects:
      title = renameObjects[title]
   elif properties != None:
      print(properties, title)
   if title in generatedObjects:
      return title
   with open(title + ".java", "w") as fil:
      try:
         fil.write(parameterObjectTemplate.render(title=title,
                                                  properties=properties,
                                                  required=required,
                                                  toLcaseJava=toLcaseJava,
                                                  toUcaseJava=toUcaseJava,
                                                  generateParameterObject=generateParameterObject,
                                                  isRequest=isRequest, specialSnowflakes=specialSnowflakes))
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
      if enumTag not in generatedEnums:
         with open(enumTag + ".java", "w") as enm:
            enm.write(stringEnumTemplate.render(enumTag=enumTag, enumCases=par["enum"]))
         generatedEnums.add(enumTag)
      type = enumTag
   elif par["type"] == "array":
      name = par["name"] if nameOverride == None else nameOverride
      if par["items"]["type"] == "string":
         type = "List<" + getTypeTag(par["items"], False, name) + ">"
      elif par["items"]["type"] == "integer":
         type = getTypeTag(par["items"], False) + "[]"
      elif par["items"]["type"] == "array" and par["items"]["items"]["type"] == "integer":
         type = "List<int[]>"
   elif par["type"] == "object":
      title = par["title"]
      tag = toUcaseJava(title)
      tag = generateParameterObject(tag, par["properties"], par["required"] if "required" in par else [], True)
      type = tag
   return type

def getArgNames(path, method):
   parDefs = swg["paths"][path][method]["parameters"]
   ret = []
   for par in parDefs:
      if "$ref" in par:
         if par["$ref"] == "#/parameters/token":
            continue
         par = parameterRefs[par["$ref"]]
      if par["name"] == "language":
         continue
      name = toLcaseJava(par["name"])
      type = getTypeTag(par, True)

      ret.append((type, name))
   return ret


def getFunctionName(path, method):
   return toLcaseJava(swg["paths"][path][method]["operationId"])

with open("ApiClient.java", "w") as acl:
    acl.write(apiClientTemplate.render(tags=tags, first_lower=first_lower))

for tag, paths in tags.items():
   with open(tag + "Api.java", "w") as apf:
      apf.write(apiObjectTemplate.render(tag=tag, paths=paths,
                                         getReturnTypeName=getReturnTypeName, getFunctionName=getFunctionName,
                                         getArgNames=getArgNames, swg=swg, parameterRefs=parameterRefs, retTypeKind=retTypeKind,
                                         toLcaseJava=toLcaseJava, toUcaseJava=toUcaseJava, first_lower=first_lower))

Path('timestamp.gen').touch()
