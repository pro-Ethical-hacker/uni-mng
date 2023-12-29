package universitydatabasemanagementsystem;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test class for the AddNewFaculty class.
 */
public class AddNewFacultyTest {

    private AddNewFaculty addNewFaculty;

    /**
     * Sets up the test environment before each test case.
     */
    @Before
    public void setUp() {
        // You can initialize any necessary objects or set up the environment here
        addNewFaculty = new AddNewFaculty();
    }

    /**
     * Tests the actionPerformed method of AddNewFaculty for adding a new record.
     */
    @Test
    public void testAddRecordActionPerformed() {
        // Prepare test data
        addNewFaculty.NameField.setText("John Doe");
        addNewFaculty.DesignationField.setText("Professor");
        addNewFaculty.CourseField.setText("Computer Science");
        addNewFaculty.EmailAdressField.setText("john.doe@example.com");

        // Perform the action you want to test
        addNewFaculty.AddRecordActionPerformed(null); // Pass a dummy ActionEvent for testing

        // Assert the expected results
        // You may want to check the database state or display a message to the user in a real application
        assertEquals("", addNewFaculty.NameField.getText());
        assertEquals("", addNewFaculty.DesignationField.getText());
        assertEquals("", addNewFaculty.CourseField.getText());
        assertEquals("", addNewFaculty.EmailAdressField.getText());
    }

}
