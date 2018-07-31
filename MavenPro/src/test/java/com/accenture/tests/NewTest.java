package com.accenture.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("www.google.com");
  }
  
  @BeforeTest
  public void beforeTest() throws MalformedURLException{
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setBrowserName("chrome");
	  //ds.setPlatform("windows");
	  
	  driver = new RemoteWebDriver(new URL("http://www.google.com:4343/wd/hub"), ds);
	  
  }
}
