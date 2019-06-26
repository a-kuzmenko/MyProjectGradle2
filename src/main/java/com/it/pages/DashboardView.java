package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardView extends BasePage{
	@FindBy(xpath="//div[@class='section_nav']//span")
	private WebElement userEmail;

	@FindBy(xpath="//div[@class='section_nav']//a[text() = 'Создать письмо']")
	private WebElement createLetter;

	public String getUserEmail(){
	    return  userEmail.getText();
    }

	public DashboardView clickOnCreateLetter() {
		createLetter.click();
		return this;
	}
}
