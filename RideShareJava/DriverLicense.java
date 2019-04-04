import java.time.LocalDate;
import java.util.Objects;

/**
 * DriverLicense contains information about a driver license, including license number, driver name,
 * driver birth date, country and state of issuance, and issuance and expiration date.
 *
 */
public class DriverLicense {

  /**
   * The license number.
   */
  private String licenseNumber;

  /**
   * The name of the driver.
   */
  private Name driverName;

  /**
   * The driver's address.
   */
  private String address;

  /**
   * The driver's birthdate.
   */
  private LocalDate driverBirthdate;

  /**
   * The country of issuance.
   */
  private String country;

  /**
   * The state of issuance.
   */
  private String state;

  /**
   * The date of issuance.
   */
  private LocalDate issued;

  /**
   * The date of expiration.
   */
  private LocalDate expires;



  /**
   * Creates a new DriverLicense given the license number, driver name, address, driver birthdate,
   * country and state of issuance, and issued and expiration dates.
   *
   * @param licenseNumber the license number
   * @param driverName the name of the driver
   * @param address the driver's address
   * @param driverBirthdate the driver's date of birth
   * @param country the country the license was issued in
   * @param state the state the license was issued in
   * @param issued the date the license was issued
   * @param expires the date the license will expire
   */
  public DriverLicense(String licenseNumber, Name driverName, String address,
      LocalDate driverBirthdate, String country, String state, LocalDate issued,
      LocalDate expires) {
    this.licenseNumber = licenseNumber;
    this.driverName = driverName;
    this.address = address;
    this.driverBirthdate = driverBirthdate;
    this.country = country;
    this.state = state;
    this.issued = issued;
    this.expires = expires;
  }

  /**
   * Returns the license number.
   *
   * @return the license number
   */
  public String getLicenseNumber() {
    return this.licenseNumber;
  }

  /**
   * Returns the driver's name.
   *
   * @return the driver's name
   */
  public Name getDriverName() {
    return this.driverName;
  }

  /**
   * Returns the driver's address.
   *
   * @return the driver's address
   */
  public String getAddress() {
    return this.address;
  }

  /**
   * Returns the driver's birthdate.
   *
   * @return the driver's birthdate
   */
  public LocalDate getDriverBirthdate() {
    return this.driverBirthdate;
  }

  /**
   * Returns the country of issuance.
   *
   * @return the country of issuance
   */
  public String getCountry() {
    return this.country;
  }

  /**
   * Returns the state of issuance.
   *
   * @return the state of issuance
   */
  public String getState() {
    return this.state;
  }

  /**
   * Returns the date of issuance.
   *
   * @return the date of issuance
   */
  public LocalDate getIssued() {
    return this.issued;
  }

  /**
   * Returns the date of expiration.
   *
   * @return the date of expiration
   */
  public LocalDate getExpires() {
    return this.expires;
  }

  /**
   * Generates a string representation of the driver license.
   *
   * @return string representation of the driver license
   */
  @Override
  public String toString() {
    return "DriverLicense{"
            + "Number='" + licenseNumber + '\''
            + ", Name=" + driverName
            + ", expires=" + expires
            + '}';
  }

  /**
   * Determines if this DriverLicense is equal to a given object.
   *
   * @param other the object to compare
   * @return true if equal, false if not
   */
  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof DriverLicense)) {
      return false;
    }
    DriverLicense that = (DriverLicense) other;
    return Objects.equals(getLicenseNumber(), that.getLicenseNumber())
            && Objects.equals(getDriverName(), that.getDriverName())
            && Objects.equals(getAddress(), that.getAddress())
            && Objects.equals(getDriverBirthdate(), that.getDriverBirthdate())
            && Objects.equals(getCountry(), that.getCountry())
            && Objects.equals(getState(), that.getState())
            && Objects.equals(getIssued(), that.getIssued())
            && Objects.equals(getExpires(), that.getExpires());
  }

  /**
   * Generates a hashcode for the DriverLicense.
   *
   * @return a hashcode
   */
  @Override
  public int hashCode() {
    return Objects
        .hash(getLicenseNumber(), getDriverName(), getAddress(), getDriverBirthdate(), getCountry(),
            getState(), getIssued(), getExpires());
  }
}
