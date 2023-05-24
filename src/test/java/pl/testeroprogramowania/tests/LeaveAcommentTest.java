package pl.testeroprogramowania.tests;

import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LeaveAcommentTest extends BaseTest{

    @FindBy(name = "comment")
    private WebElement commentMessage;

    @FindBy(name = "author")
    private WebElement authorName;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement authorsEmail;

    @FindBy(id = "url")
    private WebElement authorsURL;

    @FindBy(name = "submit")
    private WebElement postComButton;

    @Test
    public void leaveAcommentTest() {

        PageFactory.initElements(driver,this);

        commentMessage.sendKeys("s,dfhs,fhsdfhjkk");

        authorName.sendKeys("Lolol"+Math.random()*1000);

        authorsEmail.sendKeys("twojstary"+Math.random()*1000+"@wp.pl");

        authorsURL.sendKeys("www.twojstary"+Math.random()*1000+".com");

        postComButton.click();

    }
}
