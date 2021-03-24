package mappe.del1.hospital;

/**
 * Interface defining method to set a diagnosis. To be implemented
 * by any class that should be possible to be diagnosed by someone
 * authorized to set a diagnosis.
 *
 * @author idatx2001
 * @version 2021-03-23
 */
public interface Diagnosable {
  /**
   * Sets a diagnosis. The diagnosis is given by the
   * parameter {@code diagnosis}
   *
   * @param diagnosis the diagnosis to set.
   */
  void setDiagnosis(String diagnosis);
}
