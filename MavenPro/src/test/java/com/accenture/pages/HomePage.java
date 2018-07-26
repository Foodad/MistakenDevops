package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

WebDriver driver;

	@FindBy(linkText="Register")
	WebElement LinkReg;
	
	
	public void clickRegistration(){
		LinkReg.click();
	}
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
}
