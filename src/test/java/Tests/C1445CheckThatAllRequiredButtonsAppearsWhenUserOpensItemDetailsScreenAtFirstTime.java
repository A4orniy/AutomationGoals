package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import PageObject.LoginPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1445CheckThatAllRequiredButtonsAppearsWhenUserOpensItemDetailsScreenAtFirstTime extends AbstractTestInit{
    //Add to cart : check that "1", "Add to Cart" and "+", "-" appears on page when user opens product page in first time

    @Test

    public void checkingAllRequiredButtons(){
        ForkfulRestaurantElements forkfulRestaurantElements = new ForkfulRestaurantElements(driver);
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);


        forkfulRestaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();

        forkfulRestaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        assertTrue(forkfulRestaurantElements.theOneNumberAtItemsDetailScreen().isDisplayed());
        assertTrue(forkfulRestaurantElements.addBtn().isDisplayed());
        assertTrue(forkfulRestaurantElements.subtractItemBtn().isDisplayed());
        assertTrue(forkfulRestaurantElements.addBtn().isDisplayed());



    }
}
