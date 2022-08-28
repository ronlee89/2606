package selenium2006;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://danielauto.net/practice/newLocator/locator.html");

        String xpath= driver.findElement(By.xpath("/html/body/p[5]")).getText();
        System.out.println(xpath);


    }
}