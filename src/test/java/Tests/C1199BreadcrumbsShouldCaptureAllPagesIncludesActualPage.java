package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1199BreadcrumbsShouldCaptureAllPagesIncludesActualPage extends AbstractTestInit{
    //Breadcrumbs : Breadcrumbs should capture the user journey starting from the catalog
    // template home up to their current page. (e.g, Forkful Market/Milk/Oat Milk)

    @Test
    public void BreadcrumbsShouldCaptureAllPagesIncludesActualPage() throws Exception {

        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.navForkfulMarketRestaurant();
        abstractBasePage.fullScreen();

        restaurantElements.getFirstItemFromFrequentlyPurchaseScreen().click();

        assertTrue(restaurantElements.breadcrumbsCaptureForkfulMarket().isDisplayed());
        assertTrue(restaurantElements.breadcrumbsCaptureFrozenDepartment().isDisplayed());
        assertTrue(restaurantElements.breadcrumbCaptureNameOfTheIceCream().isDisplayed());


    }
}
