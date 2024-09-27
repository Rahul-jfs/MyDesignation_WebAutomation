package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MensTShirtPage extends BasePage{

    @FindBy(css = "#product-grida .grid__item")
    WebElement firstTShirt;


    @FindBy(css = ".Syc5_5I8mIIORNQO4nb4 svg")
    WebElement couponCodeCloseBtn;

    public boolean isMensTShirtPageDisplayed(){
        return driver.getCurrentUrl().equals(ConfigReader.getConfigValue("mensTShirtPage.url"));
    }

    public void addFirstTShirtToCart(){
        firstTShirt.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        if(couponCodeCloseBtn.isDisplayed()){
//            couponCodeCloseBtn.click();
//        }

    }
}
