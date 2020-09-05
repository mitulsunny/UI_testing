package com.osa.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

	public static void verifyString(String expected, String actual) {
		if(expected.equals(actual)) {
			System.out.println("The actual and expected are matched");
		}else {
			System.out.println("The actual and expected did not match");
			System.out.println("The expected value is: "+expected);
			System.out.println("But the actual value is: "+actual);
		
		    Assert.assertEquals(expected, actual);
		}
	}



}
