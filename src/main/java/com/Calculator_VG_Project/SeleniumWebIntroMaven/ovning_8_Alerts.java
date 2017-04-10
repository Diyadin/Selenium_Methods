package com.Calculator_VG_Project.SeleniumWebIntroMaven;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ovning_8_Alerts {

		public static void main(String[] args) throws InterruptedException {
			
			
			// Sätter upp gecko driver och path till den innan start av firefoxbrowser
			System.setProperty("webdriver.gecko.driver", "///Users/Bismillah//Downloads//Webdrivers//Firefox//geckodriver");
			WebDriver driver = new FirefoxDriver();
			WebDriverWait wait = new WebDriverWait(driver,3);
			driver.manage().window().maximize();
			
			
			driver.get("http://the-internet.herokuapp.com/javascript_alerts");
			driver.findElement(By.xpath("html/body/div[2]/div/div/ul/li[1]/button")).click();
			Thread.sleep(1000);
			
			// Skapar en instans och byter fokus av "frame"  till popupfönstern/ metoder för hantering av alert fönster
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			// Klicka på acceptera/ok knappen(popup)
			alert.accept();
			
			String result = driver.findElement(By.xpath("html/body/div[2]/div/div/p[2]")).getText();
			System.out.println(result);
			
			driver.findElement(By.xpath("html/body/div[2]/div/div/ul/li[2]/button")).click();
			Thread.sleep(1000);
			System.out.println(driver.switchTo().alert().getText());
			alert.dismiss();
			
			String verifyClickCancel = driver.findElement(By.xpath("//html/body/div[2]/div/div/p[2]")).getText();
			System.out.println(verifyClickCancel);
			
			driver.findElement(By.xpath("html/body/div[2]/div/div/ul/li[3]/button")).click();
			alert.sendKeys("till fältet");
			/*Implicit wait will accept 2 parameters, the first parameter will accept
			the time as an integer value and the second parameter will accept the time 
			measurement in terms of SECONDS, MINUTES, MILISECOND, MICROSECONDS, NANOSECONDS, DAYS, HOURS, etc.*/
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			System.out.println(alert.getText());
			alert.accept();
			
			String confirmJSText = driver.findElement(By.id("result")).getText();
			
			if(confirmJSText.contains("till fältet")){
				System.out.println("Text confirmed and ok");
			}else{
				System.out.println("text not confirmed and not ok");
			}
			
			
			Thread.sleep(4000);
			driver.quit();
		}
}
