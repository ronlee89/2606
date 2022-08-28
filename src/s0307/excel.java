package s0307;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel {

    public static void main(String[] args) throws AWTException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/search?q=boci&hl=en&sxsrf=ALiCzsaBFzBzcyTDC1m4WtuEpIQEtzKJJw%3A1659283861034&source=hp&ei=lKnmYvjiO7GMlQfF05mwAg&iflsig=AJiK0e8AAAAAYua3pWxbZCumfp0koaktYtNl8NToA5HU&ved=0ahUKEwj4_PWIwqP5AhUxRuUKHcVpBiYQ4dUDCAg&uact=5&oq=boci&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECcyBQguEIAEMgUIABCABDILCC4QgAQQxwEQ0QMyBQgAEJECMgUIABCRAjIICC4QgAQQ1AIyEAguEIAEEIcCEMcBENEDEBQyBQgAEIAEMgUIABCABDoKCC4QxwEQ0QMQQzoLCAAQgAQQsQMQgwE6DgguELEDEIMBEMcBENEDOhQILhCABBCxAxCDARDHARDRAxDUAjoOCC4QgAQQsQMQgwEQ1AI6CAgAELEDEIMBOhEILhCABBCxAxCDARDHARDRA1AAWIoFYK8HaABwAHgAgAGcAYgBzASSAQMwLjSYAQCgAQE&sclient=gws-wiz");
        driver.findElement(By.name("q")).clear();

        FileInputStream fis = new FileInputStream("C:\\Users\\amall\\Desktop\\excel_test.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("test");

//            XSSFRow row = sheet.getRow(0);
//            XSSFCell cell = row.getCell(0);
//            String value = cell.getStringCellValue();

        int FirstRow = sheet.getFirstRowNum();

        int LastRow = sheet.getLastRowNum();
        for (int i = FirstRow; i <= LastRow; i++) {
            XSSFRow row_r = sheet.getRow(i);
            XSSFCell cell_r = row_r.getCell(0);
            String value = cell_r.getStringCellValue();
            System.out.println(value);

            driver.findElement(By.name("q")).sendKeys(value);
            driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/button")).click();
            String searchResult = driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).get(0).getText();
            System.out.println(searchResult);

//                public static void excelPrint(String filePath, String value, int rowNumber, int cellNumber) {
//                    FileInputStream inputStream = new FileInputStream(new File(filePath));
//                    Workbook workbook = WorkbookFactory.create(inputStream);
//
//                    Sheet sheet = workbook.getSheetAt(0);//מספר גליון



                }
            }
        }
