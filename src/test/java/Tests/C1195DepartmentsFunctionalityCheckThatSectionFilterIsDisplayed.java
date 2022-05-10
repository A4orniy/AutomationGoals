package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1195DepartmentsFunctionalityCheckThatSectionFilterIsDisplayed extends AbstractTestInit{
    //Departments functionality: Check that the "Section" filter is displayed

    @Test
    public void CheckThatSectionFilterOnDepartmentPageIsDisplayed(){
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
    }

}
