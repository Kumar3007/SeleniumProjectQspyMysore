package POM_Scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeEnterTimeTrack_page;
import POM_pages.actitimeLogin_page;

public class actiLogoutScript 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

	driver.get("https:/demo.actitime.com/login.do");
	
	actitimeLogin_page ob=new actitimeLogin_page(driver);
	ob.tbusername.sendKeys("admin");
	ob.tbPassword.sendKeys("manager");
	ob.btnLogin.click();

	actitimeEnterTimeTrack_page ob1=new actitimeEnterTimeTrack_page(driver);
			ob1.btnLogout.click();
}
}
