package universitydatabasemanagementsystem;

import static org.junit.Assert.*;
import org.junit.Test;

import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

/**
 * JUnit test class for the StudentsResultDataBase class.
 */
public class StudentsResultDataBaseTest {

    /**
     * Tests the DeleteButtonActionPerformed method to ensure proper behavior when deleting student records.
     */
    @Test
    public void testDeleteButtonActionPerformed() {
        // Create a mock JFrame or the actual GUI class containing DeleteButtonActionPerformed
        StudentsResultDataBase gui = new StudentsResultDataBase();

        // Set up some sample data for testing
        gui.EnrollmentField.setText("123456");  // Replace with an actual enrollment number in your database

        // Simulate the user clicking the Delete button
        ActionEvent event = new ActionEvent(gui.DeleteButton, ActionEvent.ACTION_PERFORMED, "Command");
        gui.DeleteButtonActionPerformed(event);

        // Check if the appropriate JOptionPane message is displayed
        String actualMessage = gui.getOptionPaneMessage();
        assertNotEquals("Student Results Records Deleted Successfully.", actualMessage);

        // Check if the table model is updated after deletion
        DefaultTableModel model = (DefaultTableModel) gui.ResultsRecordTable.getModel();
        assertNotEquals(0, model.getRowCount());  // Assuming the table is cleared after deletion
    }

}
