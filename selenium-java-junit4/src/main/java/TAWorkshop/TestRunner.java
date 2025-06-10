package TAWorkshop;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * JUnit test runner class to execute Cucumber feature files.
 * Configured to locate features, glue code, and generate reports.
 */
@RunWith(Cucumber.class) // Use Cucumber's JUnit runner
@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = {"TAWorkshop.stepDefs", "TAWorkshop.steps", "TAWorkshop.pageObjects"}, // Packages with step definitions and helpers
        tags = "@SignInTest", // Only run scenarios with this tag
        plugin = {"pretty", "html:target/cucumber-report.html"}, // Console and HTML reports
        publish = true // Enable publishing reports to Cucumber Reports service (optional)
)
public class TestRunner {
    // No code needed here; annotations configure the runner
}