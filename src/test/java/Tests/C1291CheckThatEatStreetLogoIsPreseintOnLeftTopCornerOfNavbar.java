package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1291CheckThatEatStreetLogoIsPreseintOnLeftTopCornerOfNavbar extends AbstractTestInit {
    //Check header functionality: Check that 'EatStreet' logo is present on the left top corner of navbar

    @Test
    public void CheckThatEatStreetLogoIsPreseintOnLeftTopCornerOfNavbar() {
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();

        assertTrue(homePageElements.eatStreetLogo().isDisplayed());

        homePageElements.checkIfSrcOfLogoIsCorrect();
        homePageElements.checkLocationOfEatStreetLogo();


    }

}
