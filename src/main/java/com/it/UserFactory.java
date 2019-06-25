package com.it;

import com.it.utils.Utils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {
    static ResourceBundle resourceBundle;

    static {
        resourceBundle = ResourceBundle.getBundle("user");
    }

    public static Users getValidUser() {
        return new Users(resourceBundle.getString("userName"),
                resourceBundle.getString("password"),
                resourceBundle.getString("email"));
    }

    public static Users getRandomUser() {
        return new Users(
                Utils.String.getRandom(15),
                Utils.String.getRandom(15),
                Utils.String.getRandom(12) + "gmail.com");
    }

    public static List<Users> getRandomUsers(int count) {
        return Stream.generate(UserFactory::getRandomUser)
                .limit(count)
                .collect(Collectors.toList());
    }
}
