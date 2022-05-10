package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1447CheckThatUpdateCartAppearsAfterAddingItem extends AbstractTestInit{
    //Add to Cart: Check if user have 2 items in Cart and added one more item(clicks on +),"Update Cart" name of button is displayed


    @Test
    public void CheckThatUpdateCartAppearsAfterAddingItem(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();
        restaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        assertTrue(restaurantElements.addToCartBtn().isDisplayed());
        restaurantElements.addToCartBtn().click();
        restaurantElements.addBtn().click();
        assertTrue(restaurantElements.upDateCartBtn().isDisplayed());
        restaurantElements.upDateCartBtn().click();


    }
}
