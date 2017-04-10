package com.Calculator_VG_Project.SeleniumWebIntroMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","//Users/Bismillah//Downloads//Webdrivers//Firefox//geckodriver");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		
		
		Thread.sleep(2000);
		driver.get("http://www.flygresor.se");
		driver.findElement(By.xpath("//html/body/div[1]/main/section[1]/div/div[1]/div[1]/form/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div")).sendKeys("test");
		
		Select sel1 =new  Select(driver.findElement(By.xpath("//html/body/div[1]/main/section[1]/div/div[1]/div[1]/form/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div/select")));
		
		sel1.selectByValue("5");
			
		
		
	}
	
}
