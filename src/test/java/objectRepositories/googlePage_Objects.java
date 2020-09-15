package objectRepositories;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import supportLibraries.BaseClass;
import supportLibraries.Utility;

public class googlePage_Objects{
	
	public WebDriver driver;
	
	public googlePage_Objects(){
		
		driver=BaseClass.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void openBrowser() throws Exception{
		String url = Utility.getPropertiesFromConfig("ApplicationUrl");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Utility.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	@FindBy(xpath = "//input[@name='q']")
	private WebElement edtSearchLoct;
	
	@FindBy(xpath = "//div[@class='logoContainer']/a")
	private WebElement verify_Jpmclogo;
	
	@FindBy(xpath = "//*[contains(text(),'Home | JPMorgan')]")
	private WebElement lnk_Jpmorggan;
	
	By verifyPage = By.xpath("//div[@class='logoContainer']/a");
	
	/********This Method is used verify google page is launched 
	 * @return isResultDisplayed *****/
	public boolean googlePageValidation(){
		boolean isResultDisplayed = false;
		try{
			isResultDisplayed = edtSearchLoct.isDisplayed();
		}catch(NoSuchElementException e){
			System.out.println("Element is not displayed");
		}
 		return isResultDisplayed;
	}
	/********This Method is used to accept data to input in google search page *****/
	public void searchKeyword(String KeyWord) throws InterruptedException{
		edtSearchLoct.sendKeys(KeyWord);
		edtSearchLoct.sendKeys(Keys.ENTER);	
	}
	/********This Method is used to click the search result and verify the logo 
	 * @return is_LogoDisplay *****/
	public void clickOnLink() throws InterruptedException {
		lnk_Jpmorggan.click();
		WebDriverWait wait = new WebDriverWait(driver, Utility.PAGE_LOAD_TIMEOUT);
		wait.until(ExpectedConditions.presenceOfElementLocated(verifyPage));		
	}
	public String validateJPMCPage(){
		try{
			boolean	is_LogoDisplay = verify_Jpmclogo.isDisplayed();;
		}catch(NoSuchElementException e){
			System.out.println("Element is not displayed");
		}
		String strPageTitle = driver.getTitle();
 		return strPageTitle;
		
		
	}
}
