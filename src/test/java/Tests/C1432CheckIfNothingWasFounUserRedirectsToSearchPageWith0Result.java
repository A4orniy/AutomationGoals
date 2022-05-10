package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1432CheckIfNothingWasFounUserRedirectsToSearchPageWith0Result extends AbstractTestInit {
    //Search functionality : Check if nothing is found by your request , user
    // clicks on green search button, User will be redirected on search page with info that 0 result is found

    @Test
    public void CheckIfNothingWasFounUserRedirectsToSearchPageWith0Result(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        abstractBasePage.fullScreen();
        restaurantElements.navForkfulMarketRestaurant();

        restaurantElements.getCarouselItemsSearchField().sendKeys("A.Black is Automation QA");
        assertTrue(restaurantElements.getNothingIsFoundMessage().isDisplayed());
        restaurantElements.magnifyngGlassNearSearchField().click();

        assertTrue(restaurantElements.checkIfBreadcrumbsIsOnThePage().isDisplayed());
        assertTrue(restaurantElements.getNothingIsFoundMessage().isDisplayed());


    }
}
