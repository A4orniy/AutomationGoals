package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1202CheckIfUserClicksOnNameInHeaderSystemsDropsUToTheHomePageOfThatRestaurant extends AbstractTestInit{
    //Logo /Merchant Name in Header :If the user clicks on the merchant's logo in the header from the home page,
    // the user should remain in the catalog template home page

    @Test

    public void CheckIfUserClicksOnNameInHeaderSystemsDropsUToTheHomePageOfThatRestaurant(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();
        restaurantElements.scrollToDepartmentLoadMoreButton();
        restaurantElements.getLoadMoreDepartmentsButton().click();
        restaurantElements.getSnacksDepartment().click();
        restaurantElements.sleep(1);
        restaurantElements.getForkfulHeader().click();
        assertTrue(restaurantElements.popularCategoriesCarousel().isDisplayed());

    }
}
