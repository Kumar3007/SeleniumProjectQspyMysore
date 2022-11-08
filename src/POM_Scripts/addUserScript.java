package POM_Scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeEnterTimeTrack_page;
import POM_pages.actitimeLogin_page;
import POM_pages.actitimeUserList_pages;
import POM_pages.addUser_page;

public class addUserScript
{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

		driver.get("https:/demo.actitime.com/login.do");
		
		actitimeLogin_page ob1=new actitimeLogin_page(driver);
		ob1.tbusername.sendKeys("admin");
		ob1.tbPassword.sendKeys("manager");
		ob1.btnLogin.click();
			
		actitimeEnterTimeTrack_page ob2= new actitimeEnterTimeTrack_page(driver);
		ob2.lnkusers.click();
		
		actitimeUserList_pages ob3=new actitimeUserList_pages(driver);
		ob3.btnNewUser.click();
		
		Thread.sleep(3000);
		
		addUser_page ob4 = new addUser_page(driver);
		ob4.tbFirstName.sendKeys("ximzd");
		ob4.tblastName.sendKeys("A");
		ob4.tbemail.sendKeys("kumar@123");
		ob4.btnSave.click();
		

}
}