package framework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test9 {
	public WebDriver driver;
@Test
	public void openfirefoxbrowser()
	{
		System.out.println("Before test thread number is" + Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver", "C:\\thirupathi\\Selenium drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		//driver=new ChromeDriver();
	}
@Test
public void openchromebrowser()
{
	System.out.println("Before test thread number is" + Thread.currentThread().getId());
	System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.silentOutput", "true");
	driver=new ChromeDriver();
}
	
}
