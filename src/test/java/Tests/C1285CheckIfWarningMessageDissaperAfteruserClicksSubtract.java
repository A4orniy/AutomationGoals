package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1285CheckIfWarningMessageDissaperAfteruserClicksSubtract extends AbstractTestInit {
    //more than 25 items: Check if "You can only buy a maximum of 25 items" warning message disappears when user clicks on "-" button one time
    @Test
    public void CheckIfWarningMessageDissaperAfteruserClicksSubtract() {
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();
        restaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        restaurantElements.plusBtnClick25Times();
        assertTrue(restaurantElements.warningMessageAboutMaximumOf25Items().isDisplayed());
        restaurantElements.subtractItemBtn().click();
        restaurantElements.waitForElementDisappear("//p[contains(text(),'You can only buy a maximum of 25 items')]");
        assertTrue(restaurantElements.checkingThatWeHave24ItemsAfterClickingOnSubtractBtn().isDisplayed());



    }

}
