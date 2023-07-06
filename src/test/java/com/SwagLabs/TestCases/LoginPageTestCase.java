package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass
{
  @Test(priority=1)
  public void verifyTitle()
  {
	  lp.getAppTitle();
  }
  
  @Test(priority=2)
  public void verifyLogin()
  {
	  lp.doLogin("standard_user","secret_sauce");
  }
}
