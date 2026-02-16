package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class CartTest extends BaseTest {

    @Test
    public void addAndRemoveProductTest() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        HomePage home = new HomePage(driver);
        home.addFirstProduct();
        home.openCart();
        home.removeProduct();
        home.logout();
    }
}