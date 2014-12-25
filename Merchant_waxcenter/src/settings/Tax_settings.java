package settings;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import DriverSetup.driversetup;
import WaitConditaion.syz_wait_con;
import actionClass.DropDrown;

public class Tax_settings {
	static WebDriver driver;
	@FindBy(how = How.XPATH, using = "html/body/table[14]/tbody/tr/td[3]/a")
	public static WebElement contents1;
	@FindBy(how = How.XPATH, using = "html/body/h1")
	public static WebElement set;
	@Test
	public static void Tax_settings_test() throws IOException, InterruptedException
	{
		Thread.sleep(500);
		driver= driversetup.getDriver();
		PageFactory.initElements(driver, Tax_settings.class); 
		syz_wait_con.waitforpagetobeload(contents1);
		Thread.sleep(500);
		DropDrown.getValue("html/body/table[14]/tbody/tr/td[3]/a", " //td/a[text()='Tax settings']");
		Thread.sleep(500);
		System.out.println(set.getText());
		if(set.getText().equalsIgnoreCase("Edit tax settings"))
		{
			Reporter.log("Tax settings= land on correct page..");
		}
		else
		{
			Reporter.log("Tax settings= OOP something went wrong...");
		}
	}



}
