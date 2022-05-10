package Tests;

import PageObject.EatStreetHomePageElements;
import PageObject.GlobalRestaurantsSearchListElements;
import PageObject.LoginPageHelper;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1189PreviousPurchaseMenuClickingOnItemShouldDropYouToItemDetailsScreen extends AbstractTestInit{
//Steps :
    /* Preconditions : you should have an account with the same orders ordered more then 10 times
    1.User goes to the home page (should see the PP section by scrolling down)
    2.
     */

    @Test
    public void CheckThatSystemDropsYouOnItemDetailsScreenAfterPickingFromPPMenu(){
        //Here I will use PP like Previous Purchase

        EatStreetHomePageElements eatStreetHomePageElements = new EatStreetHomePageElements(driver);
        LoginPageHelper loginPageHelper = new LoginPageHelper(driver);
        GlobalRestaurantsSearchListElements globalRestaurantsSearchListElements = new GlobalRestaurantsSearchListElements(driver);
        ForkfulRestaurantElements restaurantPage = new ForkfulRestaurantElements(driver);


        eatStreetHomePageElements.fullScreen();
        eatStreetHomePageElements.getEatStreetHomePage();
        eatStreetHomePageElements.WaitAndGetGotItBanner().click();
        Assert.assertTrue(eatStreetHomePageElements.getSignInButtonOnHomePage().isDisplayed());
        eatStreetHomePageElements.getSignInButtonOnHomePage().click();
        loginPageHelper.loginPageHelper();
        loginPageHelper.sleep(2);
        loginPageHelper.getSignInButtonOnSignInPage().click();
        eatStreetHomePageElements.sleep(3);
        Assert.assertTrue(eatStreetHomePageElements.getMyAccountButton().isDisplayed());
        eatStreetHomePageElements.getHomePageAddressSearchField().clear();
        eatStreetHomePageElements.searchInMadison();
        eatStreetHomePageElements.getHomePageAddressSearchField().click();
        globalRestaurantsSearchListElements.getForkfulBanner().click();
        eatStreetHomePageElements.sleep(2);
        Assert.assertTrue(restaurantPage.checkNameOfTheRestaurantIsForkfulMarket().isDisplayed());
        restaurantPage.scrollFrequentlyPurchase();
        restaurantPage.getFirstItemFromFrequentlyPurchaseScreen().click();
        restaurantPage.scrollToBottom();
        Assert.assertTrue(restaurantPage.carouselOnDepartmentsScreen().isDisplayed());
        Assert.assertTrue(restaurantPage.itemDetailsScreen().isDisplayed());



    }

}
