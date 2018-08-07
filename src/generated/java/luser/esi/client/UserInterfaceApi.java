package luser.esi.client;


import java.util.concurrent.CompletableFuture;

public interface UserInterfaceApi {
    public ApiClient getApiClient();
    /**
     * Open the contract window inside the client
     * 
     * ---
     * 
     * @param contractId The contract to open
     * @return Open window request received
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> openContract(int contractId);
    /**
     * Open the information window for a character, corporation or alliance inside the client
     * 
     * ---
     * 
     * @param targetId The target to open
     * @return Open window request received
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> openInfoWindow(int targetId);
    /**
     * Open the market details window for a specific typeID inside the client
     * 
     * ---
     * 
     * @param typeId The item type to open in market window
     * @return Open window request received
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> openMarketWindow(int typeId);
    /**
     * Open the New Mail window, according to settings from the request if applicable
     * 
     * ---
     * 
     * @param newMail The details of mail to create
     * @return Open window request received
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> openMailCompose(NewMailOpenWindow newMail);
    /**
     * Set a solar system as autopilot waypoint
     * 
     * ---
     * 
     * @param addToBeginning Whether this solar system should be added to the beginning of all waypoints
     * @param clearOtherWaypoints Whether clean other waypoints beforing adding this one
     * @param destinationId The destination to travel to, can be solar system, station or structure's id
     * @return Open window request received
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> addWaypoint(boolean addToBeginning, boolean clearOtherWaypoints, long destinationId);
}
