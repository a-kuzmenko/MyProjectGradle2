package com.it.tests;

import com.it.UserFactory;
import com.it.Users;
import com.it.App;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {
    Users validUser = UserFactory.getValidUser();
    App app = new App();

    @AfterSuite
    public void tearDown() {
        app.commonHelper.stopApp();
    }
}
