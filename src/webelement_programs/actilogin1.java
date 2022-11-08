package webelement_programs;//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actilogin1 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https:/demo.actitime.com/login.do");
	
	driver.findElement(By.name("username")).sendKeys("admin");//identifies and enters the username
	driver.findElement(By.name("pwd")).sendKeys("manager");// identifies and enters passward
	driver.findElement(By.id("loginButton")).click();//identifies and clicks on loginbutton
}
}
