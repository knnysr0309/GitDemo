package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	//Tidy gherkin chrome app ini kullanarak featureyi oraya yapistirabiliriz ve copy paste buraya.

    @Given("^user is on NetBank landing page$")
    public void user_is_on_netbank_landing_page() throws Throwable {
    	System.out.println("Navigated to login URL");
     
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("Logged succesfully");
    }

    @Then("^home page is populated $")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Validated homa page");
    }
    
    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
    
    @And("^cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
       System.out.println(strArg1);
    }

}