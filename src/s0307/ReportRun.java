package s0307;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.io.IOException;

public class ReportRun {
    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test;
    static ExtentTest test2;
    static ExtentManager exm = new ExtentManager(driver);

    @BeforeClass
    static public void before() {
        extent = exm.GetExtent();
        test = exm.createTest("אודות המשרד", "description");
        test2 = exm.createTest("רפורמות ותוכניות", "description");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    static public void after() {
        extent.flush();
        driver.quit();
    }


    @Test
    public void test1() throws InterruptedException {
        driver.get("https://edu.gov.il/heb/Pages/hp.aspx");
        System.out.println(driver.getTitle());

                System.out.println(driver.getTitle());
        WebElement menu = driver.findElement(By.linkText("אודות המשרד"));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText("הנהלת המשרד ויחידותיו"));
        actions.click(submenu).perform();
        String Hanhala = driver.getTitle();
        if (driver.getTitle().equals("הנהלת המשרד ויחידותיו")) {
            test.pass(Hanhala + " pass");
        }
        else {
            test.fail("fail");
        }
            //  driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a")).click();
     //   driver.findElement(By.xpath("//*[@id=\"ctl00_SPWebPartManager1_g_ae9959cf_6532_49e1_89dd_a9b194ef84f8\"]/section/div[2]/ul/li[1]/a")).click();
       // String Hanhala = driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_EditModePanel1\"]/h1")).getText();
//
      String phoneNum = driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_lobby\"]/div/section/article/div[2]/div[2]/div[2]/h3")).getText();
//
//        if (Hanhala.equals("הנהלת משרד החינוך")) {
//            System.out.println(Hanhala);
//            System.out.println(test.pass("הנהלת משרד החינוך"));
//        } else {
//            System.out.println(test.fail("לא תואם להנהלת משרד החינוך"));
//        }

        if (phoneNum.contains("6552*")) {
            System.out.println(phoneNum);
            System.out.println(test.pass(phoneNum + " Phone number is display"));
        } else {
            System.out.println(test.fail(phoneNum + " is not display"));
        }
    }

    @Test
    public void test2() {
        driver.get("https://edu.gov.il/heb/Pages/hp.aspx");

        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_SPWebPartManager1_g_ae9959cf_6532_49e1_89dd_a9b194ef84f8\"]/section/div[2]/ul/li[2]/a")).click();
        String Sara = driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_breadcrumbSiteMapPath\"]/span[5]/a")).getText();

        if (Sara.equals("שרת החינוך")) {
            System.out.println(test.pass(Sara + " שרת החינוך"));
        } else {
            test.fail("fail");
        }
    }

    @Test
    public void test3() {
        driver.get("https://edu.gov.il/heb/Pages/hp.aspx");
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_SPWebPartManager1_g_ae9959cf_6532_49e1_89dd_a9b194ef84f8\"]/section/div[2]/ul/li[3]/a")).click();
        String toldot = driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_breadcrumbSiteMapPath\"]/span[5]/a")).getText();

        if (toldot.equals("תולדות משרד החינוך")) {
            System.out.println(test.pass(toldot + " תולדות משרד החינוך"));
        } else {
            test.fail("fail");
        }
    }

@Test
    public void test4() {
        driver.get("https://edu.gov.il/heb/Pages/hp.aspx");
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_SPWebPartManager1_g_55fe5383_2000_460f_b082_054c171291d4\"]/section/div[2]/ul/li[1]/a")).click();
        String ganim=driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_breadcrumbSiteMapPath\"]/span[5]/a")).getText();

        if (ganim.equals("גני ילדים")) {
            System.out.println(test2.pass(ganim+" גני ילדים"));
        }
        else {
            System.out.println(test2.fail("fail"));
        }
    }

    @Test
    public void test5 () throws IOException, AWTException {
        driver.get("https://edu.gov.il/heb/Pages/hp.aspx");
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_SPWebPartManager1_g_55fe5383_2000_460f_b082_054c171291d4\"]/section/div[2]/ul/li[2]/a")).click();
        String Biton = driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_breadcrumbSiteMapPath\"]/span[5]/a")).getText();

        if (Biton.equals("ועדת בוטן")) {
            System.out.println(test2.pass(Biton + " ועדת ביטון"));
        } else {
          test2.fail("fail", MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }
    }

    @Test
    public void test6 () throws IOException, AWTException {
        driver.get("https://edu.gov.il/heb/Pages/hp.aspx");
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_SPWebPartManager1_g_55fe5383_2000_460f_b082_054c171291d4\"]/section/div[2]/ul/li[3]/a")).click();
        String vaada=driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_breadcrumbSiteMapPath\"]/span[5]/a")).getText();

        if (vaada.equals("ועדה חיים בשותפות")) {
            test2.pass("pass");
        }
        else {
            test2.fail("fail", MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }

    }

}