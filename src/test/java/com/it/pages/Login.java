package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {
	@FindBy(name="login")
	private WebElement username;

	@FindBy(name="pass")
	private WebElement password;

	@FindBy(xpath="//input[@tabindex = '5' and @type = 'submit']")
	private WebElement loginButton;

	public void login(String log, String pass){
        username.sendKeys(log);
        password.sendKeys(pass);
        loginButton.click();
    }
}
