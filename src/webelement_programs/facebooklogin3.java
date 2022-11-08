//program to demonstate Xpath
package webelement_programs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin3 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8867432411");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kumar@07");
		driver.findElement(By.xpath("//button[@value='1']")).submit();
}
}