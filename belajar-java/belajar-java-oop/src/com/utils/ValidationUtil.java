package com.utils;

import com.data.LoginRequest;
import com.error.ValidationException;

public class ValidationUtil {
    public static void validate(LoginRequest LoginRequest) throws ValidationException, NullPointerException{
        if (LoginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (LoginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (LoginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (LoginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }
}
