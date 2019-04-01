public class DriverName {

    private String firstName, lastName;

    /**
     * constructor for:
     *
     * @param firstName
     * @param lastName
     */
    public DriverName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * gets first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * gets last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }
}
