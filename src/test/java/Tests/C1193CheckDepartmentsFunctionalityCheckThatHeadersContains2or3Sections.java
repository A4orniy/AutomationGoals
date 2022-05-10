package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1193CheckDepartmentsFunctionalityCheckThatHeadersContains2or3Sections extends AbstractTestInit{

    //Check Departments functionality: Check that in the headers of departments is displayed 2 or 3 sections (not more and not less)
@Test
    public void CheckThatHeadersContains2Or3SectionsAndNoMoreOrLess() throws Exception {
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.fullScreen();
        restaurantElements.navForkfulMarketRestaurant();
        restaurantElements.indicatorThatYouAreLocatedOnTheHomePage();
        restaurantElements.scrollToDepartmentLoadMoreButton();
        assertTrue(restaurantElements.getDepartmentLoadMoreButton().isDisplayed());
        restaurantElements.checksSubHeadersBeforeLoadMoreButton();// For better understanding how it works , please take a look under the hood
        restaurantElements.getLoadMoreDepartmentsButton().click();
        restaurantElements.scrollToDepartmentShowLessButton();
        restaurantElements.checksSubHeadersAfterLoadMoreButton(); // For better understanding how it works , please take a look under the hood





    }

}
