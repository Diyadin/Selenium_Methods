package com.Calculator_VG_Project.SeleniumWebIntroMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/Bismillah//Downloads//Webdrivers//Chrome//chromedriver");
		String baseURL = "https://www.google.com";

		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		
		
		
		
	}

}
