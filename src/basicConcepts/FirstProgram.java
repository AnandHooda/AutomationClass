package basicConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram 
{
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver");
		
		WebDriver driver = new ChromeDriver();     //  create object of Firefox Driver
		
	     driver.get("https://world.aeromexico.com/en/uk");
	     
	     
	   //boolean Test=  driver.findElement(By.id("from")).isDisplayed();
	   
//	   if(driver.findElement(By.id("from")).isDisplayed())
//	   {
//		   System.out.println("I am on correct page");
//		   
//		   driver.findElement(By.xpath("//input[@id='from']")).clear();
//		   driver.findElement(By.xpath("//input[@id='from']")).sendKeys("Rohit");
//	   }
	     
	     
	     //boolean Test=  driver.findElement(By.id("round")).isSelected();
	     
//	     if(driver.findElement(By.id("round")).isSelected())
//	     {
//	    	 System.out.println("Item is already selected");
//	    	 driver.findElement(By.id("one")).click();
//	     }
	     
	    String Exptitle = "ABC";
	     
	   String TitleOfPage =  driver.getTitle();
	   
	   if(Exptitle.equals(TitleOfPage))
	   {
		   System.out.println("I am here");
	   }
	   

}
}





