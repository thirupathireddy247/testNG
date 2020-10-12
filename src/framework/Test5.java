package framework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test5 {
	
  @Test(priority=0)
	//@Test
	public void air()
	{
		System.out.println("blood pressure");
	}
	
    @Test(priority=-1)
	
	public void pulse()
	{
		System.out.println("pulse");
	}
    @Test
	public void beforevery()
	{
		System.out.println("It will exuceate before every method in the class");
	}
}
