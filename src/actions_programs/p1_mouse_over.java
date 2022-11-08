//program for mouse_over programs using ACTION CLASS OF SELENIUM and MOVETOELEMENTS METHOD
package actions_programs;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p1_mouse_over {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.xpath("  //a[contains(text(),'Resources')]"));
		
		Actions a =new Actions(driver);//actions is a selenium class
		
		a.moveToElement(resources).perform();//moveToElement is a method to perform mouse_over action
		
		
	//	int x=resources.getLocation().getX();
	//	int y=resources.getLocation().getY();
		
	//	Robot r=new Robot();
	//	r.mouseMove(x, y);
		


}
}