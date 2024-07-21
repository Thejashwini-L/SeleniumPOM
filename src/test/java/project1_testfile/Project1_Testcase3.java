package project1_testfile;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import project1_sourcefile.Project1_HomePage;
import project1_sourcefile.Project1_LoginPage;

public class Project1_Testcase3
{
	@Test
	public void login() 
	{
		WebDriver driver = new ChromeDriver();//driver; if import option didn't show
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Project1_HomePage ap = new Project1_HomePage(driver);
		ap.AccountsLists(driver);
		ap.SignIN();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
		
		Project1_LoginPage lp = new Project1_LoginPage (driver);
		lp.email();
		lp.Continue_button();
		lp.password();
		lp.SignIn();
	   // Assert.assertFalse(false);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertEquals(search.isDisplayed(), false);
				

	}

}
