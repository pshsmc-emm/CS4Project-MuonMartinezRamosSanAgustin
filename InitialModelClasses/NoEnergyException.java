package InitialModelClasses;
/**
 *
 * @author Martinez, Ramos, San Agustin
 */
public class NoEnergyException extends Exception {

  /**
   * Creates a new instance of <code>FullTeamException</code> without detail
   * message.
   */
  public NoEnergyException() {
  }

  /**
   * Constructs an instance of <code>FullTeamException</code> with the
   * specified detail message.
   *
   * @param msg the detail message.
   */
  public NoEnergyException(String msg) {
    super(msg);
  }
}