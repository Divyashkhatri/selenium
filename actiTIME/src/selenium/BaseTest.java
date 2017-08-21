package selenium;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class BaseTest {
	@BeforeSuite
	public void start()
	{
		Reporter.log("Start",true);
	}
	@AfterSuite
	public void stop()
	{
		Reporter.log("end",true);
	}
	@BeforeTest
	public void connectDB()
	{
		Reporter.log("connectDB",true);
	}
	@AfterTest
	public void disconnect()
	{
		Reporter.log("DisconnectDB",true);
	}
	@BeforeClass
	public void OpenApp()
	{
		Reporter.log("open app",true);
	}
	@AfterClass
	public void CloseApp()
	{
		Reporter.log("Close App",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout",true);
	}
}
	
