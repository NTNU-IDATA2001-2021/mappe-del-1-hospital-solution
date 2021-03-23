package mappe.del1.hospital;

import java.util.List;
import mappe.del1.hospital.exception.RemoveException;

/**
 * A simple client used to test some of the functionality in this assignment.
 *
 * @author idatx2001
 * @version 2021-03-23
 */
public class HospitalClient {

    public static void listAllEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + ", "
                    + employee.getLastName() + ", "
                    + employee.getSocialSecurityNumber());
        }
    }

    public static void listAllPatients(List<Patient> patients) {
        for (Patient patient : patients) {
            System.out.println(patient.getFirstName() + ", "
                    + patient.getLastName() + ", "
                    + patient.getSocialSecurityNumber());
        }
    }

    public static void main(final String[] args) {
        Hospital hospital = new Hospital("St. Olavs Hospital");

        HospitalTestData.fillRegisterWithTestData(hospital);

        System.out.println("Hospital " + hospital.getHospitalName() + " created and inititalized!\n");

        // Try to remove an employee that exsists in a department
        // First get a department to work on
        Department department = hospital.getDepartments().get(0);

        // Then, create an Employee and add the employee to the department
        Employee employee = new Employee("Jens", "Olsen", "301269 25521");
        department.addEmployee(employee);
        System.out.println("Employees in the department: ");
        listAllEmployees(department.getEmployees());
        // Remove the employee
        try {
            department.remove(employee);
            System.out.println("\nEmployee " + employee.getFirstName() + " was removed successfully.\n");
            listAllEmployees(department.getEmployees());
        } catch (RemoveException rex) {
            System.out.println("Something went wrong. It should be possible to remove "
                    + employee.getFirstName());
        }

        // Try removing a patient that does not exsist in the department
        Patient patient = new Patient("Lise", "Thoresen", "230783 35623");
        try {
            department.remove(patient);
            System.out.println("Something went wrong. It should not be possible to remove a patient that does not exsist.");
        } catch (RemoveException rex) {
            System.out.println("\nThe patient " + patient.getFirstName()
                + " does not exsist in the department.");
        }
    }
}
