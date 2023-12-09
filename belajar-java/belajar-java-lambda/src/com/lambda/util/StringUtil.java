package com.lambda.util;

public class StringUtil {
    public static boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }
}
