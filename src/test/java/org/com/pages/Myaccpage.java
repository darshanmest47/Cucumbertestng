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

public class Myaccpage extends Testbase {

	public Myaccpage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Your Store']")
	WebElement yourstore;
	
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement acc;
	
	@FindBy(xpath="//ul/li/a[text()='Logout']")
	WebElement logout;
	
	Actions act = new Actions(driver);
	
	WebDriverWait wt;
	Accountlogutpage acclg ;
	
	
	public void clickMYACC() {
		act.moveToElement(acc).click().build().perform();
		
	}
	
	public Accountlogutpage clickLogout() throws IOException {
		wt = new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']")));
		logout.click();
		acclg = new Accountlogutpage();
		return acclg;
	}
	
	
	

}
