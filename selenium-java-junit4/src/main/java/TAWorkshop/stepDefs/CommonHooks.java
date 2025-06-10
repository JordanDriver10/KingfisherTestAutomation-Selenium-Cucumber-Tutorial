package TAWorkshop.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import TAWorkshop.DriverManager;
import org.openqa.selenium.WebDriver;

/**
 * Hooks to manage WebDriver lifecycle before and after each scenario.
 */
public class CommonHooks {

    private static WebDriver driver;

    /**
     * Runs before each scenario.
     * Initializes WebDriver using DriverManager.
     */
    @Before
    public void setup() {
        DriverManager.driver = DriverManager.getDriver();  // Initialize driver once before scenario
    }

    /**
     * Runs after each scenario.
     * Quits WebDriver and closes browser.
     */
//    @After
//    public void teardown() {
//        if (driver != null) {  // Check if driver was initialized
//            driver.quit();     // Close browser and end session
//        }
//    }
}