import core.DriverManager;
import core.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutTest {

    @BeforeMethod
    public void setUp() {
        DriverManager.initDriver();
        DriverManager.getDriver().get(ConfigReader.get("baseUrl"));
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }

    @Test
    public void testSuccessCheckout() {

        LoginPage login = new LoginPage();
        InventoryPage inventory = new InventoryPage();
        CartPage cart = new CartPage();
        CheckoutInformationPage info = new CheckoutInformationPage();
        CheckoutOverviewPage overview = new CheckoutOverviewPage();
        CheckoutCompletePage complete = new CheckoutCompletePage();

        // ambil data dari config.properties
        String username = ConfigReader.get("username");
        String password = ConfigReader.get("password");
        String firstName = ConfigReader.get("firstName");
        String lastName = ConfigReader.get("lastName");
        String postalCode = ConfigReader.get("postalCode");

        // login
        login.login(username, password);

        // pilih produk
        inventory.addBackpackToCart();
        inventory.goToCart();

        // checkout
        cart.clickCheckout();
        info.fillForm(firstName, lastName, postalCode);
        overview.clickFinish();

        // verify
        Assert.assertEquals(
                complete.getThankYouMessage(),
                "Thank you for your order!"
        );
    }
}

