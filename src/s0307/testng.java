package s0307;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testng {

    public static WebDriver driver;

    @BeforeClass
    static public void beforeClass(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeTest
    static public void beforeTest(){

    }

    @AfterClass
    public static void afterClass()
    {
        driver.quit();
    }

    @AfterTest
    public static void afterTest(){

    }

    @Test (groups = "list")
    public void test(){
        driver.get("https://www.nisha.co.il/%D7%98%D7%91%D7%9C%D7%90%D7%95%D7%AA-%D7%A9%D7%9B%D7%A8");

        List <WebElement> jobs=new ArrayList<WebElement>();

        jobs = driver.findElements(By.xpath("//div[@class='alohafreetext']//h3[contains(@style,'font-size: 18px')]"));

        for (int i = 0; i <7 ; i++) {
            System.out.println(jobs.get(i).getText());
        }


    }

    @Test (groups = "list")
    public void test2() {
        driver.get("https://www.nisha.co.il/%D7%98%D7%91%D7%9C%D7%90%D7%95%D7%AA-%D7%A9%D7%9B%D7%A8");

        List<WebElement> options = new ArrayList<WebElement>();

        options = driver.findElements(By.xpath("//td/span"));

        for (int i = 0; i < 7; i++) {
            System.out.println(options.get(i).getText());

        }
    }


        @Test (groups = "average")
    public void test3() {
        int sum=0;
    List <WebElement> salary=driver.findElements(By.xpath("//table[(@id='salary-table-1')]//td[2]"));

            for (int i = 1; i < salary.size(); i++) {

                String temp = salary.get(i).getText();

                if (temp.contains("-")) {
                    temp = temp.substring(0, 2);
                    System.out.println(temp);
                }
                int temp_sum = Integer.parseInt(temp);
                System.out.println(temp_sum);
                sum = sum + temp_sum;

            }

            System.out.println("--- avg--- " +  sum/(salary.size()-1) + " ----");


  }

        @Test (groups = "average")
        public void test4 (){

        int sum=0;

        List <WebElement> algo=driver.findElements(By.xpath(""));

    }
}
