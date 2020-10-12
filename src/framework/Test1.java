package framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	@Test(dependsOnMethods= {"pulse","O2"})
	public void BloodPressure()
	{
		System.out.println("blood pressure");
	}
	@Test(groups= {"smoke"})
	public void pulse()
	{
		System.out.println("pulse");
	}
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
	
	@Test(dataProvider= "getdata")
	public void O2(String uname,String password)
	{
		System.out.println("oxygen saturation");
		System.out.println(uname);
		System.out.println(password);
	}
	@Parameters({"URL","Username"})
	@Test
	public void RespirationRate(String hello ,String uname)
	{
		System.out.println("respiration rate");
		System.out.println(hello);
		System.out.println(uname);
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="firstusername";
		obj[0][1]="firstpassword";
		obj[1][0]="second username";
		obj[1][1]="second password";
		obj[2][0]="third username";
		obj[2][1]="third password";
		return obj;
				
	}

}
