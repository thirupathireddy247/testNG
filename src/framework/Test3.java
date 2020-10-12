package framework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void Carloan()
	{
		System.out.println("car loan");
	}
	@Test
	public void Bikeload()
	{
		System.out.println("bike loan");
	}
	@Test(groups= {"smoke"})
	public void Tractorloan()
	{
		System.out.println("tractor loan");
	}
	@BeforeTest
	public void Gototheshowroom()
	{
		System.out.println("It will exuceate after every beforesuite");
	}
	@AfterTest
	public void WentToTheShowRoom()
	{
		System.out.println("t will exuceate before every aftersuite ");
	}
	{
		
	}
	@Test
	public void Aeroplaneloan()
	{
		System.out.println("Aeroplane loan");
	}
	

}
