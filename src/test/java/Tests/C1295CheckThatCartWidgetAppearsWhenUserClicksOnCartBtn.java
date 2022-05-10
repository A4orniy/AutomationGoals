package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import PageObject.ForkfulRestaurantElements;
import PageObject.GlobalRestaurantsSearchListElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1295CheckThatCartWidgetAppearsWhenUserClicksOnCartBtn extends AbstractTestInit{

    //Check header functionality: Check that cart widget appears when user clicks on 'Cart' button


    @Test
    public void  CheckThatCartWidgetAppearsWhenUserClicksOnCartBtn () {
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);
        GlobalRestaurantsSearchListElements restaurantsSearchListElements = new GlobalRestaurantsSearchListElements(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();

        assertTrue(homePageElements.cartButton().isDisplayed());
        homePageElements.cartButton().click();
        assertTrue(homePageElements.yourCartIsEmptyMessage().isDisplayed());
        homePageElements.cartButton().click();
        homePageElements.getHomePageAddressSearchField().click();
        homePageElements.searchInMadison();
        assertTrue(restaurantsSearchListElements.getForkfulBanner().isDisplayed());
        restaurantsSearchListElements.getForkfulBanner().click();
        restaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        restaurantElements.sleep(1);
        restaurantElements.clickPlusBtnRandomCountOfTimes();
        restaurantElements.addToCartBtn().click();
        homePageElements.eatStreetLogo().click();
        homePageElements.cartButton().click();
        homePageElements.yourCartIsEmptyMessageDisappeared();
        assertTrue(homePageElements.yourOrderHeader().isDisplayed());
        assertTrue(homePageElements.numberOfItemsInTheCart().size()>0);


    }
}
