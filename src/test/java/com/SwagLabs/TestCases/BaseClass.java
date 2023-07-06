package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utility.PropertiesRead;
import com.SwagLabs.Utility.Utility;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public AddToCartPage ap;
	public CheckoutPage cp;
	public OverViewPage op;
	public PropertiesRead pr;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		pr=new PropertiesRead("ConfigSwagLabs.properties");
		
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		ap=new AddToCartPage(driver);
		cp=new CheckoutPage(driver);
		op=new OverViewPage(driver);
		
	}
	
	
	@BeforeClass
	public void pageSetUp()
	{
		//page pre-requisite
		System.out.println("************Login Process***************");
		lp.getAppTitle();
		lp.doLogin(pr.getData("uname"),pr.getData("pass"));
		Utility.screenShot(driver);
		pauseProcess();
		System.out.println("************Inventory Process***************");
		ip.getProductCount();
		ip.getProductName();
		Utility.screenShot(driver);
		pauseProcess();
		ip.addProductToCart(pr.getData("pname"));
		pauseProcess();
		System.out.println("************AddToCart Process***************");
		ap.openCartPage();
		Utility.screenShot(driver);
		pauseProcess();
		ap.doCheckout();
		Utility.screenShot(driver);
		pauseProcess();
		System.out.println("************CheckOut Process***************");
		cp.doContinue(pr.getData("fname"),pr.getData("lname"),pr.getData("zcode"));
		System.out.println("************Product Overview Process***************");

		
	}
	
	public static void pauseProcess()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

}
