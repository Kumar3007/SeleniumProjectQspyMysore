//PROGRAM TO DEMONSTRATE PROMPT POPUP
package popup_program;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p3_prompt_popup {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

		driver.get("file:///C:/Users/ab/Desktop/prompt.html");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());//waits for pop up
		
		Alert a = driver.switchTo().alert();//shifts the control from adduser to popup page
		
		a.sendKeys("KUMAR R");//sends the keys to prompt textbox
                                                                                                                                                                                                                                                                                   
		
		
		


}
}