

public class VehicleInsurance {

    DriverName vehicleOwner;
    private String otherDriversCovered;
    private String stateInsured;
    private String countryInsured;


    /**
     * constructor for:
     *
     * @param vehicleOwner
     * @param otherDriversCovered
     * @param stateInsured
     * @param countryInsured
     */
    public VehicleInsurance(DriverName vehicleOwner, String otherDriversCovered, String stateInsured, String countryInsured) {
        this.vehicleOwner = vehicleOwner;
        this.otherDriversCovered = otherDriversCovered;
        this.stateInsured = stateInsured;
        this.countryInsured = countryInsured;
    }
}
