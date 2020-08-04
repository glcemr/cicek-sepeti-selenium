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
        clickByClassname("login__btn");

        return new HomePage(driver);
    }

}