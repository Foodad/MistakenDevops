package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
	
WebDriver driver;

	@FindBy(id="gender-male")
	static WebElement ChkBox_Gender;

	@FindBy(id="FirstName")
	static WebElement edt_Firstname;	
	
	@FindBy(id="LastName")
	static WebElement edt_Lastname;
	
	@FindBy(id="Email")
	static WebElement edt_Email;
	
	@FindBy(id="Password")
	static WebElement edt_Passwd;
	
	@FindBy(id="ConfirmPassword")
	static WebElement edt_CnfPasswd;
	
	@FindBy(id="register-button")
	static WebElement Btn_Register;
		
	public static void Registrations(String FName, String LName, String Email, String Passwd, String CnfPasswd)
	{
		ChkBox_Gender.click();
		edt_Firstname.sendKeys(FName);
		edt_Lastname.sendKeys(LName);
		edt_Email.sendKeys(Email);
		edt_Passwd.sendKeys(Passwd);
		edt_CnfPasswd.sendKeys(CnfPasswd);
		Btn_Register.click();
	}
	
	public Registration(WebDriver driver){
		this.driver=driver;	
	}
}


