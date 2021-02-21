package mappe.del1.hospital.healthpersonal;

import mappe.del1.hospital.Employee;

public class Nurse extends Employee {
    public Nurse(final String fornavn, final String etternavn, final String personnummer) {
        super(fornavn, etternavn, personnummer);
    }

    /**
     *
     */
    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + ": " + super.toString() + "]";
    }
}
