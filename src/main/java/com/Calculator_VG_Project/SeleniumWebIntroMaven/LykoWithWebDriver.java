package com.Calculator_VG_Project.SeleniumWebIntroMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class LykoWithWebDriver {

	public static int antal;
	public static int singelProduktPris;
	public static int summa;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "///Users/Bismillah//Downloads//Webdrivers//Firefox//geckodriver");

		WebDriver driver = new FirefoxDriver();

		WebDriverWait wait = new WebDriverWait(driver, 3);
		driver.get("http://www.lyko.se");

		driver.findElement(By.name("q")).sendKeys("schampo");

		Thread.sleep(3000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"div.Grid__cell:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > img:nth-child(1)")));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(
				"div.Grid__cell:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > img:nth-child(1)"))
				.click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath(".//*[@id='container']/div/div[1]/main/div/div[1]/section/div[2]/div[3]/div/button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("._10hqxW")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Till kassan")).click();

		String pris = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(".//*[@id='checkout-form']/div[3]/table/tbody/tr/td[5]/span/span/span"))).getText();
		System.out.println("Pris innan konvertering: " + pris);

		pris = pris.replaceAll("[;:-]", "");

		try {
			singelProduktPris = Integer.parseInt(pris);

		} catch (NumberFormatException e) {

		}

		System.out.println("Pris efter konvertering: " + singelProduktPris);

		String element = driver.findElement(By.cssSelector("._2LNLh5")).getAttribute("value");

		System.out.println(element);

		try {
			antal = Integer.parseInt(element);

		} catch (NumberFormatException e) {

		}

		for (antal = 1; antal < 10; antal++) {
			driver.findElement(By.xpath(".//*[@id='checkout-form']/div[3]/table/tbody/tr/td[3]/span/button[2]"))
					.click();
			Thread.sleep(500);
		}
		String TotalPris = driver
				.findElement(By.xpath(".//*[@id='checkout-form']/div[3]/table/tbody/tr/td[6]/span/span/span"))
				.getText();
		System.out.println("Totalpris innan konvertering: " + TotalPris);

		TotalPris = TotalPris.replaceAll("[;:-]", "");
		System.out.println("Totalpris efter konvertering: " + TotalPris);

		try {
			summa = Integer.parseInt(TotalPris);
		} catch (NumberFormatException e) {

		}
		if (singelProduktPris * 10 == summa) {
			System.out.println("Verifierar att priset har multiplicerats med 10");

		} else {
			System.out.println("False");
		}

		
		Thread.sleep(10000);
		driver.quit();
		
	}
}
