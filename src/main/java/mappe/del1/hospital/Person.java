package mappe.del1.hospital;

/**
 * Represents a Person, holding a first name, last name and a social security
 * number.
 *
 * @author idatx2001
 * @version 2021-03-23
 */
public abstract class Person {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * Creates an instance of Person.
     * 
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param socialSecurityNumber the social security number fo the person
     */
    public Person(String firstName, String lastName, String socialSecurityNumber) {
        if ((null == firstName) 
                || (null == lastName) 
                || null == socialSecurityNumber) {
            throw new IllegalArgumentException("Parameters cannot be null");
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Returns the social security number.
     * 
     * @return socialSecurityNumber of the person.
     */
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    /**
     * Sets the social security number fo the person.
     * 
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.checkForNullAndBlank(socialSecurityNumber);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Sets the first name of the person.
     * 
     * @param firstName the first name to be set
     */
    public void setFirtName(String firstName) {
        this.checkForNullAndBlank(firstName);
        this.firstName = firstName;
    }

    /**
     * Sets the last name of the person.
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.checkForNullAndBlank(lastName);
        this.lastName = lastName;
    }

    /**
     * Returns the first name of the person.
     * 
     * @return the first name of the person.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Returns the last name of the person.
     * 
     * @return the last name of the person
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Returns the full name of the person on the form
     * "first name last name".
     * 
     * @return the full name of the person
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    
    /**
     * Checks the parameter against {@code null} and blank string.
     * Throws IllegalArgumentException if the argument is null or blank.
     * @param someText the text to check
     */
    private void checkForNullAndBlank(String someText) {
         if (socialSecurityNumber == null) {
            throw new IllegalArgumentException("Socisal security number cannot be null");
        }
        
        if (socialSecurityNumber.isBlank()) {
            throw new IllegalArgumentException("Socisal security number cannot be null");            
        }       
    }


    @Override
    public String toString() {
        return "Person: [name=" + firstName + " " + lastName + ", social security number=" + socialSecurityNumber + "]";
    }
}
