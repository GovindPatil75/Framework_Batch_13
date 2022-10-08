package com.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTask {

	public static void main(String[] args) throws Exception {
		
		// Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// login
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='username']"));
		txt_email.sendKeys("qa.demo9@kalkani.in");
		
		WebElement txt_password=driver.findElement(By.xpath("//input[@name='password']"));
		txt_password.sendKeys("qademo@109");
		
		WebElement btn_login=driver.findElement(By.xpath("//button[text()='Sign in']"));
		btn_login.click();
		
		Thread.sleep(3000);

		WebElement setting=driver.findElement(By.xpath("//span[text()='Organization Settings ']"));
		setting.click();
	    WebElement btn_EditOrganization=driver.findElement(By.xpath("//button[text()='Edit organization']"));
	    btn_EditOrganization.click();
	    Thread.sleep(3000);

	    WebElement txt_supportemail=driver.findElement(By.xpath("//input[@name='Support email']"));
	    txt_supportemail.click();
	    txt_supportemail.sendKeys("support-me@domain.com");
	    
	    JavascriptExecutor js=(JavascriptExecutor) driver; 
	    WebElement btn_update=driver.findElement(By.xpath("//button[text()='Update']"));
	    js.executeScript("arguments[0].scrollIntoView()", btn_update);
		
	    btn_update.click();
	    
	    driver.close();
		
		
	}

}
