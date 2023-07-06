package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

public class AddToCartTestCase extends BaseClass
{
  @Test(priority=1)
  public void verifyOpenCartPage()
  {
	  ap.openCartPage();
  }
  
  @Test(priority=2,enabled=false)
  public void verifyProductRemove()
  {
	  ap.doRemove();
  }
  
  
  @Test(priority=3,enabled=false)
  public void verifyContinueShopping()
  {
	  ap.doContinueShopping();
  }
  
  
  @Test(priority=4)
  public void verifyCheckOut()
  {
	  ap.doCheckout();
  }
}
