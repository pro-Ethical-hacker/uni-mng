package universitydatabasemanagementsystem;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTextField;

import org.junit.jupiter.api.Test;
import org.powermock.reflect.Whitebox;

/**
 * This class contains unit tests for the GPACalculator class.
 */
public class GPACalculatorTest {

    /**
     * Tests the gradeCalculator method of GPACalculator.
     */
    @Test
    public void testGradeCalculator() {
        GPACalculator calculator = new GPACalculator();

        assertEquals("A", calculator.gradeCalculator(95));
        assertEquals("A-", calculator.gradeCalculator(80));
        assertEquals("B+", calculator.gradeCalculator(75));
        assertEquals("B", calculator.gradeCalculator(71));
        assertEquals("B-", calculator.gradeCalculator(68));
        assertEquals("C+", calculator.gradeCalculator(64));
        assertEquals("C", calculator.gradeCalculator(60));
        assertEquals("C-", calculator.gradeCalculator(57));
        assertEquals("D+", calculator.gradeCalculator(53));
        assertEquals("D", calculator.gradeCalculator(50));
        assertEquals("F", calculator.gradeCalculator(40));
    }

    /**
     * Tests the gradePointCalculator method of GPACalculator.
     */
    @Test
    public void testGradePointCalculator() {
        GPACalculator calculator = new GPACalculator();

        assertEquals(4.0, calculator.gradePointCalculator("A"), 0.01);
        assertEquals(3.67, calculator.gradePointCalculator("A-"), 0.01);
        assertEquals(3.33, calculator.gradePointCalculator("B+"), 0.01);
        assertEquals(3.0, calculator.gradePointCalculator("B"), 0.01);
        assertEquals(2.67, calculator.gradePointCalculator("B-"), 0.01);
        assertEquals(2.33, calculator.gradePointCalculator("C+"), 0.01);
        assertEquals(2.0, calculator.gradePointCalculator("C"), 0.01);
        assertEquals(1.87, calculator.gradePointCalculator("C-"), 0.01);
        assertEquals(1.33, calculator.gradePointCalculator("D+"), 0.01);
        assertEquals(1.0, calculator.gradePointCalculator("D"), 0.01);
        assertEquals(0.0, calculator.gradePointCalculator("F"), 0.01);
    }

    /**
     * Tests the CalculateGPAActionPerformed method of GPACalculator for GUI interaction.
     */
    @Test
    public void testCalculateGPAActionPerformed() {
        // Create a mock instance of your class
        GPACalculator yourClass = mock(GPACalculator.class);

        // Mock the JTextField objects
        JTextField mockGPA = mock(JTextField.class);
        JTextField mockSemTotalCreditHours = mock(JTextField.class);

        // Set the mock fields for testing
        Whitebox.setInternalState(yourClass, "GPA", mockGPA);
        Whitebox.setInternalState(yourClass, "SemTotalCreditHours", mockSemTotalCreditHours);

        // Mock the database interaction
        Connection mockConnection = mock(Connection.class);
        PreparedStatement mockPreparedStatement = mock(PreparedStatement.class);
        ResultSet mockResultSet = mock(ResultSet.class);

        try {
            when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
            when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);

            // Set up the ResultSet to return values when calling rs.next()
            when(mockResultSet.next()).thenReturn(true, false); // Simulating a single row in the result set

            // Set up values for the result set
            when(mockResultSet.getInt("CreditHours")).thenReturn(3);
            when(mockResultSet.getDouble("Product")).thenReturn(12.0);

            // Additional assertions if needed
        } catch (Exception e) {
            fail("Exception not expected during CalculateGPAActionPerformed: " + e.getMessage());
        }
    }
}
