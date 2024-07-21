package Selenium_Package.Selenium_Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1//5
{
	@Test//import should be testng
	public void login_to_facebook_using_right_credentials()//method name should be what exactly we do inside that method
	{
		WebDriver driver = new ChromeDriver();//driver; if import option didn't show
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//creating obj of source cls so that we can invoke in test cls without creating relation
		Facebook_Login_Page fb = new Facebook_Login_Page(driver);//6, as we have cls with parameterized cons , creating the obj of the cls with param is needed
		//so added driver
		fb.un();//6
		fb.pwd();
		fb.login();
		
		
	}
}
