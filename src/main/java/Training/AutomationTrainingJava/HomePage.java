package Training.AutomationTrainingJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseDriver{

//	public WebDriver driver;
	@FindBy(xpath="//input[@id='myText']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='linkadd']")
	WebElement getfreetrial;
	
	
	//initializing the page objects ..objects repository
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void freetrail()
		{
			username.click();
			username.sendKeys("riyaz@gmail.com");
			getfreetrial.click();
			
			//return  new Signuppage(driver);
		}
		
		
}
