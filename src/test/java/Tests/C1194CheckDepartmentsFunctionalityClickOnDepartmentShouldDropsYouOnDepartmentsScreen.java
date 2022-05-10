package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1194CheckDepartmentsFunctionalityClickOnDepartmentShouldDropsYouOnDepartmentsScreen extends AbstractTestInit{
    //Check Departments functionality : Clicking on any Department should drop you to the departments page
@Test
    public void checkingIfItIsDepartmentScreenAfterClickingOnAnyDepartment(){

        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.fullScreen();
        restaurantElements.navForkfulMarketRestaurant();
        restaurantElements.scrollToDepartmentLoadMoreButton();
        restaurantElements.getDepartmentLoadMoreButton().click();
        restaurantElements.scrollToDepartmentShowLessButton();
        restaurantElements.getSnacksDepartment().click();
        restaurantElements.sleep(2);
        restaurantElements.scrollToCategoryOnDepartmentScreen();
        assertTrue(restaurantElements.getCategoryOnDepartmentScreen().isDisplayed());
        assertTrue(restaurantElements.isDepartmentScreen().isDisplayed());


    }

}
