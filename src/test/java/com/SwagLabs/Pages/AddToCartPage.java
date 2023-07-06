package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage 
{
	WebDriver driver;
	
	//initialize driver
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	private By cart=By.xpath("//a[@class='shopping_cart_link']");
	private By removeBtn=By.xpath("//button[text()='Remove']");
	private By cShopping=By.id("continue-shopping");
	private By checkoutbtn=By.id("checkout");
	
	
	//Actions
	
	public void openCartPage()
	{
		driver.findElement(cart).click();
	}
	
	
	public void doRemove()
	{
		
		driver.findElement(removeBtn).click();
	}
	
	public void doContinueShopping()
	{
		driver.findElement(cShopping).click();
	}
	
	public void doCheckout()
	{
		driver.findElement(checkoutbtn).click();
	}
	
}
