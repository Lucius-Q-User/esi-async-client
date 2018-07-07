package luser.esi.client;

public class ApiClient extends ApiClientBase {
    private AllianceApi allianceApi = new AllianceApi(this);
    public AllianceApi getAllianceApi() {
        return allianceApi;
    }
    private ContactsApi contactsApi = new ContactsApi(this);
    public ContactsApi getContactsApi() {
        return contactsApi;
    }
    private CharacterApi characterApi = new CharacterApi(this);
    public CharacterApi getCharacterApi() {
        return characterApi;
    }
    private AssetsApi assetsApi = new AssetsApi(this);
    public AssetsApi getAssetsApi() {
        return assetsApi;
    }
    private SkillsApi skillsApi = new SkillsApi(this);
    public SkillsApi getSkillsApi() {
        return skillsApi;
    }
    private CalendarApi calendarApi = new CalendarApi(this);
    public CalendarApi getCalendarApi() {
        return calendarApi;
    }
    private ContractsApi contractsApi = new ContractsApi(this);
    public ContractsApi getContractsApi() {
        return contractsApi;
    }
    private FittingsApi fittingsApi = new FittingsApi(this);
    public FittingsApi getFittingsApi() {
        return fittingsApi;
    }
    private FleetsApi fleetsApi = new FleetsApi(this);
    public FleetsApi getFleetsApi() {
        return fleetsApi;
    }
    private FactionWarfareApi factionWarfareApi = new FactionWarfareApi(this);
    public FactionWarfareApi getFactionWarfareApi() {
        return factionWarfareApi;
    }
    private ClonesApi clonesApi = new ClonesApi(this);
    public ClonesApi getClonesApi() {
        return clonesApi;
    }
    private IndustryApi industryApi = new IndustryApi(this);
    public IndustryApi getIndustryApi() {
        return industryApi;
    }
    private KillmailsApi killmailsApi = new KillmailsApi(this);
    public KillmailsApi getKillmailsApi() {
        return killmailsApi;
    }
    private LocationApi locationApi = new LocationApi(this);
    public LocationApi getLocationApi() {
        return locationApi;
    }
    private LoyaltyApi loyaltyApi = new LoyaltyApi(this);
    public LoyaltyApi getLoyaltyApi() {
        return loyaltyApi;
    }
    private MailApi mailApi = new MailApi(this);
    public MailApi getMailApi() {
        return mailApi;
    }
    private OpportunitiesApi opportunitiesApi = new OpportunitiesApi(this);
    public OpportunitiesApi getOpportunitiesApi() {
        return opportunitiesApi;
    }
    private MarketApi marketApi = new MarketApi(this);
    public MarketApi getMarketApi() {
        return marketApi;
    }
    private PlanetaryInteractionApi planetaryInteractionApi = new PlanetaryInteractionApi(this);
    public PlanetaryInteractionApi getPlanetaryInteractionApi() {
        return planetaryInteractionApi;
    }
    private WalletApi walletApi = new WalletApi(this);
    public WalletApi getWalletApi() {
        return walletApi;
    }
    private CorporationApi corporationApi = new CorporationApi(this);
    public CorporationApi getCorporationApi() {
        return corporationApi;
    }
    private BookmarksApi bookmarksApi = new BookmarksApi(this);
    public BookmarksApi getBookmarksApi() {
        return bookmarksApi;
    }
    private DogmaApi dogmaApi = new DogmaApi(this);
    public DogmaApi getDogmaApi() {
        return dogmaApi;
    }
    private IncursionsApi incursionsApi = new IncursionsApi(this);
    public IncursionsApi getIncursionsApi() {
        return incursionsApi;
    }
    private InsuranceApi insuranceApi = new InsuranceApi(this);
    public InsuranceApi getInsuranceApi() {
        return insuranceApi;
    }
    private RoutesApi routesApi = new RoutesApi(this);
    public RoutesApi getRoutesApi() {
        return routesApi;
    }
    private SovereigntyApi sovereigntyApi = new SovereigntyApi(this);
    public SovereigntyApi getSovereigntyApi() {
        return sovereigntyApi;
    }
    private StatusApi statusApi = new StatusApi(this);
    public StatusApi getStatusApi() {
        return statusApi;
    }
    private UserInterfaceApi userInterfaceApi = new UserInterfaceApi(this);
    public UserInterfaceApi getUserInterfaceApi() {
        return userInterfaceApi;
    }
    private UniverseApi universeApi = new UniverseApi(this);
    public UniverseApi getUniverseApi() {
        return universeApi;
    }
    private WarsApi warsApi = new WarsApi(this);
    public WarsApi getWarsApi() {
        return warsApi;
    }
    private SearchApi searchApi = new SearchApi(this);
    public SearchApi getSearchApi() {
        return searchApi;
    }
}
