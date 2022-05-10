package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPageHelper extends AbstractBasePage{
    public LoginPageHelper (WebDriver driver){
        super(driver);
    }
    public WebElement getSignInButtonOnSignInPage(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Sign In')]")));
        waitForElementAppears("//button[contains(text(),'Sign In')]",6);
        return getElementByXpath("//button[contains(text(),'Sign In')]");
    }


    public void loginPageHelper(){
        waitForElementAppears("//span[contains(text(),'Sign In')]",6);
        getElementByXpath("//span[contains(text(),'Sign In')]");
        getElementByXpath("//input[@name='email']").sendKeys("achorniy@binariks.com");
        getElementByXpath("//input[@name='password']").sendKeys("undefined0000");
        getSignInButtonOnSignInPage().sendKeys(Keys.ENTER);
        sleep(1);
        getSignInButtonOnSignInPage().sendKeys(Keys.ENTER);

    }
    public void loginAsDevAdmin(){
        getElementByXpath("//span[contains(text(),'Sign In')]").getText().contains("Sign In");
        sleep(1);
        getElementByXpath("//input[@name='email']").sendKeys("dev-admin@eatstreet.com\n");
        sleep(1);
        getElementByXpath("//input[@name='password']").sendKeys("!p6d4qm7AAvyjbi4U^&O");
        //getSignInButtonOnSignInPage().click();
        sleep(1);

    }

    public WebElement signInForm() {
        waitForElementAppears("//div[@class='user-flow']",6);
        WebElement signInForm = getElementByXpath("//div[@class='user-flow']");
        return signInForm;
    }

    public WebElement emailField() {
        waitForElementAppears("//input[@name='email']",6);
        WebElement emailField = getElementByXpath("//input[@name='email']");
        return emailField;
    }

    public WebElement passwordField() {
        waitForElementAppears("//input[@name='password']",6);
        WebElement passwordField = getElementByXpath("//input[@name='password']");
        return passwordField;
    }

    public WebElement signInWithFacebookBtn() {
        waitForElementAppears("//a[contains(text(),'Sign In with Facebook')]",6);
        WebElement signInWithFacebook = getElementByXpath("//a[contains(text(),'Sign In with Facebook')]");
        return signInWithFacebook;
    }

    public WebElement signInWithGoogleBtn() {
        waitForElementAppears("//div[contains(text(),'Sign In with Google')]",6);
        WebElement signInWithGoogle = getElementByXpath("//div[contains(text(),'Sign In with Google')]");
        return signInWithGoogle;
    }

    public WebElement resetYourPasswordBtn() {
        waitForElementAppears("//span[@id='forgot-password']",6);
        WebElement resetYourPassword = getElementByXpath("//span[@id='forgot-password']");
        return resetYourPassword;
    }

    public WebElement signInHeaderText() {
        waitForElementAppears("//span[contains(text(),'Sign In')]",6);
        WebElement signInHeaderText = getElementByXpath("//span[contains(text(),'Sign In')]");
        return signInHeaderText;
    }
}
