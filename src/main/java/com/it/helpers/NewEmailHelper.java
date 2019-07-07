package com.it.helpers;

import com.it.Email;
import com.it.NewEmailFactory;
import com.it.pages.CreateLetterView;

public class NewEmailHelper extends CreateLetterView {

    public NewEmailHelper createLetter(Email newLetter) {
        setToField(newLetter.getTo());
        setThemeField(newLetter.getTheme());
        setTextField(newLetter.getText());

        clickOnCreateLetter();
        return this;
    }

    public void createLetter() {
        Email newEmail = NewEmailFactory.getNewEmail();
        setToField(newEmail.getTo());
        setThemeField(newEmail.getTheme());
        setTextField(newEmail.getText());

        clickOnCreateLetter();
    }
}
