package com.demoWebShop.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm();
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addItemToCartTest() {
        app.getItem().addToCartSecondItem();
        app.getItem().clickShoppingCart();
        Assert.assertTrue(app.getItem().checkItemInCart("14.1-inch Laptop"));

    }

}
