package com.it.pages;

import com.it.Email;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DashboardView extends BasePage{
	@FindBy(xpath="//div[@class='section_nav']//span")
	private WebElement userEmail;

	@FindBy(xpath="//div[@class='section_nav']//a[text() = 'Создать письмо']")
	private WebElement createLetter;

	@FindBy(xpath="//div[@class='block_confirmation']//div[contains(text(),'Письмо успешно отправлено адресатам')]")
	private WebElement confirmation;

	@FindBy(xpath="//ul[@class='list_underlined']//li[@class='new']")
	private WebElement incomingEmail;

	@FindBy(xpath="//div[@class='section_nav']//li[2]")
	private WebElement letters;

	@FindBy(xpath="//span[@class='frm'][1]")
	private WebElement incomingLetter;

	@FindBy(xpath="//ul[@class='messages']//h3")
	private WebElement incomingTheme;

	@FindBy(xpath="//div[@class='message_body']//pre")
	private WebElement incomingMessageBody;

	@FindBy(xpath="//div[contains(@class,'row')]")
	private WebElement checkcolumnsLocator;

	@FindBy(xpath="//div[contains(@class,'row')]//input")
	private WebElement clickOnDeleteButton;

	public String getUserEmail(){
		return  userEmail.getText();
	}

	public String getConfirmation(){
		return  confirmation.getText();
	}

	public String getIncomingTheme(){
		return  incomingTheme.getText();
	}

	public String getIncomingMessageBody(){
		return  incomingMessageBody.getText();
	}

	public DashboardView clickOnCreateLetter() {
		createLetter.click();
		return this;
	}

	public DashboardView clickOnIncomingEmail() {
		incomingEmail.click();
		return this;
	}

	public DashboardView clickOnIncomingLetter() {
		incomingLetter.click();
		return this;
	}

	public DashboardView clickOnLetters() {
		letters.click();
		return this;
	}

	public DashboardView clickOnDeleteIncomingLetter(String theme) {
		getIncomingLetters(theme);
		clickOnDeleteButton.click();
		return this;
	}

	public boolean isLetterRecordPresent(Email letter) {
		Map<Integer, String> data = new HashMap<>();
		data.put(1, letter.getTo());
		data.put(2, letter.getTheme());
		data.put(3, letter.getText());

		return true;
	}
	protected boolean isAlertPresent(){
		//Alert alert = (new WebDriverWait(driver, 10))
		//		.until(ExpectedConditions.alertIsPresent());

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());

		return true;
	}

	public void clickOnYesInAlert(){
		boolean result = isAlertPresent();
		if (result){
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} else {
			System.out.println("Dialog cannot be found");
		}
	}

	public DashboardView getIncomingLetters(String theme) {
		By mySelector = By.xpath(String.valueOf(checkcolumnsLocator));
		List<WebElement> checkColumns = driver.findElements(mySelector);
		for (WebElement webElement : checkColumns) {
			System.out.println(webElement.getText());
		}
		return this;
	}

	public DashboardView checkIncomingLetter() {
		By mySelector = By.xpath(String.valueOf(checkcolumnsLocator + "//input"));
		WebElement checkColumn = driver.findElement(mySelector);
		checkColumn.click();

		/*boolean currentState = checkColumn.getAttribute("type").contains("checkbox");
		if (currentState != checked) {
		}*/
		return this;
	}
}
