package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTestng 

{
	WebDriver driver;     // create refrence of webdriver
	
     @BeforeSuite
     public void OpenUrl()
     {
    	 System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver");
 		
    	 driver = new ChromeDriver();       //  create object of Firefox Driver
    	 driver.get("https://google.com"); 
     }
     
	
	
	@BeforeMethod
	
	public void Test1()
	{
		System.out.println("I am in BeforeMethod");
	}
	
	@AfterMethod
	public void Test2()
	{
		System.out.println("I am in AfterMethod");
	}
	
	@Test
	public void FlipkartMenShaving()
	{
		
		System.out.println("I am in test 1");
	
   }
	
	@Test
	public void FlipkartMenMobile()
	{
		
		System.out.println("I am in test 2");
	
   }
	

}
