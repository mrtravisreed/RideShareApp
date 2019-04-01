

public class DriversLicenceInformation {


    //unique number
    private Integer licenceNumber;
    private String issueState;
    private String issueCountry;
    private DriverName driverName;
    private DriversAddress driversAddress;
    private DriverBirthday driverBirthday;
    private VehicleInsurance vehicleInsurance;
    private IssueDate issueDate;
    private ExperationDate expirationDate;

    /**
     * constructor for:
     *
     * @param licenceNumber
     * @param issueState
     * @param issueCountry
     * @param driverName
     * @param driversAddress
     * @param driverBirthday
     * @param vehicleInsurance
     * @param issueDate
     * @param expirationDate
     */
    public DriversLicenceInformation(Integer licenceNumber, String issueState, String issueCountry, DriverName driverName, DriversAddress driversAddress, DriverBirthday driverBirthday, VehicleInsurance vehicleInsurance, IssueDate issueDate, ExperationDate expirationDate) {
        this.licenceNumber = licenceNumber;
        this.issueState = issueState;
        this.issueCountry = issueCountry;
        this.driverName = driverName;
        this.driversAddress = driversAddress;
        this.driverBirthday = driverBirthday;
        this.vehicleInsurance = vehicleInsurance;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
    }

    public Integer getLicenceNumber() {
        return licenceNumber;
    }

    /**
     * gest issue state
     * @return issue state
     */
    public String getIssueState() {
        return issueState;
    }

    /**
     * gets issue country
     * @return issue country
     */
    public String getIssueCountry() {
        return issueCountry;
    }

    /**
     * gets driver name
     * @return driver name
     */
    public DriverName getDriverName() {
        return driverName;
    }

    /**
     * gets driver address
     * @returndriver adress
     */
    public DriversAddress getDriversAddress() {
        return driversAddress;
    }

    /**
     * gets driver birthday
     * @return driver birthday
     */
    public DriverBirthday getDriverBirthday() {
        return driverBirthday;
    }

    /**
     * gets vehicle insurance
     * @return vehicle insurance
     */
    public VehicleInsurance getVehicleInsurance() {
        return vehicleInsurance;
    }

    /**
     * gets issue date
     * @return issue date
     */
    public IssueDate getIssueDate() {
        return issueDate;
    }

    /**
     *gets experation date
     * @return experation date
     */
    public ExperationDate getExpirationDate() {
        return expirationDate;
    }
}
