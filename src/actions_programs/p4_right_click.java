//program for RIGHT CLICK
package actions_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p4_right_click {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
			WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));//find element
			
				Actions a = new Actions(driver);//to perform action 
				a.contextClick(link).perform();//Right clicks on link
				
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_G);//presses G    G=Incognite W=New window T=New window
				r.keyRelease(KeyEvent.VK_G);//releases G
}
	}