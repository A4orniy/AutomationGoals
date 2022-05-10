package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1305CheckThatUserCanSwitchBetweenDeliveryAndTakeoutByClickingOnIt extends AbstractTestInit{
    //Check header functionality:Check that user can switch between 'Delivery' and 'Take out' type of order by tapping on it

    @Test
    public void CheckThatUserCanSwitchBetweenDeliveryAndTakeoutByClickingOnIt(){

        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();

        assertTrue(homePageElements.getDeliveryBtn().isDisplayed());
        assertTrue(homePageElements.getTakeoutBtn().isDisplayed());

        homePageElements.getDeliveryBtn().click();
        homePageElements.checkThatUserSwitchToDelivery();

        homePageElements.getTakeoutBtn().click();
        homePageElements.checkThatUserSwitchToTakeout();
    }
}
