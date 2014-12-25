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

public class shopping_models {
	static WebDriver driver;
	@FindBy(how = How.XPATH, using = "html/body/table[14]/tbody/tr/td[3]/a")
	public static WebElement contents1;
	@FindBy(how = How.XPATH, using = "html/body/h1")
	public static WebElement set;
	@Test
	public static void shopping_models_test() throws IOException, InterruptedException
	{
		Thread.sleep(500);
		driver= driversetup.getDriver();
		PageFactory.initElements(driver, shopping_models.class); 
		syz_wait_con.waitforpagetobeload(contents1);
		Thread.sleep(500);
		DropDrown.getValue("html/body/table[14]/tbody/tr/td[3]/a", " //td/a[text()='Shipping Methods']");
		Thread.sleep(500);
		System.out.println(set.getText());
		if(set.getText().equalsIgnoreCase("UPS Shipping Methods"))
		{
			Reporter.log("UPS Shipping Methods= land on correct page..");
		}
		else
		{
			Reporter.log("UPS Shipping Methods= OOP something went wrong...");
		}
	}


}
