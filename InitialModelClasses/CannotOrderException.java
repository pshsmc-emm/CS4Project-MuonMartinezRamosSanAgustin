package InitialModelClasses;
/**
 *
 * @author Martinez, Ramos, San Agustin
 */
public class CannotOrderException extends Exception {

  /**
   * Creates a new instance of <code>FullTeamException</code> without detail
   * message.
   */
  public CannotOrderException() {
  }

  /**
   * Constructs an instance of <code>FullTeamException</code> with the
   * specified detail message.
   *
   * @param msg the detail message.
   */
  public CannotOrderException(String msg) {
    super(msg);
  }
}