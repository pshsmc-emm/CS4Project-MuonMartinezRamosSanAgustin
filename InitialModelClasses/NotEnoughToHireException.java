package InitialModelClasses;
/**
 *
 * @author Martinez, Ramos, San Agustin
 */
public class NotEnoughToHireException extends Exception {

  /**
   * Creates a new instance of <code>FullTeamException</code> without detail
   * message.
   */
  public NotEnoughToHireException() {
  }

  /**
   * Constructs an instance of <code>FullTeamException</code> with the
   * specified detail message.
   *
   * @param msg the detail message.
   */
  public NotEnoughToHireException(String msg) {
    super(msg);
  }
}