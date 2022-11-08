//program to login indirectly without username and password
package apache_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5_to_login_ 
{
			public static String getData(String sheetName,int row,int col) throws Throwable
			{
			
				FileInputStream f=new FileInputStream("D:\\SELENIUM\\selenium_project\\data\\excel1.xlsx");
				Workbook book = WorkbookFactory.create(f);
				String d = book.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
				return d;
			}
			
			public static void main(String[] args) throws Throwable
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();

				driver.get("https:/demo.actitime.com/login.do");
				
				//driver.findElement(By.xpath("input[@name='username']")).sendKeys(getData("logincr", 1, 0));
				//driver.findElement(By.xpath("input[@name='pwd']")).sendKeys(getData("logincr", 1, 1));
				//driver.findElement(By.xpath("a[@id='loginButton']")).click();
				
				driver.findElement(By.name("username")).sendKeys(getData("logincr", 1, 0));
				driver.findElement(By.name("pwd")).sendKeys(getData("logincr", 1, 1));
				driver.findElement(By.id("loginButton")).click();
				
	
			}
}
