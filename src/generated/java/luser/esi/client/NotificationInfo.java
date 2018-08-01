package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class NotificationInfo {
    private Boolean isRead;
    /**
     * is_read boolean
     */
    public void setIsRead(Boolean val) {
        isRead = val;
    }
    /**
     * is_read boolean
     */
    @JsonProperty("is_read")
    public Boolean getIsRead() {
        return isRead;
    }
    private long notificationId;
    /**
     * notification_id integer
     */
    public void setNotificationId(long val) {
        notificationId = val;
    }
    /**
     * notification_id integer
     */
    @JsonProperty("notification_id")
    public long getNotificationId() {
        return notificationId;
    }
    private int senderId;
    /**
     * sender_id integer
     */
    public void setSenderId(int val) {
        senderId = val;
    }
    /**
     * sender_id integer
     */
    @JsonProperty("sender_id")
    public int getSenderId() {
        return senderId;
    }
    private SenderTypeEnum senderType;
    /**
     * sender_type string
     */
    public void setSenderType(SenderTypeEnum val) {
        senderType = val;
    }
    /**
     * sender_type string
     */
    @JsonProperty("sender_type")
    public SenderTypeEnum getSenderType() {
        return senderType;
    }
    private String text;
    /**
     * text string
     */
    public void setText(String val) {
        text = val;
    }
    /**
     * text string
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }
    private Instant timestamp;
    /**
     * timestamp string
     */
    public void setTimestamp(Instant val) {
        timestamp = val;
    }
    /**
     * timestamp string
     */
    @JsonProperty("timestamp")
    public Instant getTimestamp() {
        return timestamp;
    }
    private TypeEnum type;
    /**
     * type string
     */
    public void setType(TypeEnum val) {
        type = val;
    }
    /**
     * type string
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }
    public static enum SenderTypeEnum {
        CHARACTER("character"),
        CORPORATION("corporation"),
        ALLIANCE("alliance"),
        FACTION("faction"),
        OTHER("other");
        private final String stringValue;
        private SenderTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
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
        private final String stringValue;
        private TypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
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
