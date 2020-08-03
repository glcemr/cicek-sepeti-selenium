package com.testinium.ciceksepeti.test.page;

import com.testinium.ciceksepeti.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;



public class ProductListPage extends BasePage {
    public ProductListPage(WebDriver driver) {
        super(driver);
    }


    public void selectProductByIndex(Integer index){
        driver.findElements(By.className("products products--category")).get(index).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getElementsByXpath("/html/body/main/div/div[1]/div[3]/div["+index+"]").get(index).click();
        //getElementsByXpath("//*[contains(@id, 'products__item-inner')]").get(index).click();
        //products__item-inner
        //products__item js-category-item-hover  products__item--featured-xlg

        ///html/body/main/div/div[1]/div[3]/div[1]
        ///html/body/main/div/div[1]/div[3]/div[2]
        ///html/body/main/div/div[1]/div[3]/div[3]

        //item-info-block
    }



}
