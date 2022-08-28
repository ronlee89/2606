package s0307;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class junit {

    static WebDriver driver;
    static double shupresal=0.0;
    static double quik= 0.0;
    static double rami=0.0;

    static Robot robot;


    @BeforeClass
    public static void beforeClass() throws  Exception{
      //System.setProperty("web-driver.chrome.driver","c:\\selenium\\browserDriver//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    driver.manage().window().maximize();
    }
    @AfterClass
    public static void afterClass() throws Exception{
  //      driver.quit();
    }

    @After
    public  void after() throws Exception{
            driver.close();
    }


    @Test

    public void test1() throws InterruptedException {
        driver.get("https://www.shufersal.co.il/online/he/");
        driver.findElement(By.id("js-site-search-input")).sendKeys("טבעול תירס");
        driver.findElement(By.xpath("//*[@id=\"formSearchSubmit\"]/fieldset/div/button")).click();
        String sPrice=driver.findElement(By.xpath("//*[@id=\"mainProductGrid\"]/li[5]/div[1]/div[3]/div/div[1]/span/span[1]")).getText();
        System.out.println("Shupersal price is:"+sPrice);


    }
//    @Test
    public void test2() throws InterruptedException, AWTException {
        Robot robot= new Robot();
        driver.get("https://www.rami-levy.co.il/he/");

        driver.findElement(By.id("destination")).sendKeys("טבעול תירס");
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
       String rPrice= driver.findElement(By.xpath("//*[@id=\"main-product-modal___BV_modal_body_\"]/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/span[1]")).getText();

        System.out.println("RamiLevi price is:"+rPrice.trim().replace("₪"," "));
    }
}
