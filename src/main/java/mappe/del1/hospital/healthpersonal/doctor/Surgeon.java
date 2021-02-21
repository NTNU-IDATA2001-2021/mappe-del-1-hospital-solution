package mappe.del1.hospital.healthpersonal.doctor;

import mappe.del1.hospital.Patient;

public class Surgeon extends Doctor {

    /**
     * @param firstname
     * @param lastname
     * @param socialSecurityNumber
     */
    public Surgeon(final String firstname, final String lastname, final String socialSecurityNumber) {
        super(firstname, lastname, socialSecurityNumber);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param patient
     * @param diagnosis
     */
    public void setDiagnosis(final Patient patient, final String diagnosis) {
        patient.setDiagnosis(diagnosis);
    }
}
