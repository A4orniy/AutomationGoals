package Tests;

import PageObject.AbstractBasePage;
import PageObject.CursorsSection;
import PageObject.ForkfulRestaurantElements;
import org.testng.annotations.Test;

public class C1444CheckThatFingerCursorIsDispayedWhenUserMovesMouseOverSearchField extends AbstractTestInit{
    //Search functionality: Check that finger cursor is displayed when user moves mouse over search button


    @Test
    public void CheckThatFingerCursorIsDispayedWhenUserMovesMouseOverSearchField(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        ForkfulRestaurantElements restaurantElements = new ForkfulRestaurantElements(driver);
        CursorsSection cursor = new CursorsSection(driver);

        abstractBasePage.fullScreen();
        restaurantElements.navForkfulMarketRestaurant();

        cursor.moveCursorToUnclickablePlaceOnCatalogHomeForkful();
        cursor.checkTypeOfCursorAtunclickablePlaceCatalogHomeForkful();

        cursor.moveCursorAtCatalogHomeSearchField();
        cursor.checkThatCursorWasChangedOnCorrectTypeAfterHoveringOnSearchFieldOnCatalogForkful();

        cursor.moveCursorAtMagnifyingGlass();
        cursor.checkThatCursorWasChangedOnCorrectTypeAfterHoveringOnMagnifyingGlass();



    }
}
