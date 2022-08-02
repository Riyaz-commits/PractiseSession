package Training.AutomationTrainingJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPagehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAZ BASHA SHAIK\\2022\\AutomationTrainingJava\\Resources\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();  
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		    driver.manage().window().maximize();
		    
		    
		    driver.findElement(By.id("confirmbtn")).click();
		    
		    driver.switchTo().alert().dismiss();

		    
		    
	}

}
