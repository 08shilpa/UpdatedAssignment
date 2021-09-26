import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Practice 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://mallskapetest.nestorhawk.com/");


WebElement dropdown=driver.findElement(By.id("customerCurrency"));
dropdown.click();
Select sc= new Select(dropdown);
//sc.selectByIndex(2);
//sc.selectByValue("http://mallskapetest.nestorhawk.com/changecurrency/18?returnUrl=%2F");
Thread.sleep(3000);
sc.selectByVisibleText("US Dollar");
dropdown.click();
}
}