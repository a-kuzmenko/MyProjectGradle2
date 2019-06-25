package com.it.utils;

import java.util.Random;
import java.util.stream.Collectors;

public  class Utils {
   public static class String {
        public static java.lang.String getRandom(int lenght) {
            return new Random()
                    .ints(65, 88)
                    .limit(lenght)
                    .mapToObj(s -> "" + (char) s)
                    .collect(Collectors.joining());

        }
    }
}
