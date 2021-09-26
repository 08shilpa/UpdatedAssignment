import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class YouTubePractice1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("video-title"));
		
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform();
		ac.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform();
		ac.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform();
		ac.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform();
	
		System.out.println("Address of current window url is" +driver.getCurrentUrl());
		
		String Focuswindow = driver.getWindowHandle(); //first window address
		Set<String> Allwindow= driver.getWindowHandles(); //all window address
		
		System.out.println("Total window" +Allwindow.size());

		int shilpa=0;  // take a varibale
		for(String s: Allwindow)
		{
			shilpa=shilpa+1;
			if (shilpa==3)
			{
				driver.switchTo().window(s);
				break;
			}
		} 
	
		System.out.println("Address of Final window url is" +driver.getCurrentUrl());
	
	
	
	}
	

}
