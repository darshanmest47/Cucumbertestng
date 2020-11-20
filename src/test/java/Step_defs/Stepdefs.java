package Step_defs;

import java.io.IOException;

import org.com.base.Testbase;
import org.com.pages.Confirmpage;
import org.com.pages.Loginpage;
import org.com.pages.Myaccpage;
import org.com.pages.Registerpage;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Stepdefs extends Testbase {

	 public Stepdefs() throws IOException {
		super();
		
	}
	 Loginpage lp;
	 Registerpage rp;
	 Confirmpage cp;
	 Myaccpage myacc;
	 
// 	 @After
//	 public void closeEverything() throws InterruptedException {
//		
// 		 teardown();
// 	 }
	 
	 @After("@smoke")
	 public void closeSmoke(){
		 System.out.println("Smoke test complete");
	 }
	 
	 @Before("@integration")
	 public void accPage() {
		 initialize();
		 
	 }
	 
	 

	@Given("^User is already on the Ninja Page$")
	    public void user_is_already_on_the_ninja_page() throws IOException  {
		initialize();
		lp= new Loginpage();
		String ti = lp.getTitlePage();
		System.out.println(ti);
		System.out.println(prop.getProperty("YOUR_STORE") );
		Assert.assertEquals(ti,prop.getProperty("YOUR_STORE") );
	        
	    }

	    @Then("^User is on the Account confirmation page$")
	    public void user_is_on_the_account_confirmation_page()  {
	      String cnftitle = cp.getTitleconf();
	      System.out.println(cnftitle);
	      System.out.println(prop.getProperty("ACCOUNT_CONF"));
	      Assert.assertEquals(cnftitle,prop.getProperty("ACCOUNT_CONF") );
	    }

	    @When("^User hovers over the Account and clicks on it$")
	    public void user_hovers_over_the_account_and_clicks_on_it()  {
	    	lp.hoverAccount();
	    
	    }

	    @When("^User clicks on Register button user must be on Registration page$")
	    public void user_clicks_on_register_button_user_must_be_on_registration_page() throws IOException, InterruptedException  {
	    	Thread.sleep(10000);
	    	
	    	rp=lp.clickRegister();
	    	String regtitle = rp.getTitleReg();
	    	System.out.println(regtitle);
	    	System.out.println(prop.getProperty("REGISTER"));
	    	Assert.assertEquals(regtitle, prop.getProperty("REGISTER"));
	    	
	          
	    }

	    @Then("^User must be able to see the correct page title$")
	    public void user_must_be_able_to_see_the_correct_page_title()  {
	        System.out.println("User is able to see correct title");
	    }

	    @Then("^User must be able to able to click on Register button$")
	    public void user_must_be_able_to_able_to_click_on_register_button()  {
	    	System.out.println("User is able to click on register");
	    	
	        
	    }

	    @Then("^User Enters the values \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enters_the_values_something_and_something_and_something_and_something_and_something_and_something(String fname, String lname, String email, String phone, String password, String cnfpass) throws Throwable {
	    	Thread.sleep(5000);
	    	rp.entervalues(fname, lname, email, phone, password, cnfpass);
	    }

	    @Then("^User verifies the title of the page$")
	    public void user_verifies_the_title_of_the_page()  {
	    	System.out.println("Title verified and user is already on confirmation page");
	    
	    }

	    @Then("^User clicks on continue button$")
	    public void user_clicks_on_continue_button() throws IOException, InterruptedException  {
	    	myacc=cp.clickCont();
	    	
	      
	    }

	    @And("^User accepts the terms$")
	    public void user_accepts_the_terms() throws InterruptedException  {
	    	Thread.sleep(5000);
	    	rp.checkAgree();
	       
	    }

	    @And("^Clicks on Continue Button$")
	    public void clicks_on_continue_button() throws InterruptedException, IOException  {
	    
	    	cp= rp.clickCont();
	    	
	    
	     
	    }

	    @And("^User verifies success text$")
	    public void user_verifies_success_text() throws InterruptedException  {
	    	Thread.sleep(5000);
	    	Assert.assertTrue(cp.dispMsg());
	       
	    }
}
