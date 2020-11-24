package Step_defs;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.com.base.Testbase;
import org.com.pages.Accountlogutpage;
import org.com.pages.Login;
import org.com.pages.Loginpage;
import org.com.pages.Myaccpage;
import org.testng.Assert;

import com.test.utilities.Dataprovider;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Logindefs extends Testbase{
	Login lp;
	Logger lm ;
	Loginpage lp1;
	Dataprovider dp;
	Myaccpage myp;
	Accountlogutpage ap;
	
	
	public Logindefs() throws IOException {
		super();
		lm = LogManager.getLogger(Logindefs.class.getName());
		
	}
	
	@Before("@login")
	public void setUp() {
		initialize();
	}
	
	@Given("^User is already on Ninja page$")
	public void user_is_already_on_Ninja_page() throws IOException {
		lp=new Login();
		String title = lp.getTit();
		Assert.assertEquals(title, prop.getProperty("YOUR_STORE"));
		lm.info("User is on the login page");
	}

	@When("^User clicks on My account user is able to see Login button$")
	public void user_clicks_on_My_account_user_is_able_to_see_Login_button() throws IOException {
		lp.clickAccount();
        lm.info("User is able to see the Login button");
	}

	@When("^User clicks on the Login Button$")
	public void user_clicks_on_the_Login_Button() throws IOException {
	 lp1=lp.clickLogin();
	}

	@When("^User lands on the Login page$")
	public void user_lands_on_the_Login_page() {
		  String title1 = lp1.getTitlePage();
	        Assert.assertEquals(title1, prop.getProperty("ACCOUNT"));
	}

	@Then("^User enters the email address$")
	public void user_enters_the_email_address() throws InterruptedException {
		dp= new Dataprovider();
    	Object email = dp.dispDataProviderEmail();
    	lm.info(email);
    	String s1="";
    	Thread.sleep(3000);
    	lp1.enterEmail(s1+email);
    	Thread.sleep(3000);
	}

	@Then("^User enters the password$")
	public void user_enters_the_password() throws InterruptedException {
		Object pwd = dp.dispDataProviderPassword();
    	String s2="";
    	Thread.sleep(3000);
    	lm.info(pwd);
        lp1.enterPassword(s2+pwd);
        Thread.sleep(3000);
	}

	@Then("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws IOException {
	 myp= lp1.clickSubmit();
	  lm.info("clicked on login");
	}

	@Then("^User must be on the account page$")
	public void user_must_be_on_the_account_page() {
		 String titl = myp.getTitleacc(); 
		 lm.info(titl);
	      Assert.assertEquals(titl, prop.getProperty("MY_ACCOUNT"));
	      lm.info("user is on the account page");
	}
	
	@Then("^User clicks on account button$")
	public void user_clicks_on_account_button() throws InterruptedException {
		Thread.sleep(2000);
	   myp.clickMYACC();
	}

	@Then("^User clicks on the Logout button$")
	public void user_clicks_on_the_Logout_button() throws InterruptedException, IOException {
	Thread.sleep(2000);
	ap = myp.clickLogout();
	 
	}

	@Then("^User must be on the Logout page$")
	public void user_must_be_on_the_Logout_page() {
	 Assert.assertTrue(ap.dispLogoutText());
	 String title = ap.logoutTitle();
	 Assert.assertEquals(title, prop.getProperty("ACCOUNT_LOGOUT"));
	}
	

    
  

}
