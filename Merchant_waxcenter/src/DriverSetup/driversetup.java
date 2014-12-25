package DriverSetup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import Loginpage_verification.LoginTest;
import WaitConditaion.syz_wait_con;



public class driversetup {
	static WebDriver driver;
	public static WebDriver getDriver() throws IOException
    {
	    return driver;
	}
	@Parameters({"Browsername","TestURL" })
	@BeforeSuite
	public  void getBrowser(String Browsername,String TestURL)
	{
		if(Browsername.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.get(TestURL);
			driver.manage().window().maximize();
			
		}
		else  if(Browsername.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
			driver.get(TestURL);
			
		}
						
		}
	@AfterSuite
	  public void endTestSuite() throws IOException
	    {
		LoginTest.Logout.click();
		syz_wait_con.waitforpagetobeload(LoginTest.submitbutton);
		    driver.quit();
		}
	
	

}
