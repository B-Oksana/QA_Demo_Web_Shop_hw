package com.demoWebShop.fw;


import com.demoWebShop.core.BaseHelper;
import com.demoWebShop.data.UserData;
import com.demoWebShop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isSignButtonPresent1() {
        return isElementPresent(By.cssSelector(".ico-logout"));
    }

    public void clickOnLoginButton() {
        click(By.cssSelector(".button-1.login-button"));
    }

    public void fillLoginForm() {
        сredentials(new User()
                .setEmail(UserData.email)
                .setPassword(UserData.password));
    }

    public void clickOnLoginLink() {
        click(By.cssSelector(".ico-login"));
    }
}
