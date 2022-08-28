package selenium2006;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6 {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://danielauto.net/practice/newLocator/locator.html");

        driver.findElement(By.partialLinkText("partial")).click();
        String link=driver.findElement(By.id("p_link_text")).getText();
        System.out.println(link);

    }

}
