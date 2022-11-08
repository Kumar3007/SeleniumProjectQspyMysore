package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeUserList_pages2
{

	@FindBy(xpath="//div[text()='New User']")
	private WebElement btnNewUser;
	
	
	public void clickNewUser()
	{
		this.btnNewUser.click();
	}
	public actitimeUserList_pages2(WebDriver driver)
	{
		//initialises the webelements
		PageFactory.initElements(driver, this);
	}
	
}
