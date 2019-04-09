package seliniumPages;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Page_BasePage;

public class Page_VerifyOfferTestCall extends Page_BasePage {
	
	String parentOfferWindow = null;
    Actions action = new Actions(driver);
	
	public void launchOffer(String offer) throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Configure")).click();
		if (driver.findElement(By.partialLinkText("Offers")).isDisplayed())
		{
			driver.findElement(By.partialLinkText("Offers")).click();
		}
		else
		{
			System.out.println("Offer link not found!!");
		}
		if (driver.getPageSource().contains("Offers: All"))
			{
			
			driver.findElement(By.id("qsearch:search:name")).sendKeys(offer);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//a[@href='/callcenter/html/editoffer.mpl?offer_id=61927']")).click();
			System.out.println("Offer link clicked ");
			}
		else {
			
			System.out.println("Offer link could not be clicked !");
		}
		
	}//launchOffer
	
	
	public void intiateTestCall() {
		driver.findElement(By.xpath("//input[@value='Test Call...']")).click();
		parentOfferWindow = driver.getWindowHandle();

		System.out.println("parent window id " + parentOfferWindow);

		driver.findElement(By.xpath("//input[@value='Place Call']")).click();
			
	}
	
	public void selectDocumentMode(String browserMode) {
		    action.sendKeys(Keys.F12);
			action.perform();
			action.sendKeys(Keys.CONTROL+"7");
			action.perform();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			action.sendKeys(Keys.TAB);
			action.perform();
					   
		  switch (browserMode) {
		   
		   case "IE5":
			   System.out.println("IE browser mode IE 5 selected");
			   break;
			   
		   case "IE6":
			   System.out.println("IE browser mode IE 6 selected");
			   break;
			   
		   case "IE7":
			   System.out.println("IE browser mode IE 7 selected");
			   break;
			   
		   case "IE8":
			   System.out.println("IE browser mode IE 8 selected");
			   break;
			   
		   case "IE9":
			   System.out.println("IE browser mode IE 9 selected");
			   break;
			   
		   case "IE10":
			   System.out.println("IE browser mode IE 10 selected");
			   
			   action.sendKeys(Keys.UP);
			   action.sendKeys(Keys.UP);
			   
			   break;
			   
		   case "IE11":
			   //System.out.println("IE browser mode IE 11 selected");
			   
			   for (int i=0;i<=5;i++) {action.sendKeys(Keys.UP);action.perform();}
			   action.sendKeys(Keys.F12);
			   action.perform();
			   new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("input-1242630-NAMEFIRST"))));
			   break;
			   
			   
		   }//switch
		   
		   
	   }//selectDocumentMode
	
	
    public void welcomeScreen() throws InterruptedException, AWTException {
    	Set<String> allWindow = driver.getWindowHandles();
    	int count = allWindow.size();
    	System.out.println("window size is: " + count);
    	for (String child : allWindow) {
    	if (!parentOfferWindow.equalsIgnoreCase(child)) {
    		driver.switchTo().window(child);
    	}
    	}//for
    	Page_BasePage.disMissMoreInfoMessage();
    	String usrnameAgain = new Page_LoginPage().username;
    	String passwordAgain = new Page_LoginPage().password;
    	try {if (driver.findElement(By.name("username")).isDisplayed()) 
    		{new Page_LoginPage().enter_credentials(usrnameAgain, passwordAgain);
    		}//if
    	}//try
    		catch (Exception e){System.out.println("USername field not dispalyed again , proceeding ahead ...");
    	
    	selectDocumentMode("IE11");
    	
    		driver.findElement(By.id("input-1242630-NAMEFIRST")).sendKeys("TestFirstName");
    		driver.findElement(By.id("input-1242630-NAMELAST")).sendKeys("TestLastName");
    		driver.findElement(By.id("forward-button-1242630-")).click();
    		//driver.switchTo().defaultContent();
    		//driver.switchTo().frame("screens");
    		}//catch

    
}
}