package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1198CheckBreadcrumbsAreLocatedInTheTopOfThePage extends AbstractTestInit{
//Breadcrumbs : Breadcrumbs should be located at the top of the page

    @Test
    public void CheckBreadcrumbsAreLocatedInTheTopOfThePage() throws Exception {
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        abstractBasePage.fullScreen();
        restaurantElements.navForkfulMarketRestaurant();

        restaurantElements.getSecondItemFromFrequentlyPurchaseScreen().click();
        assertTrue(restaurantElements.checkIfBreadcrumbsIsOnThePage().isDisplayed());
        restaurantElements.CheckThatBreadcrumbsSectionShowsOnTheTopOfThePage();




    }
}
