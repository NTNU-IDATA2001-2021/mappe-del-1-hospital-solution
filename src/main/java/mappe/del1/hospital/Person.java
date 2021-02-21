package mappe.del1.hospital;

public abstract class Person {

    /**
     * store firstName.
     */
    private String firstName;

    /**
     * store lastName.
     */
    private String lastName;

    /**
     * store socialSecurityNumber.
     */
    private String socialSecurityNumber;

    /**
     * @return socialSecurityNumber
     */
    public String getPersonnummer() {
        return socialSecurityNumber;
    }

    /**
     * @param ssNumber
     */
    public void setPersonnummer(final String ssNumber) {
        this.socialSecurityNumber = ssNumber;
    }

    /**
     * @param fName
     */
    public void setFirtName(final String fName) {
        this.firstName = fName;
    }

    /**
     * @param lName
     */
    public void setLastName(final String lName) {
        this.lastName = lName;
    }

    /**
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return fullname
     */
    public String getFullNavn() {
        return firstName + " " + lastName;
    }

    public Person(final String fornavn, final String etternavn, final String personnummer) {
        this.firstName = fornavn;
        this.lastName = etternavn;
        this.socialSecurityNumber = personnummer;
    }

    /**
     *
     */
    @Override
    public String toString() {
        return "[navn=" + firstName + " " + lastName + ", personnummer=" + socialSecurityNumber + "]";
    }
}
