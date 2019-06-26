package com.it.helpers;

import com.it.NewEmail;
import com.it.NewEmailFactory;
import com.it.pages.CreateLetterView;
import org.openqa.selenium.interactions.Locatable;

public class NewEmailHelper extends CreateLetterView {
    public void createLetter() throws InterruptedException {
        NewEmail newEmail = NewEmailFactory.getNewEmail();
        setToField(newEmail.getTo());
        setThemeField(newEmail.getTheme());
        setTextField(newEmail.getText());

        clickOnCreateLetter();
    }
}
