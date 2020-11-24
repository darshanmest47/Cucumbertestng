package org.com.pages;

import java.io.IOException;

import org.com.base.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends Testbase {

	
	Myaccpage myaccpg;
	Loginpage lpage;
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement acc;
	
	@FindBy(xpath="//li/a[text()='Login']")
	WebElement login;
	
	
	
	
	public Login() throws IOException {
	
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickAccount() throws IOException {
	
		acc.click();
		
		
	}
	
	public Loginpage clickLogin() throws IOException {
		WebDriverWait wt = new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li/a[text()='Login']")));
		login.click();
		lpage=new Loginpage();
		return lpage;
//		myaccpg =new Myaccpage();
//		
//		return myaccpg;
	}
	
	public String getTit() {
		return driver.getTitle();
	}

}
