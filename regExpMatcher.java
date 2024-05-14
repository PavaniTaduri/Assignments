package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebElement;

public class regExpMatcher {

	public void regExpChecker()
	{
	
        /*
    	System.setProperty ("webdriver.chrome.driver","D://seleniu//chromedriver.exe" );
		
    	WebDriver driver = new ChromeDriver();
        // And now use this to visit Google
        driver.get("file:///D:/Bala%20laptop/RPS/Examples/sample.html");
        
        String timeString = driver.findElement(By.id("txt")).getText();     
        
        System.out.println(timeString); 
        
        Pattern p = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        Matcher m = p.matcher(timeString);
    */    
    	//String exampleString = "Harrybpotterabcbbb";
    	 // Pattern p = Pattern.compile(".*potter.*");
        //String begins with H
    	//Pattern p = Pattern.compile("^H.*b$");
    	
        //hh:mm:ss
    	String exampleString = "04:30:45";
     	Pattern p = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        
     	
    //	String exampleString = "11 May 2024";
    	
    	
    //	Pattern p = Pattern.compile("[0-9]{1} [A-Z,a-z]{3} [0-9]{4}");
    		
    	boolean m = patternMatch(exampleString,p);
		
    		System.out.println(m);
    	
    }

    
    public static boolean patternMatch(String actual_timeDisplayed, Pattern p)
    {
    	Matcher m = p.matcher(actual_timeDisplayed);
        
        return m.matches();
        
    }

}
