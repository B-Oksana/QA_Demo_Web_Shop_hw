package com.demoWebShop.models;

public class RegistrationForm {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;

    public RegistrationForm setName(String name) {
        this.name = name;
        return this;
    }

    public RegistrationForm setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public RegistrationForm setEmail(String email) {
        this.email = email;
        return this;
    }

    public RegistrationForm setPassword(String password) {
        this.password = password;
        return this;
    }

    public RegistrationForm setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
