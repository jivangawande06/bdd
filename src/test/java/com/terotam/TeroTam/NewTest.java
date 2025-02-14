package com.terotam.TeroTam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver = null;

	@BeforeTest

	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

	}

	@Test(priority = 1)
	public void login() throws InterruptedException {

		driver.get("https://customer-sandbox.terotam.com/");
		Thread.sleep(3000);

		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("ooo0015");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Jivanmg@22");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

		/*
		 * driver.findElement(By.name("q")).sendKeys("BABA");
		 * //driver.findElement(By.name("q")).sendKeys(Keys.ENTER); Thread.sleep(3000);
		 * driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 */

		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void assetMgmt() {
		WebElement assetmgmt = driver.findElement(By.xpath("//span[@title='Assets Management']"));
		assetmgmt.click();
		WebElement asset = driver.findElement(By.xpath("//li[@title='Assets']"));
		asset.click();
	}

	@Test(priority = 3)
	public void assetFilter() throws InterruptedException {
		WebElement assetFilter = driver.findElement(By.xpath("//button[@id='filter-button-complaint']"));
		assetFilter.click();
		WebElement locationFilter = driver.findElement(By.xpath("//input[@id='filter_assets_Mgmt_outlet_ids']"));
		locationFilter.click();
		locationFilter.sendKeys("aa7");
		locationFilter.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement filterSubmit = driver
				.findElement(By.xpath("//button[@tam_id='TAM_pm_assets_filter_modal_label_submit_btn']"));
		filterSubmit.click();
		Thread.sleep(2000);
		
	}
	
	@Test (priority =4 )
	public void resetFilter () throws InterruptedException {
		WebElement assetFilter = driver.findElement(By.xpath("//button[@id='filter-button-complaint']"));
		assetFilter.click();
		Thread.sleep(3000);
		WebElement resetFilter = driver.findElement(By.xpath("//button[@tam_id='TAM_pm_assets_filter_reset_btn']"));
		resetFilter.click();
		Thread.sleep(3000);
	}  
	
	
	

	@AfterTest

	public void close() throws InterruptedException {
		WebElement UserProfile = driver.findElement(By.xpath("//span[@class='popover-style']"));
		UserProfile.click();
		WebElement logOut = driver.findElement(By.xpath("//span[text()='Logout']"));
		logOut.click();
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println(" This is the data");
	}

}
