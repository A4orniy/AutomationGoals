package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1272SearchFunctionalityCheckThatSearchResultsShowsAfter2Letters extends AbstractTestInit {
//Search functionality | Check that if you enter one letter nothing will be founded (the search should starts from 2 or more letters)


    @Test
    public void searchResultStartsFromEnteringMinimum2Letters() throws Exception {
        //Test for 1 letter
        ForkfulRestaurantElements ForkfulRestaurantElements = new ForkfulRestaurantElements(driver);

        ForkfulRestaurantElements.fullScreen();
        ForkfulRestaurantElements.navForkfulMarketRestaurant();
        Assert.assertTrue(ForkfulRestaurantElements.checkNameOfTheRestaurantIsForkfulMarket().isDisplayed());
        ForkfulRestaurantElements.getCarouselItemsSearchField().click();
        ForkfulRestaurantElements.getCarouselItemsSearchField().clear();
        ForkfulRestaurantElements.getCarouselItemsSearchField().click();
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
        ForkfulRestaurantElements.sleep(2);
        ForkfulRestaurantElements.afterEnteringOneLetterNothingIsShown();

        //      Test for 2 and more letters
        ForkfulRestaurantElements.getCarouselItemsSearchField().clear();
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("p");
        ForkfulRestaurantElements.sleep(2);
        ForkfulRestaurantElements.afterEnteringTwoLettersDropDownIsShown();
    }

}
