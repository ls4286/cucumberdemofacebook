package stepdefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SharedSD {

	 public static final String USERNAME = "ls4286";
	  public static final String ACCESS_KEY = "29b8ccba-b3b9-4b95-a95b-5dc0c5d40724";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	private static final String myURL = "https://facebook.com/";
	private static WebDriver driver = null;

	
	
	@Given("^I open the default browser$")
	public static void before() throws MalformedURLException {
		

		//System.setProperty("webdriver.gecko.driver", "C:/Users/chheten/Desktop/geckodriver.exe");
	//	driver = new FirefoxDriver();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 DesiredCapabilities caps = DesiredCapabilities.chrome();
		    caps.setCapability("platform", "Windows 10");
		    caps.setCapability("version", "59.0");
		
		    driver =  new RemoteWebDriver(new URL(URL), caps);
		    
		    
		driver.get(myURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^I close the default browser$")
	public static void after() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
