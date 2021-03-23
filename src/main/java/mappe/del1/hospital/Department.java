package mappe.del1.hospital;

import java.util.ArrayList;
import java.util.List;
import mappe.del1.hospital.exception.RemoveException;

/**
 * Represents a Department at the hospital. A department has patients
 * and employees.
 * 
 * @author idatx2001
 * @version 2021-03-23
 */
public class Department {

  //list of Employees
  private ArrayList<Employee> employees = new ArrayList<Employee>();
  // List of Patients
  private ArrayList<Patient> patients = new ArrayList<Patient>();

  private String departmentName;

  /**
   * Creates an instance of a Department with a name given by
   * the parameter.
   *
   * @param departmentName name of the department
   */
  public Department(String departmentName) {
    this.departmentName = departmentName;
  }

  /**
   * Returns the name of the department.
   *
   * @return name of the department
   */
  public String getDepartmentName() {
    return this.departmentName;
  }

  /**
   * Sets the name of the department
   *
   * @param departmentName the name of the department
   */
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  /**
   * Returns the list of employees at the department.
   *
   * @return the list of employees at the department
   */
  public List<Employee> getEmployees() {
    return this.employees;
  }

  /**
   * Add an employee to the department.
   *
   * @param employee the employee to be added
   */
  public void addEmployee(Employee employee) {
    this.employees.add(employee);
  }

  /**
   * Returns the list of patients in the department
   *
   * @return the list of patients in the department
   */
  public List<Patient> getPatients() {
    return this.patients;
  }

  /**
   * Add a patient to the department.
   *
   * @param patient the patient to be added to the department.
   */
  public void addPatient(Patient patient) {
    this.patients.add(patient);
  }

  /**
   * Since we override the equals()-method, we also need to
   * override the hashCode()-metod.
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((employees == null) ? 0 : employees.hashCode());
    result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
    result = prime * result + ((patients == null) ? 0 : patients.hashCode());
    return result;
  }

  /**
   * Checks if the object provided by the parameter is equal to
   * it self.
   * This method is overridden from the Object-class, and as such does not need
   * extra JavaDoc here.
   */
  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Department other = (Department) obj;
    if (employees == null) {
      if (other.employees != null) {
        return false;
      }
    } else if (!employees.equals(other.employees)) {
      return false;
    }
    if (departmentName == null) {
      if (other.departmentName != null) {
        return false;
      }
    } else if (!departmentName.equals(other.departmentName)) {
      return false;
    }
    if (patients == null) {
      if (other.patients != null) {
        return false;
      }
    } else if (!patients.equals(other.patients)) {
      return false;
    }
    return true;
  }

  /**
   * Creates a String-representation of a Department instance
   * for use in debugging ONLY!
   * @return a String-representation of a Department
   */
  @Override
  public String toString() {

    String employeeStr = "";
    String patientStr = "";
    String separator = "";

    for (Employee employee : employees) {
      employeeStr += separator + employee.toString();
      separator = ",";
    }

    separator = "";
    for (Patient patient : patients) {
      patientStr += separator + patient.toString();
      separator = ",";
    }

    return "[" + departmentName + "\n\t" + employeeStr + "\n\t" + patientStr + "]";
  }

  /**
   * Removes a person from either the list of employees or the
   * list of patients.
   *
   * @param person the person to remove.
   * @throws RemoveException if person was not found
   */
  public void remove(Person person) throws RemoveException {
    boolean removedSuccessfully = false;

    // Check if perosn is a patient
    if (person instanceof Patient) {
      Patient patient = (Patient) person;
      if (this.patients.contains(patient)) {
        this.patients.remove(patient);
        removedSuccessfully = true;
      }
    }

    // Check if person is an employee
    if (person instanceof Employee) {
      Employee employee = (Employee) person;

      if (this.employees.contains(employee)) {
        this.employees.remove(employee);
        removedSuccessfully = true;
      }
    }

    if (!removedSuccessfully){
      throw new RemoveException("Unable to remove person: " + person.toString());
    }
  }
}
