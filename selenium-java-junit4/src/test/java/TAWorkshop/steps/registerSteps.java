package TAWorkshop.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registerSteps {

    public static WebDriver driver;

    @Given("user is on the demo sign in page")
    public void user_is_on_the_demo_sign_in_page()  {

        //Navigate to website
        driver.navigate().to("http://automationpractice.com/index.php");

        //Click sign in button
        driver.findElement(By.className("login")).click();

    }

    @When("user enters {word} and creates account")
    public void user_enters_email_address_and_creates_account(String emailAddress) throws InterruptedException {
        //Fill out email address
        driver.findElement(By.id("email_create")).sendKeys(emailAddress);

        //Click register button
        driver.findElement(By.id("SubmitCreate")).click();

        //Wait for next page to be present before proceeding
        WebDriverWait wait = new WebDriverWait(driver,10);

        //Then check to see if the next page is open by looking for a certain element
        wait.until(ExpectedConditions.visibilityOfElementLocated
            (By.xpath("//*[@id=\"account-creation_form\"]/div[1]/h3")));

    }

    @And("user enters personal information")
    public void user_enters_personal_information() {

        //Fill out personal information (random american address)
        driver.findElement(By.id("customer_firstname")).sendKeys("Jordan");
        driver.findElement(By.id("customer_lastname")).sendKeys("Driver");
        driver.findElement(By.id("passwd")).sendKeys("test123");
        driver.findElement(By.id("address1")).sendKeys("604 Carbon Ave");
        driver.findElement(By.id("city")).sendKeys("Hartshorne");

        // Create object of the Select class
        Select cityState = new Select(driver.findElement(By.id("id_state")));

        // Select the option by index from the drop box
        cityState.selectByIndex(37);

        //Continuing to fill out personal information
        driver.findElement(By.id("postcode")).sendKeys("74547");
        driver.findElement(By.id("phone_mobile")).sendKeys("(918) 297-3255");

    }

    @Then("Sign in should be successful")
    public void sign_in_should_be_successful() {
    }

}
