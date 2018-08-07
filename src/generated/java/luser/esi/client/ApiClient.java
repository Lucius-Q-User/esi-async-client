package luser.esi.client;

public class ApiClient extends ApiClientBase {
    private AllianceApi allianceApi = new AllianceApiImpl(this);
    public AllianceApi getAllianceApi() {
        return allianceApi;
    }
    private ContactsApi contactsApi = new ContactsApiImpl(this);
    public ContactsApi getContactsApi() {
        return contactsApi;
    }
    private CharacterApi characterApi = new CharacterApiImpl(this);
    public CharacterApi getCharacterApi() {
        return characterApi;
    }
    private AssetsApi assetsApi = new AssetsApiImpl(this);
    public AssetsApi getAssetsApi() {
        return assetsApi;
    }
    private SkillsApi skillsApi = new SkillsApiImpl(this);
    public SkillsApi getSkillsApi() {
        return skillsApi;
    }
    private CalendarApi calendarApi = new CalendarApiImpl(this);
    public CalendarApi getCalendarApi() {
        return calendarApi;
    }
    private ContractsApi contractsApi = new ContractsApiImpl(this);
    public ContractsApi getContractsApi() {
        return contractsApi;
    }
    private FittingsApi fittingsApi = new FittingsApiImpl(this);
    public FittingsApi getFittingsApi() {
        return fittingsApi;
    }
    private FleetsApi fleetsApi = new FleetsApiImpl(this);
    public FleetsApi getFleetsApi() {
        return fleetsApi;
    }
    private FactionWarfareApi factionWarfareApi = new FactionWarfareApiImpl(this);
    public FactionWarfareApi getFactionWarfareApi() {
        return factionWarfareApi;
    }
    private ClonesApi clonesApi = new ClonesApiImpl(this);
    public ClonesApi getClonesApi() {
        return clonesApi;
    }
    private IndustryApi industryApi = new IndustryApiImpl(this);
    public IndustryApi getIndustryApi() {
        return industryApi;
    }
    private KillmailsApi killmailsApi = new KillmailsApiImpl(this);
    public KillmailsApi getKillmailsApi() {
        return killmailsApi;
    }
    private LocationApi locationApi = new LocationApiImpl(this);
    public LocationApi getLocationApi() {
        return locationApi;
    }
    private LoyaltyApi loyaltyApi = new LoyaltyApiImpl(this);
    public LoyaltyApi getLoyaltyApi() {
        return loyaltyApi;
    }
    private MailApi mailApi = new MailApiImpl(this);
    public MailApi getMailApi() {
        return mailApi;
    }
    private OpportunitiesApi opportunitiesApi = new OpportunitiesApiImpl(this);
    public OpportunitiesApi getOpportunitiesApi() {
        return opportunitiesApi;
    }
    private MarketApi marketApi = new MarketApiImpl(this);
    public MarketApi getMarketApi() {
        return marketApi;
    }
    private PlanetaryInteractionApi planetaryInteractionApi = new PlanetaryInteractionApiImpl(this);
    public PlanetaryInteractionApi getPlanetaryInteractionApi() {
        return planetaryInteractionApi;
    }
    private WalletApi walletApi = new WalletApiImpl(this);
    public WalletApi getWalletApi() {
        return walletApi;
    }
    private CorporationApi corporationApi = new CorporationApiImpl(this);
    public CorporationApi getCorporationApi() {
        return corporationApi;
    }
    private BookmarksApi bookmarksApi = new BookmarksApiImpl(this);
    public BookmarksApi getBookmarksApi() {
        return bookmarksApi;
    }
    private DogmaApi dogmaApi = new DogmaApiImpl(this);
    public DogmaApi getDogmaApi() {
        return dogmaApi;
    }
    private IncursionsApi incursionsApi = new IncursionsApiImpl(this);
    public IncursionsApi getIncursionsApi() {
        return incursionsApi;
    }
    private InsuranceApi insuranceApi = new InsuranceApiImpl(this);
    public InsuranceApi getInsuranceApi() {
        return insuranceApi;
    }
    private RoutesApi routesApi = new RoutesApiImpl(this);
    public RoutesApi getRoutesApi() {
        return routesApi;
    }
    private SovereigntyApi sovereigntyApi = new SovereigntyApiImpl(this);
    public SovereigntyApi getSovereigntyApi() {
        return sovereigntyApi;
    }
    private StatusApi statusApi = new StatusApiImpl(this);
    public StatusApi getStatusApi() {
        return statusApi;
    }
    private UserInterfaceApi userInterfaceApi = new UserInterfaceApiImpl(this);
    public UserInterfaceApi getUserInterfaceApi() {
        return userInterfaceApi;
    }
    private UniverseApi universeApi = new UniverseApiImpl(this);
    public UniverseApi getUniverseApi() {
        return universeApi;
    }
    private WarsApi warsApi = new WarsApiImpl(this);
    public WarsApi getWarsApi() {
        return warsApi;
    }
    private SearchApi searchApi = new SearchApiImpl(this);
    public SearchApi getSearchApi() {
        return searchApi;
    }
}
