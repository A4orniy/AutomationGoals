package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import PageObject.LoginPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1296CheckThatMyAccountButtonIsPresentedForLoggerUserInTopRightCorner extends AbstractTestInit {
    //Check header functionality: Check that 'My account' button is present for logged user on the right top corner of navbar

    @Test
    public void CheckThatMyAccountButtonIsPresentedForLoggerUserInTopRightCorner(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        LoginPageHelper loginPageHelper = new LoginPageHelper(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();
        assertTrue(homePageElements.getSignInButtonOnHomePage().isDisplayed());
        homePageElements.getSignInButtonOnHomePage().click();
        loginPageHelper.loginPageHelper();
        assertTrue(homePageElements.getMyAccountButton().isDisplayed());
        homePageElements.checkThatMyAccountButtonIsPresentedOnTopRightCornerOfThePage();
    }
}
