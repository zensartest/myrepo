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


public class shipping_service {
    static WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "html/body/table[14]/tbody/tr/td[3]/a")
	public static WebElement contents1;
	@FindBy(how = How.XPATH, using = "html/body/h1")
	public static WebElement set;
	@Test
	public static void shipping_service_test() throws IOException, InterruptedException
	{
		Thread.sleep(500);
		driver= driversetup.getDriver();
		PageFactory.initElements(driver, shipping_service.class); 
		syz_wait_con.waitforpagetobeload(contents1);
		Thread.sleep(500);
		DropDrown.getValue("html/body/table[14]/tbody/tr/td[3]/a", " //td/a[text()='Shipping Settings']");
		Thread.sleep(500);
		System.out.println(set.getText());
		if(set.getText().equalsIgnoreCase("Shipping Services"))
		{
			Reporter.log("Shipping Services= land on correct page..");
		}
		else
		{
			Reporter.log("Shipping Services= OOP something went wrong...");
		}
	}

}
