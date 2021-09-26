import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTube_Practice 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	
WebElement video = driver.findElement(By.id("video-title"));
//video.click();
	Actions ac=new Actions(driver);
	ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
	
	System.out.println("Address of current window url is" +driver.getCurrentUrl());
	
	String Focuswindow = driver.getWindowHandle(); //first window address
	Set<String> Allwindow= driver.getWindowHandles(); //all window address
	
	System.out.println("Total window" +Allwindow.size());

		/*	for(String s : Allwindow)                     "Compare the URL"
	{
		driver.switchTo().window(s);
		if(driver.getCurrentUrl().equals("ThirdURL"))
		{
			break;
		}
	}*/ 
	
	
	/*int shilpa=0;  // take a varibale
	for(String s: Allwindow)
	{
		shilpa=shilpa+1;
		if (shilpa==3)
		{
			driver.switchTo().window(s);
			break;
		}
	} */
	
	for(String s: Allwindow)
	{
		driver.switchTo().window(s);
	}
	
	
	
	System.out.println("Address of Final window url is" +driver.getCurrentUrl());
	driver.switchTo().window(Focuswindow); //   for swiching window
}
}
