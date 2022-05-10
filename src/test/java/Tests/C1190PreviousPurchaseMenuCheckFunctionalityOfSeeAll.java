package Tests;

import PageObject.EatStreetHomePageElements;
import PageObject.GlobalRestaurantsSearchListElements;
import PageObject.LoginPageHelper;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1190PreviousPurchaseMenuCheckFunctionalityOfSeeAll extends AbstractTestInit {

    @Test
    public void CheckSeeAllOnPreviousPurchaseScreen(){

        EatStreetHomePageElements eatStreetHomePageElements = new EatStreetHomePageElements(driver);
        LoginPageHelper loginPageHelper = new LoginPageHelper(driver);
        GlobalRestaurantsSearchListElements globalRestaurantsSearchListElements = new GlobalRestaurantsSearchListElements(driver);
        ForkfulRestaurantElements restaurantPage = new ForkfulRestaurantElements(driver);


        eatStreetHomePageElements.fullScreen();
        eatStreetHomePageElements.getEatStreetHomePage();
        eatStreetHomePageElements.WaitAndGetGotItBanner().click();
        Assert.assertTrue(eatStreetHomePageElements.getSignInButtonOnHomePage().isDisplayed());
        eatStreetHomePageElements.getSignInButtonOnHomePage().click();
        loginPageHelper.loginAsDevAdmin();
        loginPageHelper.sleep(2);
        loginPageHelper.getSignInButtonOnSignInPage().click();
        eatStreetHomePageElements.sleep(3);
        Assert.assertTrue(eatStreetHomePageElements.getMyAccountButton().isDisplayed());
        eatStreetHomePageElements.getHomePageAddressSearchField().clear();
        eatStreetHomePageElements.getHomePageAddressSearchField().click();
        eatStreetHomePageElements.searchInMadison();
        eatStreetHomePageElements.sleep(2);
        eatStreetHomePageElements.scrollToForkfulMarket();
        globalRestaurantsSearchListElements.getForkfulMarket().click();
        Assert.assertTrue(restaurantPage.checkNameOfTheRestaurantIsForkfulMarket().isDisplayed());
        restaurantPage.scrollToSeeAllButton();
        restaurantPage.getSeeAllButton().click();
        Assert.assertTrue(restaurantPage.isPPScreenDisplayed().isDisplayed());

    }


}
