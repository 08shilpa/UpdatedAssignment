import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
	
}}


//System.setProperty("webdriver.chrome.driver", "driver/ChromeDriver/chromedriver.exe");
//ChromeDriver driver=new ChromeDriver();