package mappe.del1.hospital;

public class Patient extends Person implements Diagnosable {

    /**
     * store diagnosis.
     */
    private String diagnosis = "";

    /**
     * @return diagnosis
     */
    protected String getDiagnose() {
        return diagnosis;

    }

    protected Patient(final String fornavn, final String etternavn, final String personnummer) {
        super(fornavn, etternavn, personnummer);
    }

    /**
     *
     */
    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + ": " + super.toString() + "," + diagnosis + "]";
    }

    /**
     * @param diag
     */
    public void setDiagnosis(final String diag) {
        this.diagnosis = diag;
    }
}
