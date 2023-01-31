package InitialModelClasses;
/**
 *
 * @author Martinez, Ramos, San Agustin
 */
public class AlreadyHiredException extends Exception {

  /**
   * Creates a new instance of <code>FullTeamException</code> without detail
   * message.
   */
  public AlreadyHiredException() {
  }

  /**
   * Constructs an instance of <code>FullTeamException</code> with the
   * specified detail message.
   *
   * @param msg the detail message.
   */
  public AlreadyHiredException(String msg) {
    super(msg);
  }
}