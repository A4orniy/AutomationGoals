package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import PageObject.LoginPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1297CheckThatAccountInfoOpensWhenUserClicksOnMyAccountBtn extends AbstractTestInit{
    //Check header functionality: Check that account info page opens when user clicks on 'My account' button

    @Test
    public void CheckThatAccountInfoOpensWhenUserClicksOnMyAccountBtn(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);
        LoginPageHelper loginPageHelper = new LoginPageHelper(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();
        homePageElements.getSignInButtonOnHomePage().click();
        loginPageHelper.loginPageHelper();
        homePageElements.getMyAccountButton().click();
        assertTrue(homePageElements.editYourInfoButton().isDisplayed());
    }
}
