package com.osa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
	WebDriver dr;
	public AboutPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath="/html/body/nav/div/div/ul/li[2]/a") 
	WebElement aboutButton;


	//All the functions for HomePage will be here
	public void clickOnAboutButton() {
		aboutButton.click();
	}
}
