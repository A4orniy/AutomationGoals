package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class THISISNOTREADYC1196DepartmentsFunctionalityCheckSectionFilterFunctionality extends AbstractTestInit{
    //Departments functionality : Check that if you choose some of the "Section" filter , the user
    // will see the items which will be related to that filter only, and if the user will choose all
    // section filters he will see all items from all departments

    ////es-product-card//a[@data-ol-has-click-handler]

    // THIS TEST IS NOT READY !!!!

    @Test
    public void checkingSectionFilterFunctionality(){
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
        restaurantElements.selectAllCheckboxesFromDepartmentsSections();

    }
}
