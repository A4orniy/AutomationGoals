package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1284CheckPossibilityToAddMoreThen25ItemsAfterAdding10Items extends AbstractTestInit{

    //more than 25 items: Check when user already added 10 items and the next time want to add 25 items ,
    // after clicking on "+" button more than 15 times, "You can only buy a maximum of 25 items" warning message is displayed


    @Test
    public void CheckPossibilityToAddMoreThen25ItemsAfterAdding10Items(){

        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();

        restaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        restaurantElements.plusBtnClick10Times();
        restaurantElements.sleep(1);
        restaurantElements.addToCartBtn().click();
        restaurantElements.plusBtnClick25Times();
        assertTrue(restaurantElements.warningMessageAboutMaximumOf25Items().isDisplayed());
    }
}
