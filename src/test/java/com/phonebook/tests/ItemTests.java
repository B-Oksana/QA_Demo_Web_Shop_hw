package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase{
    @BeforeMethod
    public void precondition() {
        clickOnLoginLink();
        fillLoginForm();
        clickOnLoginButton();
    }

    @Test
    public void addItemToCartTest() {
        addToCartSecondItem();
        clickShoppingCart();
        Assert.assertTrue(checkItemInCart("14.1-inch Laptop"));

    }

}
