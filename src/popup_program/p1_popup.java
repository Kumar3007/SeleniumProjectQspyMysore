//program to demonstrate confirmation popup
package popup_program;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p1_popup {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

		driver.get("https:/demo.actitime.com/login.do");
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//a[@class='content users']")).click();//clicks on users
		
		driver.findElement(By.xpath("//div[text()='New User']")).click();//clicks on new user
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("kumar");//enters value in textfield
		
		driver.findElement(By.xpath("//div[contains(@class,'closeButton hide')]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());//waits for pop up
		
		Alert a = driver.switchTo().alert();//shifts the control from adduser to popup page
		
		String text = a.getText();
		
		System.out.println(text);//retrives the text  from the popup
		
		a.accept();//clicks on ok                                                                                                                                                                                                                                                                                    
		
		
		
		
		


}
}