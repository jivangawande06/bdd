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

public class AssetReportDownload {

	WebDriver driver = null;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

	}

	@Test(priority = 1)
	public void login() throws InterruptedException {

		driver.get("https://customer-sandbox.terotam.com/");
		Thread.sleep(3000);

		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("gmm0001");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Test123");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

	}

	@Test(priority = 2)
	public void assetMgmt() throws InterruptedException {
		WebElement assetmgmt = driver.findElement(By.xpath("//span[@title='Assets Management']"));
		assetmgmt.click();
		Thread.sleep(3000);
		WebElement asset = driver.findElement(By.xpath("//li[@title='Assets']"));
		asset.click();
	}

	@Test(priority = 3)
	public void assetReport() throws InterruptedException {

		WebElement assetReport = driver
				.findElement(By.xpath("//div[@tam_id='TAM_assets_extra_selection_menu_Select_report_Option']"));
		assetReport.click();
		WebElement reportView = driver.findElement(By.xpath("//div[@title='Report']"));
		reportView.click();
		Thread.sleep(5000);

	}

	@Test(priority = 4)
	public void addAsset() throws InterruptedException {

		Thread.sleep(3000);

		WebElement assetmgmt = driver.findElement(By.xpath("//span[@title='Assets Management']"));
		assetmgmt.click();

		WebElement asset = driver.findElement(By.xpath("//li[@title='Assets']"));
		asset.click();

		WebElement addAsset = driver.findElement(
				By.xpath("//div[@class='ant-select select_assets_drop ant-select-single ant-select-show-arrow']"));
		addAsset.click();
		WebElement addEquipCategory = driver.findElement(By.xpath("//div[text()='Add Equipment Category']"));
		addEquipCategory.click();
		Thread.sleep(3000);
		WebElement insertEquipValvu = driver
				.findElement(By.xpath("//input[@tam_id='TAM_cm_name_multiItem_fileld_Input0']"));

		insertEquipValvu.sendKeys("Metal");
		WebElement equipDate = driver.findElement(By.xpath("//input[@size='12']"));

		equipDate.sendKeys("01/07/2024");
		equipDate.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement date = driver
				.findElement(By.xpath("//label[text()='String']/../../..//input[@class='ant-input custom-input']"));
		date.sendKeys("Micel Jacson");
		Thread.sleep(3000);
		date.sendKeys(Keys.ENTER);
		WebElement number = driver
				.findElement(By.xpath("//label[text()='Number']/../../..//input[@class='ant-input custom-input']"));
		number.sendKeys("10");
		WebElement submit = driver.findElement(By.xpath("//span[text()='Submit']"));
		submit.click();
		Thread.sleep(4000);

	}

	@Test(priority = 5)
	public void deleteZone() throws InterruptedException {
		WebElement equipmentCategory = driver
				.findElement(By.xpath("//div[@class='ant-tabs-nav-list']//span[text()='Equipment Category']"));
		equipmentCategory.click();
		Thread.sleep(3000);
		WebElement clickDelete = driver.findElement(By.xpath(
				"//*[@id=\"rc-tabs-0-panel-783\"]/div/div/div/div/div/div/span/div/div[2]/div/div/div/div/div[2]/table/tbody/tr[2]/td[5]/div/div/button[2]"));
		clickDelete.click();
		WebElement yesDelete = driver.findElement(By.xpath("//span[text()='Yes']"));
		yesDelete.click();
	}

	@AfterTest
	public void close() throws InterruptedException {
		WebElement UserProfile = driver.findElement(By.xpath("//span[@class='popover-style']"));
		UserProfile.click();
		WebElement logOut = driver.findElement(By.xpath("//span[text()='Logout']"));
		logOut.click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}
}
