package features.pages;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dominik on 08.04.2016.
 */
public class GooglePage {

    public final static String GOOGLEPAGE = "http://www.google.de";

    WebDriver driver;

    @FindBy(id = "lst-ib")
    private WebElement searchTextField;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @FindBy(name = "btnG")
    private WebElement smallSearchButton;

    @FindBy(id = "easter-egg")
    private WebElement easteregg;


    public GooglePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    public void writeInSearchField(String input){
        searchTextField.sendKeys(input);
    }

    public void clickSearch(){
        try{
            searchButton.click();
        }catch(Exception e){
            smallSearchButton.click();
        }
    }

    public boolean isSearching(){
        try{
            easteregg.toString();
            return true;
        }catch(ElementNotFoundException e){
            return false;
        }
    }
}
