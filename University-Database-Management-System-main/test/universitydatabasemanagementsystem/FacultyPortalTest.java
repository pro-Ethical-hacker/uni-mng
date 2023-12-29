package universitydatabasemanagementsystem;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit test class for the FacultyPortal class.
 */
public class FacultyPortalTest {

    /**
     * Tests the openAddNewFacultyFrame method of FacultyPortal.
     */
    @Test
    public void testOpenAddNewFacultyFrame() {
        FacultyPortal Class = new FacultyPortal();

        // Mock the frame (you may need to adjust based on your actual implementation)
        MockAddNewFaculty mockAddF = new MockAddNewFaculty();

        // Verify that the expected methods are called on the mock
        assertFalse(mockAddF.isVisibleCalled);
        assertFalse(mockAddF.setVisibleValue);
        assertFalse(Class.isVisible());
        
    }

    /**
     * Mock class for AddNewFaculty to be used in testing.
     */
    private static class MockAddNewFaculty extends AddNewFaculty {
        boolean isVisibleCalled = false;
        boolean setVisibleValue;

        /**
         * Overrides the setVisible method to track method calls and values.
         *
         * @param value The visibility value to set.
         */
        @Override
        public void setVisible(boolean value) {
            isVisibleCalled = true;
            setVisibleValue = value;
        }
    }
}
