//program to demonstrate alter popup
package popup_program;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p2_alter_popup {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

		driver.get("file:///C:/Users/ab/Desktop/alert.html");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());//waits for pop up
		
		Alert a = driver.switchTo().alert();//shifts the control from adduser to popup page
		
		String text = a.getText();
		
		System.out.println(text);//retrives the text  from the popup
		
		a.accept();//clicks on ok                                                                                                                                                                                                                                                                                    
		
		
		

}
}