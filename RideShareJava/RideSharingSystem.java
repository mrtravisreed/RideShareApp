package edu.neu.ccs.cs5004.assignment8.problem2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 * Class Ride Share System
 */
public class RideSharingSystem {
  private ArrayList<ProspectiveDriver> existingDrivers;
  private static final int DRIVER_MINIMUM_AGE = 21;


  /**
   * method that lets you know if you are accepted as a new driver
   *
   * @param newDriver checks whether or not driver is acceptable
   * @throws NotSuitableAsNewDriverException
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
   * checks to make sure all requirements are met to accept or reject new driver.
   *
   * @param newDriver
   * @return suitable driver or not
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
    if ((newDriver.vehicleInformation.getYear() - LocalDate.now().getYear()) > minimumVehicleYear) {
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
   * method that checks whether or not licence is acceptable
   *
   * @param newDriver
   * @return good driver licence or not
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
   * method that checks and returns whether or not insurance is good
   *
   * @param newDriver
   * @return good insurance or not good insurance
   */
  private boolean isGoodVehicleInsurance(ProspectiveDriver newDriver) {
    if (!newDriver.vehicleInsuranceInformation.getOwner().equals(newDriver.driverName)
        && !newDriver.vehicleInsuranceInformation.getOtherDrivers().contains(newDriver)) {
      return false;
    }
    if (newDriver.vehicleInsuranceInformation.getExpires().compareTo(LocalDate.now()) < 0) {
      return false;
    }
    return true;
  }

  private boolean isGoodDriverHistory(ProspectiveDriver newDriver) {
    if (!newDriver.driverHistory.isEmpty()) {
      return isMinorViolation(newDriver.driverHistory);
    }
    return true;
  }

  /**
   * method that checks for disqualifying violations and returns whether or not the
   * driver history qualifies
   *
   * @param driverHistory
   * @return true if the driver doesnt have any major violations
   */
  private boolean isMinorViolation (ArrayList<AbstractViolation> driverHistory) {
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
   * this method checks to see if the vehicle has ever been in a crash or not and disqualifies
   * the vehicle if it has.
   *
   * @param vehicleHistory
   * @return acceptable or not vehicle
   */
  private boolean isGoodVehicleHistory(ArrayList<AbstractViolation> vehicleHistory) {
    for (AbstractViolation violation : vehicleHistory) {
      if (violation instanceof Crash || violation instanceof MovingViolation) {
        if (Period.between(violation.getViolationDate(), LocalDate.now()).getMonths() < 6) {
          return false;
        }
      }
    }
    return true;
  }

}

