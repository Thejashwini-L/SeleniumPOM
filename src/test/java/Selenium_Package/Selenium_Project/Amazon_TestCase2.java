package Selenium_Package.Selenium_Project;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import package3.Test_Data;


public class Amazon_TestCase2 
{
	@Test
	public void login_to_search_firstproduct() throws EncryptedDocumentException, IOException 
	{
		
	WebDriver driver = new EdgeDriver();//driver; if import option didn't show
	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Test_Data td = new Test_Data();
 		td.Data_Fetching();
 		
		Amazon_Login_Page ap = new Amazon_Login_Page(driver);//created obj of source cls to build relation btwn source and cls using creating obj of source cls
		ap.un();
		ap.contbtn();
		ap.pwd();
		ap.signin();
		
		Amazon_Home_Page ah = new Amazon_Home_Page(driver);
		ah.searching();
		
		Amazon_SearchResult_Page sr = new Amazon_SearchResult_Page(driver);
		sr.fproduct();
	}
}

