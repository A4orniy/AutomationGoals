package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1201CheckIfUserClicksOnHeaderFromDepartmentAndItemDetailPageSystemDropsOnHomePage extends AbstractTestInit{
    //Logo /Merchant Name in Header : If the user clicks on the merchant's logo in the header from department and item
    // detail page, the user should go back to the catalog template home page

    @Test

    public void CheckIfUserClicksOnHeaderFromDepartmentAndItemDetailPageSystemDropsOnHomePage(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();

        //Check from department
        restaurantElements.scrollToDepartmentLoadMoreButton();
        restaurantElements.getLoadMoreDepartmentsButton().click();
        restaurantElements.getSnacksDepartment().click();
        restaurantElements.sleep(1);
        restaurantElements.getForkfulHeader().click();
        assertTrue(restaurantElements.popularCategoriesCarousel().isDisplayed());

        //Check from item detail page
        restaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        restaurantElements.getForkfulHeader().click();
        assertTrue(restaurantElements.popularCategoriesCarousel().isDisplayed());


    }
}
