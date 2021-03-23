package mappe.del1.hospital;

/**
 * Represents an employee.
 * 
 * @author idatx2001
 * @version 2021-03-23
 */
public class Employee extends Person {

    /**
     * Creates an instance of Employee.
     * 
     * @param firstName the first name of the employee
     * @param lastName the last name of the employee
     * @param socialSecurityNumber the social security number, 11 digits long
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

  
    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + ": " + super.toString() + "]";
    }
}
