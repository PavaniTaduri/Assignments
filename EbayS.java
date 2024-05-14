package Testcases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EbayS {
	static WebDriver driver;
	boolean res;

	@Test
	public  void search() 
	{
		
		driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	     driver.findElement(By.id("gh-ac")).click();
	    System.out.println("Search for anything");
	    
	    
	    String srch = "Mouse";;
			driver.findElement(By.id("gh-ac")).sendKeys(srch + Keys.ENTER);
			driver.findElement(By.id("gh-btn")).click();
			System.out.println("Mouse is searched");
			
			 try {
			    	
			    	
                	String howmanyequalto = driver.findElement(By.xpath("//h1[contains(text(),\"results for\")]")).getText();		
				    System.out.println(howmanyequalto);
				    res = true;
				   
				   
			    }		
			
			    catch(NoSuchElementException e)
			    {
			    	
			     System.out.println("no items found for: " + srch);
			     res = false;
			    }
			    Assert.assertEquals(true, res);   
			    
	}
}

