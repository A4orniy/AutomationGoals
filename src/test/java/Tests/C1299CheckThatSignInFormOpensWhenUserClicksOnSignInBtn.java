package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import PageObject.LoginPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1299CheckThatSignInFormOpensWhenUserClicksOnSignInBtn extends AbstractTestInit{
    // Check header functionality: Check that sign in form opens when user clicks on 'Sign In' button

    @Test
    public void CheckThatSignInFormOpensWhenUserClicksOnSignInBtn(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);
        LoginPageHelper loginPageHelper = new LoginPageHelper(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();

        homePageElements.getSignInButtonOnHomePage().click();
        assertTrue(loginPageHelper.signInForm().isDisplayed());
        assertTrue(loginPageHelper.emailField().isDisplayed());
        assertTrue(loginPageHelper.passwordField().isDisplayed());
        assertTrue(loginPageHelper.signInWithFacebookBtn().isDisplayed());
        assertTrue(loginPageHelper.signInWithGoogleBtn().isDisplayed());
        assertTrue(loginPageHelper.resetYourPasswordBtn().isDisplayed());
        assertTrue(loginPageHelper.signInHeaderText().isDisplayed());
        assertTrue(loginPageHelper.getSignInButtonOnSignInPage().isDisplayed());


    }
}
