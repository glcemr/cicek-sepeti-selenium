package com.testinium.ciceksepeti.test.page;

import com.testinium.ciceksepeti.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage login(String username, String password){
        setById("EmailLogin", username);
        setById("Password", password);
        clickByXpath("/html/body/main/div/div[1]/div/form[1]/div[6]/button");
        callHomePage();
        return new HomePage(driver);
    }
    //fluently pattern
}
//button[text() = 'Giriş']