package mappe.del1.hospital.healthpersonal.doctor;

import mappe.del1.hospital.Patient;

public class GeneralPractitioner extends Doctor {

    /**
     * @param firstname
     * @param lastname
     * @param socialSecurityNumber
     */
    public GeneralPractitioner(final String firstname, final String lastname, final String socialSecurityNumber) {
        super(firstname, lastname, socialSecurityNumber);
    }

    /**
     * @param patient
     * @param diagnosis
     */
    public void setDiagnosis(final Patient patient, final String diagnosis) {
        patient.setDiagnosis(diagnosis);
    }
}
