package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_IdLocator {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskstdin-21%26ref%3Dnav_ya_signin%26adgrpid%3D1317216587721796%26hvadid%3D82326303101722%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D156644%26hvtargid%3Dkwd-82326969838361%3Aloc-90%26hydadcr%3D7876_2322854%26msclkid%3Db3a19800ef0710da378ffe50601fd445&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement username = driver.findElement(By.id("ap_email"));//return type of findelement is webelement, storing the value there
		//on the ref var performing action. this is the best way to perform automation if not POM
		username.sendKeys("thejashwiniteju13@gmail.com");
		WebElement un_continue =driver.findElement(By.id("continue"));
		un_continue.click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Teju13@1996");
		WebElement pwd_continue = driver.findElement(By.id("signInSubmit"));
		pwd_continue.click();

	}

}
