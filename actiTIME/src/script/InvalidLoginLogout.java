package script;
import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

public class InvalidLoginLogout extends BaseTest{
	@Test
	public void testInvalidLoginLogout(){
		int rc = Excel.getRowCount(INPUT_PATH,"InvalidLoginLogout");
		Reporter.log(rc+" ",true);
		for(int i=1;i<=rc;i++){
			String un=Excel.getCellValue(INPUT_PATH,"InvalidLoginLogout", i, 0);
			String pw=Excel.getCellValue(INPUT_PATH,"InvalidLoginLogout", i, 1);
			LoginPage l=new LoginPage(driver);
			l.setUsername(un);
			l.setPassword(pw);
			l.clickLogin();
			l.verifyErrMsgIsPresent();
	}
	}
}
