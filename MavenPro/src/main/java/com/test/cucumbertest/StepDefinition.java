package com.test.cucumbertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
//WebDriver driver;
	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\GitProject\\MavenPro\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");*/
	    System.out.println("Login page");
	}

	@When("^I give tomsmith and SuperSecretPassword!$")
	public void i_give_tomsmith_and_SuperSecretPassword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("entering the credentials");
	}

	@Then("^I should be login$")
	public void i_should_be_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("successfully login");
	}

}
