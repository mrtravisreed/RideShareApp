import java.time.LocalDate;

/**
 * Crash keeps track of crash's date, offending driver, and type.
 *
 */
public class Crash extends AbstractViolation {

  /**
   * The type of crash.
   */
  private CrashType type;

  /**
   * Creates a new AbstractViolation with the given date.
   *
   * @param violationDate the date of the violation
   * @param offendingDriver the offending driver
   * @param type the type of crash
   */
  public Crash(LocalDate violationDate, Name offendingDriver, CrashType type) {
    super(violationDate, offendingDriver);
    this.type = type;
  }

  /**
   * Returns the type of crash.
   *
   * @return the type of crash
   */
  public CrashType getType() {
    return type;
  }

  /**
   * Sets the type of crash.
   *
   * @param type the new type of crash
   */
  public void setType(CrashType type) {
    this.type = type;
  }
}
