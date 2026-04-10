package com.demoWebShop.core;


import com.demoWebShop.fw.HomePageHelper;
import com.demoWebShop.fw.ItemHelper;
import com.demoWebShop.fw.RegistrationHelper;
import com.demoWebShop.fw.UserHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager  {

    protected WebDriver driver;

    UserHelper user;
    RegistrationHelper regHelper;
    ItemHelper item;
    HomePageHelper homePage;

    public void init() {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        regHelper = new RegistrationHelper(driver);
        item = new ItemHelper(driver);
        homePage = new HomePageHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public UserHelper getUser() {
        return user;
    }

    public RegistrationHelper getRegHelper() {
        return regHelper;
    }

    public ItemHelper getItem() {
        return item;
    }

    public HomePageHelper getHomePage() {
        return homePage;
    }
}
