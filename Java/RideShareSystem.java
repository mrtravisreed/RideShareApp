
import java.util.Objects;

public class RideShareSystem implements IRideShareSystem {

    PerspectiveDriver perspectiveDriver;

    /**
     * Adds driver if valid
     */
    @Override
    public void addDriver() {

    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RideShareSystem that = (RideShareSystem) o;
        return Objects.equals(perspectiveDriver, that.perspectiveDriver);
    }

    /**
     *
     * @return driver
     */
    @Override
    public int hashCode() {
        return Objects.hash(perspectiveDriver);
    }
}
