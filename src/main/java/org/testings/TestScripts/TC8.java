package org.testings.TestScripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC8 extends Base
{
	/*ChromeDriver driver; 
	@BeforeMethod
public void method () throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
Thread.sleep(5000);
}*/
	
	
	@Test
	public void method1() throws InterruptedException
	{
		WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin")));
		//signin.click();
		//Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.click(signin).perform();
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

		WebElement library= driver.findElement(By.xpath(pr.getProperty("library"))); //click on library
		library.click();
		Thread.sleep(3000);
		
		WebElement icon= driver.findElement(By.xpath(pr.getProperty("icon")));
		icon.click();
		Thread.sleep(3000);
		

		WebElement signout= driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		Thread.sleep(3000);
	}
	
	
	
	/*@AfterMethod
	public void method2()
	{
		driver.close();
	}*/
}
