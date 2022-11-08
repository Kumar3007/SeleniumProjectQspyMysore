package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeLogin_page
{
	@FindBy(name="username")
	public WebElement tbusername;
	
	@FindBy(name="pwd")
	public WebElement tbPassword;
	
	@FindBy(id="loginButton")
	public WebElement btnLogin;
	
	public actitimeLogin_page(WebDriver driver)
	{
		//initialises the webelements
		PageFactory.initElements(driver, this);
	}

	public void btnLogin(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	
}
