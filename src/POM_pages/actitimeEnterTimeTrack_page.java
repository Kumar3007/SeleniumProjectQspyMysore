package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeEnterTimeTrack_page
{
		
	@FindBy(xpath="//a[@class='content reports']")
	public WebElement lnkReports;
	
	@FindBy(xpath="//a[@class='content users']")
	public WebElement lnkusers;
	
	@FindBy(id="logoutLink")
	public WebElement btnLogout;
	
	public actitimeEnterTimeTrack_page(WebDriver driver)
	{
		//initiliases the webelements
		PageFactory.initElements(driver,this);
	}
}
