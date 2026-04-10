package com.demoWebShop.tests;

import com.demoWebShop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {

        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm();
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isSignButtonPresent1());
    }

}