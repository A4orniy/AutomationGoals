package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1183CarouselFunctionalityNotMoreThan10ItemsInCarousel extends AbstractTestInit{

    @Test
    public void CheckForCountOfItemsInCarousel() throws Exception {
        ForkfulRestaurantElements restaurantPage = new ForkfulRestaurantElements(driver);
        restaurantPage.fullScreen();
        restaurantPage.navForkfulMarketRestaurant();
        restaurantPage.sleep(2);
        restaurantPage.scrollDown300px();
        restaurantPage.getItemsFromCarousel();
        Assert.assertTrue(restaurantPage.getItemsFromCarousel().size()<11);

    }

}
