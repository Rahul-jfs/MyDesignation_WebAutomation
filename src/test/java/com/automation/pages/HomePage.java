package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(css = ".header__heading a img:last-child")
    WebElement logoImg;

    @FindBy(css = "#MainContent section.shopify-section.section .banner__content")
    WebElement menSection;

    public void openWebsite(){
        driver.get(ConfigReader.getConfigValue("application.url"));
    }

    public void clickMensSection(){
        menSection.click();
    }

    public boolean isHomePageDisplayed(){
        return logoImg.isDisplayed();
    }


}
