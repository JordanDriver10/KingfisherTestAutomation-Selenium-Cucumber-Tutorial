package TAWorkshop.steps;

import TAWorkshop.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static TAWorkshop.steps.registerSteps.driver;


public class commonHooks {

    //Hooks are blocks of code that run before or after
    // each scenario. You can define them anywhere
    // in your project or step definition layers,
    // using the methods @Before and @After.

    @Before
    public void setup() {
        //Gets the default driver from the driver manager file (Chrome)
        driver = DriverManager.getDriver();
    }

    @After
    public void teardown() {
        //Closes the application once test has finished
//        driver.quit();
    }
}
