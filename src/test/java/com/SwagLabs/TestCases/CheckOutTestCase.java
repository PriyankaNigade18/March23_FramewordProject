package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

public class CheckOutTestCase extends BaseClass 
{
  @Test(enabled=false)
  public void verifyCancel()
  {
	  cp.doCancel();
  }
  
  
  @Test(priority=1)
  public void verifyCheckout()
  {
	  cp.doContinue("Priyanka", "Nigade","411014");
  }
}
