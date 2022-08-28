package s0307;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csv {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

            File file = new File("C:\\Users\\amall\\Desktop\\csv.csv");

        List <String> lines = new ArrayList();

            for (int i = 0; i < lines.size(); i++) {
                String [] split =  lines.get(i).split(",");

                driver.get("http://danielauto.net/practice/loginPage/loginpageTest.html");

                driver.findElement(By.id("uaertName")).sendKeys(split[0]);
                driver.findElement(By.id("password")).sendKeys(split[1]);
                driver.findElement(By.id("send")).click();

              if (split[2].equals("false")){
                try {
                    String error =driver.findElement(By.id("err")).getText();
                    System.out.println("Test 1 pass");
            }
                catch (Exception e){
                    System.err.println("Test fails");
                }
            }
              else {
                  try {
                      String login=driver.findElement(By.xpath("/html/body/h1")).getText();
                      System.out.println("Test 1 pass");
                  }
                  catch (Exception e){
                      System.err.println("Test fails");
                  }

              }


        //    List <String> line = readCsv();
        }
    }
}
