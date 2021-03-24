package mappe.del1.hospital.healthpersonal.doctor;

import mappe.del1.hospital.Patient;

/**
 * Represents a general practitioner.
 * A general practitioner can set a diagnosis on a patient.
 *
 * @author idatx2001
 * @version 2021-03-23
 */
public class GeneralPractitioner extends Doctor {

  /**
   * Creates an instance of {@code GeneralPractitioner}.
   *
   * @param firstName            first name of the general practitioner
   * @param lastName             last name of the general practitioner
   * @param socialSecurityNumber social security number (11 digits) of the general practitioner
   */
  public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
    super(firstName, lastName, socialSecurityNumber);
  }

  @Override
  public void setDiagnosis(Patient patient, String diagnosis) {
    if ((patient == null) || (diagnosis == null)) {
      throw new IllegalArgumentException("patient or diagnosis cannot be null.");
    }
    patient.setDiagnosis(diagnosis);
  }
}
