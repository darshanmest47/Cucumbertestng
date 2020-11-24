package org.com.pages;

import java.io.IOException;

import org.com.base.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage extends Testbase {
	
	
	public Loginpage() throws IOException {
	
		PageFactory.initElements(driver, this);
	}


	Myaccpage mpage;



	@FindBy(xpath="//a[@title='My Account']")
	WebElement acc;
	
	@FindBy(xpath="//span[text()='Currency']")
	WebElement currency;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu-right')]/li/a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu-right')]/li/a[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	
	Actions act = new Actions(driver);
	WebDriverWait wt=new WebDriverWait(driver,20);
	
	Registerpage rp;
	Login lp;
	
	public boolean currencyDisp() {
		return currency.isDisplayed();
	}
	
	public String getTitlePage() {
		return driver.getTitle();
	}
	
	public void hoverAccount() {
//		act.moveToElement(acc).click().build().perform();
		acc.click();
		
		
	}
	
	public Registerpage clickRegister() throws IOException {
		wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[contains(@class,'dropdown-menu-right')]/li/a[text()='Register']")));
		register.click();
		rp=new Registerpage();
		return rp;
	}
	
	public void clickLogin() {
		wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[contains(@class,'dropdown-menu-right')]/li/a[text()='Login']")));
		login.click();
	}
	
	public void enterEmail(String email1) {
		email.sendKeys(email1);
		
	}
	
	public void enterPassword(String pwd1) {
		pwd.sendKeys(pwd1);
	}
	
	public Myaccpage clickSubmit() throws IOException {
		submit.click();
		mpage=new Myaccpage();
		return mpage;
	}
	
	

}
