package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class WalletJournalEntry {
    private Double amount;
    public void setAmount(Double val) {
        amount = val;
    }
    public Double getAmount() {
        return amount;
    }
    private Double balance;
    public void setBalance(Double val) {
        balance = val;
    }
    public Double getBalance() {
        return balance;
    }
    private Long contextId;
    public void setContextId(Long val) {
        contextId = val;
    }
    public Long getContextId() {
        return contextId;
    }
    private ContextIdTypeEnum contextIdType;
    public void setContextIdType(ContextIdTypeEnum val) {
        contextIdType = val;
    }
    public ContextIdTypeEnum getContextIdType() {
        return contextIdType;
    }
    private Instant date;
    public void setDate(Instant val) {
        date = val;
    }
    public Instant getDate() {
        return date;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private Integer firstPartyId;
    public void setFirstPartyId(Integer val) {
        firstPartyId = val;
    }
    public Integer getFirstPartyId() {
        return firstPartyId;
    }
    private long id;
    public void setId(long val) {
        id = val;
    }
    public long getId() {
        return id;
    }
    private String reason;
    public void setReason(String val) {
        reason = val;
    }
    public String getReason() {
        return reason;
    }
    private RefTypeEnum refType;
    public void setRefType(RefTypeEnum val) {
        refType = val;
    }
    public RefTypeEnum getRefType() {
        return refType;
    }
    private Integer secondPartyId;
    public void setSecondPartyId(Integer val) {
        secondPartyId = val;
    }
    public Integer getSecondPartyId() {
        return secondPartyId;
    }
    private Double tax;
    public void setTax(Double val) {
        tax = val;
    }
    public Double getTax() {
        return tax;
    }
    private Integer taxReceiverId;
    public void setTaxReceiverId(Integer val) {
        taxReceiverId = val;
    }
    public Integer getTaxReceiverId() {
        return taxReceiverId;
    }
    static WalletJournalEntry fromJson(Json json) {
        if (json == null) {
            return null;
        }
        WalletJournalEntry self = new WalletJournalEntry();
        Map<String, Json> js = json.asJsonMap();
        self.amount = ApiClientBase.optGetDouble(js.get("amount"));
        self.balance = ApiClientBase.optGetDouble(js.get("balance"));
        self.contextId = ApiClientBase.optGetLong(js.get("context_id"));
        self.contextIdType = ContextIdTypeEnum.fromString(ApiClientBase.optGetString(js.get("context_id_type")));
        self.date = ApiClientBase.optGetInstant(js.get("date"));
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.firstPartyId = ApiClientBase.optGetInteger(js.get("first_party_id"));
        self.id = ApiClientBase.optGetLong(js.get("id"));
        self.reason = ApiClientBase.optGetString(js.get("reason"));
        self.refType = RefTypeEnum.fromString(ApiClientBase.optGetString(js.get("ref_type")));
        self.secondPartyId = ApiClientBase.optGetInteger(js.get("second_party_id"));
        self.tax = ApiClientBase.optGetDouble(js.get("tax"));
        self.taxReceiverId = ApiClientBase.optGetInteger(js.get("tax_receiver_id"));
        return self;
    }
    public static enum ContextIdTypeEnum {
        STRUCTURE_ID("structure_id"),
        STATION_ID("station_id"),
        MARKET_TRANSACTION_ID("market_transaction_id"),
        CHARACTER_ID("character_id"),
        CORPORATION_ID("corporation_id"),
        ALLIANCE_ID("alliance_id"),
        EVE_SYSTEM("eve_system"),
        INDUSTRY_JOB_ID("industry_job_id"),
        CONTRACT_ID("contract_id"),
        PLANET_ID("planet_id"),
        SYSTEM_ID("system_id"),
        TYPE_ID("type_id");
        public final String stringValue;
        private ContextIdTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static ContextIdTypeEnum fromString(String str) {
            for (ContextIdTypeEnum self : ContextIdTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum RefTypeEnum {
        ACCELERATION_GATE_FEE("acceleration_gate_fee"),
        ADVERTISEMENT_LISTING_FEE("advertisement_listing_fee"),
        AGENT_DONATION("agent_donation"),
        AGENT_LOCATION_SERVICES("agent_location_services"),
        AGENT_MISCELLANEOUS("agent_miscellaneous"),
        AGENT_MISSION_COLLATERAL_PAID("agent_mission_collateral_paid"),
        AGENT_MISSION_COLLATERAL_REFUNDED("agent_mission_collateral_refunded"),
        AGENT_MISSION_REWARD("agent_mission_reward"),
        AGENT_MISSION_REWARD_CORPORATION_TAX("agent_mission_reward_corporation_tax"),
        AGENT_MISSION_TIME_BONUS_REWARD("agent_mission_time_bonus_reward"),
        AGENT_MISSION_TIME_BONUS_REWARD_CORPORATION_TAX("agent_mission_time_bonus_reward_corporation_tax"),
        AGENT_SECURITY_SERVICES("agent_security_services"),
        AGENT_SERVICES_RENDERED("agent_services_rendered"),
        AGENTS_PREWARD("agents_preward"),
        ALLIANCE_MAINTAINANCE_FEE("alliance_maintainance_fee"),
        ALLIANCE_REGISTRATION_FEE("alliance_registration_fee"),
        ASSET_SAFETY_RECOVERY_TAX("asset_safety_recovery_tax"),
        BOUNTY("bounty"),
        BOUNTY_PRIZE("bounty_prize"),
        BOUNTY_PRIZE_CORPORATION_TAX("bounty_prize_corporation_tax"),
        BOUNTY_PRIZES("bounty_prizes"),
        BOUNTY_REIMBURSEMENT("bounty_reimbursement"),
        BOUNTY_SURCHARGE("bounty_surcharge"),
        BROKERS_FEE("brokers_fee"),
        CLONE_ACTIVATION("clone_activation"),
        CLONE_TRANSFER("clone_transfer"),
        CONTRABAND_FINE("contraband_fine"),
        CONTRACT_AUCTION_BID("contract_auction_bid"),
        CONTRACT_AUCTION_BID_CORP("contract_auction_bid_corp"),
        CONTRACT_AUCTION_BID_REFUND("contract_auction_bid_refund"),
        CONTRACT_AUCTION_SOLD("contract_auction_sold"),
        CONTRACT_BROKERS_FEE("contract_brokers_fee"),
        CONTRACT_BROKERS_FEE_CORP("contract_brokers_fee_corp"),
        CONTRACT_COLLATERAL("contract_collateral"),
        CONTRACT_COLLATERAL_DEPOSITED_CORP("contract_collateral_deposited_corp"),
        CONTRACT_COLLATERAL_PAYOUT("contract_collateral_payout"),
        CONTRACT_COLLATERAL_REFUND("contract_collateral_refund"),
        CONTRACT_DEPOSIT("contract_deposit"),
        CONTRACT_DEPOSIT_CORP("contract_deposit_corp"),
        CONTRACT_DEPOSIT_REFUND("contract_deposit_refund"),
        CONTRACT_DEPOSIT_SALES_TAX("contract_deposit_sales_tax"),
        CONTRACT_PRICE("contract_price"),
        CONTRACT_PRICE_PAYMENT_CORP("contract_price_payment_corp"),
        CONTRACT_REVERSAL("contract_reversal"),
        CONTRACT_REWARD("contract_reward"),
        CONTRACT_REWARD_DEPOSITED("contract_reward_deposited"),
        CONTRACT_REWARD_DEPOSITED_CORP("contract_reward_deposited_corp"),
        CONTRACT_REWARD_REFUND("contract_reward_refund"),
        CONTRACT_SALES_TAX("contract_sales_tax"),
        COPYING("copying"),
        CORPORATE_REWARD_PAYOUT("corporate_reward_payout"),
        CORPORATE_REWARD_TAX("corporate_reward_tax"),
        CORPORATION_ACCOUNT_WITHDRAWAL("corporation_account_withdrawal"),
        CORPORATION_BULK_PAYMENT("corporation_bulk_payment"),
        CORPORATION_DIVIDEND_PAYMENT("corporation_dividend_payment"),
        CORPORATION_LIQUIDATION("corporation_liquidation"),
        CORPORATION_LOGO_CHANGE_COST("corporation_logo_change_cost"),
        CORPORATION_PAYMENT("corporation_payment"),
        CORPORATION_REGISTRATION_FEE("corporation_registration_fee"),
        COURIER_MISSION_ESCROW("courier_mission_escrow"),
        CSPA("cspa"),
        CSPAOFFLINEREFUND("cspaofflinerefund"),
        DATACORE_FEE("datacore_fee"),
        DNA_MODIFICATION_FEE("dna_modification_fee"),
        DOCKING_FEE("docking_fee"),
        DUEL_WAGER_ESCROW("duel_wager_escrow"),
        DUEL_WAGER_PAYMENT("duel_wager_payment"),
        DUEL_WAGER_REFUND("duel_wager_refund"),
        FACTORY_SLOT_RENTAL_FEE("factory_slot_rental_fee"),
        GM_CASH_TRANSFER("gm_cash_transfer"),
        INDUSTRY_JOB_TAX("industry_job_tax"),
        INFRASTRUCTURE_HUB_MAINTENANCE("infrastructure_hub_maintenance"),
        INHERITANCE("inheritance"),
        INSURANCE("insurance"),
        JUMP_CLONE_ACTIVATION_FEE("jump_clone_activation_fee"),
        JUMP_CLONE_INSTALLATION_FEE("jump_clone_installation_fee"),
        KILL_RIGHT_FEE("kill_right_fee"),
        LP_STORE("lp_store"),
        MANUFACTURING("manufacturing"),
        MARKET_ESCROW("market_escrow"),
        MARKET_FINE_PAID("market_fine_paid"),
        MARKET_TRANSACTION("market_transaction"),
        MEDAL_CREATION("medal_creation"),
        MEDAL_ISSUED("medal_issued"),
        MISSION_COMPLETION("mission_completion"),
        MISSION_COST("mission_cost"),
        MISSION_EXPIRATION("mission_expiration"),
        MISSION_REWARD("mission_reward"),
        OFFICE_RENTAL_FEE("office_rental_fee"),
        OPERATION_BONUS("operation_bonus"),
        OPPORTUNITY_REWARD("opportunity_reward"),
        PLANETARY_CONSTRUCTION("planetary_construction"),
        PLANETARY_EXPORT_TAX("planetary_export_tax"),
        PLANETARY_IMPORT_TAX("planetary_import_tax"),
        PLAYER_DONATION("player_donation"),
        PLAYER_TRADING("player_trading"),
        PROJECT_DISCOVERY_REWARD("project_discovery_reward"),
        PROJECT_DISCOVERY_TAX("project_discovery_tax"),
        REACTION("reaction"),
        RELEASE_OF_IMPOUNDED_PROPERTY("release_of_impounded_property"),
        REPAIR_BILL("repair_bill"),
        REPROCESSING_TAX("reprocessing_tax"),
        RESEARCHING_MATERIAL_PRODUCTIVITY("researching_material_productivity"),
        RESEARCHING_TECHNOLOGY("researching_technology"),
        RESEARCHING_TIME_PRODUCTIVITY("researching_time_productivity"),
        RESOURCE_WARS_REWARD("resource_wars_reward"),
        REVERSE_ENGINEERING("reverse_engineering"),
        SECURITY_PROCESSING_FEE("security_processing_fee"),
        SHARES("shares"),
        SOVEREIGNITY_BILL("sovereignity_bill"),
        STORE_PURCHASE("store_purchase"),
        STORE_PURCHASE_REFUND("store_purchase_refund"),
        TRANSACTION_TAX("transaction_tax"),
        UPKEEP_ADJUSTMENT_FEE("upkeep_adjustment_fee"),
        WAR_ALLY_CONTRACT("war_ally_contract"),
        WAR_FEE("war_fee"),
        WAR_FEE_SURRENDER("war_fee_surrender");
        public final String stringValue;
        private RefTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static RefTypeEnum fromString(String str) {
            for (RefTypeEnum self : RefTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
