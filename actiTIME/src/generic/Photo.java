package generic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public abstract class Photo implements AutoConst {
	public static void getScreenShot(WebDriver driver)
	{
		SimpleDateFormat f=new SimpleDateFormat("hh-mm-ss-d-MM-YYYY");
		String datetime = f.format(new Date());
		TakesScreenshot s=(TakesScreenshot)driver;
		File srcFile = s.getScreenshotAs(OutputType.FILE);
		File destFile=new File(AutoConst.FOLDER_PATH+datetime+".png");
		try
		{
			FileUtils.copyFile(srcFile,destFile);
		}
		catch(Exception e)
		{

		}		
	}
}
