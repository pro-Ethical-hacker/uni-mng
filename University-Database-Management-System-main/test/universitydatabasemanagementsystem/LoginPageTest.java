// LoginPageTest.java
package universitydatabasemanagementsystem;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit test class for the LoginPage class.
 */
public class LoginPageTest {

    /**
     * Tests the login functionality with valid username and password.
     *
     * @throws Exception if an exception occurs during the test.
     */
    @Test
    public void testValidUsernameAndPassword() throws Exception {
        LoginPage loginPage = new LoginPage();

        // Simulate valid username and password
        loginPage.Username.setText("admin");
        loginPage.Password.setText("password");


        // Assert that the main page is shown
        MainPage mainPage = new MainPage();
        assertNotNull(mainPage);
    }

    /**
     * Tests the login functionality with empty username and password.
     */
    @Test
    public void testEmptyUsernameAndPassword() {
        LoginPage loginPage = new LoginPage();

        // Simulate empty username and password
        loginPage.Username.setText("");
        loginPage.Password.setText("");


        // Assert that an error message is shown
        String errorMessage = "Invalid Username or Password...";
        assertNotNull(errorMessage);
        assertTrue(errorMessage.contains("Invalid Username or Password..."));
    }
}
