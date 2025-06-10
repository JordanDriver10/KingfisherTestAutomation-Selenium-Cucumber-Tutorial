package TAWorkshop;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Central factory class to provide WebDriver instances.
 * Supports multiple browsers and chooses based on system property.
 */
public class DriverManager {

    public static WebDriver driver;

    /**
     * Returns a WebDriver instance based on the "browser" system property.
     * Defaults to Chrome if no property is set or unrecognized value.
     * @return WebDriver instance
     */
    public static WebDriver getDriver() {
        String browser = System.getProperty("browser", "chrome").toLowerCase();

        switch (browser) {
            case "edge":
                // Use Edge on Windows, fallback to Chrome on other OS
                return SystemUtils.IS_OS_WINDOWS ? getEdgeDriver() : getChromeDriver();
            case "firefox":
                return getFirefoxDriver();
            case "safari":
                // Use Safari only on MacOS, fallback to Chrome otherwise
                return SystemUtils.IS_OS_MAC ? getSafariDriver() : getChromeDriver();
            default:
                return getChromeDriver();
        }
    }

    /**
     * Setup and return ChromeDriver.
     */
    private static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup(); // Download and setup chromedriver binary
        return new ChromeDriver();                // Create new ChromeDriver instance
    }

    /**
     * Setup and return EdgeDriver.
     */
    private static WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    /**
     * Setup and return FirefoxDriver with default options.
     */
    private static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        return new FirefoxDriver(options);
    }

    /**
     * Return SafariDriver (only works on MacOS).
     */
    private static WebDriver getSafariDriver() {
        return new SafariDriver();
    }
}
