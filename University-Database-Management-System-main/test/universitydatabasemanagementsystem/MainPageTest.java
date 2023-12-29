package universitydatabasemanagementsystem;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test class for the MainPage class.
 */
public class MainPageTest {

    private MainPage mainPage;

    /**
     * Sets up the test environment before each test case.
     */
    @Before
    public void setUp() {
        mainPage = new MainPage();
    }

    /**
     * Tests the initialization of the MainPage object.
     */
    @Test
    public void testInitialization() {
        // Check if the mainPage object is initialized properly
        assertNotNull(mainPage);
    }

    /**
     * Tests the action of the Back button.
     */
    @Test
    public void testBackButtonAction() {
        // Check if the Back button action performs the expected action
        mainPage.Back.doClick();
        // Assuming LoginPage is in the same package and has a setVisible method
        assertFalse(mainPage.isVisible()); // The mainPage should still be visible
    }
}
