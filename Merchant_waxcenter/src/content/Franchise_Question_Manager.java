package content;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import WaitConditaion.syz_wait_con;
import actionClass.DropDrown;

import DriverSetup.driversetup;

public class Franchise_Question_Manager {
		static WebDriver driver;
		@FindBy(how = How.XPATH, using = "html/body/table[14]/tbody/tr/td[2]/a")
		public static WebElement contents;
		@FindBy(how = How.XPATH, using = "html/body/h1")
		public static WebElement fran;
		@Test
		public static void Franchise_Question_Manager_test() throws IOException, InterruptedException
		{
			driver= driversetup.getDriver();
			PageFactory.initElements(driver, Franchise_Question_Manager.class); 
			syz_wait_con.waitforpagetobeload(contents);
			Thread.sleep(500);
			DropDrown.getValue("html/body/table[14]/tbody/tr/td[2]/a", " //td/a[text()='Franchise Question Manager']");
			Thread.sleep(500);
			System.out.println(fran.getText());
			if(fran.getText().equalsIgnoreCase("Franchise Question Manager"))
			{
				Reporter.log("Franchise Question Manager= land on correct page..");
			}
			else
			{
				Reporter.log("Franchise Question Manager = OOP something went wrong...");
			}
		}
}
