package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addUser_page
{
	@FindBy(xpath="(//input[@name='firstName'])[2]")
	public WebElement tbFirstName;
	
	@FindBy(xpath="(//input[@name='lastName'])[2]")
	public WebElement tblastName;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	public WebElement tbemail;
	
	@FindBy(xpath="//div[text()='Save & Send Invitation']")
	public WebElement btnSave;
	
	public addUser_page(WebDriver driver)
	{
		//initialises the webelements
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
