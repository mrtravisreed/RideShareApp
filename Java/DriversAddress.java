
public class DriversAddress {

    private String streetAddress;
    private String city;
    private String state;
    private Integer zip;


    /**
     * constructors for:
     *
     * @param streetAddress
     * @param city
     * @param state
     * @param zip
     */
    public DriversAddress(String streetAddress, String city, String state, Integer zip) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /**
     * gets street address
     * @return street address
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * gets city
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * gets state
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * gets zip
     * @return zip
     */
    public Integer getZip() {
        return zip;
    }
}
