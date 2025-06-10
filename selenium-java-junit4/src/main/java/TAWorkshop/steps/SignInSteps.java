package TAWorkshop.steps;

import org.openqa.selenium.WebDriver;
import TAWorkshop.pageObjects.SignInPage;

/**
 * Helper class containing reusable action methods for the Sign In feature.
 * This class performs interactions with the page elements but does NOT contain assertions.
 */
public class SignInSteps {

    private WebDriver driver;       // WebDriver instance to control the browser
    private SignInPage signInPage;  // Page Object instance to access page elements

    /**
     * Constructor initializes WebDriver and Page Object.
     * @param driver WebDriver instance passed from step definitions.
     */
    public SignInSteps(WebDriver driver) {
        this.driver = driver;
        this.signInPage = new SignInPage(driver);
    }

    /**
     * Navigate browser to the Sauce Demo sign in page URL.
     */
    public void navigateToSignInPage() {
        driver.get("https://www.saucedemo.com/"); // Open the URL in the browser
    }

    /**
     * Enter the given username into the username input field.
     * @param username The username string to enter.
     */
    public void enterUsername(String username) {
        signInPage.getUsernameInput().clear();       // Clear any existing text in input
        signInPage.getUsernameInput().sendKeys(username); // Type the username
    }

    /**
     * Enter the given password into the password input field.
     * @param password The password string to enter.
     */
    public void enterPassword(String password) {
        signInPage.getPasswordInput().clear();       // Clear any existing text in input
        signInPage.getPasswordInput().sendKeys(password); // Type the password
    }

    /**
     * Click the login button on the page.
     */
    public void clickLoginButton() {
        signInPage.getLoginButton().click(); // Perform click action on login button
    }

    /**
     * Close the browser window and quit the WebDriver session.
     */
    public void closeBrowser() {
        if (driver != null) {  // Check if driver is initialized
            driver.quit();     // Close all browser windows and safely end session
        }
    }
}