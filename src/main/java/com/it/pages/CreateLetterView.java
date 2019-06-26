package com.it.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;

public class CreateLetterView extends BasePage {
    @FindBy(xpath="//span[@class='field']/textarea[@id='to']")
    private WebElement toField;

    @FindBy(xpath="//span[@class='field']//input[@tabindex='5']")
    private WebElement themeField;

    @FindBy(xpath="//textarea[@id='text']")
    private WebElement textField;

    @FindBy(xpath="//input[@tabindex='12']")
    private WebElement sendButton;

    public CreateLetterView setToField(String to) {
        toField.sendKeys(to);
        return this;
    }

    public CreateLetterView setThemeField(String theme) {
        themeField.sendKeys(theme);
        return this;
    }

    public CreateLetterView setTextField(String text) {
        textField.sendKeys(text);
        return this;
    }

    public CreateLetterView clickOnCreateLetter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", sendButton);
        sendButton.click();
        return this;
    }
}
