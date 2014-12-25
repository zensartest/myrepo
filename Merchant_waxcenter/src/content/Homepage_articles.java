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

public class Homepage_articles {
	static WebDriver driver;
	@FindBy(how = How.XPATH, using = "html/body/table[14]/tbody/tr/td[2]/a")
	public static WebElement contents;
	@FindBy(how = How.XPATH, using = "html/body/h1")
	public static WebElement fran;
	@Test
	public static void Homepage_articles_test() throws IOException, InterruptedException
	{
		driver= driversetup.getDriver();
		PageFactory.initElements(driver, Homepage_articles.class); 
		syz_wait_con.waitforpagetobeload(contents);
		Thread.sleep(500);
		DropDrown.getValue("html/body/table[14]/tbody/tr/td[2]/a", " //td/a[text()='Homepage Articles']");
		Thread.sleep(500);
		System.out.println(fran.getText());
		if(fran.getText().equalsIgnoreCase("Homepage Articles"))
		{
			Reporter.log("Homepage Articles= land on correct page..");
		}
		else
		{
			Reporter.log("Homepage Articles= OOP something went wrong...");
		}
	}
}
