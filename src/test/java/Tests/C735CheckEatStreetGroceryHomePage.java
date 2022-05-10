package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C735CheckEatStreetGroceryHomePage extends AbstractTestInit{

    @Test
    public void checkEatStreetGroceryHomePage(){
        ForkfulRestaurantElements ForkfulRestaurantElements = new ForkfulRestaurantElements(driver);

        ForkfulRestaurantElements.fullScreen();
        ForkfulRestaurantElements.navForkfulMarketRestaurant();
        Assert.assertTrue(ForkfulRestaurantElements.checkNameOfTheRestaurantIsForkfulMarket().isDisplayed());
    }
}
