//program for geolocation and notification popup
package popup_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class p10_disable_popup_location {
	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-geolocation");
			
			WebDriver driver=new ChromeDriver(options);
			driver.get("https://www.hdfc.com");
	

}
}