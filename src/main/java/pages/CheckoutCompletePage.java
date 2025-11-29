package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class CheckoutCompletePage extends BasePage {

    private By thankYouMsg = By.className("complete-header");

    public String getThankYouMessage() {
        return getText(thankYouMsg);
    }
}
