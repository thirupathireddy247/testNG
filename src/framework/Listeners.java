package framework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

      //ITestListner is a interface which implements testng listeners
public class Listeners implements ITestListener
{ 
	@Override
	public void onTestSuccess(ITestResult result)
	{
		//System.out.println("Listners test case is passed on every successfully test");
	}
	@Override
	public void onTestStart(ITestResult result)
	{
		
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("listners testcase is printed on every failed testcase :" +result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	@Override
	public void onStart(ITestContext context)
	{
		
	}
	@Override
	public void onFinish(ITestContext context)
	{
		
	}
}
