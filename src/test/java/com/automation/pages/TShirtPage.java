package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Stack;

public class TShirtPage extends BasePage{

    @FindBy(css = ".product-form__input label")
    WebElement xsSize;

    @FindBy(css = ".product-form__buttons button[type='submit']")
    WebElement addToCartBtn;

    @FindBy(css = ".cart-count-bubble span:first-child")
    WebElement cartIconNumber;

    @FindBy(css = ".price__regular .price__last bdi")
    WebElement priceEle;

    @FindBy(css = "h1.product__heading")
    WebElement productNameEle;

    @FindBy(css = ".cart-drawer-container")
    WebElement cartIcon;

    static String price = "";
    static String tShirtName = "";

    public void selectSmallSize(){
        String priceStr = priceEle.getText();
        price = priceStr.substring(priceStr.indexOf("₹"));
        tShirtName = productNameEle.getText().trim();
        xsSize.click();
    }

    public void clickAddToCartBtn(){
        addToCartBtn.click();
    }

    public boolean isItemAddedToCart(){
        return cartIconNumber.getText().equals("1");
    }

    public void clickCartIcon() {
        cartIcon.click();
    }
}
