package actionClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import DriverSetup.driversetup;

public class DropDrown {
	static WebDriver driver;
	
	public static void getValue(String xpath1,String xpathselection) throws IOException
	{
		driver= driversetup.getDriver();
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(xpath1));
		action.moveToElement(we);
		WebElement we1 = driver.findElement(By.xpath(xpathselection));
		action.moveToElement(we1);
		action.click();
		action.perform();
		
	}
	

}
