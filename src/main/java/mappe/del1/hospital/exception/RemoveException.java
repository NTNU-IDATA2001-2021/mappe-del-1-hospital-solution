package mappe.del1.hospital.exception;

/**
 * Thrown to indicate that removal of an instance from a collection
 * was not successfull.
 *
 * @author idatx2001
 * @version 2021-03-23
 */
public class RemoveException extends Exception {

  /**
   * Constructs a {@code RemoveException} with the specified detail message.
   *
   * @param message the detail message
   */
  public RemoveException(String message) {
    super(message);
  }
}
