package Tests;

import PageObject.EatStreetHomePageElements;
import PageObject.GlobalRestaurantsSearchListElements;
import PageObject.LoginPageHelper;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1187CarouselFunctionalityCheckThatCarouselShowsOnPreviousPurchaseScreen extends AbstractTestInit{

    @Test
public void checkThatCarouselShowsOnPreviousPurchaseScreen(){
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
            restaurantPage.checkNameOfTheRestaurantIsForkfulMarket().isDisplayed();
            restaurantPage.scrollFrequentlyPurchase();
            restaurantPage.getItemFromPreviousPurchaseScreen().click();
            restaurantPage.scrollToBottom();
            Assert.assertTrue(restaurantPage.carouselOnDepartmentsScreen().isDisplayed());

}

}
