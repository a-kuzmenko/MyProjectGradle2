package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void login() throws InterruptedException {
        app.login.loginValidUser();

        Thread.sleep(2);

        Assert.assertEquals(app.dashboard.getUserEmail(),
                validUser.getEmail(),
                "Email is not valid");
    }
}
