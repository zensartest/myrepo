package content;
import actionClass.*;
import WaitConditaion.syz_wait_con;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import DriverSetup.driversetup;


public class Franchise_Interest_Submissions {
	static WebDriver driver;
	@FindBy(how = How.XPATH, using = "html/body/table[14]/tbody/tr/td[2]/a")
	public static WebElement contents;
	@FindBy(how = How.XPATH, using = "html/body/div[2]")
	public static WebElement fran;
	@Test
	public static void Franchise() throws IOException, InterruptedException
	{
		driver= driversetup.getDriver();
		PageFactory.initElements(driver, Franchise_Interest_Submissions.class); 
		syz_wait_con.waitforpagetobeload(contents);
		Thread.sleep(500);
		DropDrown.getValue("html/body/table[14]/tbody/tr/td[2]/a", " //td/a[text()='Franchise Interest Submissions']");
		Thread.sleep(500);
		System.out.println(fran.getText());
		if(fran.getText().equalsIgnoreCase("HomeFranchise Interest Items"))
		{
			Reporter.log("Franchise Interest Submissions= land on correct page..");
		}
		else
		{
			Reporter.log("Franchise Interest Submissions= OOP something went wrong...");
		}
	}
}
