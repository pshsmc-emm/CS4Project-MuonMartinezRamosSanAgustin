package InitialModelClasses;
/**
 *
 * @author Martinez, Ramos, San Agustin
 */
public class DirtyTableException extends Exception {

  /**
   * Creates a new instance of <code>FullTeamException</code> without detail
   * message.
   */
  public DirtyTableException() {
  }

  /**
   * Constructs an instance of <code>FullTeamException</code> with the
   * specified detail message.
   *
   * @param msg the detail message.
   */
  public DirtyTableException(String msg) {
    super(msg);
  }
}