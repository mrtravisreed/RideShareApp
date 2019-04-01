

public class MovingViolations implements IMovingViolation {

    private boolean distractedDriving;
    private boolean recklessDriving;
    private boolean speeding;
    private boolean drivingUnderInfluence;
    private boolean failureToRespectTrafficSignals;
    private boolean drivingWithoutValidLicence;


    /**
     * constuctors for:
     *
     * @param distractedDriving
     * @param recklessDriving
     * @param speeding
     * @param drivingUnderInfluence
     * @param failureToRespectTrafficSignals
     * @param drivingWithoutValidLicence
     */
    public MovingViolations(boolean distractedDriving, boolean recklessDriving, boolean speeding, boolean drivingUnderInfluence, boolean failureToRespectTrafficSignals, boolean drivingWithoutValidLicence) {
        this.distractedDriving = distractedDriving;
        this.recklessDriving = recklessDriving;
        this.speeding = speeding;
        this.drivingUnderInfluence = drivingUnderInfluence;
        this.failureToRespectTrafficSignals = failureToRespectTrafficSignals;
        this.drivingWithoutValidLicence = drivingWithoutValidLicence;
    }
}
