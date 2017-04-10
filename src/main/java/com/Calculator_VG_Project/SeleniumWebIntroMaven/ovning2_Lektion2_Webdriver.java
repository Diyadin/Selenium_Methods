package com.Calculator_VG_Project.SeleniumWebIntroMaven;

import java.awt.Frame;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class ovning2_Lektion2_Webdriver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "///Users/Bismillah//Downloads//Webdrivers//Firefox//geckodriver");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 3);

		driver.get("http://the-internet.herokuapp.com/challenging_dom");

		WebElement select = driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr"));
		List<WebElement> allOptions = select
				.findElements(By.xpath("//html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr"));

		Iterator<WebElement> it = allOptions.iterator();

		while (it.hasNext()) {
			System.out.println(it.next().getText().replaceAll("edit delete", ""));
		}

		driver.get("http://the-internet.herokuapp.com/checkboxes");

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		WebElement checkbox = driver.findElement(By.xpath("//html/body/div[2]/div/div/form/input"));
		List<WebElement> allOptions2 = checkbox.findElements(By.xpath("//html/body/div[2]/div/div/form/input"));

		Iterator<WebElement> it2 = allOptions2.iterator();

		boolean isChecked;

		while (it2.hasNext()) {
			System.out.println(isChecked = checkbox.findElement(By.xpath("//html/body/div[2]/div/div/form/input[1]"))
					.isSelected());
			System.out.println(isChecked = checkbox.findElement(By.xpath("//html/body/div[2]/div/div/form/input[2]"))
					.isSelected());
			break;
		}
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		driver.get("http://the-internet.herokuapp.com/dropdown");

		System.out.println(driver.findElement(By.xpath("//html/body/div[2]/div/div/select/option[3]")).getText());

		driver.findElement(By.xpath("//html/body/div[2]/div/div/select/option[3]")).click();
		boolean option2IsChoosen;
		System.out.println(option2IsChoosen = driver
				.findElement(By.xpath("//html/body/div[2]/div/div/select/option[3]")).isSelected());

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("fakeUsername");
		driver.findElement(By.id("password")).sendKeys("fakePassword");
		driver.findElement(By.className("radius")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));

		String verifyFalseUsernameInput = driver.findElement(By.id("flash")).getText();
		String falseUsername = "Your username is invalid!";
		String falsePassword = "Your password is invalid!";

		if (verifyFalseUsernameInput.contains(falseUsername) || verifyFalseUsernameInput.contains(falsePassword)) {
			System.out.println("Verified it didnt log in with wrong inputs");

		} else {
			System.out.println("Not verified");
		}

		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String logedIn = driver.findElement(By.id("flash")).getText();
		System.out.println("verifying gettext: " + logedIn);
		String verifedLogIn = "You logged into a secure area!";

		if (logedIn.contains(verifedLogIn)) {
			System.out.println("Verified Succsesfull log in ");

		} else {
			System.out.println("Fail in vierifying succsesfull log in");
		}

		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}
	}

