package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.models.Customer;
import pl.testeroprogramowania.pages.HomePage;
import pl.testeroprogramowania.pages.ProductListPage;

public class CheckoutTest extends BaseTest {
    @Test
    public void checkoutTest() {

        Customer customer = new Customer();
        customer.setFirstname("Bartek");
        customer.setLastName("Testowy");
        customer.setCompanyName("google");
        customer.setCountry("Poland");
        customer.setStreet("Testowa");
        customer.setFlatNumber("22");
        customer.setZipcode("21370");
        customer.setCity("Test city");
        customer.setPhone("123123123");
        customer.setEmail("lol@lol.pl");


        new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart()
                .openAddressDetails()
                .fillAddressDetails(customer,"Ship it asap");
    }
}
