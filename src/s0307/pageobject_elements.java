package s0307;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class pageobject_elements {

    @FindBy (how = How.ID, using = "searchTxt")
    static WebElement search;

    @FindBy (how = How.ID, using = "quantity")
    static WebElement quantity;

//    @FindBy (how = How.ID, using = "serachResults")
//    static WebElement searchResults;

    @FindBy (how = How.ID, using = "Button1")
    static WebElement searchButton;

    @FindBy (how = How.ID, using = "calculator_deleteTxt")
    static WebElement add;

    @FindBy(how = How.ID, using = "serachResults")
    static List<WebElement> results;

//    @FindBy(tagName = "list")
//    private List<WebElement> links;
}