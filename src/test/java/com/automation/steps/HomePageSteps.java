package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("user open website")
    public void user_open_website() {
        homePage.openWebsite();
    }

    @Then("verify home page is displayed")
    public void verify_home_page_is_displayed() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
        ReportManager.attachScreenshot();
        ReportManager.log("Home Page Displayed");
    }

    @When("user clicks on mens section")
    public void user_clicks_on_mens_section() {
        homePage.clickMensSection();
    }

}
