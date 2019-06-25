package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BasePage{
	@FindBy(xpath="//div[@class='section_nav']//span")
	private WebElement userEmail;

	public String getUserEmail(){
	    return  userEmail.getText();
    }
}
