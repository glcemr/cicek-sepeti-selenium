package com.testinium.ciceksepeti.test.base;

import com.testinium.ciceksepeti.test.page.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class   BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public ProductListPage search(String keyword){

        setByClassname("js-product-search-input",keyword);
        clickByClassname("product-search__button");
        //setByXpath("//*[@id=\"product-search-2\"]/form/input",keyword);
        //clickByXpath("//*[@id=\"product-search-2\"]/button");

        //setById("product-search-2", keyword);
        //clickById("header-search-find-link");

        return new ProductListPage(driver);

    }

    public LoginPage callLoginPage(){
        mauseOver("/html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[2]/a");
        clickByClassname("users-process-list__btn");
        return new LoginPage(driver);
    }
    public SignInPage callSignInPage(){
        mauseOver("/html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[2]/a");
        clickByXpath("/html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[2]/div/div/ul/li[2]/a");
        //clickByClassname("users-process-list__icon icon-register");
        return new SignInPage(driver);

    }
    public ProductPage callProductPage(){
        return new ProductPage(driver);
    }

    public void callContactUsPage(){
        clickByXpath("/html/body/div[5]/div[1]/ul[1]/li[3]/ul/li[1]/a");
    }

    //public void addBasket(){

    //}//

    public HomePage callHomePage(){
        driver.get("https://www.ciceksepeti.com/");
        return new HomePage(driver);
    }
    public void mauseOver(String xpath) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(xpath));
        action.moveToElement(we).build().perform();
    }
    public void setById(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.clear();
        element.sendKeys(value);
    }
    public void setByXpath(String xpath, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.clear();
        element.sendKeys(value);
    }

    public void clickById(String id){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id(id)));
        driver.findElement(By.id(id)).click();
    }

    public void clickByClassname(String classname){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.className(classname)));
        driver.findElement(By.className(classname)).click();
    }
    //yeni
    public void setByClassname(String classname, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.className(classname)));
        element.clear();
        element.sendKeys(value);
        //driver.findElement(By.className(classname)).click();
    }

    // yeni
    public void clickByXpath(String xpath){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }



    public List<WebElement> getElementsByXpath(String s) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[contains(@id, 'item-info-block')]"))));
    }
}

