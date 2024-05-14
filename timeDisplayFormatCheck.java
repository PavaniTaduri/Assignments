package Testcases;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.regex.Pattern;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import utils.regExpMatcher;

public class timeDisplayFormatCheck {

	static WebDriver driver;
	boolean res;
	
	@BeforeClass
	public static void openTheBrowser() 
	{
		// To open browser
	
		driver= new ChromeDriver();
		driver.get("https://www.timeanddate.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// To maximize browser
		driver.manage().window().maximize();
	
		
		// To open website with multiple windows
		
	}
	
	@AfterClass
	public static void closeall()
	{
		//driver.close();
	}
	
		//Test Case1 - Check the header text
		@Test
		public void checkDateFormatTC()
		{
			
			regExpMatcher reg= new regExpMatcher();
			
			
		//	String actual_dateDisplayed=driver.findElement(By.id("ij2")).getText();
			String actual_timeDisplayed=driver.findElement(By.id("clk_box")).getText();
			
			System.out.println(actual_timeDisplayed);
			System.out.println("time is in hh:mm:ss format");
			
			//Pattern p = Pattern.compile("[0-9]{2} [A-Z,a-z]{3} [0-9]{4}");
			Pattern p = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
			
			
			res = reg.patternMatch(actual_timeDisplayed, p);
		
			Assert.assertEquals(true, res);
			
		}
	

}
