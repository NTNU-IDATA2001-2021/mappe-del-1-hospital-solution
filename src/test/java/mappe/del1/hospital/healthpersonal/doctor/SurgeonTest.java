/**
 * Some reflections on why to test the Surgon class, and how to test the class
 * to both ensure the class does what it is designed to do (positive testing)
 * and also that the class is robust against being used in thw wrong way
 * (negative tests).
 * 
 * So why test the class Surgeon? Well since Surgeou extends Doctor extends 
 * Employee extends Person, by testing Surgeon, we also test all the 
 * superclasses Doctor, Employee and Person.
 * 
 * Positive tests:
 * - Test that the cretion of a Surgeoun object works. That is, that the values
 *   given by the parameters of the constructor are actually set in the
 *   fields of the object, if all the parameters are valid.
 * - Test that the method testDiagnosis() works as intended, when the
 *   parameters are valid.
 * 
 * Negative Tests:
 * - Test that if trying to create an instance of Surgeon using invalid
 *   parameters, the object will not be created, and an IllegalArgumenException 
 *   will be thrown.
 * - Test that if trying to call setDiagnosis() with an invalid parameter,
 *   the method will throw an IllegalArgumentException.
 * 
 * With these 4 tests, the entire class should be well covered by both positive-
 * and negative tests.
 * 
 */
package mappe.del1.hospital.healthpersonal.doctor;

import mappe.del1.hospital.Patient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author arne
 */
public class SurgeonTest {
    

    /**
     * Tests the creation of an instance using valid parameters on the
     * constructor.
     */
    @Test
    @DisplayName("Test the creation of an instance of Surgeon with valid input.")
    public void testCreateInstanceWithValidParameters() {
        Surgeon surgeon = new Surgeon("Leif", "Olsen", "120376 36542");
        
        assertEquals("Leif", surgeon.getFirstName());
        assertEquals("Olsen", surgeon.getLastName());
        assertEquals("Leif Olsen", surgeon.getFullName());
        assertEquals("120376 36542", surgeon.getSocialSecurityNumber());
    }

    /**
     * Test of setDiagnosis method, of class Surgeon with valid parameters.
     */
    @Test
    @DisplayName("Test setting a diagnosis of a patient using valid parameters.")
    public void testSetDiagnosisWithValidParameters() {
        Patient patient = new Patient("Trine", "Jensen", "030483 35654");
        String diagnosis = "breast cancer";
        Surgeon surgeon = new Surgeon("Leif", "Olsen", "120376 36542");
        surgeon.setDiagnosis(patient, diagnosis);
        
        assertEquals("breast cancer", patient.getDiagnosis());
        
    }
    

    /**
     * Tests the creation of an instance using valid parameters on the
     * constructor.
     */
    @Test
    @DisplayName("Test the creation of an instance of Surgeon with invalid input.")
    public void testCreateInstanceWithInvalidParameters() {
        try {
            Surgeon surgeon = new Surgeon(null, "Olsen", "120376 36542");
            fail("Invalid parameter firstName was not caught by the constructor.");
        } catch (IllegalArgumentException iae) {
            assertTrue(true);
        }        
    }

    /**
     * Test of setDiagnosis method, of class Surgeon with invalid parameters.
     */
    @Test
    @DisplayName("Test setting a diagnosis of a patient using invalid parameters.")
    public void testSetDiagnosisWithInvalidParameter() {
        Patient patient = null;
        String diagnosis = "breast cancer";
        Surgeon surgeon = new Surgeon("Leif", "Olsen", "120376 36542");
        try {
            surgeon.setDiagnosis(patient, diagnosis);
            fail("Invalid parameter patient was not caught by the setDiagnosis().");
        } catch( IllegalArgumentException iae) {
            
        }
                
    }    
}
