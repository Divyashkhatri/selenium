package selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseTest {
	@Test(priority=2)
	public void TestB()
	{
		Reporter.log("Executeing B",true);
	}
}