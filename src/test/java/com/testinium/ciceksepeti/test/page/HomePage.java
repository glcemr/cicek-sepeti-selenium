package com.testinium.ciceksepeti.test.page;

import com.testinium.ciceksepeti.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://www.ciceksepeti.com/");
        clickByXpath("/html/body/main/div/div[1]/div[1]/div[1]/a/span");
        //clickByXpath("/html/body/main/div/div[1]/div[1]/div[1]/a/span");


    }


}