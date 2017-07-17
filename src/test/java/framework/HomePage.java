package framework;

import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

public class HomePage extends BasePage{

	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	
	
	//this method enables us to log in
	public void clickOnLoginButton() {
		clickOn(loginButton);
	}

	// this method is for entering email in the email field
	public void enterEmail(String enterEmail) {
		sendText(emailTextField, enterEmail);
	}
	
	
	// this method enables us to enter password in the required field
	public void enterPassword(String enterPassword) {
		sendText(passwordTextField, enterPassword);
	}
}
