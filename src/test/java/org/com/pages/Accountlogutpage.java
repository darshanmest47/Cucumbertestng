package org.com.pages;

import java.io.IOException;

import org.com.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountlogutpage extends Testbase {

	public Accountlogutpage() throws IOException {
	PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//h1[text()='Account Logout']")
	WebElement logouttxt;
	
	
	public boolean dispLogoutText() {
		return logouttxt.isDisplayed();
	}
	
	public String logoutTitle() {
		return driver.getTitle();
	}
}
