package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By loginTxtBox = By.id("user_login");
	By passwordTxtBox = By.id("user_password");
	By signInBtn = By.cssSelector("input[name='submit']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterCredentials(String uname, String pwd) {
		
		driver.findElement(loginTxtBox).sendKeys(uname);
		driver.findElement(passwordTxtBox).sendKeys(pwd);
		driver.findElement(signInBtn).click();
		
		
		
	}
}
