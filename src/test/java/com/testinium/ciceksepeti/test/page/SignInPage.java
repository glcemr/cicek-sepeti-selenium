package com.testinium.ciceksepeti.test.page;

import com.testinium.ciceksepeti.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public HomePage signIn(String nameSurname,String email, String password){

        setById("NameIndivual", nameSurname);
        setById("EmailIndivual",email);
        setById("PasswordIndivual", password);
        clickByClassname("required-label");
        clickByXpath("/html/body/div[8]/div/div/div[3]/button");
        clickByXpath("/html/body/main/div/div[1]/div[1]/div/div/div[1]/form/div[10]/button");

        return new HomePage(driver);
    }

}