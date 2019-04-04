import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
/**
 * RideSharingSystem provides registration for a given prospective driver.
 *
 */
public class RideSharingSystem {
  private ArrayList<ProspectiveDriver> existingDrivers;
  private static final int DRIVER_MINIMUM_AGE = 21;

  /**
   * Constructs a new empty RideSharingSystem.
   */
  public RideSharingSystem() {
    this.existingDrivers = new ArrayList<>();
  }

  /**
   * Constructs a new RideSharingSystem with given pool of existing drivers.
   * @param existingDrivers pool of existing drivers
   */
  public RideSharingSystem(
      ArrayList<ProspectiveDriver> existingDrivers) {
    this.existingDrivers = existingDrivers;
  }

  /**
   * Registers a prospective driver.
   * @param newDriver a Driver object
   * @throws NotSuitableAsNewDriverException thrown when prospective driver is
   *     not accepted as new driver
   */
  public void register(ProspectiveDriver newDriver) throws NotSuitableAsNewDriverException {
    if (isSuitable(newDriver) && !existingDrivers.contains(newDriver)) {
      existingDrivers.add(newDriver);
      System.out.println("Congratulation! You are now a new registered driver!");
    } else {
      System.out.println("Unfortunately, your application is not approved.");
      throw new NotSuitableAsNewDriverException();
    }
  }

  /**
   * Main helper function to decide if a prospective driver is accepted as a new driver.
   *
   * @param newDriver ProspectiveDrive object
   * @return true if new driver is accepted, false otherwise.
   */
  private boolean isSuitable(ProspectiveDriver newDriver) {
    int minimumVehicleYear = 20;
    if (Period.between(newDriver.driverBirthDate, LocalDate.now()).getYears()
        < DRIVER_MINIMUM_AGE) {
      return false;
    }
    if (!isGoodDriverLicense(newDriver)) {
      return false;
    }
    if ((LocalDate.now().getYear() - newDriver.vehicleInformation.getYear()) > minimumVehicleYear) {
      return false;
    }
    if (!isGoodVehicleInsurance(newDriver)) {
      return false;
    }
    if (!isGoodDriverHistory(newDriver)) {
      return false;
    }
    if (!isGoodVehicleHistory(newDriver.vehicleInformation.getVehicleHistory())) {
      return false;
    }
    return true;
  }

  /**
   * Helper function (1/5) for isSuitable (main helper). Checks if a given driver's information
   * matches with the information on their driver's license.
   *
   * @param newDriver ProspectiveDriver object
   * @return true if a prospective driver has good driver license, false otherwise
   */
  private boolean isGoodDriverLicense(ProspectiveDriver newDriver) {
    if (!newDriver.driverName.equals(newDriver.driverLicense.getDriverName())) {
      return false;
    }
    if (!newDriver.driverBirthDate.equals(newDriver.driverLicense.getDriverBirthdate())) {
      return false;
    }
    if (!newDriver.driverLicense.getCountry().equals("US")) {
      return false;
    }
    if (Period.between(newDriver.driverLicense.getIssued(), LocalDate.now()).getMonths() < 6) {
      return false;
    }
    if (newDriver.driverLicense.getExpires().compareTo(LocalDate.now()) < 0) {
      return false;
    }
    return true;
  }

  /**
   * Helper function (2/5) for isSuitable (main helper). Check's if a given driver's insurance
   * information is valid.
   *
   * @param newDriver ProspectiveDriver object
   * @return true if a prospective driver has good vehicle insurance, false otherwise
   */
  private boolean isGoodVehicleInsurance(ProspectiveDriver newDriver) {
    if (!newDriver.vehicleInsuranceInformation.getOwner().equals(newDriver.driverName)
        && !newDriver.vehicleInsuranceInformation
        .getOtherDrivers().contains(newDriver.getDriverName())) {
      return false;
    }
    if (newDriver.vehicleInsuranceInformation.getExpires().compareTo(LocalDate.now()) < 0) {
      return false;
    }
    return true;
  }
  /**
   * Helper function (3/5) for isSuitable (main helper). Checks if a given driver's driver history
   * is disqualifying.
   *
   * @param newDriver ProspectiveDriver object
   * @return true if a prospective driver has good driving history, false otherwise
   */
  private boolean isGoodDriverHistory(ProspectiveDriver newDriver) {
    if (!newDriver.getDriverHistory().isEmpty()) {
      return isMinorViolation(newDriver.driverHistory);
    }
    return true;
  }
  /**
   * Helper function (4/5) for isSuitable (main helper). Checks if a given driver history is free
   * of any disqualifying violations.
   *
   * @param driverHistory ArrayList of a driver's history
   * @return true if a prospective driver has no or only minor violation, false otherwise
   */
  private boolean isMinorViolation(ArrayList<AbstractViolation> driverHistory) {
    for (AbstractViolation violation : driverHistory) {
      if (violation instanceof MovingViolation) {
        MovingViolationType type = ((MovingViolation) violation).getType();
        if (type.equals(MovingViolationType.RECKLESS_DRIVING)) {
          return false;
        }
        if (type.equals(MovingViolationType.SPEEDING)) {
          return false;
        }
        if (type.equals(MovingViolationType.DUI)) {
          return false;
        }
        if (type.equals(MovingViolationType.LICENSE_OR_INSURANCE)) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Helper function (5/5) for isSuitable (main helper). Checks if a given vehicle history is free
   * of any recent disqualifying violations.
   *
   * @param vehicleHistory ArrayList of a vehicle's history
   * @return true if a prospective driver has good vehicle history, false otherwise
   */
  private boolean isGoodVehicleHistory(ArrayList<AbstractViolation> vehicleHistory) {
    if (vehicleHistory.isEmpty()) {
      return true;
    }
    for (AbstractViolation violation : vehicleHistory) {
      if (violation instanceof Crash || violation instanceof MovingViolation
          && Period.between(violation.getViolationDate(), LocalDate.now()).getMonths() < 6) {
        return false;
      }
    }
    return true;
  }
}