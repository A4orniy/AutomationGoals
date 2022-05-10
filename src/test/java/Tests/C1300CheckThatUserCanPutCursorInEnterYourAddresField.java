package Tests;

import PageObject.AbstractBasePage;
import PageObject.CursorsSection;
import PageObject.EatStreetHomePageElements;
import org.testng.annotations.Test;

public class C1300CheckThatUserCanPutCursorInEnterYourAddresField extends AbstractTestInit{
    //Check header functionality: Check that user can put cursor/focus in 'Enter Your Address' search field

    @Test
    public void CheckThatUserCanPutCursorInEnterYourAddresField(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);
        CursorsSection cursor = new CursorsSection(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();


        cursor.moveCursorOnUnClickablePlaceOnHomePage();
        cursor.checkThatCursorHasDefaultTypeBeforeHoveringOnAddressSearchFieldOnHomePage();

        cursor.moveCursorToAddressSearchFieldOnHomePage();
        cursor.checkThatCursorWasChangedOnCorrectTypeAfterHoveringOnAddressSearchFieldOnHomePage();


    }
}
