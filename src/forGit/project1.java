package forGit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project1 {
    public static  void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("filename.txt",
//                true)))) {
//            out.println(" the text");
//            { catch (Exception e) {
//                {


        driver.get("https://mvnrepository.com/");
        driver.findElement(By.id("query")).sendKeys("Cucumber JVM: Junit");
        driver.findElement(By.xpath("//*[@id=\"search\"]/form/input[2]")).click();

    }
    }
