package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1179SearchFunctionalityCheckIfNothingIsFoundByYourRequestYouShouldSeeTheMessage extends AbstractTestInit{
              // If user enter some name of the item and the search didn't find any results , user should see this error message  :
             // "It looks like there aren't any matches for your search"
   //P.S - need to create stronger method , need to understand how to get exact element from the page , because current message element is
   // an Angular property and it show in specific circumstances


   @Test

    public void CheckingMessageWhenNothingIsFound(){

       ForkfulRestaurantElements ForkfulRestaurantElements = new ForkfulRestaurantElements(driver);

       ForkfulRestaurantElements.fullScreen();
       ForkfulRestaurantElements.navForkfulMarketRestaurant();
       ForkfulRestaurantElements.checkNameOfTheRestaurantIsForkfulMarket().isDisplayed();
       ForkfulRestaurantElements.getCarouselItemsSearchField().click();
       ForkfulRestaurantElements.getCarouselItemsSearchField().clear();
       ForkfulRestaurantElements.getCarouselItemsSearchField().click();
       ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
       ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
       ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
       ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
       ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
       ForkfulRestaurantElements.sleep(4);
       assertTrue(ForkfulRestaurantElements.getNothingIsFoundMessage().isDisplayed());

   }


}
