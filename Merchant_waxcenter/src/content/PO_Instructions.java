package content;

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

public class PO_Instructions {
	static WebDriver driver;
	@FindBy(how = How.XPATH, using = "html/body/table[14]/tbody/tr/td[2]/a")
	public static WebElement contents;
	@FindBy(how = How.XPATH, using ="html/body/div[2]")
	public static WebElement fran;
	@Test
	public static void PO_Instructions_test() throws IOException, InterruptedException
	{
		driver= driversetup.getDriver();
		PageFactory.initElements(driver, PO_Instructions.class); 
		syz_wait_con.waitforpagetobeload(contents);
		//Thread.sleep(500);
		DropDrown.getValue("html/body/table[14]/tbody/tr/td[2]/a", "//td/a[text()='PO Instructions']");
		Thread.sleep(8000);
		System.out.println(fran.getText());
		if(fran.getText().equalsIgnoreCase("HomePO Instructions"))
		{
			Reporter.log("PO Instructions= land on correct page..");
		}
		else
		{
			Reporter.log("PO Instructions= OOP something went wrong...");
		}
	}
}
