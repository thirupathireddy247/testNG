package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase {
	public WebDriver driver;
	@Test
	public void login() throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\TECHOLUTION\\eclipse-workspace\\New\\TestNG Tutorial\\globalvariables.properties");
		p.load(fis);
		System.out.println(p.getProperty("username"));
		if(p.getProperty("browser").equals("chrome"))
				{
			System.setProperty("webdriver.chrome.driver","C:\\thirupathi\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver=new ChromeDriver();
				}
		else if(p.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\thirupathi\\Selenium drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		else if(p.getProperty("browser").equals("ie"))
		{
		 driver=new InternetExplorerDriver();
		}
		driver.get(p.getProperty("URL"));
		
		}

}
