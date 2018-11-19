package bank.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.BrowserFactory;
import pages.HomePage;
import pages.LoginPage;

public class ViewAccountSummary {
	WebDriver driver;
	
	@Test
	public void viewSummary() {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rumoursrus\\chromedriver_win32\\chromedriver.exe");
		// driver = new ChromeDriver();
		driver = BrowserFactory.chooseBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
		driver.get("http://zero.webappsecurity.com");
		HomePage homepage = new HomePage(driver);
		homepage.clickSignBtn();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterCredentials("username", "password");
		driver.close();
		
	}

}
