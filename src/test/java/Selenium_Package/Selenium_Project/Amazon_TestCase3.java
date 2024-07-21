package Selenium_Package.Selenium_Project;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import package3.Test_Data;

public class Amazon_TestCase3 
{
	@Test
	public void login_to_search_firstproduct_wishlist() throws EncryptedDocumentException, IOException 
	{
		
	WebDriver driver = new ChromeDriver();//driver; if import option didn't show
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
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
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> s2 = s1.iterator();
		String parentid = s2.next();
		String childid = s2.next();
		driver.switchTo().window(childid);
		
		Amazon_Product_Page pp = new Amazon_Product_Page(driver);
		pp.whishlist();
		pp.continue_shopping();
		pp.add_to_cart();
	}
}
