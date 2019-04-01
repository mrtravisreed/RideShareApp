

public class Vehicle {

    private String make;
    private String model;
    private Integer year;
    DriverName vehicleOwner;

    /**
     * constructor for:
     *
     * @param make
     * @param model
     * @param year
     * @param vehicleOwner
     */
    public Vehicle(String make, String model, Integer year, DriverName vehicleOwner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vehicleOwner = vehicleOwner;
    }
}
