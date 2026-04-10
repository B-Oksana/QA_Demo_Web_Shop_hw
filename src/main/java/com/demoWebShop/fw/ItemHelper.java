package com.demoWebShop.fw;

import com.demoWebShop.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver driver) {
        super(driver);
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
}
