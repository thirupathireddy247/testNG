package framework;

import org.testng.annotations.Test;

public class Test8 {
	@Test(threadPoolSize = 5, invocationCount = 4, timeOut = 1000)
	public void openApplication()
	{
		System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
		
	}

}
