package com.Calculator_VG_Project.SeleniumWebIntroMaven;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class losning_ovning_10 
{
	private static WebDriver driver;
	private static WebDriverWait wait;
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver", "///Users/Bismillah//Downloads//Webdrivers//Firefox//geckodriver");

    	driver = new FirefoxDriver();
    	wait = new WebDriverWait(driver, 3);
    	// Gå till hemsidan
    	driver.get("http://the-internet.herokuapp.com/windows");
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='content']/div/a")));
    	driver.findElement(By.xpath(".//*[@id='content']/div/a")).click();
    	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    	while(tabs.size() < 2){
    		tabs = new ArrayList<String> (driver.getWindowHandles());
    	}
    	driver.switchTo().window(tabs.get(1));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div/h3")));
    	 System.out.println(driver.findElement(By.xpath("html/body")).getText());
    	 driver.close();
    	 tabs = new ArrayList<String> (driver.getWindowHandles());
     	while(tabs.size() == 2){
     		tabs = new ArrayList<String> (driver.getWindowHandles());
     	}
    	driver.switchTo().window(tabs.get(0));
    	driver.close();
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	driver.quit();
    }
}
