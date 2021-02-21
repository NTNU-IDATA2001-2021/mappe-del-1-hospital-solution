package mappe.del1.hospital;

public class Employee extends Person {

    /**
     * @param fornavn
     * @param etternavn
     * @param personnummer
     */
    public Employee(final String fornavn, final String etternavn, final String personnummer) {
        super(fornavn, etternavn, personnummer);
    }

    /**
     * overriding toString() for this class.
     */
    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + ": " + super.toString() + "]";
    }
}
