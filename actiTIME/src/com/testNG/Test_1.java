package com.testNG;

import org.testng.annotations.*;

public class Test_1 {

	@Test
	public void testLogin() {
		System.out.println("testing login screen");
	}
	
	@Test
	public void testformfill(){
		System.out.println("Testing registration form");
	}
	
	@BeforeMethod
	public void openBrowser(){
		
		System.out.println("Opening browser");
	 }
	
	@AfterMethod
	public void closeBrowser(){
		
		System.out.println("closing browser");
	 }
	
	@BeforeTest
	public void opendbConnection() {
		System.out.println("create dbConnection");
	 }
	
	@AfterTest
	public void closedbConnection(){
		System.out.println("closing db connection");
	 }
	
	@BeforeSuite
	public void runSeleniumServer(){
		System.out.println("starting selenium server");
		
	 }
	
	@AfterSuite
	public void stopSeleniumServer(){
		System.out.println("stopping selenium server");
	 }
}
