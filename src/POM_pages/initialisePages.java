package POM_pages;

import org.openqa.selenium.WebDriver;

public class initialisePages
{
	
	public actitimeLogin_page2 actiLogin;
	public actitimeEnterTimeTrack_page2 actitimeEnterTimeTrack;
	public actitimeUserList_pages2 actiUsers;
	public addUser_page2 addUser;



	public initialisePages(WebDriver driver)
	{
		this.actiLogin=new actitimeLogin_page2(driver);
		this.actitimeEnterTimeTrack=new actitimeEnterTimeTrack_page2(driver);
		this.actiUsers=new actitimeUserList_pages2(driver);
		this.addUser=new addUser_page2(driver);
	}
}