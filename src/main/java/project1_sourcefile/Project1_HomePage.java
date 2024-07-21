package project1_sourcefile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project1_HomePage {

	@FindBy(partialLinkText = "Account & Lists")
	WebElement AccountsLists;

	@FindBy(partialLinkText = "Sign in")
	WebElement si;
	
	
	public void AccountsLists(WebDriver driver) 
	{
		Actions as = new Actions(driver);
		as.moveToElement(AccountsLists).perform();	
	}

	public void SignIN() 
	{
		si.click();
	}

	public Project1_HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
