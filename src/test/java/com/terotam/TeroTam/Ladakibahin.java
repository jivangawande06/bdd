package com.terotam.TeroTam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Ladakibahin {


	WebDriver driver = null;
	String baseURL = "https://ladakibahin.maharashtra.gov.in/";
	String baseeURL2 = "https://voters.eci.gov.in/login";

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

	}

	@Test
	public void login() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(3000);
		WebElement appLogin = driver.findElement(By.xpath("//a[text()='अर्जदार लॉगिन']"));
		appLogin.click();
		Thread.sleep(10000);
		WebElement enterMobile = driver.findElement(By.xpath("//input[@placeholder='Mobile No.']"));
		enterMobile.sendKeys("8956812782");
		WebElement enterPass = driver.findElement(By.xpath("//input[@type='password']"));
		enterPass.sendKeys("Jivanmg@22");
		WebElement captcha = driver.findElement(By.xpath("//canvas[@width='200']"));
		
		WebElement inputCaptcha = driver.findElement(By.xpath("//input[@name='captchaCode']"));
		
		Thread.sleep(12000);
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(3000);
		WebElement applicantList = driver.findElement(By.xpath("//span[text()='Applications Submitted']"));
		applicantList.click();
		Thread.sleep(2000);
		WebElement appView = driver.findElement(By.xpath("//button[@class='normalButton']"));
	appView.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;

    // Scroll up by a specific amount (e.g., 500 pixels)
    js.executeScript("window.scrollBy(0, 500);");
	
	}
	
	@Test
	public void login2 () {
		
	}

	
	  @AfterTest public void Quite() { driver.quit(); }
	 
}

