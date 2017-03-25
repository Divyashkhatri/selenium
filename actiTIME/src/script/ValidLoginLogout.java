package script;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest {
	@Test
	public void testValidLoginLogout(){
		String un=Excel.getCellValue(INPUT_PATH,"ValidLoginLogout", 1, 0);
		String pw=Excel.getCellValue(INPUT_PATH,"ValidLoginLogout", 1, 1);
		String HomeTitle=Excel.getCellValue(INPUT_PATH,"ValidLoginLogout", 1, 2);
		String LoginTitle=Excel.getCellValue(INPUT_PATH,"ValidLoginLogout", 1, 3);
		//Enter Valid Username
	LoginPage l=new LoginPage(driver);
	l.setUsername(un);
	//Enter Valid password
	l.setPassword(pw);
	//click on login Button
	l.clickLogin();
	//Verify Enter Time Track Page is displayed
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.verifyTitle(HomeTitle);
	//click on logout link
	e.clickLogout();
	//verify Login Page is displayed
	l.verifyTitle(LoginTitle);
	}
}
