package project1_testfile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser_Launch 
{
	WebDriver driver;
	@Test
	public void browser_code()
	{
		driver = new ChromeDriver();//driver; if import option didn't show
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	 
	}

}
