package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base  {

public WebDriver driver; //globally declare
	@BeforeMethod
	public void initializeBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/"); //to launch a site get method is used
		driver.manage().window().maximize(); //window maximize 
		
	}
@AfterMethod
	public void driverQuitandClose()
	{
		//driver.close();
		//driver.quit();
	}
	
	

}
