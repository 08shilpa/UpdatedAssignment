import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.id("video-title"));
	
	Actions ac=new Actions(driver);
	ac.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform();
	
	
	}
}
