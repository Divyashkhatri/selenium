package selenium;
import java.util.Collections;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class dependsOnMethodAnnotation extends BaseTest {
	@Test(priority=0,invocationCount=2)//,dependsOnMethods="deletealluser")
	public void registeruser()
	{
		Reporter.log("Register user",true);
	}
	@Test(priority=1,dependsOnMethods="registeruser")
	public void deletealluser()
	{
		Reporter.log("Delete all users",true);
	}
	
	
	
}