package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import org.testng.annotations.Test;

public class C1304CheckIfUserClicksOnLocationIconItShowsUseMyLocation extends AbstractTestInit{
    // Check header functionality:Check if location icon button is present on the right
    // corner in 'Enter Your Address' search field and 'Use my location' tooltip is shown when user hovers the cursor on that

    @Test
    public void CheckIfUserClicksOnLocationIconItShowsUseMyLocation(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();

        homePageElements.checkIfUseMyLocationTitleShowsWhenUserHoverCursorOnLocationIcon();
        homePageElements.checkThatLocationIconIsLocatedInCorrectPlace();
    }
}
