import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Play_all_video 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	java.util.List<WebElement> obj =driver.findElements(By.id("video-title"));
	for(WebElement a1:obj)
	{
		a1.click();
		Thread.sleep(3000);
		driver.navigate().back(); //navigate to back window
	}
}
}
