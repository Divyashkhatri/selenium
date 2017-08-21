package Harshasirprograms;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DownloadFile {

	private WebDriver driver;

	private static String downloadPath = "C:\\Users\\rex\\Downloads\\";
	private String URL="http://www.seleniumhq.org/download/"; 

	private boolean isFileDownloaded_Ext(String dirPath, String ext){
		boolean flag=false;
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			flag = false;
		}

		for (int i = 1; i < files.length; i++) {
			if(files[i].getName().contains(ext)) {
				flag=true;
			}
		}
		return flag;
	}

	public boolean isFileDownloaded(String downloadPath, String fileName) {
		boolean flag = false;
		File dir = new File(downloadPath);
		File[] dir_contents = dir.listFiles();

		for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().equals(fileName))
				return flag=true;
		}

		return flag;
	}
	/* Get the latest file from a specific directory*/
	private File getLatestFilefromDir(String dirPath){
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}

		File lastModifiedFile = files[0];
		for (int i = 1; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;
	}
	public static FirefoxProfile firefoxProfile() throws Exception {

		FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setPreference("browser.download.folderList",2);
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting",false);
		firefoxProfile.setPreference("browser.download.dir",downloadPath);
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");

		return firefoxProfile;
	}
	@BeforeClass
	public void testSetup()
	{	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//			driver = new FirefoxDriver(firefoxProfile());	
//					driver.manage().window().maximize();
		driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.xpath("(//h3[.='Selenium Standalone Server']/../p)[3]/a")).click();
	}

	@Test
	public void example_VerifyDownloadWithFileName() throws InterruptedException  
	{
		Thread.sleep(1000l);
		Assert.assertTrue(isFileDownloaded(downloadPath, "mailmerge.xls"), "Failed to download Expected document");
	
	}

	@Test
	public void example_VerifyDownloadWithFileExtension() throws InterruptedException  
	{
		Thread.sleep(1000l);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".xls"), "Failed to download document which has extension .xls");       
	}

	@Test
	public void example_VerifyExpectedFileName() throws InterruptedException 
	{
		
		File getLatestFile = getLatestFilefromDir(downloadPath);
		String fileName = getLatestFile.getName();
		Reporter.log(fileName,true);
		Thread.sleep(1000l);
		Assert.assertTrue(fileName.equals("mailmerge.xls"), "Downloaded file name is not matching with expected file name");
	}

	@AfterClass
	public void tearDown() 
	{
//		driver.quit();
	}

}

