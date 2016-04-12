import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Suite for the Selenium Tests
 * Created by Dominik on 15.02.2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "src/test/java/features")
public class RunFeaturesTest {
}


