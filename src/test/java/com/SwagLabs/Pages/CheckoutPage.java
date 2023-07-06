package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utility.Utility;

public class CheckoutPage
{
	
	WebDriver driver;

	//initialization driver
	public CheckoutPage(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	//locators
	private By username=By.id("first-name");
	private By lastname=By.name("lastName");
	private By zipcode=By.id("postal-code");
	private By cancelbtn=By.id("cancel");
	private By continuebtn=By.id("continue");
	
	
	
	//Actions
	
	public void doCancel()
	{
		driver.findElement(cancelbtn).click();
		
	}
	
	
	public void doContinue(String fname,String lname,String zcode)
	{
	driver.findElement(username).sendKeys(fname);
	driver.findElement(lastname).sendKeys(lname);
	driver.findElement(zipcode).sendKeys(zcode);
	Utility.screenShot(driver);
	driver.findElement(continuebtn).click();
	}
	

}
