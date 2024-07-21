package Selenium_Package.Selenium_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResult_Page
{
	WebDriver driver;
	@FindBy(xpath="(//span[@class='rush-component']/a/div)[1]")
	WebElement first_Prod;
	
	public void fproduct()
	{
		first_Prod.click();
	}
	
	public Amazon_SearchResult_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
