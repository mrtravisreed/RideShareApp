
import java.util.Date;

public class DriversHistory {

    Date violationDate;
    MovingViolations movingViolations;
    NonMovingViolations nonMovingViolations;


    /**
     * constructors for:
     *
     * @param violationDate
     * @param movingViolations
     * @param nonMovingViolations
     */
    public DriversHistory(Date violationDate, MovingViolations movingViolations, NonMovingViolations nonMovingViolations) {
        this.violationDate = violationDate;
        this.movingViolations = movingViolations;
        this.nonMovingViolations = nonMovingViolations;
    }

}
