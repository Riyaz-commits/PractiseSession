package Training.AutomationTrainingJava;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   public static void main(String args[]) throws IOException
   {
	   
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAZ BASHA SHAIK\\2022\\AutomationTrainingJava\\Resources\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.orangehrm.com/");
	    driver.manage().window().maximize();
	    
	    FileInputStream fis = new FileInputStream("C:\\Users\\RIYAZ BASHA SHAIK\\2022\\AutomationTrainingJava\\Resources\\creds.properties");
	    Properties properties = new Properties();
	    properties.load(fis);
	    
	    
	 String pagename=   driver.getTitle();
	 System.out.println(pagename);
	 
	    driver.findElement(By.id("myText")).click();
	    driver.findElement(By.id("myText")).sendKeys(properties.getProperty("username"));
	    
	    driver.findElement(By.id("linkadd")).click();
	 /*
		 * 
		 * driver.findElement(By.id("Form_submitForm_Name")).sendKeys("Riyaz");
		 * 
		 * Select s = new Select(driver.findElement(By.id("Form_submitForm_Country")));
		 * 
		 * s.selectByValue("India");
		 */
	    
	    
	  //  driver.quit();
	    
		/*
		 * WebElement platformxpath =
		 * driver.findElement(By.xpath("//a[contains(text(),'Platform')]"));
		 * 
		 * WebElement HrAdmin =
		 * driver.findElement(By.xpath("(//a[contains(text(),'HR Administration')])[1]")
		 * );
		 * 
		 * Actions action = new Actions(driver);
		 * 
		 * action.moveToElement(platformxpath).
		 * moveToElement(HrAdmin).click().build().perform();
		 */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
   }
}
