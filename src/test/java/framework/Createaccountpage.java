package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Createaccountpage extends BasePage{
private By signUpLink = By.xpath(".//*[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[1]/a");
private By firstNameTextField = By.id("u_0_2");
private By lastNameTextField = By.id("u_0_4");
private By enterEmailTextField = By.id("u_0_7");
private By enterPasswordTextField = By.id("u_0_e");
private By selectMonthDropDown = (By.id("month"));
private By selectDayDropDown = By.id("day");
private By selectYearDropDown = By.id("year");
private By maleRadioButton = By.id("u_0_g");
private By createAccountButton = By.id("u_0_m");
private By pageHeader = By.xpath(".//*[@id='more_pager_pagelet_594eceb1ade5d8922263686']/div/div[1]/div[1]");


public void clickOnSignUpLink(){
clickOn(signUpLink);
}
public void enterFirstName(String enterFirstName){
sendText(firstNameTextField, enterFirstName );
}
public void enterLastName(String enterLastName){
sendText(lastNameTextField, enterLastName);
}
public void enterEmail(String enterEmail){
sendText(enterEmailTextField, enterEmail);
}
public void enterPassword(String enterPassword){
sendText(enterPasswordTextField, enterPassword);
}
public void selectMonth(String month) {
selectFromDropdown(selectMonthDropDown, month);
}
		
public void selectDay(String day) {
selectFromDropdown(selectDayDropDown, day);
}

public void selectYear(String year) {
selectFromDropdown(selectYearDropDown, year);

}

public void clickOnMaleRadioButton(){
	clickOn(maleRadioButton);
}
public void clickOnCreateAccount(){
	clickOn(createAccountButton);
}
public String getPageHeader(){
	return getTextFromElement(pageHeader);
}




}




