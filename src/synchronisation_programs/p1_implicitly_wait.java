//program to implicitly make to sync(wait) webpage and program excecution without using  THREAD
package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1_implicitly_wait 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

	driver.get("https:/demo.actitime.com/login.do");
	
	
	driver.findElement(By.name("username")).sendKeys("admin");//identifies and enters the username
	driver.findElement(By.name("pwd")).sendKeys("manager");// identifies and enters passward
	driver.findElement(By.id("loginButton")).click();//identifies and clicks on loginbutton
	
	driver.findElement(By.xpath("//a[@class='content users']")).click();
}
}