package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1289CheckifUCanBuyMaximum25Items extends AbstractTestInit{

   //less than 25 items:Check if "You can only buy a maximum of [amount
    // of items on the balance] items" warning message disappears when user clicks on "-" button one time

    @Test
    public void CheckIfYouCanBuyMaximum25ItemsAtTime(){
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);

        restaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();
        restaurantElements.scrollToFrequentlyPurchasev2();
        restaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        restaurantElements.scrollDown200px();
        restaurantElements.plusBtnClick25Times();
        Assert.assertTrue(restaurantElements.warningMessageAboutMaximumOf25Items().isDisplayed());
        restaurantElements.sleep(2);
        restaurantElements.subtractItemBtn().click();
        restaurantElements.waitForElementDisappear("//p[contains(text(),'You can only buy a maximum of 25 items')]");


    }
}
