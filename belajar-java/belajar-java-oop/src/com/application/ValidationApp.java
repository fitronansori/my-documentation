package com.application;

import com.data.LoginRequest;
import com.error.ValidationException;
import com.utils.ValidateRuntime;
import com.utils.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, "asasa");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid: " + loginRequest.username());
        } catch (ValidationException e) {
            System.out.println("Data invalid: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Data null: " + e.getMessage());
        } finally {
            System.out.println("Selesai");
        }


        LoginRequest loginRequest2 = new LoginRequest("fitron", "rahasia");
        ValidateRuntime.validate(loginRequest2);
        System.out.println(loginRequest2.username());
        System.out.println("Sukses");
    }
}
