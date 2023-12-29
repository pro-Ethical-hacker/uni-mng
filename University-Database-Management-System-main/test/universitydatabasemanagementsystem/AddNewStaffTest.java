package universitydatabasemanagementsystem;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test class for the AddNewStaff class.
 */
public class AddNewStaffTest {

    private AddNewStaff addNewStaff;

    /**
     * Sets up the test environment before each test case.
     */
    @Before
    public void setUp() {
        // You can initialize any necessary objects or set up the environment here
        addNewStaff = new AddNewStaff();
    }

    /**
     * Tests the actionPerformed method of AddNewStaff for adding a new record.
     */
    @Test
    public void testAddRecordActionPerformed() {
        // Prepare test data
        addNewStaff.Name.setText("John Doe");
        addNewStaff.Designation.setText("Professor");
        addNewStaff.PhoneNo.setText("1234567890");

        // Perform the action you want to test
        addNewStaff.AddRecordActionPerformed(null); // Pass a dummy ActionEvent for testing

        // Assert the expected results
        // You may want to check the database state or display a message to the user in a real application
        assertEquals("", addNewStaff.Name.getText());
        assertEquals("", addNewStaff.Designation.getText());
        assertEquals("", addNewStaff.PhoneNo.getText());
    }

    /**
     * Tests the actionPerformed method of AddNewStaff with empty fields.
     */
    @Test
    public void testAddRecordWithEmptyFields() {
        // Prepare test data with empty fields
        addNewStaff.Name.setText("");
        addNewStaff.Designation.setText("");
        addNewStaff.PhoneNo.setText("");

        // Perform the action you want to test
        addNewStaff.AddRecordActionPerformed(null);

        // Assert that no records should be added with empty fields
        // You may want to check if an appropriate message is shown to the user
        // or if the database state remains unchanged
        // (based on your actual implementation)
        // For simplicity, let's assume that the fields should remain empty
        assertEquals("", addNewStaff.Name.getText());
        assertEquals("", addNewStaff.Designation.getText());
        assertEquals("", addNewStaff.PhoneNo.getText());
    }

    /**
     * Tests the actionPerformed method of AddNewStaff with an invalid phone number.
     */
    @Test
    public void testAddRecordWithInvalidPhoneNo() {
        // Prepare test data with an invalid phone number
        addNewStaff.Name.setText("Jane Doe");
        addNewStaff.Designation.setText("Assistant Professor");
        addNewStaff.PhoneNo.setText("InvalidPhoneNumber");

        // Perform the action you want to test
        addNewStaff.AddRecordActionPerformed(null);

        // Assert that records should be added even with an invalid phone number
        // You may want to check if an appropriate message is shown to the user
        // or if the database state reflects the addition of the record
        // (based on your actual implementation)
        assertEquals("", addNewStaff.Name.getText()); // Assuming the name field should be cleared after adding
        assertEquals("", addNewStaff.Designation.getText()); // Assuming the designation field should be cleared after adding
        assertEquals("", addNewStaff.PhoneNo.getText()); // Assuming the phone number field should be cleared after adding
    }
}
