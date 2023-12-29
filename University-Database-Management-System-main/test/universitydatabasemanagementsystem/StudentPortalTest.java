package universitydatabasemanagementsystem;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTable;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.powermock.reflect.Whitebox;

/**
 * JUnit test class for the StudentPortal class.
 */
public class StudentPortalTest {

    /**
     * Tests the LoadStudentRecordTable method of the StudentPortal class.
     */
    @Test
    public void testLoadStudentRecordTable() {
        // Create an instance of your class
        StudentPortal yourClass = new StudentPortal();

        // Mock the JTable object
        JTable mockStudentRecordTable = mock(JTable.class);

        // Set the mock field for testing
        Whitebox.setInternalState(yourClass, "StudentRecordTable", mockStudentRecordTable);

        // Mock the database interaction
        Connection mockConnection = mock(Connection.class);
        PreparedStatement mockPreparedStatement = mock(PreparedStatement.class);
        ResultSet mockResultSet = mock(ResultSet.class);

        try {
            when(mockConnection.prepareStatement(ArgumentMatchers.anyString())).thenReturn(mockPreparedStatement);
            when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);

            // Set up the ResultSet to return values when calling rs.next()
            when(mockResultSet.next()).thenReturn(true, false); // Simulating a single row in the result set

            // Set up values for the result set
            when(mockResultSet.getInt("Enrollment")).thenReturn(1);
            when(mockResultSet.getString("Name")).thenReturn("John");
            when(mockResultSet.getString("Age")).thenReturn("25");
            when(mockResultSet.getString("Department")).thenReturn("Computer Science");
            when(mockResultSet.getString("Section")).thenReturn("A");
            when(mockResultSet.getString("Phone")).thenReturn("123456789");

            // Additional assertions if needed
        } catch (Exception e) {
            fail("Exception not expected during LoadStudentRecordTable: " + e.getMessage());
        }
    }
}
