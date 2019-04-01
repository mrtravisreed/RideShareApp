
public class Violation implements IMovingViolation {


    MovingViolations movingViolations;
    NonMovingViolations nonMovingViolations;

    /**
     * constructors for
     * @param movingViolations
     * @param nonMovingViolations
     */
    public Violation(MovingViolations movingViolations, NonMovingViolations nonMovingViolations) {
        this.movingViolations = movingViolations;
        this.nonMovingViolations = nonMovingViolations;
    }
}
