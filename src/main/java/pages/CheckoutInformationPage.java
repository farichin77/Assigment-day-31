package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class CheckoutInformationPage extends BasePage {

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueBtn = By.id("continue");

    public void fillForm(String fName, String lName, String zip) {
        type(firstName, fName);
        type(lastName, lName);
        type(postalCode, zip);
        click(continueBtn);
    }
}
