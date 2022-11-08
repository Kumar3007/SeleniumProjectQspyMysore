package POM_Scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeEnterTimeTrack_page;
import POM_pages.actitimeEnterTimeTrack_page2;
import POM_pages.actitimeLogin_page;
import POM_pages.actitimeLogin_page2;
import POM_pages.actitimeUserList_pages;
import POM_pages.addUser_page;
import POM_pages.addUser_page2;

public class addUserScript2
{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

		driver.get("https:/demo.actitime.com/login.do");
		
		actitimeLogin_page2 ob1=new actitimeLogin_page2(driver);
		ob1.login("admin","manager");
		
		actitimeEnterTimeTrack_page2  ob2=new actitimeEnterTimeTrack_page2(driver);
		ob2.clickUsers();
		
		actitimeEnterTimeTrack_page2 ob3=new actitimeEnterTimeTrack_page2(driver);
		ob3.clickUsers();
		
		
		Thread.sleep(4000);
		
		addUser_page2 ob4=new addUser_page2(driver);
		ob4.createNewUser("xyz", "Q", "KUMAR@GMAIL.COM");
		

}
}