package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	By signInBtn = By.id("signin_button");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickSignBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(signInBtn));
		driver.findElement(signInBtn).click();
		
	}
}
