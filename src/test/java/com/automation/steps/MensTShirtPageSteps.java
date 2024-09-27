package com.automation.steps;

import com.automation.pages.MensTShirtPage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MensTShirtPageSteps {

    MensTShirtPage mensTShirtPage = new MensTShirtPage();

    @Then("verify user is on mensTShirt page")
    public void verify_user_is_on_mens_t_shirt_page() {
        Assert.assertTrue(mensTShirtPage.isMensTShirtPageDisplayed());
        ReportManager.attachScreenshot();
        ReportManager.log("Mens TShirt Page Displayed");
    }

    @Then("user clicks on first tShirt")
    public void user_clicks_on_first_t_shirt() {
        mensTShirtPage.addFirstTShirtToCart();
    }

}
