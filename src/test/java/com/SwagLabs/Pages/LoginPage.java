package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.SwagLabs.Utility.Utility;

public class LoginPage 
{
	//Encapsulation= data+function
	WebDriver driver;
	
	//initialize driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//locator
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By loginbtn=By.id("login-button");
	
	
	public void getAppTitle()
	{
		String actTitle=driver.getTitle();
		
		Assert.assertTrue(actTitle.equals("Swag Labs"),"Title is not matching");
		System.out.println("Application title is: "+actTitle);
		
//		if(actTitle.equals("Swag Labs"))
//		{
//		System.out.println("Application title is: "+actTitle);
//		}else
//		{
//			System.out.println("Title is not matching");
//		}
	}
	
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		Utility.screenShot(driver);
		driver.findElement(loginbtn).click();
	}
	
	
	
	
	
	
	
	
	
	

}
