package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1298CheckThatSignInButtonIsPresentForNotLoggedUserInTheTopRightCorner extends AbstractTestInit{
    //Check header functionality: Check that 'Sign In' button is present for not logged user on the right top corner of navbar

    @Test
    public void CheckThatSignInButtonIsPresentForNotLoggedUserInTheTopRightCorner(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();
        assertTrue(homePageElements.getSignInButtonOnHomePage().isDisplayed());
        homePageElements.checkLocationOfSignInBtnOnHomePage();


    }
}
