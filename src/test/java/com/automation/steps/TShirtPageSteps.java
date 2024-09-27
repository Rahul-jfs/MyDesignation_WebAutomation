package com.automation.steps;

import com.automation.pages.TShirtPage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TShirtPageSteps {

    TShirtPage tShirtPage = new TShirtPage();

    @When("user selects xs size")
    public void user_selects_xs_size() {
        tShirtPage.selectSmallSize();
    }

    @When("clicks on add to cart button")
    public void clicks_on_add_to_cart_button() {
        tShirtPage.clickAddToCartBtn();
    }

    @Then("verify item is added to cart")
    public void verify_item_is_added_to_cart() {
        Assert.assertTrue(tShirtPage.isItemAddedToCart());
        ReportManager.attachScreenshot();
        ReportManager.log("Item added to cart Successfully");
    }


    @When("user clicks on cart icon")
    public void user_clicks_on_cart_icon() {
        tShirtPage.clickCartIcon();
    }
}
