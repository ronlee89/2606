package s0307;

import com.paulhammant.ngwebdriver.ByAngular;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class angu {

        public static void main (String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://myhealth.stanfordhealthcare.org/");

        driver.findElement(ByAngular.model("id")).sendKeys("Mia");
            driver.findElement(ByAngular.model("password")).sendKeys("Mia");
            driver.findElement(ByAngular.buttonText("Sign in")).click();

            driver.wait(7000);

    }
    }