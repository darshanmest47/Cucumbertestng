package org.com.pages;

import java.io.IOException;

import org.com.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage extends Testbase{
	
	
	public Registerpage() throws IOException {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//legend[text()='Your Personal Details']")
	WebElement personal;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement fname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='confirm']")
	WebElement confirm;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement agree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement contbutt;
	
	
	Confirmpage cnf;
	
	public String getTitleReg() {
		return driver.getTitle();
	}
	
	public boolean persondisp() {
		return personal.isDisplayed();
	}
	
	public void entervalues(String user,String laname,String eadd,String ph,String passwd,String cnf) {
		fname.sendKeys(user);
		lname.sendKeys(laname);
		email.sendKeys(eadd);
	    phone.sendKeys(ph);
	    password.sendKeys(passwd);
	    confirm.sendKeys(cnf);
		
	}
	
	public void checkAgree() {
		agree.click();
	}
	
	public Confirmpage clickCont() throws IOException {
		contbutt.click();
		cnf = new Confirmpage();
		return cnf;
	}
	
	

}
