package framework;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import stepdefinition.SharedSD;

/**
 * Created by mohammadmuntakim on 6/9/17.
 */
public class BasePage {

	// this method allows us to click on an element
	public void clickOn(By locator) {
		try {
			SharedSD.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	// this method allows us to send text to a field
	public void sendText(By locator, String text) {
		try {
			SharedSD.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	
	//this method allows us to get text from a web element
	
	public String getTextFromElement(By locator) {
		String text = null;
		try {
			text = SharedSD.getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}

		return text;
	}
	
	// this method allows us to select from a dropdown menu
	
	public void selectFromDropdown(By locator, String selection){
		Select dropdown = new Select(SharedSD.getDriver().findElement(locator));
		dropdown.selectByVisibleText(selection);
	}

	// this method allows us to go back to a previous page
	
	public void clickOnBrowserBackArrow() {
		SharedSD.getDriver().navigate().back();
	}

	
	// this method allows us to move forward to a page
	public void clickOnBrowserForwardArrow() {
		SharedSD.getDriver().navigate().forward();
	}

	
	//this method allows us to refresh a web page
	
	public void refreshBrowser() {
		SharedSD.getDriver().navigate().refresh();
	}
}
