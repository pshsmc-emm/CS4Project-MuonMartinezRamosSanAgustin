package InitialModelClasses;
/**
 *
 * @author Martinez, Ramos, San Agustin
 */
public class FullTableException extends Exception {

  /**
   * Creates a new instance of <code>FullTeamException</code> without detail
   * message.
   */
  public FullTableException() {
  }

  /**
   * Constructs an instance of <code>FullTeamException</code> with the
   * specified detail message.
   *
   * @param msg the detail message.
   */
  public FullTableException(String msg) {
    super(msg);
  }
}