package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_parameters {

	
	@Test(dataProvider="getData")
	public void testFormfill(String username, String password, Integer age){
		
		System.out.println(username + " - " + password + " - " + age );
		
	}
	
	@DataProvider
	public Object[][] getData(){		
		Object[][] data = new Object[4][3];
		
		data[0][0] = "mohan80ms@gmail.com";
		data[0][1] = "harhsa123";
		data[0][2] = 18;
		
		data[1][0] = "abhishek@gmail.com";
		data[1][1] = "teju@123";
		data[1][2] = 19;
		
		data[2][0] = "sohan80ms@gmail.com";
		data[2][1] = "harhsa123";
		data[2][2] = 18;
		
		data[3][0] = "kabhishek@gmail.com";
		data[3][1] = "teju@123";
		data[3][2] = 19;
		return data;
	}
}
