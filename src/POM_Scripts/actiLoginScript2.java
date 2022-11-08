package POM_Scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeEnterTimeTrack_page2;
import POM_pages.actitimeLogin_page;
import POM_pages.actitimeLogin_page2;

public class actiLoginScript2
{
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//works only for findelement and findelements

		driver.get("https:/demo.actitime.com/login.do");
		
		actitimeLogin_page2 ob=new actitimeLogin_page2(driver);
			ob.login("admin", "manager");
			
			actitimeEnterTimeTrack_page2 ob1=new actitimeEnterTimeTrack_page2(driver);
			ob1.clickLogout();
		

					


	}

}
