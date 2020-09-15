package supportLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BaseClass extends Utility{
	
	public static WebDriver driver;	
	public static String browser = getPropertiesFromConfig("Browser");
	public static WebDriver getDriver() {
		switch(browser){
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver() ;
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\IEDriver.exe");
			driver = new InternetExplorerDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver() ;
			break;
		}
		driver.manage().window().maximize();
		return driver;
	}
}