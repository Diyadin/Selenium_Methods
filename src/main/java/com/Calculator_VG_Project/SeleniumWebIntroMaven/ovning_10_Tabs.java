package com.Calculator_VG_Project.SeleniumWebIntroMaven;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ovning_10_Tabs {

	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.gecko.driver","///Users/Bismillah//Downloads//Webdrivers//Firefox//geckodriver" );
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.manage().window().maximize();
		
		
		
		driver.get("http://the-internet.herokuapp.com/windows ");
		Thread.sleep(1500);
		driver.findElement(By.partialLinkText("Click")).click();
		Thread.sleep(1500);
		
		
		Iterator<String> windowIterator = driver.getWindowHandles().iterator();while (windowIterator.hasNext()) {
			String windowHandle = windowIterator.next();
			driver = driver.switchTo().window(windowHandle);
		
		}
		Thread.sleep(1500);
		System.out.println(driver.findElement(By.className("example")).getText());
		
		
			
		
		
		
		

	    
		
		
		
		
		
		
	}
	
	
}
