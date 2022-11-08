package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeEnterTimeTrack_page2
{
		
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement lnkReports;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement lnkusers;
	
	@FindBy(id="logoutLink")
	private WebElement btnLogout;
	
	public void clickReports()
	{
		this.lnkReports.click();
	}
	
	public void clickUsers()
	{
		this.lnkusers.click();
	}
	
	public void clickLogout()
	{
		this.btnLogout.click();
	}
	
	
	public actitimeEnterTimeTrack_page2(WebDriver driver)
	{
		//initiliases the webelements
		PageFactory.initElements(driver,this);
	}
}
