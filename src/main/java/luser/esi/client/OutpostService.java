package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class OutpostService {
    private double discountPerGoodStanding;
    public void setDiscountPerGoodStanding(double val) {
        discountPerGoodStanding = val;
    }
    public double getDiscountPerGoodStanding() {
        return discountPerGoodStanding;
    }
    private double minimumStanding;
    public void setMinimumStanding(double val) {
        minimumStanding = val;
    }
    public double getMinimumStanding() {
        return minimumStanding;
    }
    private ServiceNameEnum serviceName;
    public void setServiceName(ServiceNameEnum val) {
        serviceName = val;
    }
    public ServiceNameEnum getServiceName() {
        return serviceName;
    }
    private double surchargePerBadStanding;
    public void setSurchargePerBadStanding(double val) {
        surchargePerBadStanding = val;
    }
    public double getSurchargePerBadStanding() {
        return surchargePerBadStanding;
    }
    static OutpostService fromJson(Json json) {
        if (json == null) {
            return null;
        }
        OutpostService self = new OutpostService();
        Map<String, Json> js = json.asJsonMap();
        self.discountPerGoodStanding = ApiClientBase.optGetDouble(js.get("discount_per_good_standing"));
        self.minimumStanding = ApiClientBase.optGetDouble(js.get("minimum_standing"));
        self.serviceName = ServiceNameEnum.fromString(ApiClientBase.optGetString(js.get("service_name")));
        self.surchargePerBadStanding = ApiClientBase.optGetDouble(js.get("surcharge_per_bad_standing"));
        return self;
    }
    public static enum ServiceNameEnum {
        BOUNTY_MISSIONS("Bounty Missions"),
        ASSASSINATION_MISSIONS("Assassination Missions"),
        COURIER_MISSIONS("Courier Missions"),
        INTERBUS("Interbus"),
        REPROCESSING_PLANT("Reprocessing Plant"),
        REFINERY("Refinery"),
        MARKET("Market"),
        BLACK_MARKET("Black Market"),
        STOCK_EXCHANGE("Stock Exchange"),
        CLONING("Cloning"),
        SURGERY("Surgery"),
        DNA_THERAPY("DNA Therapy"),
        REPAIR_FACILITIES("Repair Facilities"),
        FACTORY("Factory"),
        LABORATORY("Laboratory"),
        GAMBLING("Gambling"),
        FITTING("Fitting"),
        PAINTSHOP("Paintshop"),
        NEWS("News"),
        STORAGE("Storage"),
        INSURANCE("Insurance"),
        DOCKING("Docking"),
        OFFICE_RENTAL("Office Rental"),
        JUMP_CLONE_FACILITY("Jump Clone Facility"),
        LOYALTY_POINT_STORE("Loyalty Point Store"),
        NAVY_OFFICES("Navy Offices"),
        SECURITY_OFFICE("Security Office");
        public final String stringValue;
        private ServiceNameEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static ServiceNameEnum fromString(String str) {
            for (ServiceNameEnum self : ServiceNameEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
