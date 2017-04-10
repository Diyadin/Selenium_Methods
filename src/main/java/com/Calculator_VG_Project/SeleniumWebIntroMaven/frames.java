package com.Calculator_VG_Project.SeleniumWebIntroMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frames {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "///Users/Bismillah//Downloads//Webdrivers//Firefox//geckodriver");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 3);

		driver.get("http://the-internet.herokuapp.com/nested_frames");

		Thread.sleep(1000);

		// driver.switchTo().frame(0);
		// System.out.println(driver.switchTo().defaultContent());
		Thread.sleep(1000);

		driver.switchTo().frame("frame-top");
		Thread.sleep(1000);

		System.out.println(driver.switchTo().frame("frame-left").findElement(By.xpath("//html/body")).getText());
		Thread.sleep(1000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top");

		Thread.sleep(1000);
		System.out.println(driver.switchTo().frame("frame-right").findElement(By.xpath("//html/body")).getText());

		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top");
		Thread.sleep(1000);

		System.out
				.println(driver.switchTo().frame("frame-middle").findElement(By.xpath("//html/body/div[1]")).getText());
		driver.switchTo().defaultContent();

		System.out.println(driver.switchTo().frame("frame-bottom").findElement(By.xpath("//html/body")).getText());

		// driver.switchTo().frame(iframe_element);

		driver.quit();

	}

}
