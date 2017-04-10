package com.Calculator_VG_Project.SeleniumWebIntroMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "///Users/Bismillah//Downloads//Webdrivers//Firefox//geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://lyko.se");

		driver.findElement(By.name("q")).sendKeys("Schampo");
		Thread.sleep(4000);

		driver.findElement(By
				.xpath(".//*[@id='container']/div/main/div/div[1]/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div[1]/div[1]/a/div/img"))
				.click();

		driver.manage().window().getPosition();	
		
		
		
	}

}
