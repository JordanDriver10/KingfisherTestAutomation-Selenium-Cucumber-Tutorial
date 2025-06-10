package TAWorkshop.stepDefs;

import TAWorkshop.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import TAWorkshop.steps.SignInSteps;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Step definitions class mapping Gherkin steps to Java methods.
 * This class contains assertions and calls reusable actions from SignInSteps helper.
 */
public class SignInStepDefinitions {

    // Use the shared WebDriver instance from DriverManager to avoid multiple browser instances
    private WebDriver driver = DriverManager.driver;

    // Declare SignInSteps helper instance for interacting with page elements and actions
    private SignInSteps signInSteps;

    /**
     * Step to navigate user to the sign in page.
     * Initializes the SignInSteps helper with the shared WebDriver instance.
     */
    @Given("user is on the sign in page")
    public void userIsOnSignInPage() {
        signInSteps = new SignInSteps(driver);       // Instantiate SignInSteps helper with the shared WebDriver
        signInSteps.navigateToSignInPage();          // Use the helper to open the sign in page URL in the browser
    }

    /**
     * Step to enter username.
     * Delegates the action to the SignInSteps helper.
     * @param username Username string passed from the feature file.
     */
    @When("user enters username {string}")
    public void userEntersUsername(String username) {
        signInSteps.enterUsername(username);         // Enter the username into the username input field
    }

    /**
     * Step to enter password.
     * Delegates the action to the SignInSteps helper.
     * @param password Password string passed from the feature file.
     */
    @When("user enters password {string}")
    public void userEntersPassword(String password) {
        signInSteps.enterPassword(password);         // Enter the password into the password input field
    }

    /**
     * Step to click the login button.
     * Delegates the action to the SignInSteps helper.
     */
    @When("user clicks the login button")
    public void userClicksLoginButton() {
        signInSteps.clickLoginButton();              // Click the login button on the sign in page
    }

    /**
     * Step to verify that user is redirected to the products page after login.
     * Retrieves the current URL and asserts it contains the expected substring.
     */
    @Then("user should be redirected to the products page")
    public void userShouldBeRedirectedToProductsPage() {
        String currentUrl = driver.getCurrentUrl(); // Get the current URL from the browser
        assertTrue("User is not on the products page", currentUrl.contains("inventory.html")); // Assert URL correctness
    }

    /**
     * Step to close the browser.
     * Delegates the action to the SignInSteps helper to close the WebDriver session.
     */
    @Then("close the browser")
    public void closeTheBrowser() {
        signInSteps.closeBrowser();                   // Close the browser and quit the WebDriver
    }


}