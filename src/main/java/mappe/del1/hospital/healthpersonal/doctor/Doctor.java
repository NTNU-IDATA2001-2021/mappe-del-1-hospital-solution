package mappe.del1.hospital.healthpersonal.doctor;

import mappe.del1.hospital.Employee;
import mappe.del1.hospital.Patient;

/**
 * Represents a Doctor. A doctor can set a diagnosis on a patient.
 * This is an abstract class to be used for any role that are authorized
 * to set a diagnosis on a patient.
 * 
 * @author idatx2001
 * @version 2021-03-23
 */
public abstract class Doctor extends Employee {

    /**
     * Creates an instance of {@code Doctor}.
     * 
     * @param firstName first name of the doctor
     * @param lastName last name of the doctor
     * @param socialSecurityNumber social security number (11 digits) of the doctor
     */
    protected Doctor(String firstname, String lastname, String socialSecurityNumber) {
        super(firstname, lastname, socialSecurityNumber);
    }

    /**
     * Sets a diagnosis on the specified patient.
     * A short note on design of this class and this method: Since setting a
     * diagnose is done the same way for all subclases of Doctor, we could have 
     * implemented the setDiagnoses()-method fully in this class. Then we would
     * not have to override it in the sub classes. On the other hand, we might
     * think that depending upon type of Doctor (defined by a subclass), the
     * types of diagnosis a specialist can- or are allowed to set on a pasient
     * might differ. Hence by leaving this method abstract, we open up for the
     * possibillity for the subclasses to add extra logic to control that
     * a specialized doctor does not set a diagnosis he/she is not allowed to set.
     * 
     * @param patient the patient to receive the diagnosis
     * @param diagnosis the diagnosis to be given to the patient
     */
    public abstract void setDiagnosis(Patient patient, String diagnosis);
}
