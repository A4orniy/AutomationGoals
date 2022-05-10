package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import org.testng.annotations.Test;

public class C1306CheckThatGedFedBtnIsPresentNearSearchField extends AbstractTestInit {
    //Check header functionality: Check that 'Get Fed' button is present on near search field

    @Test
    public void CheckThatGedFedBtnIsPresentNearSearchField() {
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();

        homePageElements.CheckThatGedFedBtnIsPresentNearSearchField();

    }
}
