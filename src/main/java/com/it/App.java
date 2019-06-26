package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashboardHelper;
import com.it.helpers.LoginHelper;
import com.it.helpers.NewEmailHelper;

public class App {
    public LoginHelper login;
    public DashboardHelper dashboard;
    public NewEmailHelper newEmail;
    public CommonHelper commonHelper;

    public App() {
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        newEmail = new NewEmailHelper();
        commonHelper = new CommonHelper();
    }
}
