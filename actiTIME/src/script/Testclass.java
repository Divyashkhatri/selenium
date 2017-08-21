package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class Testclass extends BaseTest {
	@Test
	void openapp(){
		Reporter.log("hello",true);
	}
}
