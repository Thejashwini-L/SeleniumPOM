package project1_sourcefile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project1_RegistrationPage 
{
   @FindBy(id="auth-create-account-link")
   WebElement create_account;
   
   @FindBy(id="ap_customer_name")
   WebElement username;
   
   @FindBy(id="ap_email")
   WebElement phonenum;
   
   @FindBy(id="ap_password")
   WebElement password;
   
   @FindBy(id="ap_password_check")
   WebElement re_enter_password;
   
   @FindBy(id="continue")
   WebElement verify_mobile;
   
   public void createaccount()
   {
	   create_account.click();
   }
   
   public void un()
   {
	   username.sendKeys("Thejashwini");;
   }
   
   public void phnno()
   {
	   phonenum.sendKeys("9986125935");
   }
   
   public void pwd()
   {
	   password.sendKeys("Teju13@19");
   }
   
   public void re_pwd()
   {
	   re_enter_password.sendKeys("Teju13@19");
   }
   
   public void verify_mob()
   {
	   verify_mobile.click();
   }
   
   public Project1_RegistrationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}

