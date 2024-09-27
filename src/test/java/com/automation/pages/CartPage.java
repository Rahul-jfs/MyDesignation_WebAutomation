package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.temporal.WeekFields;

public class CartPage extends BasePage {

    @FindBy(css = ".upcart-product-title a")
    WebElement itemNameInCart;

    @FindBy(css = ".upcart-item-price")
    WebElement priceInCart;

    @FindBy(css = ".styles_TrashButton__deleteButton__8uIHq")
    WebElement deleteButton;

    @FindBy(css = ".styles_CartPreview__empty__WFP86 h3")
    WebElement emptyMessage;

    public boolean isSameItemAddedToCart() {
        String name = itemNameInCart.getText();
        return name.equals(TShirtPage.tShirtName);
    }

    public boolean isSameAmountDisplayed() {
        String priceStr = priceInCart.getText();
        String price = "₹"+priceStr.substring(priceStr.indexOf(" ")+1);
//        System.out.println("Price in cart: "+price);
//        System.out.println("Price in page: "+TShirtPage.price);
        return price.equals(TShirtPage.price);
    }


    public void clickOnDeleteButton() {
        deleteButton.click();
    }

    public boolean isItemRemoved() {
        return emptyMessage.getText().equals("Your cart is empty");
    }
}
