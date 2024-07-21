package Selenium_Package.Selenium_Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//to search we need home page
public class Amazon_Home_Page
{
@FindBy(id="twotabsearchtextbox")
WebElement search_tf;

public void searching()
{
	search_tf.sendKeys("shoes" + Keys.ENTER);//keys.enter is same as search_tf.sendKeys(keys.enter)
}

public Amazon_Home_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
