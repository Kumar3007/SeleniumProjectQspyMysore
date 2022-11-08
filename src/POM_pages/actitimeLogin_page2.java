package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeLogin_page2 {
	@FindBy(name="username")
	private WebElement tbusername;
	
	@FindBy(name="pwd")
	private WebElement tbPassword;
	
	@FindBy(id="loginButton")
	private WebElement btnLogin;
	
	
	public void login(String un,String pw)
	{
		this.tbusername.sendKeys(un);
		this.tbPassword.sendKeys(pw);
		this.btnLogin.click();
	}
	
	public actitimeLogin_page2(WebDriver driver)
	{
		//initialises the webelements
		PageFactory.initElements(driver, this);
	}

}
