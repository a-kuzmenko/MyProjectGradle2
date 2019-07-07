package com.it.helpers;

import com.it.UserFactory;
import com.it.Users;
import com.it.pages.LoginView;


public class LoginHelper extends LoginView {

    public void loginValidUser(){
        Users user = UserFactory.getValidUser();
        log.info(String.format("Login user name - %s, password - %s", user.getlogin(), user.getpassword()));
        login(user.getlogin(), user.getpassword());
    }

    public void loginUser(Users user){
        log.info(String.format("Login user name - %s, password - %s", user.getlogin(), user.getpassword()));
        login(user.getlogin(), user.getpassword());
    }
}
