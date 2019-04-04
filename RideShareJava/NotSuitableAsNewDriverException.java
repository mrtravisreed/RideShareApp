/**
 * NotSuitableAsNewDriverException is an exception to be thrown if a prospective driver is not
 * accepted as a new driver.
 *
 */
public class NotSuitableAsNewDriverException extends Exception {

  public NotSuitableAsNewDriverException() {
    super("Not suitable as new driver.");
  }

}
