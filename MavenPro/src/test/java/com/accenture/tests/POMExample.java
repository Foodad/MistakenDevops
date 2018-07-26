package com.accenture.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.accenture.pages.HomePage;
import com.accenture.pages.Registration;
import com.accenture.utilities.ExcelUtility;


public class POMExample {

WebDriver driver;
HomePage h;
Registration r;
ExcelUtility e;

	@BeforeTest
	public void beforeTest(){
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "resources\\geckodriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		//capabilities.setBrowserName("firefox");
		//driver = new FirefoxDriver();
		
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		h = PageFactory.initElements(driver, HomePage.class);
		r = PageFactory.initElements(driver, Registration.class);
		
	}
	
	@Test
	public void POMExamples() throws IOException{
		h.clickRegistration();
		e = new ExcelUtility();
		e.getData();
		//r.Registrations();
	}
	
	

}
