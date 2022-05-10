package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1178SearchFunctionalityCheckThatWhenYouClicksOnFoundedItemYouWillBeRedirectedToItemDetailsScreen extends AbstractTestInit{
    @Test
    public void CheckRedirectOnItemDetailsScreenAfterClickingOnFoundedItem(){
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
        ForkfulRestaurantElements.waitForDropDownItemsWillAppear();
        assertTrue(ForkfulRestaurantElements.numberOfDropDownItems().size()>0);
        ForkfulRestaurantElements.getItemFromDropDownMenu().get(1).click();
        ForkfulRestaurantElements.sleep(2);
        assertTrue(ForkfulRestaurantElements.itemDetailsScreen().isDisplayed());
        assertTrue(ForkfulRestaurantElements.itemDetailsScreenContainsAppleKeyword().isDisplayed());


    }


}
