package Tests;

import PageObject.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C736CheckThatYouCanFindEatStreetGroceryViaEnteringAddressForLoggedUser extends AbstractTestInit{

    @Test
    public void checkAccessEatStreetGroceryViaAddressForLogged(){
        EatStreetHomePageElements eatStreetHomePageElements = new EatStreetHomePageElements(driver);
        LoginPageHelper loginPageHelper = new LoginPageHelper(driver);
        GlobalRestaurantsSearchListElements globalRestaurantsSearchListElements = new GlobalRestaurantsSearchListElements(driver);
        ForkfulRestaurantElements ForkfulRestaurantElements = new ForkfulRestaurantElements(driver);


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
        eatStreetHomePageElements.getHomePageAddressSearchField().click();
        eatStreetHomePageElements.searchInMadison();
        eatStreetHomePageElements.sleep(3);
        eatStreetHomePageElements.scrollToForkfulMarket();
        globalRestaurantsSearchListElements.getForkfulMarket().click();
        Assert.assertTrue(ForkfulRestaurantElements.checkNameOfTheRestaurantIsForkfulMarket().isDisplayed());

    }
}
