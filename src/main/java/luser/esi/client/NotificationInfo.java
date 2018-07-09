package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class NotificationInfo {
    private Boolean isRead;
    public void setIsRead(Boolean val) {
        isRead = val;
    }
    public Boolean getIsRead() {
        return isRead;
    }
    private long notificationId;
    public void setNotificationId(long val) {
        notificationId = val;
    }
    public long getNotificationId() {
        return notificationId;
    }
    private int senderId;
    public void setSenderId(int val) {
        senderId = val;
    }
    public int getSenderId() {
        return senderId;
    }
    private SenderTypeEnum senderType;
    public void setSenderType(SenderTypeEnum val) {
        senderType = val;
    }
    public SenderTypeEnum getSenderType() {
        return senderType;
    }
    private String text;
    public void setText(String val) {
        text = val;
    }
    public String getText() {
        return text;
    }
    private Instant timestamp;
    public void setTimestamp(Instant val) {
        timestamp = val;
    }
    public Instant getTimestamp() {
        return timestamp;
    }
    private TypeEnum type;
    public void setType(TypeEnum val) {
        type = val;
    }
    public TypeEnum getType() {
        return type;
    }
    static NotificationInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        NotificationInfo self = new NotificationInfo();
        Map<String, Json> js = json.asJsonMap();
        self.isRead = ApiClientBase.optGetBoolean(js.get("is_read"));
        self.notificationId = ApiClientBase.optGetLong(js.get("notification_id"));
        self.senderId = ApiClientBase.optGetInteger(js.get("sender_id"));
        self.senderType = SenderTypeEnum.fromString(ApiClientBase.optGetString(js.get("sender_type")));
        self.text = ApiClientBase.optGetString(js.get("text"));
        self.timestamp = ApiClientBase.optGetInstant(js.get("timestamp"));
        self.type = TypeEnum.fromString(ApiClientBase.optGetString(js.get("type")));
        return self;
    }
    public static enum SenderTypeEnum {
        CHARACTER("character"),
        CORPORATION("corporation"),
        ALLIANCE("alliance"),
        FACTION("faction"),
        OTHER("other");
        public final String stringValue;
        private SenderTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static SenderTypeEnum fromString(String str) {
            for (SenderTypeEnum self : SenderTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum TypeEnum {
        ACCEPTEDALLY("AcceptedAlly"),
        ACCEPTEDSURRENDER("AcceptedSurrender"),
        ALLANCHORINGMSG("AllAnchoringMsg"),
        ALLMAINTENANCEBILLMSG("AllMaintenanceBillMsg"),
        ALLSTRUCINVULNERABLEMSG("AllStrucInvulnerableMsg"),
        ALLSTRUCTVULNERABLEMSG("AllStructVulnerableMsg"),
        ALLWARCORPJOINEDALLIANCEMSG("AllWarCorpJoinedAllianceMsg"),
        ALLWARDECLAREDMSG("AllWarDeclaredMsg"),
        ALLWARINVALIDATEDMSG("AllWarInvalidatedMsg"),
        ALLWARRETRACTEDMSG("AllWarRetractedMsg"),
        ALLWARSURRENDERMSG("AllWarSurrenderMsg"),
        ALLIANCECAPITALCHANGED("AllianceCapitalChanged"),
        ALLYCONTRACTCANCELLED("AllyContractCancelled"),
        ALLYJOINEDWARAGGRESSORMSG("AllyJoinedWarAggressorMsg"),
        ALLYJOINEDWARALLYMSG("AllyJoinedWarAllyMsg"),
        ALLYJOINEDWARDEFENDERMSG("AllyJoinedWarDefenderMsg"),
        BATTLEPUNISHFRIENDLYFIRE("BattlePunishFriendlyFire"),
        BILLOUTOFMONEYMSG("BillOutOfMoneyMsg"),
        BILLPAIDCORPALLMSG("BillPaidCorpAllMsg"),
        BOUNTYCLAIMMSG("BountyClaimMsg"),
        BOUNTYESSSHARED("BountyESSShared"),
        BOUNTYESSTAKEN("BountyESSTaken"),
        BOUNTYPLACEDALLIANCE("BountyPlacedAlliance"),
        BOUNTYPLACEDCHAR("BountyPlacedChar"),
        BOUNTYPLACEDCORP("BountyPlacedCorp"),
        BOUNTYYOURBOUNTYCLAIMED("BountyYourBountyClaimed"),
        BUDDYCONNECTCONTACTADD("BuddyConnectContactAdd"),
        CHARAPPACCEPTMSG("CharAppAcceptMsg"),
        CHARAPPREJECTMSG("CharAppRejectMsg"),
        CHARAPPWITHDRAWMSG("CharAppWithdrawMsg"),
        CHARLEFTCORPMSG("CharLeftCorpMsg"),
        CHARMEDALMSG("CharMedalMsg"),
        CHARTERMINATIONMSG("CharTerminationMsg"),
        CLONEACTIVATIONMSG("CloneActivationMsg"),
        CLONEACTIVATIONMSG2("CloneActivationMsg2"),
        CLONEMOVEDMSG("CloneMovedMsg"),
        CLONEREVOKEDMSG1("CloneRevokedMsg1"),
        CLONEREVOKEDMSG2("CloneRevokedMsg2"),
        CONTACTADD("ContactAdd"),
        CONTACTEDIT("ContactEdit"),
        CONTAINERPASSWORDMSG("ContainerPasswordMsg"),
        CORPALLBILLMSG("CorpAllBillMsg"),
        CORPAPPACCEPTMSG("CorpAppAcceptMsg"),
        CORPAPPINVITEDMSG("CorpAppInvitedMsg"),
        CORPAPPNEWMSG("CorpAppNewMsg"),
        CORPAPPREJECTCUSTOMMSG("CorpAppRejectCustomMsg"),
        CORPAPPREJECTMSG("CorpAppRejectMsg"),
        CORPDIVIDENDMSG("CorpDividendMsg"),
        CORPFRIENDLYFIREDISABLETIMERCOMPLETED("CorpFriendlyFireDisableTimerCompleted"),
        CORPFRIENDLYFIREDISABLETIMERSTARTED("CorpFriendlyFireDisableTimerStarted"),
        CORPFRIENDLYFIREENABLETIMERCOMPLETED("CorpFriendlyFireEnableTimerCompleted"),
        CORPFRIENDLYFIREENABLETIMERSTARTED("CorpFriendlyFireEnableTimerStarted"),
        CORPKICKED("CorpKicked"),
        CORPLIQUIDATIONMSG("CorpLiquidationMsg"),
        CORPNEWCEOMSG("CorpNewCEOMsg"),
        CORPNEWSMSG("CorpNewsMsg"),
        CORPOFFICEEXPIRATIONMSG("CorpOfficeExpirationMsg"),
        CORPSTRUCTLOSTMSG("CorpStructLostMsg"),
        CORPTAXCHANGEMSG("CorpTaxChangeMsg"),
        CORPVOTECEOREVOKEDMSG("CorpVoteCEORevokedMsg"),
        CORPVOTEMSG("CorpVoteMsg"),
        CORPWARDECLAREDMSG("CorpWarDeclaredMsg"),
        CORPWARFIGHTINGLEGALMSG("CorpWarFightingLegalMsg"),
        CORPWARINVALIDATEDMSG("CorpWarInvalidatedMsg"),
        CORPWARRETRACTEDMSG("CorpWarRetractedMsg"),
        CORPWARSURRENDERMSG("CorpWarSurrenderMsg"),
        CUSTOMSMSG("CustomsMsg"),
        DECLAREWAR("DeclareWar"),
        DISTRICTATTACKED("DistrictAttacked"),
        DUSTAPPACCEPTEDMSG("DustAppAcceptedMsg"),
        ENTOSISCAPTURESTARTED("EntosisCaptureStarted"),
        FWALLIANCEKICKMSG("FWAllianceKickMsg"),
        FWALLIANCEWARNINGMSG("FWAllianceWarningMsg"),
        FWCHARKICKMSG("FWCharKickMsg"),
        FWCHARRANKGAINMSG("FWCharRankGainMsg"),
        FWCHARRANKLOSSMSG("FWCharRankLossMsg"),
        FWCHARWARNINGMSG("FWCharWarningMsg"),
        FWCORPJOINMSG("FWCorpJoinMsg"),
        FWCORPKICKMSG("FWCorpKickMsg"),
        FWCORPLEAVEMSG("FWCorpLeaveMsg"),
        FWCORPWARNINGMSG("FWCorpWarningMsg"),
        FACWARCORPJOINREQUESTMSG("FacWarCorpJoinRequestMsg"),
        FACWARCORPJOINWITHDRAWMSG("FacWarCorpJoinWithdrawMsg"),
        FACWARCORPLEAVEREQUESTMSG("FacWarCorpLeaveRequestMsg"),
        FACWARCORPLEAVEWITHDRAWMSG("FacWarCorpLeaveWithdrawMsg"),
        FACWARLPDISQUALIFIEDEVENT("FacWarLPDisqualifiedEvent"),
        FACWARLPDISQUALIFIEDKILL("FacWarLPDisqualifiedKill"),
        FACWARLPPAYOUTEVENT("FacWarLPPayoutEvent"),
        FACWARLPPAYOUTKILL("FacWarLPPayoutKill"),
        GAMETIMEADDED("GameTimeAdded"),
        GAMETIMERECEIVED("GameTimeReceived"),
        GAMETIMESENT("GameTimeSent"),
        GIFTRECEIVED("GiftReceived"),
        IHUBDESTROYEDBYBILLFAILURE("IHubDestroyedByBillFailure"),
        INCURSIONCOMPLETEDMSG("IncursionCompletedMsg"),
        INDUSTRYTEAMAUCTIONLOST("IndustryTeamAuctionLost"),
        INDUSTRYTEAMAUCTIONWON("IndustryTeamAuctionWon"),
        INFRASTRUCTUREHUBBILLABOUTTOEXPIRE("InfrastructureHubBillAboutToExpire"),
        INSURANCEEXPIRATIONMSG("InsuranceExpirationMsg"),
        INSURANCEFIRSTSHIPMSG("InsuranceFirstShipMsg"),
        INSURANCEINVALIDATEDMSG("InsuranceInvalidatedMsg"),
        INSURANCEISSUEDMSG("InsuranceIssuedMsg"),
        INSURANCEPAYOUTMSG("InsurancePayoutMsg"),
        JUMPCLONEDELETEDMSG1("JumpCloneDeletedMsg1"),
        JUMPCLONEDELETEDMSG2("JumpCloneDeletedMsg2"),
        KILLREPORTFINALBLOW("KillReportFinalBlow"),
        KILLREPORTVICTIM("KillReportVictim"),
        KILLRIGHTAVAILABLE("KillRightAvailable"),
        KILLRIGHTAVAILABLEOPEN("KillRightAvailableOpen"),
        KILLRIGHTEARNED("KillRightEarned"),
        KILLRIGHTUNAVAILABLE("KillRightUnavailable"),
        KILLRIGHTUNAVAILABLEOPEN("KillRightUnavailableOpen"),
        KILLRIGHTUSED("KillRightUsed"),
        LOCATECHARMSG("LocateCharMsg"),
        MADEWARMUTUAL("MadeWarMutual"),
        MERCOFFEREDNEGOTIATIONMSG("MercOfferedNegotiationMsg"),
        MISSIONOFFEREXPIRATIONMSG("MissionOfferExpirationMsg"),
        MISSIONTIMEOUTMSG("MissionTimeoutMsg"),
        MOONMININGAUTOMATICFRACTURE("MoonminingAutomaticFracture"),
        MOONMININGEXTRACTIONCANCELLED("MoonminingExtractionCancelled"),
        MOONMININGEXTRACTIONFINISHED("MoonminingExtractionFinished"),
        MOONMININGEXTRACTIONSTARTED("MoonminingExtractionStarted"),
        MOONMININGLASERFIRED("MoonminingLaserFired"),
        NPCSTANDINGSGAINED("NPCStandingsGained"),
        NPCSTANDINGSLOST("NPCStandingsLost"),
        OFFEREDSURRENDER("OfferedSurrender"),
        OFFEREDTOALLY("OfferedToAlly"),
        OLDLSCMESSAGES("OldLscMessages"),
        OPERATIONFINISHED("OperationFinished"),
        ORBITALATTACKED("OrbitalAttacked"),
        ORBITALREINFORCED("OrbitalReinforced"),
        OWNERSHIPTRANSFERRED("OwnershipTransferred"),
        REIMBURSEMENTMSG("ReimbursementMsg"),
        RESEARCHMISSIONAVAILABLEMSG("ResearchMissionAvailableMsg"),
        RETRACTSWAR("RetractsWar"),
        SEASONALCHALLENGECOMPLETED("SeasonalChallengeCompleted"),
        SOVALLCLAIMAQUIREDMSG("SovAllClaimAquiredMsg"),
        SOVALLCLAIMLOSTMSG("SovAllClaimLostMsg"),
        SOVCOMMANDNODEEVENTSTARTED("SovCommandNodeEventStarted"),
        SOVCORPBILLLATEMSG("SovCorpBillLateMsg"),
        SOVCORPCLAIMFAILMSG("SovCorpClaimFailMsg"),
        SOVDISRUPTORMSG("SovDisruptorMsg"),
        SOVSTATIONENTEREDFREEPORT("SovStationEnteredFreeport"),
        SOVSTRUCTUREDESTROYED("SovStructureDestroyed"),
        SOVSTRUCTUREREINFORCED("SovStructureReinforced"),
        SOVSTRUCTURESELFDESTRUCTCANCEL("SovStructureSelfDestructCancel"),
        SOVSTRUCTURESELFDESTRUCTFINISHED("SovStructureSelfDestructFinished"),
        SOVSTRUCTURESELFDESTRUCTREQUESTED("SovStructureSelfDestructRequested"),
        SOVEREIGNTYIHDAMAGEMSG("SovereigntyIHDamageMsg"),
        SOVEREIGNTYSBUDAMAGEMSG("SovereigntySBUDamageMsg"),
        SOVEREIGNTYTCUDAMAGEMSG("SovereigntyTCUDamageMsg"),
        STATIONAGGRESSIONMSG1("StationAggressionMsg1"),
        STATIONAGGRESSIONMSG2("StationAggressionMsg2"),
        STATIONCONQUERMSG("StationConquerMsg"),
        STATIONSERVICEDISABLED("StationServiceDisabled"),
        STATIONSERVICEENABLED("StationServiceEnabled"),
        STATIONSTATECHANGEMSG("StationStateChangeMsg"),
        STORYLINEMISSIONAVAILABLEMSG("StoryLineMissionAvailableMsg"),
        STRUCTUREANCHORING("StructureAnchoring"),
        STRUCTURECOURIERCONTRACTCHANGED("StructureCourierContractChanged"),
        STRUCTUREDESTROYED("StructureDestroyed"),
        STRUCTUREFUELALERT("StructureFuelAlert"),
        STRUCTUREITEMSDELIVERED("StructureItemsDelivered"),
        STRUCTUREITEMSMOVEDTOSAFETY("StructureItemsMovedToSafety"),
        STRUCTURELOSTARMOR("StructureLostArmor"),
        STRUCTURELOSTSHIELDS("StructureLostShields"),
        STRUCTUREONLINE("StructureOnline"),
        STRUCTURESERVICESOFFLINE("StructureServicesOffline"),
        STRUCTUREUNANCHORING("StructureUnanchoring"),
        STRUCTUREUNDERATTACK("StructureUnderAttack"),
        STRUCTUREWENTHIGHPOWER("StructureWentHighPower"),
        STRUCTUREWENTLOWPOWER("StructureWentLowPower"),
        STRUCTURESREINFORCEMENTCHANGED("StructuresReinforcementChanged"),
        TOWERALERTMSG("TowerAlertMsg"),
        TOWERRESOURCEALERTMSG("TowerResourceAlertMsg"),
        TRANSACTIONREVERSALMSG("TransactionReversalMsg"),
        TUTORIALMSG("TutorialMsg"),
        WARALLYOFFERDECLINEDMSG("WarAllyOfferDeclinedMsg"),
        WARSURRENDERDECLINEDMSG("WarSurrenderDeclinedMsg"),
        WARSURRENDEROFFERMSG("WarSurrenderOfferMsg");
        public final String stringValue;
        private TypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static TypeEnum fromString(String str) {
            for (TypeEnum self : TypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
