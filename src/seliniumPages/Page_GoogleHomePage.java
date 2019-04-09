package seliniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Page_BasePage;

public class Page_GoogleHomePage extends Page_BasePage {
	
	public void launchBrowser() {
		//File file = new File("D:\\perAham\\studies\\Cucumber\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		// driver = new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver","D:\\perAham\\\\studies\\Cucumber\\cukes-jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void openGoogleURL() {
        
		
		driver.get("http://www.google.com");
	}
		
	public void checkSearchBoxIsDisplayed() {
		if(driver.findElement(By.name("q")).isDisplayed()) {
			System.out.println("Search text box is displayed");
		} else {
			System.out.println("Search text box is NOT displayed");
		}
	}
	
	public void checkGoogleSearchButtonIsDisplayed() {
		if(driver.findElement(By.name("btnK")).isDisplayed()) {
			System.out.println("Google Search button is displayed");
		} else {
			System.out.println("Google Search button is NOT displayed");
		}
	}
	
	public void checkImFeelingLuckyButtonIsDisplayed() {
		if(driver.findElement(By.name("btnI")).isDisplayed()) {
			System.out.println("I'm Feeling Lucky button is displayed");
		} else {
			System.out.println("I'm Feeling Lucky button is NOT displayed");
		}
	}
}


