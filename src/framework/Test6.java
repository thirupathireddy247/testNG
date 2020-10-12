package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test6 {

	public WebDriver driver;
	 @BeforeTest
		//@Test
		public void openchromebrowser()
		{
			System.out.println("Before test thread number is" + Thread.currentThread().getId());
			System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver=new ChromeDriver();
		}
	    @Test
		public void openApplication()
		{
			System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
			driver.get("https://www.linkedin.com/");
		}
	    @AfterTest
		public void Closebrowser()
		{
			System.out.println("After Test Thread Number Is " + Thread.currentThread().getId());
			driver.close();
		}
}
