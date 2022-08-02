package Training.AutomationTrainingJava;

import org.testng.annotations.Test;

public class Frameworkclass {

	
	@Test(priority=3)
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
