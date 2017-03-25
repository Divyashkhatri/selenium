package script;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;
public class VerifyProductVersion extends BaseTest{
	@Test
	public void testVerifyProductVerion(){
	
		String un=Excel.getCellValue(INPUT_PATH,"ValidLoginLogout", 1, 0);
		String pw=Excel.getCellValue(INPUT_PATH,"ValidLoginLogout", 1, 1);
		String productVersion=Excel.getCellValue(INPUT_PATH,"ValidLoginLogout", 1, 2);
	LoginPage l=new LoginPage(driver);
	l.setUsername(un);
	l.setPassword(pw);
	l.clickLogin();
	EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
	e.clickHelp();
	e.clickAboutActiTime();
	e.verifyProductVersion(productVersion);
	e.clickCloseButton();
	e.clickLogout();
	}
}
