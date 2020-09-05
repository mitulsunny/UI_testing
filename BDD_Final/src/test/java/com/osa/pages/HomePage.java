package com.osa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver dr;
public HomePage(WebDriver dr) {
	this.dr=dr;
	PageFactory.initElements(dr, this);
}
@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[1]/a") 
WebElement homeButton;


//All the functions for HomePage will be here
public void clickOnHomeButton() {
	homeButton.click();
}

}
