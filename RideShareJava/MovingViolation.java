import java.time.LocalDate;

/**
 * MovingViolation keeps track of moving violation's date, offending driver, and type.
 *
 */
public class MovingViolation extends AbstractViolation {

  /**
   * The type of moving violation.
   */
  private MovingViolationType type;

  /**
   * Creates a new MovingViolation with the given date and type.
   *
   * @param violationDate the date of the violation
   * @param offendingDriver the offending driver
   * @param type type of moving violation
   */
  public MovingViolation(LocalDate violationDate, Name offendingDriver, MovingViolationType type) {
    super(violationDate, offendingDriver);
    this.type = type;
  }

  /**
   * Returns the moving violation type.
   *
   * @return the type
   */
  public MovingViolationType getType() {
    return this.type;
  }

  /**
   * Sets the moving violation type.
   *
   * @param type the new type
   */
  public void setType(MovingViolationType type) {
    this.type = type;
  }
}
