//program to demonstrate height and width of UN and PWD
package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		
		WebElement un = driver.findElement(By.name("username"));
		WebElement pw = driver.findElement(By.name("pwd"));
		
			int w1 = un.getSize().getWidth();
			int h1= un.getSize().getHeight();
			
			int w2 = un.getSize().getWidth();
			int h2= un.getSize().getHeight();
			
			if(w1==w2&&h1==h2)
			
				System.out.println("pass:they are of same type");
				else
					System.out.println("fail: they are diff type");
					
			
}
}