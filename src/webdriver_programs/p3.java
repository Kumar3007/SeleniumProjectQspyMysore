package webdriver_programs;// program to demonstrate manage method

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize(); //maximises the window
		driver.manage().window().fullscreen();//fullscreens the window
		driver.manage().window().minimize();// minimises the screen

}
}
