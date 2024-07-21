package project1_testfile;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Selenium_Package.Selenium_Project.Amazon_Login_Page;
import project1_sourcefile.Project1_HomePage;
import project1_sourcefile.Project1_RegistrationPage;
//Test if new user can successfully register
public class Project1_Testcase1 extends Browser_Launch 
{
	@Test
	public void registration_page()
	{
		WebDriver driver = new ChromeDriver();//driver; if import option didn't show
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Project1_HomePage ap = new Project1_HomePage(driver);
		ap.AccountsLists(driver);
		ap.SignIN();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
		
		Project1_RegistrationPage rp = new Project1_RegistrationPage(driver);
		rp.createaccount();
		rp.un();
		rp.phnno();
		rp.pwd();
		rp.re_pwd();
		rp.verify_mob();
		Assert.assertEquals(driver.getTitle(), "Authentication required");
}
}

