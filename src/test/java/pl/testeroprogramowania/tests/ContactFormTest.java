package pl.testeroprogramowania.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ContactFormTest extends BaseTest {

    @FindBy(id = "nimble_name1629401528")
    WebElement TestData1;

    @FindBy(id = "nimble_email1629401528")
    WebElement TestData2;

    @FindBy(id = "nimble_message1629401528")
    WebElement TestMessage;

    @FindBy(name = "nimble_submit")
    WebElement SubmitButton;

    @Test
    public void contactFormTest() {
        PageFactory.initElements(driver, this);

        TestData1.sendKeys("Test pierwszego inputa");

        TestData2.sendKeys("Test drugiego inputa");

        TestMessage.sendKeys("Test Message Test Message Test Message Test Message Test Message Test Message Test Message.");

        SubmitButton.click();

        driver.findElement(By.name("comment")).sendKeys("s,dfhs,fhsdfhjkk");

        driver.findElement(By.name("author")).sendKeys("Lolol"+Math.random()*1000);

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("twojstary"+Math.random()*1000+"@wp.pl");

        driver.findElement(By.id("url")).sendKeys("www.twojstary"+Math.random()*1000+".com");

        driver.findElement(By.id("submit")).sendKeys(Keys.ENTER);


    }
}

