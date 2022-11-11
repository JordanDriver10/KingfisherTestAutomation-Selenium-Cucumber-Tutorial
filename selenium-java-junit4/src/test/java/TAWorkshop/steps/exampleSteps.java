package TAWorkshop.steps;

import static TAWorkshop.DriverManager.driver;

import io.cucumber.java.en.Given;

public class exampleSteps {

    // The step definition file stores the mapping between
    // each step of the scenario defined in the feature file
    // with a code of function to be executed.

    // Here is the start of the Given step for the sign in feature.
    // Use this step inside the signInSteps file to start.

    @Given("user is on the sign in page")
    public void userIsOnTheSignInPage() {
        driver.navigate().to("https://www.saucedemo.com/");

        }

}