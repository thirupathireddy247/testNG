package framework;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test10 {

	@BeforeMethod
	public void beforevery()
	{
		System.out.println("It will exuceate before every method in the class");
	}
	@AfterMethod
	public void afterevery()
	{
		System.out.println("It will exuceate after every method in the class");
	}

	@BeforeSuite
	public void firstexuceate()
	{
		System.out.println("it will ecuceate first step");
	}
	@AfterSuite
    public void lastexuceate()
	{
		System.out.println("it will exuceate last step");
	}
	@BeforeClass
	public void Beforeclassrespiration()
	{
		System.out.println("it will exuceate Beforeclass respiration");
	}
	@AfterClass
	public void Afterclassrespiration()
	{
		System.out.println("it will exuceate afterclass respiration");
	}
	
	@BeforeClass
	public void Beforeclasspulse()
	{
		System.out.println("it will exuceate Beforeclass pulse");
	}
	@AfterClass
	public void Afterclasspulse()
	{
		System.out.println("it will exuceate afterclass pulse");
	}
	
	@Test
	public void PatientName()
	{
		System.out.println("patientname");
	}
	@BeforeTest
	public void beforeclass()
	{
		System.out.println("before exuceating all the methods");
	}
	@AfterTest
	public void afterclass()
	{
		System.out.println("after exuceating all the methods");
	}
	@Test
	public void PatientAge()
	{
		System.out.println("patientage");
		//Assert.assertTrue(false);
		
	}

}
