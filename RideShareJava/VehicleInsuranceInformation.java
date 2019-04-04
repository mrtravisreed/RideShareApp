import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

/**
 * VehicleInsuranceInformation object keeps track of a vehicle's insurance information, including
 * the vehicle's official owner, other drivers covered by the policy, and the date of expiration.
 *
 */
public class VehicleInsuranceInformation {

  /**
   * The official owner of the insured vehicle.
   */
  private Name owner;

  /**
   * The other driver's insured by the policy.
   */
  private HashSet<Name> otherDrivers;

  /**
   * The policy's expiration date.
   */
  private LocalDate expires;

  /**
   * Creates a new VehicleInsuranceInformation object given an owner, a set of other drivers, and
   * an expiration date.
   *
   * @param owner official owner
   * @param otherDrivers the other drivers covered by the policy
   * @param expires insurance expiration date
   */
  public VehicleInsuranceInformation(Name owner, HashSet<Name> otherDrivers, LocalDate expires) {
    this.owner = owner;
    this.otherDrivers = otherDrivers;
    this.expires = expires;
  }

  /**
   * Adds another driver to the set of insured drivers.
   *
   * @param driver the new driver to add to the policy
   */
  public void addDriver(Name driver) {
    this.otherDrivers.add(driver);
  }

  /**
   * Returns the policy owner.
   *
   * @return the policy owner
   */
  public Name getOwner() {
    return this.owner;
  }

  /**
   * Sets the policy owner.
   *
   * @param owner the new owner
   */
  public void setOwner(Name owner) {
    this.owner = owner;
  }

  /**
   * Returns the other drivers covered by the policy.
   *
   * @return the other drivers covered
   */
  public HashSet<Name> getOtherDrivers() {
    return this.otherDrivers;
  }

  /**
   * Sets the set of other driver's covered.
   *
   * @param otherDrivers the new set of other drivers
   */
  public void setOtherDrivers(HashSet<Name> otherDrivers) {
    this.otherDrivers = otherDrivers;
  }

  /**
   * Returns the expiration date.
   *
   * @return the expiration date
   */
  public LocalDate getExpires() {
    return this.expires;
  }

  /**
   * Sets the expiration date.
   *
   * @param expires the new expiration date
   */
  public void setExpires(LocalDate expires) {
    this.expires = expires;
  }

  /**
   * Returns a string representation of the insurance information.
   *
   * @return a string representation
   */
  @Override
  public String toString() {
    return "VehicleInsuranceInformation{"
            + "owner=" + owner
            + ", expires=" + expires
            + '}';
  }

  /**
   * Determines if this VehicleInsuranceInformation object is equal to a given object.
   *
   * @param other the object to compare to
   * @return true if equal, false if not
   */
  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof VehicleInsuranceInformation)) {
      return false;
    }
    VehicleInsuranceInformation that = (VehicleInsuranceInformation) other;
    return Objects.equals(getOwner(), that.getOwner())
            && Objects.equals(getOtherDrivers(), that.getOtherDrivers())
            && Objects.equals(getExpires(), that.getExpires());
  }

  /**
   * Returns a hashcode for the VehicleInsuranceInformation object.
   *
   * @return a hashcode
   */
  @Override
  public int hashCode() {
    return Objects.hash(getOwner(), getOtherDrivers(), getExpires());
  }
}
