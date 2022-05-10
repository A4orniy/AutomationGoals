package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1282CheckThatPlusButtonBecomesUnActiveAfterAchieving25Items extends AbstractTestInit{
//more than 25 items: Check that if user clicks on "+" button up to 25 items and after clicking on it one more
// time, "You can only buy a maximum of 25 items" warning message is displayed and "+" button is disabled
    @Test

    public void CheckThatPlusButtonBecomesUnActiveAfterAchieving25Items(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements forkfulRestaurantElements = new ForkfulRestaurantElements(driver);

        forkfulRestaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();
        forkfulRestaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        forkfulRestaurantElements.plusBtnClick25Times();
        forkfulRestaurantElements.addToCartBtn().click();
        forkfulRestaurantElements.addBtn().click();
        assertTrue(forkfulRestaurantElements.warningMessageAboutMaximumOf25Items().isDisplayed());
        assertTrue(forkfulRestaurantElements.thePlusButtonBecomesUnActive().isDisplayed());

    }
}
