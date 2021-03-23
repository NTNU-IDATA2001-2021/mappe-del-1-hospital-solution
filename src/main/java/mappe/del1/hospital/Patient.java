package mappe.del1.hospital;

/**
 * Represents a patient of the hospital.
 * A patient can be diagnosed.
 * 
 * @author idatx2001
 * @version 2021-03-23
 */
public class Patient extends Person implements Diagnosable {

    // The diagnosis
    private String diagnosis;
    
    /**
     * Creates an instance of Patient.
     * 
     * @param firstName the first name of the patient
     * @param lastName the last name of the patient
     * @param socialSecurityNumber  the social security number of the patient
     */
    public Patient(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.setDiagnosis("");
    }    

    /**
     * Returns the diagnosis of the patient.
     * @return diagnosis the diagnosis of the patient
     */
    public String getDiagnosis() {
        return diagnosis;

    }


    @Override
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + ": " + super.toString() + "," + diagnosis + "]";
    }
}
