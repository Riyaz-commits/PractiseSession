package Training.AutomationTrainingJava;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frameworkclas2 {

	@BeforeMethod
	public void before()
	{
		System.out.println("Before Test");
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("After a method");
	}
	
	@Test(groups="Regression")
	public void functionality()
	{
		System.out.println("This is the method 1");
	}
	
	@Test(priority=1)
	public void functionality1()
	{
	
		System.out.println("This is the method 2");
	}
	
	
	
}
