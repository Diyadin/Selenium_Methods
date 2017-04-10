package com.Calculator_VG_Project.SeleniumWebIntroMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;




public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.gecko.driver", "///Users/Bismillah//Downloads//Webdrivers//Firefox//geckodriver");

    	WebDriver driver = new FirefoxDriver();
    	Actions actions = new Actions(driver);
    	driver.get("https://google.se");
    	String seleniumURL = "http://seleniumhq.org";
    	WebDriverWait wait = new WebDriverWait(driver, 3);
    	
    	driver.navigate().to(seleniumURL);
    	
    	driver.navigate().back();
    
    	driver.navigate().forward();
    	driver.navigate().refresh();
    	Thread.sleep(3000);
    	
    	driver.manage().window().fullscreen();
    	
   System.out.println(driver.manage().window().getSize());

   
   driver.manage().window().maximize();
    }
}
