package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addUser_page2
{
	@FindBy(xpath="(//input[@name='firstName'])[2]")
	private WebElement tbFirstName;
	
	@FindBy(xpath="(//input[@name='lastName'])[2]")
	private WebElement tblastName;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	private WebElement tbemail;
	
	@FindBy(xpath="//div[text()='Save & Send Invitation']")
	private WebElement btnSave;
	
	public void createNewUser(String fn,String ln,String em)
	
	{
		this.tbFirstName.sendKeys(fn);
		this.tblastName.sendKeys(ln);
		this.tbemail.sendKeys(em);
		this.btnSave.click();
	}
	public addUser_page2(WebDriver driver)
	{
		//initialises the webelements
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
