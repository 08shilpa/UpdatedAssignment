import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class 
{
public void dropdownselection(int indexnumber, WebElement element)
{
	Select s=new Select(element);
	s.selectByIndex(7);
	}

public void dropdownselection(String VisibleTextValue, WebElement element)
{
	Select s=new Select(element);
	s.selectByVisibleText("Aug");
	}

public void dropdown(String value, WebElement element)
{
	Select s=new Select(element);
	s.selectByValue("2001");
}

public static void main(String[] args) throws InterruptedException 
{
	Select_Class sc=new Select_Class();
System.setProperty("webdriver.chrome.driver", "../SeleniumScratch/driver/ChromeDriver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();

WebElement CreateNewAccount=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));   
CreateNewAccount.click();
Thread.sleep(5000);

WebElement Firstname=driver.findElement(By.name("firstname"));
Firstname.sendKeys("shilpa");

WebElement Surname=driver.findElement(By.name("lastname"));
Surname.sendKeys("chaudhary");

WebElement number=driver.findElement(By.name("reg_email__"));
number.sendKeys("9041221996");

WebElement password =driver.findElement(By.id("password_step_input"));
password.sendKeys("qwerty");

WebElement day =driver.findElement(By.id("day"));
sc.dropdownselection(7,day);

WebElement month =driver.findElement(By.name("birthday_month"));
sc.dropdownselection("Aug",month);

WebElement year =driver.findElement(By.id("year"));
sc.dropdown("2001" ,year);

WebElement custom =driver.findElement(By.cssSelector("input[value='1']"));
custom.click();

WebElement Submit =driver.findElement(By.name("websubmit"));
Submit.click();

}
}

