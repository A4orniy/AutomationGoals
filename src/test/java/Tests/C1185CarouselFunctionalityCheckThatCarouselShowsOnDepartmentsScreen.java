package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1185CarouselFunctionalityCheckThatCarouselShowsOnDepartmentsScreen extends AbstractTestInit{
@Test
public void checkCarouselOnDepartmantScreen(){
    ForkfulRestaurantElements restaurantPage = new ForkfulRestaurantElements(driver);
    restaurantPage.fullScreen();
    restaurantPage.navForkfulMarketRestaurant();

    restaurantPage.scrollToDepartmentsScreen();
    restaurantPage.getLoadMoreDepartmentsButton().click();
    restaurantPage.getSnacksDepartment().click();
    restaurantPage.scrollDown300px();
    Assert.assertTrue(restaurantPage.carouselOnDepartmentsScreen().isDisplayed());


}

}
