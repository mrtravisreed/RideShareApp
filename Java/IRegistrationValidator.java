

public interface IRegistrationValidator {

    /**
     * This will validate a driver
     */

    /**
     * Checks to see if the driver is under 21, If so the method should return false
     * @return valid driver
     */
    boolean isUnder21(DriverBirthday driverBirthday);

    /**
     *this should check if the name on the application is the same as the name on the drivers licence
     *
     * @return valid name
     */
    boolean validName();

    /**
     * this should check if the birthday on the drivers licence is the same as the birthday on the application
     *
     * @return valid birthday
     */
    boolean validBirthday();

    /**
     * this should check is the Drivers Licence is US or not.
     *
     * @return valid US licence
     */
    boolean validUSLicence();

    /**
     * this should check to make sure that the issue date of the licence is more than six months than todays date
     *
     * @return
     */
    boolean validTimeWithLicence(IssueDate issueDate);

    /**
     * this should make sure the licence hasnt expired
     *
     * @return
     */
    boolean licenceExpired(ExperationDate experationDate);


}
