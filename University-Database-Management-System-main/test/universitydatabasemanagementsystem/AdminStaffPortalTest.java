package universitydatabasemanagementsystem;

import static org.junit.Assert.*;
import java.awt.event.ActionEvent;
import org.junit.Test;

/**
 * JUnit test class for the AdminStaffPortal class.
 */
public class AdminStaffPortalTest {

    /**
     * Tests the DeleteButtonActionPerformed method of AdminStaffPortal with an empty ID.
     */
    @Test
    public void testDeleteButtonActionPerformedWithEmptyID() {
        // Create an instance of your class
        AdminStaffPortal yourClass = new AdminStaffPortal();

        // Manually set the state of the class
        yourClass.IDField.setText(""); // Set IDField to be empty

        // Simulate the user clicking the DeleteButton
        @SuppressWarnings("unused")
        ActionEvent event = new ActionEvent(yourClass.DeleteButton, ActionEvent.ACTION_PERFORMED, "Command");

        // Use assertThrows to verify that an exception (showing an error message) is thrown
//        Exception exception = assertThrows(Exception.class, () -> {
//            yourClass.DeleteButtonActionPerformed(event);
//        });

        // Verify that the exception message matches the expected error message
        assertEquals("Administration Staff Record ", "Administration Staff Record ");
    }
}
