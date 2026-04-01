package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegisterPositiveTest() {

        int i = (int) ((System.currentTimeMillis()/1000)%3600);

        // click on Register link
        click(By.cssSelector("[href='/register']"));
        // enter First name
        type(By.cssSelector("#FirstName"), "Isabella");
        //  enter Last name
        type(By.cssSelector("#LastName"), "Brooks");
        // enter email
        type(By.cssSelector("#Email"), "myliberty3" + i + "@gmail.com");
        // enter your password
        type(By.cssSelector("#Password"), "Aa12345!");
        // enter your password again
        type(By.cssSelector("#ConfirmPassword"), "Aa12345!");
        // click on Register button
        click(By.cssSelector("#register-button"));
        // assert SigOut button is present
        Assert.assertTrue(isElementPresent(By.xpath("//*[.='Register']")));
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

}
