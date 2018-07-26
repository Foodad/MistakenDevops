package com.accenture.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
  @Test(priority=1)
  public void LoginValid() {
	  String ER = "Tested";
	  String AR = "Tested";
	  Assert.assertEquals(ER, AR);
  }
  
  @Test(priority=2, enabled=false)
  public void LoginInvalid() {
	  String ER = "Tested";
	  String AR = "Tested123";
	  Assert.assertEquals(ER, AR);
  }
}
