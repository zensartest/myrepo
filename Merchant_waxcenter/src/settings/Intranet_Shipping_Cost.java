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

public class Intranet_Shipping_Cost {
	static WebDriver driver;
	@FindBy(how = How.XPATH, using = "html/body/table[14]/tbody/tr/td[3]/a")
	public static WebElement contents1;
	@FindBy(how = How.XPATH, using = "html/body/h1")
	public static WebElement set;
	@Test
	public static void Intranet_Shipping_Cost_test() throws IOException, InterruptedException
	{
		Thread.sleep(500);
		driver= driversetup.getDriver();
		PageFactory.initElements(driver, Intranet_Shipping_Cost.class); 
		syz_wait_con.waitforpagetobeload(contents1);
		Thread.sleep(500);
		DropDrown.getValue("html/body/table[14]/tbody/tr/td[3]/a", " //td/a[text()='Intranet Shipping Cost']");
		Thread.sleep(500);
		System.out.println(set.getText());
		if(set.getText().equalsIgnoreCase("Edit Shipping Cost"))
		{
			Reporter.log("Edit Shipping Cost= land on correct page..");
		}
		else
		{
			Reporter.log("Edit Shipping Costs= OOP something went wrong...");
		}
	}



}
