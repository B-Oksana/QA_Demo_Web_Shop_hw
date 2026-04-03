package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegisterPositiveTest() {

        int i = (int) ((System.currentTimeMillis()/1000)%3600);

        clickOnRegister();
        fillRegistrationForm("Isabella" , "Brooks", "myliberty1@gmail.com", "Aa12345!", "Aa12345!");
        clickOnRegisterButton();
        Assert.assertTrue(isSignButtonPresent());
    }

}
