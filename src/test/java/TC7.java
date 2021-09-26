import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7 
{
	ChromeDriver driver; 
	@BeforeMethod
public void method () throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
Thread.sleep(5000);
}
	
	
	@Test
	public void method1() throws InterruptedException
	{
		WebElement signin =driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));	
		//signin.click();
		//Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.click(signin).perform();
		Thread.sleep(5000);
		
		WebElement a= driver.findElement(By.xpath("//input[@type='email']"));
		a.sendKeys("seleniumt91@gmail.com");
		Thread.sleep(5000);
		
		WebElement b= driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
		b.click();
		Thread.sleep(5000);
		
		WebElement c= driver.findElement(By.xpath("//input[@type='password']"));
		c.sendKeys("Qwerty@123");
		Thread.sleep(5000);
		
		WebElement d= driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
		d.click();
		Thread.sleep(3000);
		
List<WebElement> s =driver.findElements(By.xpath("//yt-formatted-string[@id='video-title']")); // Video play 
s.get(1).click();
Thread.sleep(3000);
	
	
	WebElement f= driver.findElement(By.xpath("//button[@aria-label='Save to playlist']")); // Video play & comment
	f.click();
	Thread.sleep(3000);
		
	
		
		/*WebElement i= driver.findElement(By.xpath("//img[@id='img']"));
		i.click();
		Thread.sleep(3000);
		
		WebElement j= driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
		j.click();
		Thread.sleep(3000);*/
	}
	
	
	
	/*@AfterMethod
	public void method3()
	{
		driver.close();
	}*/

}
