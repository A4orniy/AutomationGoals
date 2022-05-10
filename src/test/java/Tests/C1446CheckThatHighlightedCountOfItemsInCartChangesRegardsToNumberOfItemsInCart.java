package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import PageObject.LoginPageHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class C1446CheckThatHighlightedCountOfItemsInCartChangesRegardsToNumberOfItemsInCart extends AbstractTestInit{

    //Add to Cart: Check that button changes on "x in cart" and "x" is displayed near cart icon in case user added x product and click on "Add to Cart" button

    @Test
    public void CheckThatHighlightedCountOfItemsInCartChangesRegardsToNumberOfItemsInCart() throws Exception {

        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();


        restaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        restaurantElements.clickPlusBtnRandomCountOfTimes();
        restaurantElements.addToCartBtn().click();
        restaurantElements.checkHighlightedCountOfItems();//If u not sure how it works please take a look under the hood



    }

}
