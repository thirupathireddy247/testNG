package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test7 {
	public WebDriver driver;
	 
	@BeforeTest
		public void openchromebrowser()
		{
			System.out.println("Before test thread number is" + Thread.currentThread().getId());
			System.setProperty("webdriver.gecko.driver", "C:\\thirupathi\\Selenium drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			//driver=new ChromeDriver();
		}
	    @Test
		public void openApplication()
		{
			System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
			driver.get("https://www.google.com/");
		}
	    @AfterTest
		public void Closebrowser()
		{
			System.out.println("After Test Thread Number Is " + Thread.currentThread().getId());
			driver.close();
		}


}
