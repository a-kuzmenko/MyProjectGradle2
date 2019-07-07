package com.it.tests;

import com.it.Email;
import com.it.NewEmailFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class SendLetterTest extends BaseTest {
    //отправить письмо самому себе и проверить что она пришло

    private Email newEmail = NewEmailFactory.getNewEmail();

    @Test
    public void sendLetter() throws InterruptedException {
        app.login.loginValidUser();

        Thread.sleep(2);
        app.dashboard.clickOnCreateLetter();

        app.newEmail.createLetter(newEmail);
        //app.newEmail.createLetter();

        Assert.assertEquals(app.dashboard.getConfirmation(), "Письмо успешно отправлено адресатам");

        app.dashboard.clickOnIncomingEmail();

        app.dashboard.clickOnIncomingLetter();

        Assert.assertEquals(app.dashboard.getIncomingTheme(), validEmail.getTheme());
        Assert.assertEquals(app.dashboard.getIncomingMessageBody(), validEmail.getText());

        app.dashboard.clickOnLetters();

        //app.dashboard.deleteLetterRecordIfExists(newEmail);

        //boolean letterRecordPresent = app.dashboard.isLetterRecordExists(newEmail);
        //assertTrue(letterRecordPresent, "Letter record should be present");
    }

    /*@AfterClass(alwaysRun = true)
    public void afterClass() {
        //app.login.loginValidUser();

        app.dashboard.clickOnLetters();

        app.dashboard.deleteLetterRecordIfExists(newEmail);

        boolean letterRecordPresent = app.dashboard.isLetterRecordExists(newEmail);
        assertTrue(letterRecordPresent, "Letter record should be present");
    }*/
}
