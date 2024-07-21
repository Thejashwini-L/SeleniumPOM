package project1_sourcefile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project1_LoginPage 
{
	@FindBy(id="ap_email")
	WebElement un1;
	
	@FindBy(id="continue")
	WebElement Cont_butn1;
	
	@FindBy(id="ap_password")
	WebElement pwd;
	
	@FindBy(id="signInSubmit")
	WebElement Cont_butn2;
	
public void email()
{
	un1.sendKeys("thejashwiniteju13@gmail.com");
	//un1.sendKeys("thejashwiniteju13@gmail");
}

public void Continue_button()
{
	Cont_butn1.click();
}

public void password()
{
	pwd.sendKeys("Teju13@1996");
}

public void SignIn()
{
	Cont_butn2.click();
}
 public Project1_LoginPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }

}
