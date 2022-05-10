package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1192CheckDepartmentsFunctionalityCheckBeforeClickingLoadMoreIsShows8Sections extends AbstractTestInit{

    //Check Departments functionality : Check that before user clicks on the "Load more" button , he will see only 8 departments


    @Test
    public void CheckThat8SectionsIsDisplayedBeforeClickOnLoadMoreButton() throws Exception {
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);
        restaurantElements.fullScreen();
        restaurantElements.navForkfulMarketRestaurant();
        restaurantElements.indicatorThatYouAreLocatedOnTheHomePage();
        restaurantElements.scrollToDepartmentLoadMoreButton();
        assertTrue(restaurantElements.getDepartmentLoadMoreButton().isDisplayed());
        restaurantElements.checkThatNotMoreThan8SectionIsPresented();
    }
}
