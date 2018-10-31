package Selenium;

import org.testng.annotations.Test;

public class NewTest {
  
	public class DriverUtility {
		
		public static WebDriver getDriver(String browser) {
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\chromedriver.exe");
				return new ChromeDriver();
			} else if(browser.equals("firefox")) {
				System.setProperty("webdriver.firefox.marionet", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
				return new FirefoxDriver();
			} else if(browser.equals("ie")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
				return new InternetExplorerDriver();
			} else {
				return null;
			}
			
		}

	}
