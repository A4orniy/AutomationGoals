package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1180SearchFunctionalityCheckThatSearchFieldsIsShownOnEveryScreenAndWorksProperly extends AbstractTestInit {
    //Search functionality : Check that search field is shown on every screen of the restaurant and works properly

    @Test
    public void CheckSearchFieldOnEveryRestaurantScreen(){
        ForkfulRestaurantElements ForkfulRestaurantElements = new ForkfulRestaurantElements(driver);

        ForkfulRestaurantElements.fullScreen();
        ForkfulRestaurantElements.navForkfulMarketRestaurant();
        ForkfulRestaurantElements.checkNameOfTheRestaurantIsForkfulMarket().isDisplayed();
        ForkfulRestaurantElements.getCarouselItemsSearchField().click();
        ForkfulRestaurantElements.getCarouselItemsSearchField().clear();
        ForkfulRestaurantElements.getCarouselItemsSearchField().click();
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("p");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("p");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("l");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("e");
        ForkfulRestaurantElements.sleep(2);
        ForkfulRestaurantElements.waitForDropDownItemsWillAppear();
        assertTrue(ForkfulRestaurantElements.numberOfDropDownItems().size()>0);
        ForkfulRestaurantElements.checkingResultsOfSearchFieldContainsEnteredKeyword();
        ForkfulRestaurantElements.getItemFromDropDownMenu().get(1).click();
        ForkfulRestaurantElements.sleep(2);
        assertTrue(ForkfulRestaurantElements.itemDetailsScreen().isDisplayed());
        assertTrue(ForkfulRestaurantElements.itemDetailsScreenContainsAppleKeyword().isDisplayed());
        ForkfulRestaurantElements.getCarouselItemsSearchField().clear();
        ForkfulRestaurantElements.getCarouselItemsSearchField().click();
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
        ForkfulRestaurantElements.getCarouselItemsSearchField().sendKeys("a");
        ForkfulRestaurantElements.sleep(2);
        ForkfulRestaurantElements.scrollDown200px();
        assertTrue(ForkfulRestaurantElements.getNothingIsFoundMessage().isDisplayed());
        ForkfulRestaurantElements.getItemsDetailSearchField().clear();
        ForkfulRestaurantElements.getItemsDetailSearchField().sendKeys("a");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getItemsDetailSearchField().sendKeys("p");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getItemsDetailSearchField().sendKeys("p");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getItemsDetailSearchField().sendKeys("l");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getItemsDetailSearchField().sendKeys("e");
        ForkfulRestaurantElements.sleep(2);
        ForkfulRestaurantElements.waitForDropDownItemsWillAppear();
        assertTrue(ForkfulRestaurantElements.numberOfDropDownItems().size()>0);
        ForkfulRestaurantElements.checkingResultsOfSearchFieldContainsEnteredKeyword();
        ForkfulRestaurantElements.getItemFromDropDownMenu().get(1).click();
        assertTrue(ForkfulRestaurantElements.itemDetailsScreen().isDisplayed());
        assertTrue(ForkfulRestaurantElements.itemDetailsScreenContainsAppleKeyword().isDisplayed());
        ForkfulRestaurantElements.getItemsDetailSearchField().clear();
        ForkfulRestaurantElements.getItemsDetailSearchField().click();
        ForkfulRestaurantElements.getItemsDetailSearchField().sendKeys("a");
        ForkfulRestaurantElements.getItemsDetailSearchField().sendKeys("a");
        ForkfulRestaurantElements.getItemsDetailSearchField().sendKeys("a");
        ForkfulRestaurantElements.getItemsDetailSearchField().sendKeys("a");
        ForkfulRestaurantElements.getItemsDetailSearchField().sendKeys("a");
        ForkfulRestaurantElements.sleep(2);
        assertTrue(ForkfulRestaurantElements.getNothingIsFoundMessage().isDisplayed());
        ForkfulRestaurantElements.homePageInRestaurantNavigationButton().click();
        ForkfulRestaurantElements.sleep(2);
        ForkfulRestaurantElements.scrollToDepartmentsScreen();
        ForkfulRestaurantElements.getLoadMoreDepartmentsButton().click();
        ForkfulRestaurantElements.scrollDown200px();
        ForkfulRestaurantElements.getSnacksDepartment().click();
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getDepartmentSearchField().sendKeys("a");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getDepartmentSearchField().sendKeys("p");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getDepartmentSearchField().sendKeys("p");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getDepartmentSearchField().sendKeys("l");
        ForkfulRestaurantElements.sleep(1);
        ForkfulRestaurantElements.getDepartmentSearchField().sendKeys("e");
        ForkfulRestaurantElements.sleep(2);
        ForkfulRestaurantElements.checkingResultsOfSearchFieldContainsEnteredKeyword();
        ForkfulRestaurantElements.getDepartmentSearchField().clear();
        ForkfulRestaurantElements.getDepartmentSearchField().click();
        ForkfulRestaurantElements.getDepartmentSearchField().sendKeys("a");
        ForkfulRestaurantElements.getDepartmentSearchField().sendKeys("a");
        ForkfulRestaurantElements.getDepartmentSearchField().sendKeys("a");
        ForkfulRestaurantElements.getDepartmentSearchField().sendKeys("a");
        ForkfulRestaurantElements.getDepartmentSearchField().sendKeys("a");
        ForkfulRestaurantElements.sleep(2);
        ForkfulRestaurantElements.scrollDown200px();
        assertTrue(ForkfulRestaurantElements.getNothingIsFoundMessage().isDisplayed());





    }
}
