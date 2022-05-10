package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1448CheckRemoveButtonWorksProperly extends AbstractTestInit{
//Add to Cart: Check if user click on "-" button and delete all items from cart than "Remove"(red) button is displayed.
// After clicking on Remove button the Cart become empty
    @Test
    public void CheckIfUserRemoveAllItemsFromCartTheRemoveButtonAppears(){
        ForkfulRestaurantElements forkfulElements = new ForkfulRestaurantElements(driver);
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);

        forkfulElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();
        forkfulElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        forkfulElements.scrollDown200px();
        forkfulElements.plusBtnClick25Times();
        forkfulElements.addToCartBtn().click();
        forkfulElements.sleep(1);
        forkfulElements.subtractBtnClick25Times();
        forkfulElements.sleep(1);
        Assert.assertTrue(forkfulElements.removeBtn().isDisplayed());
        forkfulElements.removeBtn().click();
        forkfulElements.cartButton().get(0).click();
        Assert.assertTrue(forkfulElements.yourCartIsEmpty().isDisplayed());



    }

}
