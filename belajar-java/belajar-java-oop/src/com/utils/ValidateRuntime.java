package com.utils;

import com.data.LoginRequest;
import com.error.BlankException;

public class ValidateRuntime {
    public static void validate(LoginRequest LoginRequest) {
        if (LoginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (LoginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (LoginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (LoginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }
}
