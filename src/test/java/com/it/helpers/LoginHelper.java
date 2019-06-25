package com.it.helpers;

import com.it.UserFactory;
import com.it.Users;
import com.it.pages.Login;


public class LoginHelper extends Login {

    public void loginValidUser(){
        Users user = UserFactory.getValidUser();
        login(user.getlogin(), user.getpassword());
    }

    public void loginUser(Users user){
        login(user.getlogin(), user.getpassword());
    }
}
