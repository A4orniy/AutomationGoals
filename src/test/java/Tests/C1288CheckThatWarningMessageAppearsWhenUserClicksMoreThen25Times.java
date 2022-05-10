package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1288CheckThatWarningMessageAppearsWhenUserClicksMoreThen25Times extends AbstractTestInit{
//less than 25 items:Check that "You can only buy a maximum of [amount of items on the balance] items" warning
// message appears when user clicks on "+" button one more time after achieving the maximum count of items
    @Test
    public void checkThatWarningMessageAppearsWhenUserClicksMoreThen25Times(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements forkfulRestaurantElements = new ForkfulRestaurantElements(driver);

        forkfulRestaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();
        forkfulRestaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        forkfulRestaurantElements.plusBtnClick25Times();
        forkfulRestaurantElements.addToCartBtn().click();
        forkfulRestaurantElements.addBtn().click();
        assertTrue(forkfulRestaurantElements.warningMessageAboutMaximumOf25Items().isDisplayed());
    }

}
