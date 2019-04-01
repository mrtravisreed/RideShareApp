public class ApplicationInformation extends DriversLicenceInformation{


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
    public ApplicationInformation(Integer licenceNumber, String issueState, String issueCountry, DriverName driverName, DriversAddress driversAddress, DriverBirthday driverBirthday, VehicleInsurance vehicleInsurance, IssueDate issueDate, ExperationDate expirationDate) {
        super(licenceNumber, issueState, issueCountry, driverName, driversAddress, driverBirthday, vehicleInsurance, issueDate, expirationDate);
    }
}
