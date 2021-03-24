package mappe.del1.hospital;

import mappe.del1.hospital.healthpersonal.Nurse;
import mappe.del1.hospital.healthpersonal.doctor.GeneralPractitioner;
import mappe.del1.hospital.healthpersonal.doctor.Surgeon;

/**
 * A helper-class contining a method to fill a Hospital with some default
 * departments with some employees and patients.
 *
 * @author idatx2001
 * @version 2021-03-23
 */
public class HospitalTestData {

  /**
   * It is good coding practice to always add a private default construcor
   * on "utility classes". Utillity classes are classes where all methods
   * are static. Hence we should never create instances of utillity classes.
   */
  private HospitalTestData() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Fills the hospital provided as a parameter with
   * departments and some employees and patients.
   *
   * @param hospital the hospital to be populated with testdata
   */
  public static void fillRegisterWithTestData(final Hospital hospital) {

    // Add some departments
    Department emergencyRoom = new Department("Akutten");
    emergencyRoom.addEmployee(new Employee("Odd Even", "Primtallet", "260327 38456"));
    emergencyRoom.addEmployee(new Employee("Huppasahn", "DelFinito", "030436 47452"));
    emergencyRoom.addEmployee(new Nurse("Rigmor", "Mortis", "121267 453678"));
    emergencyRoom.addEmployee(new GeneralPractitioner("Inco", "Gnito", "310547 48563"));
    emergencyRoom.addEmployee(new Surgeon("Inco", "Gnito", "280678 32564"));
    emergencyRoom.addPatient(new Patient("Nina", "Teknologi", "060467 46356"));
    emergencyRoom.addPatient(new Patient("Ove", "Ralt", "091045 35632"));
    hospital.addDepartment(emergencyRoom);

    Department childrensPolyclinic = new Department("Barne poliklinikk");
    childrensPolyclinic.addEmployee(new Employee("Salti", "Kaffen", "121278 45367"));
    childrensPolyclinic.addEmployee(new Employee("Nidel V.", "ElvefÃ¸lger", "280267 39624"));
    childrensPolyclinic.addEmployee(new Nurse("Anton", "Nym", "240567 35246"));
    childrensPolyclinic.addEmployee(new GeneralPractitioner("Gene", "Sis", "210989 56372"));
    childrensPolyclinic.addPatient(new Patient("Nanna", "Na", "120403 56435"));
    childrensPolyclinic.addPatient(new Patient("Nora", "Toriet", "281178 36524"));
    hospital.addDepartment(childrensPolyclinic);
  }
}
