

public class PerspectiveDriver implements IPerspectiveDriver {

    DriverName driverName;
    DriverBirthday driverBirthday;
    DriversLicenceInformation driversLicenceInformation;
    Vehicle vehicle;
    VehicleInsurance vehicleInsurance;
    DriversHistory driversHistory;
    Violation violation;

    /**
     * constructors for:
     * @param driverName
     * @param driverBirthday
     * @param driversLicenceInformation
     * @param vehicle
     * @param vehicleInsurance
     * @param driversHistory
     * @param violation
     */
    public PerspectiveDriver(DriverName driverName, DriverBirthday driverBirthday, DriversLicenceInformation driversLicenceInformation, Vehicle vehicle, VehicleInsurance vehicleInsurance, DriversHistory driversHistory, Violation violation) {
        this.driverName = driverName;
        this.driverBirthday = driverBirthday;
        this.driversLicenceInformation = driversLicenceInformation;
        this.vehicle = vehicle;
        this.vehicleInsurance = vehicleInsurance;
        this.driversHistory = driversHistory;
        this.violation = violation;
    }

    /**
     * gets driver name
     *
     * @return driver name
     */
    public DriverName getDriverName() {
        return this.driverName;
    }

    /**
     * gets driver birthday
     *
     * @return driver birthday
     */
    public DriverBirthday getDriverBirthday() {
        return this.driverBirthday;
    }

    /**
     * gets drivers licence info
     *
     * @return drivers licence information
     */
    public DriversLicenceInformation getDriversLicenceInformation() {
        return this.driversLicenceInformation;
    }

    /**
     * gets vehicle
     *
     * @return vehicle
     */
    public Vehicle getVehicle() {
        return this.vehicle;
    }

    /**
     * gets vehicle insurance
     *
     * @return vehicle insurance
     */
    public VehicleInsurance getVehicleInsurance() {
        return this.vehicleInsurance;
    }

    /**
     * gets driver history
     *
     * @return driver history
     */
    public DriversHistory getDriversHistory() {
        return this.driversHistory;
    }

    /**
     * gets violation
     *
     * @return violation
     */
    public Violation getViolation() {
        return this.violation;
    }
}
