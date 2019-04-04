import java.time.LocalDate;
import java.util.ArrayList;

/**
 * ProspectiveDriver keeps track of an application for a prospective driver for a ride-share
 * business. Will keep track of the driver's name, birth date, license information, vehicle
 * information, vehicle insurance information, and driver's history.
 *
 */
public class ProspectiveDriver {

  /**
   * The driver's name.
   */
  protected Name driverName;

  /**
   * The driver's birth date.
   */
  protected LocalDate driverBirthDate;

  /**
   * The driver's license information.
   */
  protected DriverLicense driverLicense;

  /**
   * The vehicle's information.
   */
  protected VehicleInformation vehicleInformation;

  /**
   * The vehicle's information.
   */
  protected VehicleInsuranceInformation vehicleInsuranceInformation;

  /**
   * The driver's history of violations.
   */
  protected ArrayList<AbstractViolation> driverHistory;

  /**
   * Creates a new ProspectiveDriver application, given the driver's name, birth date, driver
   * license, vehicle information, and driver history.
   *
   * @param driverName the name of the driver
   * @param driverBirthDate the driver's birth date
   * @param driverLicense the driver's license information
   * @param vehicleInformation the driver's vehicle information
   * @param vehicleInsuranceInformation the driver's vehicle insurance information
   * @param driverHistory the driver's history of violations
   */
  public ProspectiveDriver(Name driverName, LocalDate driverBirthDate, DriverLicense driverLicense,
      VehicleInformation vehicleInformation,
      VehicleInsuranceInformation vehicleInsuranceInformation,
      ArrayList<AbstractViolation> driverHistory) {
    this.driverName = driverName;
    this.driverBirthDate = driverBirthDate;
    this.driverLicense = driverLicense;
    this.vehicleInformation = vehicleInformation;
    this.vehicleInsuranceInformation = vehicleInsuranceInformation;
    this.driverHistory = driverHistory;
  }

  public Name getDriverName() {
    return driverName;
  }

  public void setDriverName(Name driverName) {
    this.driverName = driverName;
  }

  public LocalDate getDriverBirthDate() {
    return driverBirthDate;
  }

  public void setDriverBirthDate(LocalDate driverBirthDate) {
    this.driverBirthDate = driverBirthDate;
  }

  public DriverLicense getDriverLicense() {
    return driverLicense;
  }

  public void setDriverLicense(DriverLicense driverLicense) {
    this.driverLicense = driverLicense;
  }

  public VehicleInformation getVehicleInformation() {
    return vehicleInformation;
  }

  public void setVehicleInformation(
      VehicleInformation vehicleInformation) {
    this.vehicleInformation = vehicleInformation;
  }

  public VehicleInsuranceInformation getVehicleInsuranceInformation() {
    return vehicleInsuranceInformation;
  }

  public void setVehicleInsuranceInformation(
      VehicleInsuranceInformation vehicleInsuranceInformation) {
    this.vehicleInsuranceInformation = vehicleInsuranceInformation;
  }

  public ArrayList<AbstractViolation> getDriverHistory() {
    return driverHistory;
  }

  public void setDriverHistory(
      ArrayList<AbstractViolation> driverHistory) {
    this.driverHistory = driverHistory;
  }
}
