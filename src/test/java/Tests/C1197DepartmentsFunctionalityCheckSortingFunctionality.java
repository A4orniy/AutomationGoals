package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1197DepartmentsFunctionalityCheckSortingFunctionality extends AbstractTestInit{
@Test
    public void checkRelevanceFunctionality() throws Exception {
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
        //restaurantElements.scrollDown500px();
        restaurantElements.sleep(1);
        restaurantElements.parsingAllItems();
        //restaurantElements.sleep(1);
        //restaurantElements.sortItemsViaJava();


    }

}
