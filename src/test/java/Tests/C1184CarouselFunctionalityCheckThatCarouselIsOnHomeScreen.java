package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1184CarouselFunctionalityCheckThatCarouselIsOnHomeScreen extends AbstractTestInit{

    @Test
    public void checkThatCarouselIsLocatedOnTheHomePage() throws Exception {
        ForkfulRestaurantElements restaurantPage = new ForkfulRestaurantElements(driver);
        restaurantPage.fullScreen();
        restaurantPage.navForkfulMarketRestaurant();

        Assert.assertTrue(restaurantPage.getCarousel().isDisplayed());
        restaurantPage.indicatorThatYouAreLocatedOnTheHomePage(); //take a look under the hood if u r not sure in the functional of this method


    }

}
