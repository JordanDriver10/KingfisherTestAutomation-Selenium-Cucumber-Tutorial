package TAWorkshop;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//    features - Helps Cucumber to locate the Feature file in the project folder structure.
//    glue - Helps Cucumber to locate the Step Definition file.
//    tags - Cucumber run scenarios with a particular tag.
//    plugin - Specifies different formatting options for the output reports.
//    publish - Cucumber.io has developed a free cloud-based service for sharing reports.

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
