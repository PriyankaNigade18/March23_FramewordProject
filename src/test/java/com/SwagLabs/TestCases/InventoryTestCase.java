package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InventoryTestCase extends BaseClass
{
	
	
  @Test(priority=1)
  public void verifyTotalProduct()
  {
	  ip.getProductCount();
  }
  
  
  @Test(priority=2)
  public void verifyProduct()
  {
	  ip.getProductName();
  }
  
  
  @Test(priority=3)
  public void ValidateAddToCart()
  {
	  ip.addProductToCart("Sauce Labs Fleece Jacket");
  }
}
