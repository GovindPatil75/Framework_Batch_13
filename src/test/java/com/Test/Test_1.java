package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_1 extends BaseClass{
	
	
	@Test
	public void verify_test1() {
		
		// WebElement 
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		// Test Case Steps 
		
		Library.custom_SendKeys(login.getTxt_email(), excel.getStringData("Sheet1", 0, 0),"Email Id");
		Library.custom_SendKeys(login.getTxt_password(), excel.getStringData("Sheet1", 0, 1),"Password");
		Library.custom_click(login.getBtn_login(),"Login Button");
		
		// to handle drop down
//		Library.Handle_DropDown(null, null);
//		Library.MouseHover_Click_OnElement(driver, null);
//		Library.Scroll_toElement(driver, null);
		
		// verify
		String ExpectedTitle ="FaceBook";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle);
		
	}

}
