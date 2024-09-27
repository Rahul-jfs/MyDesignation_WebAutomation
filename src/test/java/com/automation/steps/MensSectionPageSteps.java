package com.automation.steps;

import com.automation.pages.MensSectionPage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MensSectionPageSteps {

    MensSectionPage mensSectionPage = new MensSectionPage();

    @Then("verify user is on mens section")
    public void verify_user_is_on_mens_section() {
       Assert.assertTrue(mensSectionPage.isMensSectionDisplayed());
        ReportManager.attachScreenshot();
        ReportManager.log("Mens Section Page Displayed");
    }

    @Then("clicks on TShirt category")
    public void clicks_on_t_shirt_category() {
        mensSectionPage.clickOnTShirtCategory();
    }
}
