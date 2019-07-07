package com.it;

import java.util.ResourceBundle;

public class NewEmailFactory {
    static ResourceBundle resourceBundle;

    static {
        resourceBundle = ResourceBundle.getBundle("newEmail");
    }

    public static Email getNewEmail() {
        return new Email(resourceBundle.getString("to"),
                resourceBundle.getString("theme"),
                resourceBundle.getString("text"));
    }
}
