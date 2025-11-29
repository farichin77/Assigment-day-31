package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class InventoryPage extends BasePage {

    private By addBackpack = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");

    public void addBackpackToCart() {
        click(addBackpack);
    }

    public void goToCart() {
        click(cartIcon);
    }
}
