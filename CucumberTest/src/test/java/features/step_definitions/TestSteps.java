package features.step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.pages.GooglePage;
import features.support.DriverFactory;
import org.junit.Assert;

/**
 * Created by Dominik on 08.04.2016.
 */
public class TestSteps extends DriverFactory{

    @When("^the user types into the searchbar ([^\"]*)$")
    public void typeIntoSearchbar(String input) throws Throwable {
        new GooglePage(driver).writeInSearchField(input);
    }

    @When("^he clicks on the search-button$")
    public void clickSearchButton() throws Throwable {
        new GooglePage(driver).clickSearch();
    }

    @Then("^the search results are shown$")
    public void isSearchResultShown() throws Throwable{
        Assert.assertTrue(new GooglePage(driver).isSearching());
    }




}
