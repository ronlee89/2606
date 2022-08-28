package s0307;

import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static s0307.junit.driver;


public class pageobject_run {



    @BeforeClass
    static public void before() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.netogreen.co.il/Calculators/Nutrition-Calories.aspx");
        pageobject_elements pom = new pageobject_elements();
        pom = PageFactory.initElements(driver, pageobject_elements.class);

        pom = PageFactory.initElements(driver, pageobject_elements.class);

    }

    @Test
    public void test1() {
        pageobject_elements.search.sendKeys("לחם");
        pageobject_elements.searchButton.click();
        String result = String.valueOf(pageobject_elements.results);

        if (result.equals("לחם")) {
            System.out.println("pass");
        }
        else{
            System.err.println("fail");
        }

            }
        }


