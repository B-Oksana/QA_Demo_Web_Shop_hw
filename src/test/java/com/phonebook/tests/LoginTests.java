package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {

        clickOnLoginLink();
        fillLoginForm();
        clickOnLoginButton();
        Assert.assertTrue(isSignButtonPresent1());
    }

}