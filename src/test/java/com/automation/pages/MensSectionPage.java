package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MensSectionPage extends BasePage{

    @FindBy(css = ".custom_collection_list h3")
    WebElement categoryTitle;

    @FindBy(id = "Slide-template--22320117678388__74466f05-c5f7-464a-aaae-1dd4e79dd10e-1")
    WebElement tShirtCategoryElement;


    public void clickOnTShirtCategory(){
        tShirtCategoryElement.click();
    }

    public boolean isMensSectionDisplayed(){
        return categoryTitle.isDisplayed();
    }
}
