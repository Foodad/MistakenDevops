package com.accenture.tests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoCookies {

WebDriver driver;

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
		}
	
	@Test
	public void cookies() {
	  driver.manage().deleteAllCookies();
	  Cookie c = new Cookie("Test", "Mycookies");
	  driver.manage().addCookie(c);
	  Set<Cookie> myset = driver.manage().getCookies();
	  
	  for(Cookie s : myset){
		  System.out.println(s.getName());
		  System.out.println(s.getPath());
		  System.out.println(s.getDomain());
	  }
  }
}
