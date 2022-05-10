package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1186CarouselFunctionalityCheckThatFeaturedItemslShowsOnItemDetailsScreen extends AbstractTestInit{
    @Test
    public void CheckThatFeaturedItemsShowsOnItemDetailsScreen(){
        ForkfulRestaurantElements restaurantPage = new ForkfulRestaurantElements(driver);
        restaurantPage.fullScreen();
        restaurantPage.navForkfulMarketRestaurant();

        restaurantPage.scrollDown300px();
        restaurantPage.getFourthItemFromCarousel().get(3).click();
        restaurantPage.sleep(1);
        restaurantPage.scrollDown400px();
        restaurantPage.sleep(1);
        Assert.assertTrue(restaurantPage.featuredItemsScreen().isDisplayed());
    }

}
