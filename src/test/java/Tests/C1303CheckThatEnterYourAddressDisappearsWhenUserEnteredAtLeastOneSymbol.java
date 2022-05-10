package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1303CheckThatEnterYourAddressDisappearsWhenUserEnteredAtLeastOneSymbol extends AbstractTestInit{
    //Check header functionality: Check that 'Enter Your Address' placeholder disappears when user enters at least one symbol

    @Test
    public void CheckThatEnterYourAddressDisappearsWhenUserEnteredAtLeastOneSymbol(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();
        homePageElements.getHomePageAddressSearchField().click();
        Assert.assertTrue(homePageElements.getHomePageAddressSearchField().isDisplayed());
        Assert.assertTrue(homePageElements.enterYourAddressText().isDisplayed());
        homePageElements.getHomePageAddressSearchField().sendKeys("A");
        homePageElements.checkThatEnterYourAddressDisappeared();


    }
}
