package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsMarket implements ApiParameterObject {
    private Long acceptContractsCourier;
    /**
     * accept_contracts_courier integer
     */
    public void setAcceptContractsCourier(Long val) {
        acceptContractsCourier = val;
    }
    /**
     * accept_contracts_courier integer
     */
    @JsonProperty("accept_contracts_courier")
    public Long getAcceptContractsCourier() {
        return acceptContractsCourier;
    }
    private Long acceptContractsItemExchange;
    /**
     * accept_contracts_item_exchange integer
     */
    public void setAcceptContractsItemExchange(Long val) {
        acceptContractsItemExchange = val;
    }
    /**
     * accept_contracts_item_exchange integer
     */
    @JsonProperty("accept_contracts_item_exchange")
    public Long getAcceptContractsItemExchange() {
        return acceptContractsItemExchange;
    }
    private Long buyOrdersPlaced;
    /**
     * buy_orders_placed integer
     */
    public void setBuyOrdersPlaced(Long val) {
        buyOrdersPlaced = val;
    }
    /**
     * buy_orders_placed integer
     */
    @JsonProperty("buy_orders_placed")
    public Long getBuyOrdersPlaced() {
        return buyOrdersPlaced;
    }
    private Long cancelMarketOrder;
    /**
     * cancel_market_order integer
     */
    public void setCancelMarketOrder(Long val) {
        cancelMarketOrder = val;
    }
    /**
     * cancel_market_order integer
     */
    @JsonProperty("cancel_market_order")
    public Long getCancelMarketOrder() {
        return cancelMarketOrder;
    }
    private Long createContractsAuction;
    /**
     * create_contracts_auction integer
     */
    public void setCreateContractsAuction(Long val) {
        createContractsAuction = val;
    }
    /**
     * create_contracts_auction integer
     */
    @JsonProperty("create_contracts_auction")
    public Long getCreateContractsAuction() {
        return createContractsAuction;
    }
    private Long createContractsCourier;
    /**
     * create_contracts_courier integer
     */
    public void setCreateContractsCourier(Long val) {
        createContractsCourier = val;
    }
    /**
     * create_contracts_courier integer
     */
    @JsonProperty("create_contracts_courier")
    public Long getCreateContractsCourier() {
        return createContractsCourier;
    }
    private Long createContractsItemExchange;
    /**
     * create_contracts_item_exchange integer
     */
    public void setCreateContractsItemExchange(Long val) {
        createContractsItemExchange = val;
    }
    /**
     * create_contracts_item_exchange integer
     */
    @JsonProperty("create_contracts_item_exchange")
    public Long getCreateContractsItemExchange() {
        return createContractsItemExchange;
    }
    private Long deliverCourierContract;
    /**
     * deliver_courier_contract integer
     */
    public void setDeliverCourierContract(Long val) {
        deliverCourierContract = val;
    }
    /**
     * deliver_courier_contract integer
     */
    @JsonProperty("deliver_courier_contract")
    public Long getDeliverCourierContract() {
        return deliverCourierContract;
    }
    private Long iskGained;
    /**
     * isk_gained integer
     */
    public void setIskGained(Long val) {
        iskGained = val;
    }
    /**
     * isk_gained integer
     */
    @JsonProperty("isk_gained")
    public Long getIskGained() {
        return iskGained;
    }
    private Long iskSpent;
    /**
     * isk_spent integer
     */
    public void setIskSpent(Long val) {
        iskSpent = val;
    }
    /**
     * isk_spent integer
     */
    @JsonProperty("isk_spent")
    public Long getIskSpent() {
        return iskSpent;
    }
    private Long modifyMarketOrder;
    /**
     * modify_market_order integer
     */
    public void setModifyMarketOrder(Long val) {
        modifyMarketOrder = val;
    }
    /**
     * modify_market_order integer
     */
    @JsonProperty("modify_market_order")
    public Long getModifyMarketOrder() {
        return modifyMarketOrder;
    }
    private Long searchContracts;
    /**
     * search_contracts integer
     */
    public void setSearchContracts(Long val) {
        searchContracts = val;
    }
    /**
     * search_contracts integer
     */
    @JsonProperty("search_contracts")
    public Long getSearchContracts() {
        return searchContracts;
    }
    private Long sellOrdersPlaced;
    /**
     * sell_orders_placed integer
     */
    public void setSellOrdersPlaced(Long val) {
        sellOrdersPlaced = val;
    }
    /**
     * sell_orders_placed integer
     */
    @JsonProperty("sell_orders_placed")
    public Long getSellOrdersPlaced() {
        return sellOrdersPlaced;
    }
}
