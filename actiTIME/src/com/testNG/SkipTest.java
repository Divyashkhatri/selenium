package com.testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {


	@Test
	public void testCaptureScreen()
	{

		System.out.println("capturing screen test");
	}

	@Test
	public void testSkip()
	{	
		throw new SkipException("skip this test case");
	}
}
