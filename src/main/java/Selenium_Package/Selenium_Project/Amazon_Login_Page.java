package Selenium_Package.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import package3.Test_Data;
//scenario 1 - Login to application
public class Amazon_Login_Page extends Test_Data
{
	WebDriver driver;
    @FindBy(id="ap_email")
    WebElement username;
    
    @FindBy(xpath="//input[@id='continue']")
    WebElement continue_button;
    
    @FindBy(xpath="//input[@type='password']")
    WebElement password;
    
    @FindBy(xpath="//input[@id='signInSubmit']")
    WebElement signin_button;
    
    public void un()
    {
    	//username.sendKeys("thejashwiniteju13@gmail.com");
    	username.sendKeys(un1);//for DDT concept wrt to pacage3
    }
    
    public void contbtn()
    {
    	continue_button.click();
    }
    
    public void pwd()
    {
    	//password.sendKeys("Teju13@1996");
    	password.sendKeys(pwd1);//for DDT concept wrt to pacakge 3
    }
    
    public void signin()
    {
    	signin_button.click();
    }
    
    public Amazon_Login_Page(WebDriver driver)//create cons of same cls//step 44 to 47 is same for all the pgm

    {
    	PageFactory.initElements(driver, this);
    }	
    
}


