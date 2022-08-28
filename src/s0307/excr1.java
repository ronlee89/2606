package s0307;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class excr1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://stackoverflow.com/tags");

        List<WebElement> list=driver.findElements(By.xpath("//*[@class='post-tag']"));
       List<WebElement> list2=  driver.findElements(By.xpath("//div[@class='flex--item']"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("in "+(list.get(i).getText())+"we have "+ (list2.get(i).getText()));

            //div[@class='flex--item']

        }
        }


    }
