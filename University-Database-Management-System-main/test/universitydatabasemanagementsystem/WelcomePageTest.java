package universitydatabasemanagementsystem;

import static org.junit.Assert.*;
import org.junit.Test;

import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;

/**
 * JUnit test class for the WelcomePage class.
 */
public class WelcomePageTest {

    /**
     * Tests the SignInButtonActionPerformed method to ensure proper behavior when clicking the Sign In button.
     */
    @Test
    public void testSignInButtonActionPerformed() {
        // Create the WelcomePage in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            WelcomePage welcomePage = new WelcomePage();
            welcomePage.setVisible(true);

            // Simulate the user clicking the Sign In button
            ActionEvent event = new ActionEvent(welcomePage.SignInButton, ActionEvent.ACTION_PERFORMED, "Command");
            welcomePage.SignInButton.getActionListeners()[0].actionPerformed(event);

            // Check if the LoginPage is visible after clicking the Sign In button
            assertNotNull(welcomePage.lp);
            assertTrue(welcomePage.lp.isVisible());

            // Check if the WelcomePage is not visible after clicking the Sign In button
            assertFalse(welcomePage.isVisible());
        });
    }

    /**
     * Tests the ExitActionPerformed method to ensure proper behavior when clicking the Exit button.
     */
    @Test
    public void testExitActionPerformed() {
        // Create the WelcomePage in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            WelcomePage welcomePage = new WelcomePage();
            welcomePage.setVisible(true);

            // Simulate the user clicking the Exit button
            ActionEvent event = new ActionEvent(welcomePage.Exit, ActionEvent.ACTION_PERFORMED, "Command");
            welcomePage.Exit.getActionListeners()[0].actionPerformed(event);

            // Check if the WelcomePage is not visible after clicking the Exit button
            assertFalse(welcomePage.isVisible());
        });
    }

    /**
     * Tests the initialization of components in the WelcomePage.
     */
    @Test
    public void testComponentsInitialization() {
        // Create the WelcomePage in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            WelcomePage welcomePage = new WelcomePage();

            // Check if the components are initialized properly
            assertNotNull(welcomePage.jPanel1);
            assertNotNull(welcomePage.jPanel2);
            assertNotNull(welcomePage.jPanel3);
            assertNotNull(welcomePage.SignInButton);
            assertNotNull(welcomePage.Exit);
        });
    }
}
