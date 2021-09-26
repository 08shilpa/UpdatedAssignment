import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();	
	
	WebElement Web=driver.findElement(By.cssSelector("input[title='Search']"));
	Thread.sleep(3000);
Web.sendKeys("Software");
Thread.sleep(3000);

Web.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(3000);

Web.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(3000);

Web.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(3000);

Web.sendKeys(Keys.ENTER);
}
}
