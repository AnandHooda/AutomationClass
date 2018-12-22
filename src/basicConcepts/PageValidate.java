package basicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageValidate 
{
	WebDriver driver;

	@BeforeTest
	public void OpenUrl() throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver");
	   driver = new ChromeDriver();     
	   driver.get("https://www.facebook.com/"); 
	   Thread.sleep(10000);
	}
	
	@Test
	 public void Login()
	 {
		driver.findElement(By.id("email")).sendKeys("ahhooda@gmailcom");
		driver.findElement(By.id("pass")).sendKeys("pinkyhooda@47");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	 }

}

