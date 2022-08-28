package s0307;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class l1707 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://danielauto.net/practice/tabls/tables.html");

        List<WebElement> column = driver.findElements(By.xpath("//th"));
        List<WebElement> row = driver.findElements(By.xpath("//tr//a"));

        System.out.println("number of rows are: " + row.size() + " , number of coloumns are: " + column.size());


        int A = 0, B = 0, C = 0;

        List<WebElement> group = driver.findElements(By.xpath("//td"));
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i).getText().equals(A)) {
            }
            if (group.get(i).getText().equals(B)) {
                B++;
            }
            if (group.get(i).getText().equals(C)) {
                C++;
            }
        }

        System.out.println("Group A:" +A);
        System.out.println("Group B:" +B);
        System.out.println("Group C:" +C);
    }
}