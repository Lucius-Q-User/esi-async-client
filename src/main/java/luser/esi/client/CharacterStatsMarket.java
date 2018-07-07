package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterStatsMarket {
    private Long acceptContractsCourier;
    public void setAcceptContractsCourier(Long val) {
        acceptContractsCourier = val;
    }
    public Long getAcceptContractsCourier() {
        return acceptContractsCourier;
    }
    private Long acceptContractsItemExchange;
    public void setAcceptContractsItemExchange(Long val) {
        acceptContractsItemExchange = val;
    }
    public Long getAcceptContractsItemExchange() {
        return acceptContractsItemExchange;
    }
    private Long buyOrdersPlaced;
    public void setBuyOrdersPlaced(Long val) {
        buyOrdersPlaced = val;
    }
    public Long getBuyOrdersPlaced() {
        return buyOrdersPlaced;
    }
    private Long cancelMarketOrder;
    public void setCancelMarketOrder(Long val) {
        cancelMarketOrder = val;
    }
    public Long getCancelMarketOrder() {
        return cancelMarketOrder;
    }
    private Long createContractsAuction;
    public void setCreateContractsAuction(Long val) {
        createContractsAuction = val;
    }
    public Long getCreateContractsAuction() {
        return createContractsAuction;
    }
    private Long createContractsCourier;
    public void setCreateContractsCourier(Long val) {
        createContractsCourier = val;
    }
    public Long getCreateContractsCourier() {
        return createContractsCourier;
    }
    private Long createContractsItemExchange;
    public void setCreateContractsItemExchange(Long val) {
        createContractsItemExchange = val;
    }
    public Long getCreateContractsItemExchange() {
        return createContractsItemExchange;
    }
    private Long deliverCourierContract;
    public void setDeliverCourierContract(Long val) {
        deliverCourierContract = val;
    }
    public Long getDeliverCourierContract() {
        return deliverCourierContract;
    }
    private Long iskGained;
    public void setIskGained(Long val) {
        iskGained = val;
    }
    public Long getIskGained() {
        return iskGained;
    }
    private Long iskSpent;
    public void setIskSpent(Long val) {
        iskSpent = val;
    }
    public Long getIskSpent() {
        return iskSpent;
    }
    private Long modifyMarketOrder;
    public void setModifyMarketOrder(Long val) {
        modifyMarketOrder = val;
    }
    public Long getModifyMarketOrder() {
        return modifyMarketOrder;
    }
    private Long searchContracts;
    public void setSearchContracts(Long val) {
        searchContracts = val;
    }
    public Long getSearchContracts() {
        return searchContracts;
    }
    private Long sellOrdersPlaced;
    public void setSellOrdersPlaced(Long val) {
        sellOrdersPlaced = val;
    }
    public Long getSellOrdersPlaced() {
        return sellOrdersPlaced;
    }
    static CharacterStatsMarket fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterStatsMarket self = new CharacterStatsMarket();
        Map<String, Json> js = json.asJsonMap();
        self.acceptContractsCourier = ApiClientBase.optGetLong(js.get("accept_contracts_courier"));
        self.acceptContractsItemExchange = ApiClientBase.optGetLong(js.get("accept_contracts_item_exchange"));
        self.buyOrdersPlaced = ApiClientBase.optGetLong(js.get("buy_orders_placed"));
        self.cancelMarketOrder = ApiClientBase.optGetLong(js.get("cancel_market_order"));
        self.createContractsAuction = ApiClientBase.optGetLong(js.get("create_contracts_auction"));
        self.createContractsCourier = ApiClientBase.optGetLong(js.get("create_contracts_courier"));
        self.createContractsItemExchange = ApiClientBase.optGetLong(js.get("create_contracts_item_exchange"));
        self.deliverCourierContract = ApiClientBase.optGetLong(js.get("deliver_courier_contract"));
        self.iskGained = ApiClientBase.optGetLong(js.get("isk_gained"));
        self.iskSpent = ApiClientBase.optGetLong(js.get("isk_spent"));
        self.modifyMarketOrder = ApiClientBase.optGetLong(js.get("modify_market_order"));
        self.searchContracts = ApiClientBase.optGetLong(js.get("search_contracts"));
        self.sellOrdersPlaced = ApiClientBase.optGetLong(js.get("sell_orders_placed"));
        return self;
    }
}
