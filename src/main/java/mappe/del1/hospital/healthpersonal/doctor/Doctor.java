package mappe.del1.hospital.healthpersonal.doctor;

import mappe.del1.hospital.Employee;
import mappe.del1.hospital.Patient;

public abstract class Doctor extends Employee {

    /**
     * @param firstname
     * @param lastname
     * @param socialSecurityNumber
     */
    protected Doctor(final String firstname, final String lastname, final String socialSecurityNumber) {
        super(firstname, lastname, socialSecurityNumber);
    }

    /**
     * @param patient
     * @param diagnosis
     */
    public abstract void setDiagnosis(Patient patient, String diagnosis);
}
