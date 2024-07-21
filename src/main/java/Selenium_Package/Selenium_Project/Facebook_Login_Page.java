package Selenium_Package.Selenium_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login_Page 
{
//step1 : locate each element using @FindBy
	WebDriver driver;
	@FindBy(id="email")//locating using locator id
	WebElement username;//return type of find element is webelement
	
	@FindBy(name ="pass")
	WebElement password;
	
	@FindBy(xpath ="//button[@name='login']")
	WebElement loginbutton;
	
	//step2 : create separate method for each component
	
	public void un()//made public so that we can access outsie the pck without creating the relation
	{
		username.sendKeys("thejashwini@gmail.com");//will get the NullPointer exception if we won't initialize username;
	}
	
	public void pwd()
	{
		password.sendKeys("Tej@123");
	}
	
	public void login()
	{
		loginbutton.click();
	}
	
	//Step 3: Iniitialize each element using PageFactory class inside the constructor
	
	public Facebook_Login_Page(WebDriver driver)//WebDriver driver is from line 11 global var, created the constructor
	{
		PageFactory.initElements(driver, this);//4//PageFactory is class and its static method is initElements, initializing the elements
		//PageFactory cls is one of the cls present in Selenium, which helps to initialise the element in the concept of POM
		//this keyword is used to send the local value to global - driver
		//init element will always have 2 param
		//to maintain synch we have mentioned driver in this cls and other cls  as well - driver is local in this method
	}
}

