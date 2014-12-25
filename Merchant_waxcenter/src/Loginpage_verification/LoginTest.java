package Loginpage_verification;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import WaitConditaion.syz_wait_con;
import DriverSetup.driversetup;

public class LoginTest {
	WebDriver driver;
	
	@FindBy(how = How.ID, using = "email")
	 static WebElement user_email;
	@FindBy(how = How.ID, using = "password")
	 static WebElement user_password;
	@FindBy(how = How.XPATH, using = "html/body/table[3]/tbody/tr/td/form/table/tbody/tr[1]/td[1]/table/tbody/tr[4]/td[2]/input")
	public
	 static WebElement submitbutton;
	@FindBy(how = How.XPATH, using = "html/body/div[2]")
	 static WebElement Hometext;
	@FindBy(how = How.XPATH, using = "html/body/h1")
	 static WebElement Home;
	@FindBy(how = How.XPATH, using = "html/body/table[14]/tbody/tr/td[15]/a")
	public
	 static WebElement Logout;
	@Test(description="Checking the invalid input")
	public void loginWithInValidUser() throws IOException
	{
		driver= driversetup.getDriver();
		PageFactory.initElements(driver, LoginTest.class);    
		syz_wait_con.waitforpagetobeload(user_email);
		user_email.sendKeys("sameer.shaikh@clariontechnologies.co.in");
		syz_wait_con.waitforpagetobeload(user_password);
		user_password.clear();
		submitbutton.click();
		syz_wait_con.waitforpagetobeload(Hometext);
		String lo=Hometext.getText();
		if(lo.equalsIgnoreCase("Please enter your password."))
		{
		Reporter.log("Invalid functionality working correctly");
		}
		else 
		{
			Reporter.log("Some thing went wrong ....");
		}
		
		
		
		
	}	
	@Test(description="Checking the valid input")
	public void loginWithValidUser() throws IOException
	{
		driver= driversetup.getDriver();
		PageFactory.initElements(driver, LoginTest.class); 
		syz_wait_con.waitforpagetobeload(user_email);
		user_email.clear();
		user_email.sendKeys("sameer.shaikh@clariontechnologies.co.in");
		syz_wait_con.waitforpagetobeload(user_password);
		user_password.sendKeys("Password1");
		submitbutton.click();
		syz_wait_con.waitforpagetobeload(Hometext);
		String lo=Home.getText();
		if(lo.equalsIgnoreCase("Home"))
		{
		Reporter.log("valid functionality working correctly");
		}
		else 
		{
			Reporter.log("Some thing went wrong ....");
		}
		
		
	}
	

}
