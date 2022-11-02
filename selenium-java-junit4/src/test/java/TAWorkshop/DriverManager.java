package TAWorkshop;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;



public class DriverManager {

    //The driver manager file allows for control over what type of driver needed.
    // This means later if we need to change from Chrome to Firefox,
    // we don't have to go into every test script to change the driver

    public static WebDriver getDriver() {
        WebDriver driver;
        switch (System.getProperty("browser", "chrome").toLowerCase()) {
            case "edge":
                driver = SystemUtils.IS_OS_WINDOWS ? getEdgeDriver() : getChromeDriver();
                break;
            case "firefox":
                driver = getFirefoxDriver();
                break;
            case "safari":
                driver = SystemUtils.IS_OS_MAC ? getSafariDriver() : getChromeDriver();
                break;
            default:
                driver = getChromeDriver();
        }
        return driver;
    }

    private static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private static WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    private static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        return new FirefoxDriver(options);
    }

    private static WebDriver getSafariDriver() {
        return new SafariDriver();
    }
}
