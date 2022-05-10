package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1283CheckThatWarningMessageDoesntDisplayWithDifferentRangeOfItemsAndDifferentTypeOfItems extends AbstractTestInit{

    //more than 25 items: Check that if user clicks on "+" button up to 25 items, no warning message is
    // displayed (e.g. 1, 10,14 items one by one for each type of goods)


    @Test
    public void CheckThatWarningMessageDoesntDisplayWithDifferentRangeOfItemsAndDifferentTypeOfItems(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();

        //Here we pick first item from the Frequently Purchase carousel ,add 1 item and check if warning message doesn't appear
        restaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        restaurantElements.addToCartBtn().click();
        restaurantElements.waitForElementDisappear("//p[contains(text(),'You can only buy a maximum of 25 items')]");
        restaurantElements.sleep(1);

        //Here we pick second item from the Frequently Purchase carousel ,add 10 items and check if warning message doesn't appear
        abstractBasePage.navigateBackInBrowser();
        restaurantElements.sleep(1);
        restaurantElements.getSecondItemFromFrequentlyPurchaseScreen().click();
        restaurantElements.plusBtnClick10Times();
        restaurantElements.addToCartBtn().click();
        restaurantElements.waitForElementDisappear("//p[contains(text(),'You can only buy a maximum of 25 items')]");
        restaurantElements.sleep(1);

        //Here we pick third item from the Frequently Purchase carousel ,add 14 items and check if warning message doesn't appear
        abstractBasePage.navigateBackInBrowser();
        restaurantElements.sleep(1);
        restaurantElements.getThirdItemFromFrequentlyPurchaseScreen().click();
        restaurantElements.plusBtnClick14Times();
        restaurantElements.addToCartBtn().click();
        restaurantElements.waitForElementDisappear("//p[contains(text(),'You can only buy a maximum of 25 items')]");
        restaurantElements.sleep(1);

    }
}
