package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class OutpostInfo {
    private Coordinate coordinates;
    public void setCoordinates(Coordinate val) {
        coordinates = val;
    }
    public Coordinate getCoordinates() {
        return coordinates;
    }
    private float dockingCostPerShipVolume;
    public void setDockingCostPerShipVolume(float val) {
        dockingCostPerShipVolume = val;
    }
    public float getDockingCostPerShipVolume() {
        return dockingCostPerShipVolume;
    }
    private long officeRentalCost;
    public void setOfficeRentalCost(long val) {
        officeRentalCost = val;
    }
    public long getOfficeRentalCost() {
        return officeRentalCost;
    }
    private int ownerId;
    public void setOwnerId(int val) {
        ownerId = val;
    }
    public int getOwnerId() {
        return ownerId;
    }
    private float reprocessingEfficiency;
    public void setReprocessingEfficiency(float val) {
        reprocessingEfficiency = val;
    }
    public float getReprocessingEfficiency() {
        return reprocessingEfficiency;
    }
    private float reprocessingStationTake;
    public void setReprocessingStationTake(float val) {
        reprocessingStationTake = val;
    }
    public float getReprocessingStationTake() {
        return reprocessingStationTake;
    }
    private List<OutpostService> services;
    public void setServices(List<OutpostService> val) {
        services = val;
    }
    public List<OutpostService> getServices() {
        return services;
    }
    private int standingOwnerId;
    public void setStandingOwnerId(int val) {
        standingOwnerId = val;
    }
    public int getStandingOwnerId() {
        return standingOwnerId;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static OutpostInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        OutpostInfo self = new OutpostInfo();
        Map<String, Json> js = json.asJsonMap();
        self.coordinates = Coordinate.fromJson(js.get("coordinates"));
        self.dockingCostPerShipVolume = ApiClientBase.optGetFloat(js.get("docking_cost_per_ship_volume"));
        self.officeRentalCost = ApiClientBase.optGetLong(js.get("office_rental_cost"));
        self.ownerId = ApiClientBase.optGetInteger(js.get("owner_id"));
        self.reprocessingEfficiency = ApiClientBase.optGetFloat(js.get("reprocessing_efficiency"));
        self.reprocessingStationTake = ApiClientBase.optGetFloat(js.get("reprocessing_station_take"));
        {
            List<Json> jl = js.get("services").asJsonList();
            List<OutpostService> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, OutpostService.fromJson(jl.get(i)));
            }
            self.services = rt;
        }

        self.standingOwnerId = ApiClientBase.optGetInteger(js.get("standing_owner_id"));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
