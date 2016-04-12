package features.step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import features.pages.GooglePage;
import features.support.DriverFactory;
import org.openqa.selenium.WebDriver;

/**
 * All the Steps starting a Scenario
 * Created by Dominik on 16.02.2016.
 */
public class StartingSteps {

    private WebDriver driver;

    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
    }

    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
    }

    @Given("^the user is on Googles Home Page$")
    public void the_user_is_on_Googles_Home_Page() throws Throwable {       driver.get(GooglePage.GOOGLEPAGE);
        driver.manage().window().maximize();
    }

}
