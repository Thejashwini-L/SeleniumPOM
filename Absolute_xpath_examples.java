package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath_examples {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Thejashwini%20L/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("Thejashwini");
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("my name");
		
	}

}
