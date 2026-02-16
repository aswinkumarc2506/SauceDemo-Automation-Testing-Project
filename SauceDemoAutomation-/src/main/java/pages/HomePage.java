package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By firstAddToCart = By.cssSelector(".inventory_item button");
    By cartIcon = By.className("shopping_cart_link");
    By removeBtn = By.cssSelector(".cart_button");
    By menuBtn = By.id("react-burger-menu-btn");
    By logoutLink = By.id("logout_sidebar_link");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProduct() {
        driver.findElement(firstAddToCart).click();
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }

    public void removeProduct() {
        driver.findElement(removeBtn).click();
    }

    public void logout() throws InterruptedException {
        driver.findElement(menuBtn).click();
        Thread.sleep(1000);
        driver.findElement(logoutLink).click();
    }
}