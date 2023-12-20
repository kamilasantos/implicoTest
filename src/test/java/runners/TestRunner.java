package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions"
)
public class TestRunner {
    @BeforeClass
    public static void setUp() {
        // Set the default browser as Chrome if no browser property is specified
        if (System.getProperty("browser") == null) {
            System.setProperty("browser", "chrome");
        }
    }
}
