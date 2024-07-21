package Selenium_Package.Selenium_Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product_Page 
{
    WebDriver driver;
    
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement Add_to_wishlist;
	
	@FindBy(xpath = "(//span[@class='a-button a-button-span12 a-button-primary'])[1]")
	WebElement cont_shopping;
	
	@FindBy(id = "add-to-cart-button")
	WebElement addingtocart;
	
	public void whishlist()
	{
		Add_to_wishlist.click();
	}
	
	public void continue_shopping()
	{
		cont_shopping.click();
	}
	
	public void add_to_cart()
	{
		addingtocart.click();
	}
	
	public Amazon_Product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
