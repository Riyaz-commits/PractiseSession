package Training.AutomationTrainingJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Signuppage extends BaseDriver{
	
	public Signuppage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
