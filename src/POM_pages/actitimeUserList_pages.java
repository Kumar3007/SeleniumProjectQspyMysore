package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeUserList_pages
{

	@FindBy(xpath="//div[text()='New User']")
	public WebElement btnNewUser;
	
	public actitimeUserList_pages(WebDriver driver)
	{
		//initialises the webelements
		PageFactory.initElements(driver, this);
	}
	
}
