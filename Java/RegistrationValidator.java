
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RegistrationValidator implements IRegistrationValidator {
    /**
     * formats date to be worked with
     */
    private static final DateTimeFormatter dateFormatter
            = DateTimeFormatter.ofPattern("dd-MM-uuuu");

    PerspectiveDriver perspectiveDriver;
    TodaysDate todaysDate;
    ApplicationInformation applicationInformation;
    /**
     * Checks to see if the driver is under 21, If so the method should return false
     *
     * @return valid driver
     */
    @Override
    public boolean isUnder21(DriverBirthday driverBirthday) {

        LocalDate dob = LocalDate.parse((CharSequence) driverBirthday, dateFormatter);
        LocalDate today = LocalDate.now(ZoneId.of("USA"));

        int age = (int) ChronoUnit.YEARS.between(dob, today);

        if (age < 21) {
            return false;

        } else
            return true;

    }


    /**
     * this should check if the name on the application is the same as the name on the drivers licence
     *
     * @return valid name
     */
    @Override
    public boolean validName() {

        if(applicationInformation.getDriverName()!=perspectiveDriver.getDriverName()){
            return false;
        }
        else
            return true;
    }


    /**
     * this should check if the birthday on the drivers licence is the same as the birthday on the application
     *
     * @return valid birthday
     */
    @Override
    public boolean validBirthday() {

        if(applicationInformation.getDriverBirthday()!=perspectiveDriver.driverBirthday){
            return false;
        }
        else
            return true;
    }

    /**
     * this should check is the Drivers Licence is US or not.
     *
     * @return valid US licence
     */
    @Override
    public boolean validUSLicence() {

        if(perspectiveDriver.driversLicenceInformation.getIssueCountry()!="US"){
            return false;
        }
        else
            return true;
    }

    /**
     * this should check to make sure that the issue date of the licence is more than six months than todays date
     *
     * @return
     */
    @Override
    public boolean validTimeWithLicence(IssueDate issueDate) {

        LocalDate issued = LocalDate.parse((CharSequence) issueDate, dateFormatter);
        LocalDate today = LocalDate.now(ZoneId.of("USA"));

        int monthspast = (int) ChronoUnit.MONTHS.between(issued, today);

        if (monthspast < 6) {
            return false;

        } else
            return true;
    }

    /**
     * this should make sure the licence hasnt expired
     *
     * @return
     */
    @Override
    public boolean licenceExpired(ExperationDate experationDate) {

        LocalDate today = LocalDate.now(ZoneId.of("USA"));
        if (today.isAfter((ChronoLocalDate) experationDate)) {
            return false;
        } else
            return true;
    }
}
