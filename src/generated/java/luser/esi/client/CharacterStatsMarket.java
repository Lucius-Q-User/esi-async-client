package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsMarket implements ApiParameterObject {
    private Long acceptContractsCourier;
    public void setAcceptContractsCourier(Long val) {
        acceptContractsCourier = val;
    }
    @JsonProperty("accept_contracts_courier")
    public Long getAcceptContractsCourier() {
        return acceptContractsCourier;
    }
    private Long acceptContractsItemExchange;
    public void setAcceptContractsItemExchange(Long val) {
        acceptContractsItemExchange = val;
    }
    @JsonProperty("accept_contracts_item_exchange")
    public Long getAcceptContractsItemExchange() {
        return acceptContractsItemExchange;
    }
    private Long buyOrdersPlaced;
    public void setBuyOrdersPlaced(Long val) {
        buyOrdersPlaced = val;
    }
    @JsonProperty("buy_orders_placed")
    public Long getBuyOrdersPlaced() {
        return buyOrdersPlaced;
    }
    private Long cancelMarketOrder;
    public void setCancelMarketOrder(Long val) {
        cancelMarketOrder = val;
    }
    @JsonProperty("cancel_market_order")
    public Long getCancelMarketOrder() {
        return cancelMarketOrder;
    }
    private Long createContractsAuction;
    public void setCreateContractsAuction(Long val) {
        createContractsAuction = val;
    }
    @JsonProperty("create_contracts_auction")
    public Long getCreateContractsAuction() {
        return createContractsAuction;
    }
    private Long createContractsCourier;
    public void setCreateContractsCourier(Long val) {
        createContractsCourier = val;
    }
    @JsonProperty("create_contracts_courier")
    public Long getCreateContractsCourier() {
        return createContractsCourier;
    }
    private Long createContractsItemExchange;
    public void setCreateContractsItemExchange(Long val) {
        createContractsItemExchange = val;
    }
    @JsonProperty("create_contracts_item_exchange")
    public Long getCreateContractsItemExchange() {
        return createContractsItemExchange;
    }
    private Long deliverCourierContract;
    public void setDeliverCourierContract(Long val) {
        deliverCourierContract = val;
    }
    @JsonProperty("deliver_courier_contract")
    public Long getDeliverCourierContract() {
        return deliverCourierContract;
    }
    private Long iskGained;
    public void setIskGained(Long val) {
        iskGained = val;
    }
    @JsonProperty("isk_gained")
    public Long getIskGained() {
        return iskGained;
    }
    private Long iskSpent;
    public void setIskSpent(Long val) {
        iskSpent = val;
    }
    @JsonProperty("isk_spent")
    public Long getIskSpent() {
        return iskSpent;
    }
    private Long modifyMarketOrder;
    public void setModifyMarketOrder(Long val) {
        modifyMarketOrder = val;
    }
    @JsonProperty("modify_market_order")
    public Long getModifyMarketOrder() {
        return modifyMarketOrder;
    }
    private Long searchContracts;
    public void setSearchContracts(Long val) {
        searchContracts = val;
    }
    @JsonProperty("search_contracts")
    public Long getSearchContracts() {
        return searchContracts;
    }
    private Long sellOrdersPlaced;
    public void setSellOrdersPlaced(Long val) {
        sellOrdersPlaced = val;
    }
    @JsonProperty("sell_orders_placed")
    public Long getSellOrdersPlaced() {
        return sellOrdersPlaced;
    }
}
