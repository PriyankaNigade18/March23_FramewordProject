package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.SwagLabs.Utility.Utility;

public class InventoryPage 
{
	WebDriver driver;
	
	//initialization driver
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	private By list=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	private By plist=By.xpath("//div[@class='inventory_list']//div//div[@class='inventory_item_name']");
	private By button=By.xpath("//button[text()='Add to cart']");
	//actions
	
	public void getProductCount()
	{
	int count=driver.findElements(list).size();
	if(count==6)
	{
		System.out.println("Total Product count is: "+count);
	}else
	{
		System.out.println("Product count is Wrong!");
	}
	}
	
	public void getProductName()
	{
		List<WebElement> product=driver.findElements(plist);
		
		for(WebElement i:product)
		{
			System.out.println(i.getText());
		}
		
		
		
	}
	
	
	public void addProductToCart(String pname)
	{
		
		List<WebElement> product=driver.findElements(plist);
		
		for(WebElement i:product)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
			
		}
		Utility.screenShot(driver);
		driver.findElement(button).click();
		Utility.screenShot(driver);
		
		
		
	}
	
	
	
}
