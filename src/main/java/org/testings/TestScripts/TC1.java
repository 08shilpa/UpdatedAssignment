package org.testings.TestScripts;


import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 extends Base
{
	
	
	@Test
	public void method1() throws InterruptedException, IOException
	{
	
	WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin")));
	signin.click();
	Thread.sleep(5000);
	
	WebElement username=driver.findElement(By.xpath(pr.getProperty("username")));
	username.sendKeys("seleniumt91@gmail.com");
	Thread.sleep(5000);
	
	WebElement Next=driver.findElement(By.xpath(pr.getProperty("Next")));
	Next.click();
	Thread.sleep(5000);
	
	WebElement password=driver.findElement(By.xpath(pr.getProperty("password")));
	password.sendKeys("Qwerty@123");
	Thread.sleep(5000);
	
	WebElement next2=driver.findElement(By.xpath(pr.getProperty("next2")));
	next2.click();
	Thread.sleep(3000);
	
	WebElement Tranding1=driver.findElement(By.xpath(pr.getProperty("Tranding1")));
	Tranding1.click();
	Thread.sleep(3000);
	
	WebElement Tranding2=driver.findElement(By.xpath(pr.getProperty("Tranding2")));
	Tranding2.click();
	Thread.sleep(3000);
	ScreenshotCapture.takescreenshot(driver,"C:\\Users\\Asus\\Desktop.png" );
	
	WebElement icon= driver.findElement(By.xpath(pr.getProperty("icon")));
	icon.click();
	Thread.sleep(3000);
	

	WebElement signout= driver.findElement(By.xpath(pr.getProperty("signout")));
	signout.click();
	Thread.sleep(3000);
	
	
	
	
	}
	
	
	
	
}
