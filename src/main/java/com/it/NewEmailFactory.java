package com.it;

import java.util.ResourceBundle;

public class NewEmailFactory {
    static ResourceBundle resourceBundle;

    static {
        resourceBundle = ResourceBundle.getBundle("newEmail");
    }

    public static NewEmail getNewEmail() {
        return new NewEmail(resourceBundle.getString("to"),
                resourceBundle.getString("theme"),
                resourceBundle.getString("text"));
    }
}
