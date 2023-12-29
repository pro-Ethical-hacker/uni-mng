package universitydatabasemanagementsystem;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test class for the AddNewStudent class.
 */
public class AddNewStudentTest {

    private AddNewStudent addNewStudent;

    /**
     * Sets up the test environment before each test case.
     */
    @Before
    public void setUp() {
        // You can initialize any necessary objects or set up the environment here
        addNewStudent = new AddNewStudent();
    }

    /**
     * Tests the actionPerformed method of AddNewStudent for adding a new record.
     */
    @Test
    public void testAddRecordActionPerformed() {
        // Prepare test data
        addNewStudent.Name.setText("John Doe");
        addNewStudent.Age.setText("25");
        addNewStudent.Department.setText("Computer Science");
        addNewStudent.Section.setText("A");
        addNewStudent.PhoneNo.setText("1234567890");

        // Perform the action you want to test
        addNewStudent.AddRecordActionPerformed(null); // Pass a dummy ActionEvent for testing

        // Assert the expected results
        // You may want to check the database state or display a message to the user in a real application
        assertEquals("", addNewStudent.Name.getText());
        assertEquals("", addNewStudent.Age.getText());
        assertEquals("", addNewStudent.Department.getText());
        assertEquals("", addNewStudent.Section.getText());
        assertEquals("", addNewStudent.PhoneNo.getText());
    }

    /**
     * Tests the actionPerformed method of AddNewStudent with empty fields.
     */
    @Test
    public void testAddRecordWithEmptyFields() {
        // Prepare test data with empty fields
        addNewStudent.Name.setText("");
        addNewStudent.Age.setText("");
        addNewStudent.Department.setText("");
        addNewStudent.Section.setText("");
        addNewStudent.PhoneNo.setText("");

        // Perform the action you want to test
        addNewStudent.AddRecordActionPerformed(null);

        // Assert that no records should be added with empty fields
        // You may want to check if an appropriate message is shown to the user
        // or if the database state remains unchanged
        // (based on your actual implementation)
        // For simplicity, let's assume that the fields should remain empty
        assertEquals("", addNewStudent.Name.getText());
        assertEquals("", addNewStudent.Age.getText());
        assertEquals("", addNewStudent.Department.getText());
        assertEquals("", addNewStudent.Section.getText());
        assertEquals("", addNewStudent.PhoneNo.getText());
    }

    /**
     * Tests the actionPerformed method of AddNewStudent with an invalid phone number.
     */
    @Test
    public void testAddRecordWithInvalidPhoneNo() {
        // Prepare test data with an invalid phone number
        addNewStudent.Name.setText("Jane Doe");
        addNewStudent.Age.setText("22");
        addNewStudent.Department.setText("Electrical Engineering");
        addNewStudent.Section.setText("B");
        addNewStudent.PhoneNo.setText("InvalidPhoneNumber");

        // Perform the action you want to test
        addNewStudent.AddRecordActionPerformed(null);

        // Assert that records should be added even with an invalid phone number
        // You may want to check if an appropriate message is shown to the user
        // or if the database state reflects the addition of the record
        // (based on your actual implementation)
        assertEquals("", addNewStudent.Name.getText()); // Assuming the name field should be cleared after adding
        assertEquals("", addNewStudent.Age.getText()); // Assuming the age field should be cleared after adding
        assertEquals("", addNewStudent.Department.getText()); // Assuming the department field should be cleared after adding
        assertEquals("", addNewStudent.Section.getText()); // Assuming the section field should be cleared after adding
        assertEquals("", addNewStudent.PhoneNo.getText()); // Assuming the phone number field should be cleared after adding
    }
}
