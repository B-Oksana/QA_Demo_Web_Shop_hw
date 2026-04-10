package com.demoWebShop.fw;


import com.demoWebShop.core.BaseHelper;
import com.demoWebShop.models.RegistrationForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationHelper extends BaseHelper {
    public RegistrationHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isSignButtonPresent() {
        return isElementPresent(By.xpath("//*[.='Register']"));
    }

    public void clickOnRegisterButton() {
        click(By.cssSelector("#register-button"));
    }

    public void fillRegistrationForm(RegistrationForm signupForm) {
        type(By.cssSelector("#FirstName"), signupForm.getName());
        type(By.cssSelector("#LastName"), signupForm.getLastName());
        type(By.cssSelector("#Email"), signupForm.getEmail());
        type(By.cssSelector("#Password"), signupForm.getPassword());
        type(By.cssSelector("#ConfirmPassword"), signupForm.getConfirmPassword());
    }

    public void clickOnRegister() {
        click(By.cssSelector("[href='/register']"));
    }
}
