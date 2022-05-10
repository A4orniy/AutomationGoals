package Tests;

import PageObject.ForkfulRestaurantElements;
import PageObject.EatStreetHomePageElements;
import PageObject.GlobalRestaurantsSearchListElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1313CheckThatYouCanFindEatStreetGroceryViaEnteringAddressForUnloggedUser extends AbstractTestInit {


    @Test
    public void checkAccessForkfulViaAddressForUnlogged() {
        EatStreetHomePageElements eatStreetHomePageElements = new EatStreetHomePageElements(driver);
        ForkfulRestaurantElements ForkfulRestaurantElements = new ForkfulRestaurantElements(driver);
        GlobalRestaurantsSearchListElements globalRestaurantsSearchListElements = new GlobalRestaurantsSearchListElements(driver);

        eatStreetHomePageElements.fullScreen();
        eatStreetHomePageElements.getEatStreetHomePage();
        eatStreetHomePageElements.WaitAndGetGotItBanner().click();
        eatStreetHomePageElements.isDeliveryDisplayedByDefaultOnHomePage();
        eatStreetHomePageElements.searchInMadison();
        eatStreetHomePageElements.sleep(2);
        eatStreetHomePageElements.scrollToForkfulMarket();
        globalRestaurantsSearchListElements.getForkfulMarket().click();
        Assert.assertTrue(ForkfulRestaurantElements.checkNameOfTheRestaurantIsForkfulMarket().isDisplayed());




    }

}
