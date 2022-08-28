package selenium2006;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7 {
    public static void main (String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://danielauto.net/practice/newLocator/locator.html");

        driver.findElement(By.cssSelector("input[type='button']")).click();
        String button=driver.findElement(By.id("btn")).getText();

        System.out.println(button);
    }
    }