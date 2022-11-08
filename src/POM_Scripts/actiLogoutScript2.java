package POM_Scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeEnterTimeTrack_page;
import POM_pages.actitimeLogin_page;

public class actiLogoutScript2 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

	driver.get("https:/demo.actitime.com/login.do");
	
	actitimeLogin_page ob1=new actitimeLogin_page(driver);
	ob1.btnLogin("admin","manager");
	


	actitimeEnterTimeTrack_page ob2=new actitimeEnterTimeTrack_page(driver);
			ob2.btnLogout.click();
}
}
