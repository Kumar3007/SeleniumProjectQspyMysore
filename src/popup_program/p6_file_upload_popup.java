package popup_program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6_file_upload_popup {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//works only for findelement and findelements

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=EAIaIQobChMI_ejF59_N-AIVoplmAh3EuAXzEAAYASAAEgI-QfD_BwE&gclsrc=aw.ds");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Thread.sleep(1000);
		
		fileupload("D:\\SELENIUM\\selenium_project\\upload\\keerthan.docx");

}
	
	public static void fileupload(String fileLocation) throws AWTException
	{
   StringSelection s = new StringSelection(fileLocation);//copies the content to clipboard
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);//please press ctrl+V to print this stmt
		
		Robot r=new Robot();
		
		//presses control+v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		//releases control+v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//presses and releases enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

	}
	
}