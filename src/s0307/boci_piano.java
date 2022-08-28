package s0307;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class boci_piano {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.musicca.com/piano");

        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[8]/span[1]")).click(); //C
        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[10]/span")).click(); //E
        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[8]/span[1]")).click(); //C
        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[10]/span")).click(); //E
        Thread.sleep(700);
        driver.findElement(By.xpath(" //*[@id=\"piano\"]/div[2]/ul/li[12]/span[1]")).click(); //G
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[12]/span[1]")).click(); //G
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[8]/span[1]")).click(); //C
        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[10]/span")).click(); //E
        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[8]/span[1]")).click(); //C
        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[10]/span")).click(); //E
        Thread.sleep(700);
        driver.findElement(By.xpath(" //*[@id=\"piano\"]/div[2]/ul/li[12]/span[1]")).click(); //G
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[12]/span[1]")).click(); //G
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[15]/span[1]")).click(); //C2
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[14]/span")).click(); //B
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[13]/span[1]")).click();//A
        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[12]/span[1]")).click();//G
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[11]/span[1]")).click();//F
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[13]/span[1]")).click();//A
        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[12]/span[1]")).click();//G
        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[11]/span[1]")).click();//F
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[10]/span")).click(); //E
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[9]/span[1]")).click(); //D
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[8]/span[1]")).click(); //C
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"piano\"]/div[2]/ul/li[8]/span[1]")).click(); //C
        Thread.sleep(700);







    }
}
