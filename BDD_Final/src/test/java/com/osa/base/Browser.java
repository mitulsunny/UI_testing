package com.osa.base;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.osa.read.FileManager;


public class Browser {
public static void main(String[] args) {
	opentBrowser();
}
public static WebDriver opentBrowser() {
 Properties p=FileManager.readValue("src\\test\\resources\\properties\\config.properties");
	System.setProperty("webdriver.chrome.driver",p.getProperty("driver_path") );
	WebDriver dr=new ChromeDriver();
	return dr;
	
}
}
