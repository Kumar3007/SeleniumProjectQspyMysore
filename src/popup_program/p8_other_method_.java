//other method for file upload method(DON'T USE THIS METHOD)
package popup_program;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8_other_method_ {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=EAIaIQobChMI_ejF59_N-AIVoplmAh3EuAXzEAAYASAAEgI-QfD_BwE&gclsrc=aw.ds");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("D:\\SELENIUM\\selenium_project\\upload\\fupopup.exe");

	}

}
