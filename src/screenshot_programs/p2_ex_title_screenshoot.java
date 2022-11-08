//program to take title of multilpe screenshoot
package screenshot_programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2_ex_title_screenshoot
{
	public static void main(String[] args) throws  IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.flipkart.com");
		
					String title = driver.getTitle();//to print TITLE while taking
		
				TakesScreenshot t= (TakesScreenshot) driver;
					
							File src = t.getScreenshotAs(OutputType.FILE);//near output use control+
							
							 File dest = new File("./screenshot/+title+.png");
							
							 FileUtils.copyFile(src, dest);

}
}