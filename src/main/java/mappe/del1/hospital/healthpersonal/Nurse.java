package mappe.del1.hospital.healthpersonal;

import mappe.del1.hospital.Employee;

/**
 * Represents a Nurse.
 *
 * @author idatx2001
 * @version 2021-03-23
 */
public class Nurse extends Employee {
  /**
   * Creates an instance of {@code Nurse}.
   *
   * @param firstName            first name of the nurse
   * @param lastName             last name of the nurse
   * @param socialSecurityNumber social security number (11 digits) of the nurse
   */
  public Nurse(String firstName, String lastName, String socialSecurityNumber) {
    super(firstName, lastName, socialSecurityNumber);
  }

  @Override
  public String toString() {
    return "Nurse: [" + getClass().getSimpleName() + ": " + super.toString() + "]";
  }
}
