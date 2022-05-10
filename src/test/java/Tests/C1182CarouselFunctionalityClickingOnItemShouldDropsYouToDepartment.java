package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1182CarouselFunctionalityClickingOnItemShouldDropsYouToDepartment extends AbstractTestInit{

    @Test
    public void checkDepartmentsScreenAfterPickedCarouselItem() throws Exception {
        ForkfulRestaurantElements restaurantPage = new ForkfulRestaurantElements(driver);
        restaurantPage.navForkfulMarketRestaurant();

        restaurantPage.fullScreen();
        restaurantPage.scrollDown400px();
        restaurantPage.getCarousel();
        restaurantPage.getFourthItemFromCarousel().get(3).click();
        restaurantPage.sleep(1);
        restaurantPage.scrollDown400px();
        restaurantPage.checkingIfTheNameOfTheDepartmentsRegardsEachOther(); //Please take a look under the hood if u don't understand what is going-on in this method


    }

}
