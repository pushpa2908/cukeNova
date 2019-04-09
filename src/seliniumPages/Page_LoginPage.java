package seliniumPages;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import common.Page_BasePage;

public class Page_LoginPage extends Page_BasePage{
	
	String username =null;
	String password =null;
	
	public void setCredentials(String username, String password) {
		
		this.username=username;
		this.password=password;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	
public void launchPreferredBrowser(String browser) {
		
		File file = null;
		switch(browser)
		{		   
		   case "IE" :
			   //file = new File("D:\\perAham\\studies\\Cucumber\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			   file = new File("D:\\perAham\\studies\\Cucumber\\cukes-jars\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			   System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			   driver = new InternetExplorerDriver(); 
			   break;
		   
		   case "chrome" :
			   file = new File("D:\\perAham\\studies\\Cucumber\\cukes-jars\\chromedriver_win32\\chromedriver.exe");
			   System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			   driver = new ChromeDriver();
			   break;
		      
		   case "firefox": 
			   System.out.println("Yet to implement");
			   break;
		     }
	}
	
	public void accessApp(String app) throws InterruptedException, AWTException {
		driver.get(app);
		Thread.sleep(20);
	}
		
	
	
	public void enter_credentials(String username, String passwrd) {
		
		setCredentials(username,passwrd);
		WebElement toClear1 = driver.findElement(By.name("username"));
		toClear1.sendKeys(Keys.CONTROL + "a");
		toClear1.sendKeys(Keys.DELETE);
		driver.findElement(By.name("username")).sendKeys(username);
		
		WebElement toClear2 = driver.findElement(By.name("password"));
		toClear2.sendKeys(Keys.CONTROL + "a");
		toClear2.sendKeys(Keys.DELETE);
		
		
		driver.findElement(By.name("password")).sendKeys(passwrd);
		
		
	}
	
	public void submitAction(String buttonName) {
		
		driver.findElement(By.name(buttonName)).click();
	}
	


}
