package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1281CheckThatSubtractAndPlusButtonAreActiveBetween2And25Items extends AbstractTestInit{
    //more than 25 items: Check that "-" and "+" buttons are active when count is from 2 to 25 items



    @Test
    public void CheckThatSubtractAndPlusButtonAreActiveBetween2And25Items(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements forkfulRestaurantElements = new ForkfulRestaurantElements(driver);

        forkfulRestaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();
        forkfulRestaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        forkfulRestaurantElements.scrollDown200px();
        forkfulRestaurantElements.checkThatButtonsIsActive();
    }
}
