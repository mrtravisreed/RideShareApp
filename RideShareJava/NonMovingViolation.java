package edu.neu.ccs.cs5004.assignment8.problem2;

import edu.neu.ccs.cs5004.assignment8.problem1.Name;
import java.time.LocalDate;

/**
 * NonMovingViolation keeps track of a non moving violation's date, offending driver, and type.
 */
public class NonMovingViolation extends AbstractViolation {

  /**
   * The type of non moving violation.
   */
  private NonMovingViolationType type;


  /**
   * Creates a new AbstractViolation with the given date, offending driver, and type.
   *
   * @param violationDate the date of the violation
   * @param offendingDriver the offending driver
   * @param type the type of non moving violation
   */
  public NonMovingViolation(LocalDate violationDate, Name offendingDriver,
      NonMovingViolationType type) {
    super(violationDate, offendingDriver);
    this.type = type;
  }

  /**
   * Returns the type of non moving violation.
   *
   * @return type of non moving violation
   */
  public NonMovingViolationType getType() {
    return this.type;
  }

  /**
   * Sets the type of non moving violation.
   *
   * @param type the new type
   */
  public void setType(NonMovingViolationType type) {
    this.type = type;
  }
}
