package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CartPageSteps {

    CartPage cartPage = new CartPage();

    @Then("verify the same item is added to cart")
    public void verify_the_same_item_is_added_to_cart() {
        Assert.assertTrue(cartPage.isSameItemAddedToCart());
        ReportManager.attachScreenshot();
        ReportManager.log("Same item is Displayed");
    }

    @Then("same price is displayed")
    public void same_price_is_displayed() {
        Assert.assertTrue(cartPage.isSameAmountDisplayed());
        ReportManager.attachScreenshot();
        ReportManager.log("Same price is Displayed");
    }

    @When("user click on delete button")
    public void user_click_on_delete_button() {
        cartPage.clickOnDeleteButton();
    }

    @Then("verify item is removed from the cart")
    public void verify_item_is_removed_from_the_cart() {
        Assert.assertTrue(cartPage.isItemRemoved());
        ReportManager.attachScreenshot();
        ReportManager.log("Item removed successfully");
    }
}
