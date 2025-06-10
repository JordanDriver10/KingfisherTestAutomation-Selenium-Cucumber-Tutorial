package TAWorkshop.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Page Object Model class representing the Sauce Demo Sign In page.
 * Contains only element locators and getter methods.
 */
public class SignInPage {

    private WebDriver driver; // WebDriver instance used to interact with the browser

    /**
     * Constructor initializes the WebDriver instance.
     * @param driver WebDriver instance passed from test or steps.
     */
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Locate and return the username input field element.
     * @return WebElement representing the username input.
     */
    public WebElement getUsernameInput() {
        return driver.findElement(By.id("user-name")); // Locate element by ID "user-name"
    }

    /**
     * Locate and return the password input field element.
     * @return WebElement representing the password input.
     */
    public WebElement getPasswordInput() {
        return driver.findElement(By.id("password")); // Locate element by ID "password"
    }

    /**
     * Locate and return the login button element.
     * @return WebElement representing the login button.
     */
    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button")); // Locate element by ID "login-button"
    }
}
