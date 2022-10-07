package com.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public static void isElementenabled(WebElement element,String value) {
		
		 boolean value1=element.isEnabled();
		 if(value1==true) {
			 element.sendKeys(value);
		 }
	}
   // SendKeys genric method
	public static void custom_SendKeys(WebElement element,String value,String fieldname) {
		try {
		     element.sendKeys(value);
		     test.log(Status.PASS, value+"== succefully send=="+fieldname);
		}catch(Exception e) {
			 test.log(Status.FAIL, e.getMessage());
		}
	}
	
	// click method
	
	public static void custom_click(WebElement element,String fieldname) {
		try {
		    element.click();
		    test.log(Status.PASS, "Clicked succefully=="+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
	}
	
	// Scroll -Element
	
	public static void Scroll_toElement(WebDriver driver,WebElement element) {
		try {
		    JavascriptExecutor js=(JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView()", element);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// DropDown 
	
	public static void Handle_DropDown(WebElement element,String value) {
		try {
		   Select select=new Select(element);
		   select.selectByVisibleText(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	// Mouse Hover +click
	
	public static void MouseHover_Click_OnElement(WebDriver driver,WebElement element) {
		try {
		   Actions act=new Actions(driver);
		   act.moveToElement(element).click().build().perform();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
}
