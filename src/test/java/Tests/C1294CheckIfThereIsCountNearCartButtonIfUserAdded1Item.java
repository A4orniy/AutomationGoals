package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import PageObject.ForkfulRestaurantElements;
import PageObject.GlobalRestaurantsSearchListElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1294CheckIfThereIsCountNearCartButtonIfUserAdded1Item extends AbstractTestInit{
    // Check header functionality: Check if there is count near 'Cart' button if user already added even one position

    @Test
    public void CheckIfThereIsCountNearCartButtonIfUserAdded1Item(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);
        GlobalRestaurantsSearchListElements restaurantsSearchElements = new GlobalRestaurantsSearchListElements(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();
        homePageElements.getHomePageAddressSearchField();
        homePageElements.searchInMadison();
        restaurantsSearchElements.getForkfulBanner().click();
        restaurantElements.sleep(1);
        restaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        restaurantElements.sleep(1);
        restaurantElements.clickPlusBtnRandomCountOfTimes();
        restaurantElements.addToCartBtn().click();
        homePageElements.eatStreetLogo().click();
        assertTrue(homePageElements.cartButton().isDisplayed());
        homePageElements.checkThatNumberOfItemsIsTheSameAsHighlightedIconShows();


    }
}
