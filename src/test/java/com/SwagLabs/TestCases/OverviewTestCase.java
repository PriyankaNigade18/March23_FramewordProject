package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OverviewTestCase extends BaseClass
{
  @Test(priority=1)
  public void verifySummary()
  {
	  op.getSummary();
  }
  
  @Test(priority=2,enabled=false)
  public void verifyCancel()
  {
	  op.doCancel();
  }
  
  
  @Test(priority=3)
  public void verifyFinish()
  {
	  op.doFinish();
  }
}
