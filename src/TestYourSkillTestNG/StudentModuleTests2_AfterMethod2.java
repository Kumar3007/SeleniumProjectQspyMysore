package TestYourSkillTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class StudentModuleTests2_AfterMethod2
{
	@BeforeMethod
	public void openBrowserandApplication()
	{
		System.out.println("Launching the Browser and accessing the the application URL");
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		System.out.println("closing the Browser/signout");
		
		//selenium code
	}
	
	@Test(priority=1)
	public void StudentSignup()
	{
		System.out.println("Enter all the Mandatory Details for student for Signup");
	}
	
	
	
	

	@Test(priority=2)
	public void StudentHomePage()
	{
		System.out.println("Student HomePage click on StartButton");
		
	}
	

	@Test(priority=3)
	public void StudentTakingQuiz()
	{
		System.out.println("Student taking AGILE METHODOLOGY QUIZ");
	}
	
}
