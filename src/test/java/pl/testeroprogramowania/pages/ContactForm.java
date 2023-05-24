package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactForm {

    private WebDriver driver;

    @FindBy(id = "nimble_name1629401528")
    WebElement TestData1;

    @FindBy(id = "nimble_email1629401528")
    WebElement TestData2;

    @FindBy(id = "nimble_message1629401528")
    WebElement TestMessage;

    @FindBy(name = "nimble_submit")
    WebElement SubmitButton;


    public ContactForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}