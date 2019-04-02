package edu.neu.ccs.cs5004.assignment8.problem2;

import edu.neu.ccs.cs5004.assignment8.problem1.Name;
import java.util.ArrayList;
import java.util.Objects;

/**
 * VehicleInformation keeps track of a vehicle's information, including the make, model, and year
 * of the vehicle, as well as the registered owner.
 */
public class VehicleInformation {

  /**
   * The vehicle's make.
   */
  private String make;

  /**
   * The vehicle's model.
   */
  private String model;

  /**
   * The vehicle's year.
   */
  private int year;

  /**
   * The vehicle's registered owner.
   */
  private Name owner;

  /**
   * The vehicle's list of violations.
   */
  private ArrayList<AbstractViolation> vehicleHistory;

  /**
   * Creates a new VehicleInformation object, given the make, model, and year of a vehicle, as well
   * as the name of it's registered owner.
   *
   * @param make the vehicle make
   * @param model the vehicle model
   * @param year the vehicle year
   * @param owner the registered owner
   * @param vehicleHistory the list of violations in this vehicle.
   */
  public VehicleInformation(String make, String model, int year, Name owner,
      ArrayList<AbstractViolation> vehicleHistory) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.owner = owner;
    this.vehicleHistory = vehicleHistory;
  }

  /**
   * Adds a violation to the vehicle's history.
   *
   * @param violation the new violation
   */
  public void addViolation(AbstractViolation violation) {
    this.vehicleHistory.add(violation);
  }

  /**
   * Returns the vehicle make.
   *
   * @return the vehicle make
   */
  public String getMake() {
    return this.make;
  }

  /**
   * Returns the vehicle model.
   *
   * @return the vehicle model
   */
  public String getModel() {
    return this.model;
  }

  /**
   * Returns the vehicle production year.
   *
   * @return the vehicle year
   */
  public int getYear() {
    return this.year;
  }

  /**
   * Returns the owner's name.
   *
   * @return the owner's name
   */
  public Name getOwner() {
    return this.owner;
  }

  /**
   * Sets the vehicle make
   *
   * @param make the new make
   */
  public void setMake(String make) {
    this.make = make;
  }

  /**
   * Sets the vehicle model.
   *
   * @param model the new model
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * Sets the vehicle year.
   *
   * @param year the new year
   */
  public void setYear(int year) {
    this.year = year;
  }

  /**
   * Sets the vehicle owner.
   *
   * @param owner the new owner
   */
  public void setOwner(Name owner) {
    this.owner = owner;
  }

  /**
   * Returns the vehicle history.
   *
   * @return the vehicle history
   */
  public ArrayList<AbstractViolation> getVehicleHistory() {
    return this.vehicleHistory;
  }

  /**
   * Sets the vehicle history.
   *
   * @param vehicleHistory the new vehicle history.
   */
  public void setVehicleHistory(ArrayList<AbstractViolation> vehicleHistory) {
    this.vehicleHistory = vehicleHistory;
  }

  /**
   * Returns a string representation of the vehicle.
   *
   * @return a string representation of the vehicle
   */
  @Override
  public String toString() {
    return this.owner + "'s " + this.year + " " + this.make + " " + this.model;
  }

  /**
   * Determines if this vehicle information object is equal to a given object.
   *
   * @param other
   * @return true if equal, false if not
   */
  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof VehicleInformation)) {
      return false;
    }
    VehicleInformation that = (VehicleInformation) other;
    return getYear() == that.getYear() &&
        Objects.equals(getMake(), that.getMake()) &&
        Objects.equals(getModel(), that.getModel()) &&
        Objects.equals(getOwner(), that.getOwner());
  }

  /**
   * Returns a hashcode for the vehicle information object.
   *
   * @return a hashcode
   */
  @Override
  public int hashCode() {
    return Objects.hash(getMake(), getModel(), getYear(), getOwner());
  }
}
