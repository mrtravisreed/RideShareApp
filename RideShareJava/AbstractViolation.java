import java.time.LocalDate;

/**
 * AbstractViolation keeps track of a traffic violation, including the date of the violation.
 *
 */
public abstract class AbstractViolation {

  /**
   * The date of the violation.
   */
  protected LocalDate violationDate;

  /**
   * The name of the offending driver.
   */
  protected Name offendingDriver;

  /**
   * Creates a new AbstractViolation with the given date.
   *
   * @param violationDate the date of the violation
   * @param offendingDriver the offending driver
   */
  public AbstractViolation(LocalDate violationDate, Name offendingDriver) {
    this.violationDate = violationDate;
    this.offendingDriver = offendingDriver;
  }

  /**
   * Returns the date of the violation.
   *
   * @return the date of the violation
   */
  public LocalDate getViolationDate() {
    return this.violationDate;
  }

  /**
   * Sets the violation date.
   *
   * @param violationDate the new violation date
   */
  public void setViolationDate(LocalDate violationDate) {
    this.violationDate = violationDate;
  }

  /**
   * Returns the offending driver.
   *
   * @return the offending driver
   */
  public Name getOffendingDriver() {
    return this.offendingDriver;
  }

  /**
   * Sets the offending driver.
   *
   * @param offendingDriver the new offending driver
   */
  public void setOffendingDriver(Name offendingDriver) {
    this.offendingDriver = offendingDriver;
  }
}
