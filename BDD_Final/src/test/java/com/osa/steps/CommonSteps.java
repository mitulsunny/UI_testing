package com.osa.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.osa.base.Browser;
import com.osa.utilities.Utility;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonSteps {
	WebDriver dr;
	@Given("^I want to navigate to My OSA home Page$")
	public void i_want_to_navigate_to_My_OSA_home_Page() throws Throwable {
         dr=Browser.opentBrowser();
         dr.get("https://www.td.com/us/en/personal-banking/mortgage/");
	}
	@Given("^I want to click on \"([^\"]*)\"$")
	public void i_want_to_click_on(String arg1, DataTable myData) throws Throwable {
		List<List<String>> data=myData.raw();
		CommonSteps.getElement(dr, data.get(0).get(0), data.get(0).get(1)).click();
       System.out.println("Changing to Iframe");
		dr.switchTo().frame(dr.findElement(By.xpath("//*[@id=\"iframe13\"]")));
		Thread.sleep(8000);
		 System.out.println("Now we are on Iframe");
		dr.findElements(By.xpath("/html/body/app-root/section/app-loan-form/div[1]/form/div/div[1]/div[2]/div/div/input")).get(0).sendKeys("45656");
		System.out.println("We entered value for purchase Price");
	    Select select=new Select(dr.findElement(By.xpath("//select[@class=\"ng-pristine ng-valid ng-touched\"]")));
		select.deselectByVisibleText("Refinance");
	}
	@Given("^I enter the \"([^\"]*)\"$")
	public void i_enter_the(String arg1, DataTable myData) throws Throwable {
		List<List<String>> data=myData.raw();
		CommonSteps.getElement(dr, data.get(0).get(0), data.get(0).get(1)).sendKeys(data.get(0).get(2));
	}
	
	@Then("^I verify the \"([^\"]*)\"$")
	public void i_verify_the(String arg1, DataTable myData) throws Throwable {
		List<List<String>> data=myData.raw();
		String expectedValue=data.get(0).get(0);
		String actualValue=dr.getTitle();
		Utility.verifyString(expectedValue, actualValue);
	}
	
	@And("^I want close the browser$")
	public void i_want_close_the_browser() {
		dr.close();
	}
	
	public static WebElement getElement(WebDriver dr,String locatorType, String locatorValue) {
		By by=null;
		if(locatorType.equals("xpath")) {
	      by=By.xpath(locatorValue);
		}else if(locatorType.equals("id")) {
			by=By.id(locatorValue);
		}else if(locatorType.equals("name")) {
			by=By.name(locatorValue);
		}
		
		return dr.findElement(by);
	}
	
}
