import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.interactions.Actions;

public class Make_my_trip
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.makemytrip.com/");
driver.manage().window().maximize();

WebElement from=driver.findElement(By.id("fromCity"));
Actions ac=new Actions(driver);
ac.moveToElement(from).click().click().build().perform();;


WebElement d1=driver.findElement(By.xpath("//input[@placeholder='From']"));
Thread.sleep(2000);

d1.sendKeys("delhi");
Thread.sleep(2000);

d1.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(2000);

d1.sendKeys(Keys.ENTER);
Thread.sleep(2000); 

WebElement to=driver.findElement(By.xpath("//input[@placeholder='To']"));
Thread.sleep(2000);

to.sendKeys("Pune");
Thread.sleep(2000);

to.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(2000);

to.sendKeys(Keys.ENTER);
Thread.sleep(2000); 
}
}
 