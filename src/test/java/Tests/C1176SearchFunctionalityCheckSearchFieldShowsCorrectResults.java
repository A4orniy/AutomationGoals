package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

public class C1176SearchFunctionalityCheckSearchFieldShowsCorrectResults extends AbstractTestInit {
    @Test
    public void gettingMerchantAndCheckingSearchField() {

        ForkfulRestaurantElements ForkfulRestaurantElements = new ForkfulRestaurantElements(driver);

        ForkfulRestaurantElements.fullScreen();
        ForkfulRestaurantElements.navForkfulMarketRestaurant();
        ForkfulRestaurantElements.checkNameOfTheRestaurantIsForkfulMarket().isDisplayed();
        ForkfulRestaurantElements.getCarouselItemsSearchField().click();
        ForkfulRestaurantElements.getCarouselItemsSearchField().clear();
        ForkfulRestaurantElements.getCarouselItemsSearchField().click();
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("p");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("p");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("l");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("e");
        ForkfulRestaurantElements.sleep(2);
        ForkfulRestaurantElements.checkingResultsOfSearchFieldContainsEnteredKeyword();

    }

}
