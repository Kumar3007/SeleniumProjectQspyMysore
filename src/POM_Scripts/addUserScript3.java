package POM_Scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeEnterTimeTrack_page;
import POM_pages.actitimeLogin_page;
import POM_pages.actitimeUserList_pages;
import POM_pages.addUser_page;
import POM_pages.initialisePages;

public class addUserScript3
{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

		driver.get("https:/demo.actitime.com/login.do");
		
		initialisePages pages = new initialisePages(driver);
		
		pages.actiLogin.login("admin", "manager");
		
		pages.actitimeEnterTimeTrack.clickUsers();
		
		pages.actiUsers.clickNewUser();
		
			
		Thread.sleep(3000);
		
		pages.addUser.createNewUser("gowda", "KRJ", "kry@gmail.com");
		

}
}