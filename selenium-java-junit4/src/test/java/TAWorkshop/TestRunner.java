package TAWorkshop;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/TAWorkshop/features",
        glue = "TAWorkshop.steps",
        tags = "@TestTag",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        publish = true
)

public class TestRunner {

//    A Test Runner is a tool that is used to run or execute tests and export results.
//    It is a library that selects the source code directory
//    and picks the test files to run them for verifying bugs and errors.

}
