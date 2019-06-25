package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashboardHelper;
import com.it.helpers.LoginHelper;

public class App {
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CommonHelper commonHelper;

    public App() {
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        commonHelper = new CommonHelper();
    }
}
