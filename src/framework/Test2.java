package framework;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void PatientName()
	{
		System.out.println("patientname");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before exuceating all the methods");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after exuceating all the methods");
	}
	@Test
	public void PatientAge()
	{
		System.out.println("patientage");
		Assert.assertTrue(false);
		
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
	
	@Test(groups= {"smoke"})
	public void PatientAddress()
	{
		System.out.println("patient address");
	}
	
	@Test(enabled=false)       //If you want skip any test using this annotation
	public void OnlineBeds()
	{
		System.out.println("online count beds");
	}
	@Test(timeOut=4000)    //If you want wait any commands using this annotation
    public void OfflineBeds()
    {
		System.out.println("offline count beds");
    }

}
