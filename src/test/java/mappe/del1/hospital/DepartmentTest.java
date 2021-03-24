
package mappe.del1.hospital;

import mappe.del1.hospital.exception.RemoveException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import javax.management.openmbean.KeyAlreadyExistsException;
import mappe.del1.hospital.healthpersonal.doctor.Surgeon;


import static org.junit.jupiter.api.Assertions.*;


public class DepartmentTest {
  /**
   * Test removing persons from the list of employees and list of patiens.
   * The persons tried removed exsits in the lists.
   */
  @Test
  @DisplayName("Try to remove exsisting persons from department registers")
  public void testRemovingExsistingPersonsFromDepartment() {

    Department department = new Department("Paramedic Department");
    Surgeon surgeon = new Surgeon("Jens", "Olsen", "120323 87565");
    Patient patient = new Patient("Per", "Knutsen", "140356 45723");

    department.addEmployee(surgeon);
    department.addPatient(patient);

    try {
      department.remove(surgeon);
      department.remove(patient);
      assertTrue(true);
    } catch (RemoveException e) {
      fail("Person was not removed");
    }
  }

  /**
   * Test removing people from the departments lists that are not in the lists.
   * Should result in RemoveException being thrown.
   */
  @Test
  @DisplayName("Try to remove non-exsisting persons from department register")
  public void testRemovingPersonWhenPersonDoesNotExistsInDepartment() {
    Department department = new Department("Paramedic Derpartment");
    Surgeon surgeon = new Surgeon("Jens", "Olsen", "120323 87565");
    Patient patient = new Patient("Per", "Knutsen", "140356 45723");

    // Try removing the surgeon
    try {
      department.remove(surgeon);
      fail("RemoveException should have been thrown..");
    } catch (RemoveException e) {
      assertTrue(true);
    }
    // Try removing the patient
    try {
      department.remove(patient);
      fail("RemoveException should have been thrown..");
    } catch (RemoveException e) {
      assertTrue(true);
    }
  }

  /**
   * Test that creating an instance of department with valid parameters
   */
  @Test
  @DisplayName("Create a department with valid parameters")
  public void testCreateDepartmentWithValidInput() {
    Department department = new Department("Medical Department");
    assertEquals("Medical Department", department.getDepartmentName());
  }

  /**
   * Test that creating an instance of department with invalid parameter.
   * Should throw an exception.
   * <p>
   * Invalid inputs are {@code null} or a blank string for department name
   */
  @Test
  @DisplayName("Create a department with invalid input")
  public void testCreateDepartmentWithInvalidInput() {
    try {
      Department department = new Department("");
      fail("IllegalArgumentException should have been thrown");
    } catch (IllegalArgumentException e) {
      assertTrue(true);
    }
  }

  /**
   * Test adding new employee.
   */
  @Test
  @DisplayName("Adding employee to department")
  public void testAddingEmployeeToDepartment() {
    Department department = new Department("Medical Department");
    Employee employee = new Employee("Per", "Knutsen", "140356 45723");

    try {
      department.addEmployee(employee);
      boolean foundEmployee = department.getEmployees()
          .stream()
          .anyMatch(empl ->
              empl.equals(employee));
      assertTrue(foundEmployee);

    } catch (Exception e) {
      fail("Should not throw Exception");
    }
  }

}
