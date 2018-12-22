package basicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 

{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver");
		
		WebDriver driver = new ChromeDriver();     //  create object of Firefox Driver
		
	    driver.get("https://world.aeromexico.com/en/uk");
	    
	  //boolean  Test =   driver.findElement(By.id("from")).isDisplayed();
	    
	    if(driver.findElement(By.id("from")).isDisplayed())
	    {
	    	System.out.println("I am on coreect page");
	    }
	  
	  //System.out.println(Test);
	    
	}  
}

