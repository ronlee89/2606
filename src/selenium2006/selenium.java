package selenium2006;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class selenium {
    public static void main(String[] args) throws InterruptedException {

      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\amall\\Downloads\\for selenium//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
   //     driver.manage().window().maximize();
        driver.get("http://danielauto.net/practice/newLocator/locator.html");

   //   Thread.sleep(3000);
        driver.findElement(By.id("myText")).sendKeys("Ayala");
        driver.findElement(By.id("btn")).click();

        String txt2=driver.findElement(By.id("myText2")).getText();
        String txt1="Ayala";

        if (txt2.equals(txt1)){
            System.out.println("equal");
        }
        else {
            System.err.println("Not equal");
        }

        driver.navigate().back();


    }
}
