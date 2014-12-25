package seo;

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

public class Brochure_Request_SEO {
	static WebDriver driver;
	@FindBy(how = How.XPATH, using = "html/body/table[14]/tbody/tr/td[4]/a")
	public static WebElement contents2;
	@FindBy(how = How.XPATH, using = "html/body/h1")
	public static WebElement seo;
	@Test
	public static void Brochure_Request_SEO_test() throws IOException, InterruptedException
	{
		Thread.sleep(500);
		driver= driversetup.getDriver();
		PageFactory.initElements(driver,Brochure_Request_SEO.class); 
		syz_wait_con.waitforpagetobeload(contents2);
		Thread.sleep(500);
		DropDrown.getValue("html/body/table[14]/tbody/tr/td[4]/a", " //td/a[text()='Brochure Request SEO']");
		Thread.sleep(500);
		System.out.println(seo.getText());
		if(seo.getText().equalsIgnoreCase("Edit Brochure Request SEO"))
		{
			Reporter.log("Edit Brochure Request SEO= land on correct page..");
		}
		else
		{
			Reporter.log("Edit Brochure Request SEO= OOP something went wrong...");
		}
	}

}
