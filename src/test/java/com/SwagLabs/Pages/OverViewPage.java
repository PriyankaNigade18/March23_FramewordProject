package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utility.Utility;



public class OverViewPage
{
	WebDriver driver;
	
	public OverViewPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	//locator
	private By summary=By.xpath("//div[@id='checkout_summary_container']");
	private By cancelbtn=By.id("cancel");
	private By finishbtn=By.id("finish");
	private By msg=By.xpath("//h2[contains(text(),'Thank you')]");
	
	//Actions
	
	public void getSummary()
	{
		String text=driver.findElement(summary).getText();
		System.out.println(text);
		
	}
	
	
	public void doCancel()
	{
		driver.findElement(cancelbtn).click();
	}
	
	
	public void doFinish()
	{
		driver.findElement(finishbtn).click();
		Utility.screenShot(driver);
		System.out.println("********************************");
		System.out.println(driver.findElement(msg).getText());
		Utility.screenShot(driver);
	}
}
