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

public class VHV_Library_SEO_Download {
	static WebDriver driver;
	@FindBy(how = How.XPATH, using = "html/body/table[14]/tbody/tr/td[4]/a")
	public static WebElement contents3;
	@FindBy(how = How.XPATH, using = "html/body/h1")
	public static WebElement seo_lib;
	@Test
	public static void Vision_and_History_SEO_test() throws IOException, InterruptedException
	{
		java.lang.Runtime.getRuntime().exec("D:\\cancel.exe");
		Thread.sleep(500);
		driver= driversetup.getDriver();
		PageFactory.initElements(driver, VHV_Library_SEO_Download.class); 
		syz_wait_con.waitforpagetobeload(contents3);
		Thread.sleep(500);
		DropDrown.getValue("html/body/table[14]/tbody/tr/td[4]/a", " //td/a[text()='VHV Library SEO Download']");
		Thread.sleep(500);
				
			Reporter.log("Download pop open correctly");
		
	}


}
