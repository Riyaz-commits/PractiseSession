package Training.AutomationTrainingJava;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomepageTest extends BaseDriver{

	public Utility ut ;
	public HomePage hp;
	@Test
	public void Hmpage() throws IOException, InterruptedException
	{
		BaseDriver.initialization();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//a[contains(text(),'Contact Sales')]")).click();
		hp = new HomePage();
		hp.freetrail();
		ut = new Utility();
		Thread.sleep(5000);
		ut.takeScreenshotAtEndOfTest();
		
	}
	
	
}
