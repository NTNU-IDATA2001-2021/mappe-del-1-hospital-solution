package mappe.del1.hospital;

import java.util.ArrayList;

import java.util.List;
import mappe.del1.hospital.exception.RemoveException;

/**
 * Represents a Hospital. 
 * A hospital typically consists of one or more departments.
 * 
 * @author idatx2001
 * @version 2021-03-23
 */
public class Hospital {

     //Departments.
    private ArrayList<Department> departments = new ArrayList<Department>();
    // Name of the Hospital
    private final String hospitalName;

    /**
     * Creates an instance of the Hospital. The name of the hospital
     * is given by the parameter.
     *
     * @param name the name of the hospital
     */
    public Hospital(String name) {
        this.hospitalName = name;
    }

    /**
     * Returns the name of the hospital.
     * @return name of the hospital
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * Returns the departments in the hospital.
     * @return the departments in the hospital
     */
    public List<Department> getDepartments() {
        return this.departments;
    }

    /**
     * Adds a department to the hospital.
     * @param department the depratment to add to the hospital.
     */
    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    /**
     * Creates a string representing the Hospital instance
     * for debugging purposes ONLY!!.
     */
    @Override
    public String toString() {
        String departmentStr = "";
        String separator = "";

        for (Department department : departments) {
            departmentStr += separator + department.toString();
            separator = ",";
        }

        return "[Hospital=" + hospitalName + "\n\t" + departmentStr + "]";
    }


}
