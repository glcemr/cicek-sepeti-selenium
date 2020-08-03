package com.testinium.ciceksepeti.test;

import com.testinium.ciceksepeti.test.base.BasePage;
import com.testinium.ciceksepeti.test.base.BaseTest;
import com.testinium.ciceksepeti.test.page.HomePage;
import com.testinium.ciceksepeti.test.page.LoginPage;
import org.junit.Test;
import java.util.Random;

public class TestCases extends BaseTest {

//    @Test
//    public void sampleTest(){
//        new HomePage(driver).search("samsung");
//        new LoginPage(driver).login("melih","123456");
//    }

    @Test
    public void homePageTest(){
        new HomePage(driver);
    }

    @Test
    public void cantactUsTest(){
        new HomePage(driver)
                .callContactUsPage();

    }



    @Test
    public void signInTest(){
        new HomePage(driver)
                .callSignInPage()
                .signIn("emre güleç","emregulec74@hotmail.com","Emre.1234");
    }

    @Test
    public void loginTest() {
        new HomePage(driver)
                .callLoginPage()
                .login("emregulec74@hotmail.com", "Emre.1234");
    }

    @Test
    public void searchTest(){

        new HomePage(driver)
                .search("papatya")
                .selectProductByIndex(2);
    }


}
//img[contains(@alt, 'cicek') and contains(@data-src, 'product')]
