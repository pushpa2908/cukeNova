package common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Page_BasePage {
	
	public static WebDriver driver;
	
	
	
	
    public static void disMissMoreInfoMessage() throws InterruptedException, AWTException {
		
		
		if (driver.findElement(By.linkText("More information")).isDisplayed())
		{
			System.out.println("More information link dispalyed ....");
			//dismissAlerts();
			driver.findElement(By.linkText("More information")).click();
			Thread.sleep(2);
			driver.findElement(By.linkText("Go on to the webpage (not recommended)")).click();
		
			
		}
		else {
			System.out.println("no more inromation link!");
			}		
	} //disMissMoreInfoMessage
    
 
    }//class
