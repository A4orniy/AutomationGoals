package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1181CarouselFunctionalityScrolling extends AbstractTestInit{
    // Carousel functionality: Scrolling. Items scrolls smooth , you can also use the navigation arrows for scrolling

    @Test
    public void checkScrollByDragAndDropAndScrollByArrows(){
        ForkfulRestaurantElements restaurantPage = new ForkfulRestaurantElements(driver);
        restaurantPage.navForkfulMarketRestaurant();

        restaurantPage.fullScreen();
        restaurantPage.scrollDown400px();
        restaurantPage.sleep(1);
        restaurantPage.getCarousel();
        restaurantPage.sleep(1);
        restaurantPage.scrollLeftInTheCarousel();
        restaurantPage.sleep(1);
        restaurantPage.scrollToTheEndOfTheCarouselRight();
        Assert.assertTrue(restaurantPage.rightNavigationArrowBecomesGrey().isDisplayed());
        restaurantPage.scrollToTheEndOfTheCarouselLeft();
        Assert.assertTrue(restaurantPage.leftNavigationArrowBecomesGrey().isDisplayed());

    }


}
