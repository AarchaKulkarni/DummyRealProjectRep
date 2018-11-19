package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	static WebDriver driver;
	
	
	public static WebDriver chooseBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome"))
				{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rumoursrus\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		
		if (browser.equalsIgnoreCase("ie"))
		{
	System.setProperty("IEDriverServer","C:\\Users\\rumoursrus\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
	 driver = new InternetExplorerDriver();
	
}
		return driver;
	}

}
