package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Sample2SD {

    /*
    @Given("I am on login page of billing")
    public void i_am_on_login_page_of_billing() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I enter username and password on billing page")
    public void i_enter_username_and_password_on_billing_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I will click login button")
    public void i_will_click_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be on dashboard")
    public void i_should_be_on_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/


    @Given("^I am on login page of billing$")
    public void i_am_on_login_page_of_billing() throws Throwable {
        System.out.println("I am on login page of billing");
    }

    @When("^I enter username and password on billing page$")
    public void i_enter_username_and_password_on_billing_page() throws Throwable {
        System.out.println("I enter username and password on billing page");
    }

    @Then("^I should be on dashboard$")
    public void i_should_be_on_dashboard() throws Throwable {
        System.out.println("I should be on dashboard");
    }

    @And("^I will click login button$")
    public void i_will_click_login_button() throws Throwable {
        System.out.println("I will click login button");
    }

    @When("I enter invalid username and password on billing page")
    public void iEnterInvalidUsernameAndPasswordOnBillingPage() {

        System.out.println("I enter invalid username and password on billing page");
    }

    @Then("I should get error on login page")
    public void iShouldGetErrorOnLoginPage() {

        System.out.println("I should get error on login page");
    }

    @When("I enter blank username and password on billing page")
    public void iEnterBlankUsernameAndPasswordOnBillingPage() {

        System.out.println("I enter blank username and password on billing page");
    }

    @Then("I should get another error on login page")
    public void iShouldGetAnotherErrorOnLoginPage() {
        System.out.println("I should get another error on login page");
        Assert.assertEquals(true,false,"blank user test doesnt work");
    }



    @When("I enter {string} and {string} as username and password on billing page")
    public void iEnterAndAsUsernameAndPasswordOnBillingPage(String username, String password) {

        System.out.println("username="+username);
        System.out.println("password="+password);
    }

    @Given("I open the browser")
    public void iOpenTheBrowser() {

        System.out.println("=========== >>>>> I open the browser");
    }

    @And("I maximize it")
    public void iMaximizeIt() {
        System.out.println("=========== >>>>> I maximize it");
    }

   /* @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" as username and password on billing page$")
    public void i_enter_something_and_something_as_username_and_password_on_billing_page(String strArg1, String strArg2) throws Throwable {
    }*/

}
