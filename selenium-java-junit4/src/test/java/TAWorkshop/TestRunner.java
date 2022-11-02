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
}
