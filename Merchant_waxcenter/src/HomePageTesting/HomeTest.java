package HomePageTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import DriverSetup.driversetup;


public class HomeTest {
	static WebDriver driver;
	@FindBy(how = How.XPATH, using = "html/body/h1")
	public static WebElement HomeVerify;
	
	@Test
	public static void HomeTesting() throws IOException
	{
		driver= driversetup.getDriver();
		PageFactory.initElements(driver, HomeTest.class); 
		if(HomeVerify.getText().equalsIgnoreCase("Home"))
		{
			Reporter.log("Correct Page Open this Homepage Test Case is pass");
		}
		else
		{
			Reporter.log("No Correct page is open means some thing went wrong...");
		}
	}
	
	

}
