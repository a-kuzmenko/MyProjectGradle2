package com.it.helpers;

import com.it.Email;
import com.it.pages.DashboardView;

public class DashboardHelper extends DashboardView {

    public boolean isLetterRecordExists(Email letter) {
        return isLetterRecordPresent(letter);
    }

    public DashboardHelper deleteLetterRecordIfExists(Email letter) {
        boolean letterRecordPresent = isLetterRecordExists(letter);

        if (letterRecordPresent) {
            checkIncomingLetter();
            clickOnDeleteIncomingLetter(letter.getTheme());
            clickOnYesInAlert();
        }
        return this;
    }
}
