package webdriver_programs;// program to demonstrate to getmethod (retrieve URL) and CLOSE application 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	public static void main(String[] args) 
	{
		//sets the path to the chromedriver.exe
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		// launches the chrome browser
		 WebDriver driver=new ChromeDriver();
		 
		 //fetches the webpages and waits untill the page is loaded
		driver.get("https://www.facebook.com");
		
		// retrives the title of webpage
				 String title=driver.getTitle();
				 System.out.println(title);
				 
		// retrives the url of the webpage
				 String url=driver.getCurrentUrl();
				 System.out.println(url);
		// closes the window
		driver.close();
	}

}



