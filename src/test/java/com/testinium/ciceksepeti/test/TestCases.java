package com.testinium.ciceksepeti.test;

import com.testinium.ciceksepeti.test.base.BasePage;
import com.testinium.ciceksepeti.test.base.BaseTest;
import com.testinium.ciceksepeti.test.page.HomePage;
import com.testinium.ciceksepeti.test.page.LoginPage;
import org.junit.Test;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestCases extends BaseTest {


    @Test
    public void homePageTest01(){
        new HomePage(driver);
    }

    @Test
    public void cantactUsTest02(){
        new HomePage(driver)
                .callContactUsPage();
    }

    @Test
    public void signInTest03(){
        new HomePage(driver)
                .closeAddress()
                .callSignInPage()
                .signIn("emre güleç","emregulec74@hotmail.com","Emre.1234");
    }

    @Test
    public void loginTest04() throws InterruptedException {
        new HomePage(driver)
                .closeAddress()
                .callLoginPage()
                .login("emregulec74@hotmail.com", "Emre.1234");//TimeUnit.SECONDS.sleep(3);
    }

    @Test
    public void searchTest05() throws InterruptedException {

        new HomePage(driver)
                .closeAddress()
                .search("papatya");

    }
    @Test
    public void loginAndSearchTest06() throws InterruptedException {

        new HomePage(driver)
                .closeAddress()
                .callLoginPage()
                .login("emregulec74@hotmail.com", "Emre.1234")
                .search("bilgisayar");
    }

    @Test
    public void signInAndLoginTest07(){

    }
    @Test
    public void searchAndBasketTest08(){

    }
    @Test
    public void loginSearchAddfavTest09(){

    }
    @Test
    public void loginDeleteFavTest10(){

    }




}
