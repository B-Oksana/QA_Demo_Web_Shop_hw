package com.phonebook.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public boolean isHomeComponentPresent() {
        return driver.findElements(By.cssSelector(".topic-html-content-header")).size()>0;
    }

    @Test
    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void сredentials(String email, String password) {
        driver.findElement(By.cssSelector("#Email")).click();
        driver.findElement(By.cssSelector("#Email")).clear();
        driver.findElement(By.cssSelector("#Email")).sendKeys(email);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).clear();
        driver.findElement(By.cssSelector("#Password")).sendKeys(password);
    }

    public boolean isSignButtonPresent1() {
        return isElementPresent(By.cssSelector(".ico-logout"));
    }

    public void clickOnLoginButton() {
        click(By.cssSelector(".button-1.login-button"));
    }

    public void fillLoginForm() {
        сredentials("myliberty3@gmail.com", "Aa12345!");
    }

    public void clickOnLoginLink() {
        click(By.cssSelector(".ico-login"));
    }

    public void clickShoppingCart() {
        click(By.cssSelector("#topcartlink [href='/cart']"));

    }

    public void addToCartSecondItem() {
        click(By.cssSelector(".product-grid.home-page-product-grid .item-box:nth-child(3) input[type='button']"));
    }

    public boolean checkItemInCart(String text) {
        List<WebElement> products = driver.findElements(By.cssSelector("[href='/141-inch-laptop']"));
        for (WebElement element: products) {
            if(element.getText().contains(text));
            return true;
        }
        return false;
    }

    public boolean isSignButtonPresent() {
        return isElementPresent(By.xpath("//*[.='Register']"));
    }

    public void clickOnRegisterButton() {
        click(By.cssSelector("#register-button"));
    }

    public void fillRegistrationForm(String name, String lastName, String email, String password, String confirmPassword) {
        type(By.cssSelector("#FirstName"), name);
        type(By.cssSelector("#LastName"), lastName);
        type(By.cssSelector("#Email"), email);
        type(By.cssSelector("#Password"), password);
        type(By.cssSelector("#ConfirmPassword"), confirmPassword);
    }

    public void clickOnRegister() {
        click(By.cssSelector("[href='/register']"));
    }
}
