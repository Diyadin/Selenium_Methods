package com.Calculator_VG_Project.SeleniumWebIntroMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ovning_9_inputs {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "///Users/Bismillah//Downloads//Webdrivers//Firefox//geckodriver");
		WebDriver driver = new SafariDriver();
		WebDriverWait wait = new WebDriverWait(driver,3);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		Thread.sleep(2000);
		Keys alt = Keys.ALT;
		Keys shift = Keys.SHIFT;
		Keys enter = Keys.ENTER;
		Keys esc = Keys.ESCAPE;
		Keys control = Keys.CONTROL;
		Keys tab = Keys.TAB;
		Keys space = Keys.SPACE;
		Keys backspace = Keys.BACK_SPACE;
		
			
		driver.findElement(By.xpath("//html")).sendKeys(space);
		String verifyResult = driver.findElement(By.id("result")).getText();
		
		
		if(verifyResult.contains("SPACE")){
		System.out.println("Space verified");
		}else{
			System.out.println("Space Not verified");
		}
		
		
		
		Thread.sleep(4000);
		driver.quit();
		
		
	}
	
}
