package com.Calculator_VG_Project.SeleniumWebIntroMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCaseSelenium {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		
			driver.get("https://www.google.se");
				
			
			driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//html/body/div/div[6]/div[4]/div[8]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/h3/a")).click();
			
			
			System.out.println(driver.findElement(By.xpath("//html/body/div[3]/div[2]/div[2]/p[1]")).getText());
			System.out.println(driver.getTitle());
			
			
			Thread.sleep(5000);
			
			driver.quit();
	}
	
	
	
}
