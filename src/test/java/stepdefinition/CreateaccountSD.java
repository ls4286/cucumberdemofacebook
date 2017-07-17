package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.Createaccountpage;

public class CreateaccountSD {
	private Createaccountpage createAccount = new Createaccountpage();
	
	@Given("^I go down to the bottom of the home page$")
	public void scrollDownToFooter(){
		JavascriptExecutor js = (JavascriptExecutor)SharedSD.getDriver();
		//vertical scrolls to the end of the page.
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	}
	@Given("^I click on the Sign Up link$")
	public void clickOnSignUpLink(){
	}
	@When("^I enter (.+) into (firstname|lastname|email|password) text fields on sign up page")
    public void enterDataIntoTextFields(String text, String textFields) {

        switch (textFields) {
            case "firstname":
                createAccount.enterFirstName(text);
                break;
            case "lastname":
            	createAccount.enterLastName(text);
                break;
            case "email":
            	createAccount.enterEmail(text);
            	//createAccount.confirmEmail(text);
            	break;
            case "password":
            	createAccount.enterPassword(text);
           }
        }
	@When("^I select (.+) on (month|day|year) dropdown on sign up page$")
	public void selectOptionFromDropDown(String dropMenu, String selection ){
		
		switch(dropMenu){
			case "month":
				createAccount.selectMonth(selection);
				break;
			case "day":
				createAccount.selectDay(selection);
				break;
			case "year":
				createAccount.selectYear(selection);
				break;
			}
	}
	@When("^I click on Male radio button on sign up page$")
	public void clickOnMaleRadioButton(){
	}
	@When("^I click on create account button on sign up page$")
	public void clickOnCreateAccount(){
	}
	@Then("^I verify account created$")
	public void verifyAccountCreatedPage(){
		Assert.assertEquals(createAccount.getPageHeader(), "Confirm Your Email");
	}
}	