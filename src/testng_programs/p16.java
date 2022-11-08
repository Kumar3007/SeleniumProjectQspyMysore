package testng_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM_pages.actitimeEnterTimeTrack_page2;
import POM_pages.actitimeLogin_page2;
import POM_pages.addUser_page2;

public class p16
{
	
	@Test(dataProviderClass=datapr.class,dataProvider="addusr")
	public void adduserscript(String un,String pw,String fn,String ln,String em) throws Throwable

	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

		driver.get("https:/demo.actitime.com/login.do");
		
		actitimeLogin_page2 ob1=new actitimeLogin_page2(driver);
		ob1.login(un,pw);
		
		actitimeEnterTimeTrack_page2  ob2=new actitimeEnterTimeTrack_page2(driver);
		ob2.clickUsers();
		
		actitimeEnterTimeTrack_page2 ob3=new actitimeEnterTimeTrack_page2(driver);
		ob3.clickUsers();
		
		
		Thread.sleep(4000);
		
		addUser_page2 ob4=new addUser_page2(driver);
		ob4.createNewUser(fn, ln,em);
		

}
}