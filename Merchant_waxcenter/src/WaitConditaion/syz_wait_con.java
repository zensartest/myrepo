package WaitConditaion;
import java.io.IOException;

import DriverSetup.driversetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syz_wait_con {
	static WebDriverWait sleep;
	static WebDriver driver;
	 public static void waitforpagetobeload(WebElement element) throws IOException
	 {
		 driver = driversetup.getDriver();
		 sleep = new WebDriverWait(driver, 1500);
		 sleep.until(ExpectedConditions.visibilityOf(element));
	 }

}
