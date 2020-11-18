package org.com.pages;

import java.io.IOException;

import org.com.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmpage extends Testbase {
	
	

	
	public Confirmpage() throws IOException {
		
	PageFactory.initElements(driver, this);
	    
	}





	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	WebElement msg;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement cont;

	
	Myaccpage myacc;
	
	public boolean dispMsg() {
		return msg.isDisplayed();
		
	}
	
	public String getTitleconf() {
		return driver.getTitle();
	}
	
	public Myaccpage clickCont() throws IOException {
		cont.click();
		
		 myacc = new Myaccpage();
		 return myacc;
	}
	
	
}


