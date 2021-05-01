package shoppingSite.basePackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import shoppingSite.utilityPackage.TestUtil;




public class TestBase{
	public static WebDriver driver;
	public static Properties prop;

	public TestBase()
	{
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\shopping\\configPackage\\Config.properties");
			prop.load(fis);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static WebDriver getBrowser()
	{
		String browser= prop.getProperty("browser");

		
			if(browser.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}	
			else if(browser.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
				

			}
			else if(browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				

			}
			else
			{
				System.out.println("No Browser selected");

			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITE_WAIT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		
		return driver;

	}

	public static void tierDown()
	{
		driver.close();
		driver.quit();
	}
}
