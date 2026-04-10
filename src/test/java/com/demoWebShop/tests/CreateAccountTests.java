package com.demoWebShop.tests;

import com.demoWebShop.data.RegistrationData;
import com.demoWebShop.models.RegistrationForm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegisterPositiveTest() {

        int i = (int) ((System.currentTimeMillis()/1000)%3600);

        app.getRegHelper().clickOnRegister();
        app.getRegHelper().fillRegistrationForm(new RegistrationForm()
                .setName(RegistrationData.name)
                .setLastName(RegistrationData.lastName)
                .setEmail(RegistrationData.email)
                .setPassword(RegistrationData.password)
                .setConfirmPassword(RegistrationData.confirmPassword));
        app.getRegHelper().clickOnRegisterButton();
        Assert.assertTrue(app.getRegHelper().isSignButtonPresent());
    }

}
