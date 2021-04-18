package ShopingSite.frameworkPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

/**
 * Hello world!
 *
 */
public class ScreenShot
{
	public static void getScreenshot(WebDriver driver, String targetpath) throws IOException
	{
		TakesScreenshot TS = (TakesScreenshot)driver;
		File source = TS.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File(targetpath));
	}

	public static String getDateTimeStamp() {
		System.out.println("before timestamp method");
		Date oDate;
		String[] sDatePart;
		String sDateStamp;
		oDate = new Date();
		System.out.println(oDate.toString());
		sDatePart = oDate.toString().split(" ");
		sDateStamp = sDatePart[5] + "_" + 
				sDatePart[1]+ "_"+
				sDatePart[2]+"_"+
				sDatePart[3];
		sDateStamp = sDateStamp.replace(":","_");
		System.out.println(sDateStamp);
		System.out.println("after timestamp method");
		return sDateStamp; 
	}

}
