package com.testinium.ciceksepeti.test.page;

import com.testinium.ciceksepeti.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;



public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public HomePage addBasket(String adress){
        setByClassname("js-html-tag-replace",adress);
        return new HomePage(driver);
    }


}
