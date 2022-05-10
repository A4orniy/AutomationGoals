package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1200BreadcrumbsEachStepShouldBeSeparatedByASlashSign extends AbstractTestInit{

    //Breadcrumbs : Each "Step" should be separated by a "/"

    @Test
    public void EachStepShouldBeSeparatedByASlashSign() throws Exception {
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();

        restaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();
        restaurantElements.getFirstItemFromPopularCetagoriesCarousel().click();
        assertTrue(restaurantElements.checkIfBreadcrumbsIsOnThePage().isDisplayed());
        restaurantElements.checkThatCountOfSeparatorsIsTheSameAsCountOfBreadcrumbs();//Please take a look under the hood if u not sure how it works


    }

}
