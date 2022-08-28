package s0307;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://simania.co.il/");
//        driver.wait(7000);
        driver.findElement(By.name("query")).sendKeys("אין ילדים רעים");
        driver.findElement(By.className("clickable")).click();
        String authorname=driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/table/tbody/tr/td[2]/div/h3/a")).getText();
        String price=driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/table/tbody/tr/td[2]/div/span")).getText();
        System.out.println(authorname);
        System.out.println(price);
    }
    }
