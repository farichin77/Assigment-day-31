package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class CartPage extends BasePage {

    private By checkoutBtn = By.id("checkout");

    public void clickCheckout() {
        click(checkoutBtn);
    }
}
