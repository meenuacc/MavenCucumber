package com.vktech.MavenCucumberPrototype;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver = new FirefoxDriver();
	
	@Given("^I navigate to the url$")
	public void i_navigate_to_the_url() throws Throwable {
	    driver.navigate().to("http://www.bbc.co.uk/");
	}

	@When("^I click on the \"([^\"]*)\"$")
	public void i_click_on_the(String link) throws Throwable {
		driver.findElement(By.linkText("Sport")).click();
	    
	}

	@Then("^I check I am on the confirmation page$")
	public void i_check_I_am_on_the_confirmation_page() throws Throwable {
	    Assert.assertTrue(driver.findElement(By.linkText("SPORT")).isDisplayed());
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    driver.quit();
	}


}
