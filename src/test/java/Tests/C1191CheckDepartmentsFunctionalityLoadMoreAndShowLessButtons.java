package Tests;

import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1191CheckDepartmentsFunctionalityLoadMoreAndShowLessButtons extends AbstractTestInit{

//Check Departments functionality: Check the functionality of the "Load more" and "Show less" button Screen reader support enabled.


    @Test
    public void CheckLoadMoreAndShowLessButtons() throws Exception {

        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);

        restaurantElements.fullScreen();
        restaurantElements.navForkfulMarketRestaurant();
        restaurantElements.indicatorThatYouAreLocatedOnTheHomePage(); //Please take a look under the hood if you're not really understanding how it works
        restaurantElements.scrollToDepartmentLoadMoreButton();
        restaurantElements.sleep(1);
        Assert.assertTrue(restaurantElements.getDepartmentLoadMoreButton().isDisplayed());
        restaurantElements.checkThatNotMoreThan8SectionIsPresented();
        restaurantElements.getDepartmentLoadMoreButton().click();
        restaurantElements.sleep(2);
        restaurantElements.scrollToDepartmentShowLessButton();
        Assert.assertTrue(restaurantElements.getDepartmentShowLessButton().isDisplayed());
        restaurantElements.getDepartmentShowLessButton().click();

    }

}
