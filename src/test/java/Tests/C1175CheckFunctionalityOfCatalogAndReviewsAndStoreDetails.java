package Tests;

import PageObject.AbstractBasePage;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1175CheckFunctionalityOfCatalogAndReviewsAndStoreDetails extends AbstractTestInit {
    //Check functionality of the "Catalog" , "Reviews" and "Store details" functionality (they might
    // be the same as in the non merchant restaurants except "Catalog" button, it should redirect you to place in the restaurant which was your last

    @Test
    public void checkFunctionalityOfCatalogSection() {
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        abstractBasePage.fullScreen();
        restaurantElements.navForkfulMarketRestaurant();

        assertTrue(restaurantElements.catalogBtn().isDisplayed());
        assertTrue(restaurantElements.reviewsBtn().isDisplayed());
        assertTrue(restaurantElements.storeDetailsDtn().isDisplayed());

        restaurantElements.getSecondItemFromPopularCategories();
        restaurantElements.checkIfTheNameOfDepartmentRegardsToSecondItem();
        restaurantElements.getForkfulHeader().click();
        restaurantElements.getForkfulHeader().click();
        restaurantElements.getSecondItemFromFrequentlyPurchaseScreen().click();
        assertTrue(restaurantElements.addToCartBtn().isDisplayed());
        restaurantElements.getForkfulHeader().click();
        restaurantElements.sleep(2);
        restaurantElements.scrollToDepartmentLoadMoreButton();
        restaurantElements.getDepartmentLoadMoreButton().click();
        restaurantElements.scrollDown200px();
        restaurantElements.getSnacksDepartment().click();
        restaurantElements.sleep(2);
        restaurantElements.scrollToCategoryOnDepartmentScreen();

        assertTrue(restaurantElements.departmentScreen().isDisplayed());


    }

    @Test
    public void checkFunctionalityOfReviewsSection() {
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        abstractBasePage.fullScreen();
        restaurantElements.navForkfulMarketRestaurant();
        restaurantElements.reviewsBtn().click();
        restaurantElements.sleep(1);
        assertTrue(restaurantElements.reviewsHeader().isDisplayed());
        restaurantElements.scrollToBottom();
        restaurantElements.getShowMoreBtn().click();
        restaurantElements.scrollToTop();
        restaurantElements.sleep(2);
        restaurantElements.checkIfNumberOfReviewsInHeaderRegardsToTheirRealNumbers();
        restaurantElements.checkThatSearchFieldReturnsCorrectNumberOfReviews();
        restaurantElements.getSearchReviewsField().clear();

    }

    @Test
    public void checkFunctionalityOfStoreDetailsSection() {
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        abstractBasePage.fullScreen();
        restaurantElements.navForkfulMarketRestaurant();
        restaurantElements.storeDetailsDtn().click();

        assertTrue(restaurantElements.forkfulHours().isDisplayed());
        assertTrue(restaurantElements.getDeliveryHoursBtn().isDisplayed());
        assertTrue(restaurantElements.getTakeoutHoursBtn().isDisplayed());

        //Check that restaurant works every day with delivery
        restaurantElements.getDeliveryHoursBtn().click();
        assertTrue(restaurantElements.restaurantWorksOnMonday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnTuesday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnWednesday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnThursday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnFriday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnSaturday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnSunday().isDisplayed());

        //Check that restaurant works every day with takeout
        restaurantElements.getTakeoutHoursBtn().click();
        assertTrue(restaurantElements.restaurantWorksOnMonday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnTuesday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnWednesday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnThursday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnFriday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnSaturday().isDisplayed());
        assertTrue(restaurantElements.restaurantWorksOnSunday().isDisplayed());

        //And check for the catalog (it should redirect me to the home page after I will click on it)
        restaurantElements.catalogBtn().click();
        assertTrue(restaurantElements.popularCategoriesCarousel().isDisplayed());


    }


}
