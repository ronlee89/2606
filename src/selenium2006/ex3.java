package selenium2006;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://danielauto.net/practice/newLocator/locator.html");

        String hello=driver.findElement(By.tagName("h3")).getText();
        String world=driver.findElement(By.className("c_name")).getText();

        System.out.println(hello+" "+world);
    }
}