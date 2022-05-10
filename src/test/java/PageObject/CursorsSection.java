package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CursorsSection extends AbstractBasePage{
    public CursorsSection(WebDriver driver) {
        super(driver);
    }

    public void moveCursorToAddressSearchFieldOnHomePage() {
        waitForElementAppears("//input[@placeholder='Enter Your Address']",6);
        WebElement addressSearchField = getElementByXpath("//input[@placeholder='Enter Your Address']");
        Actions actions = new Actions(driver);
        actions.moveToElement(addressSearchField).build().perform();
        System.out.println("The type of the cursor after hovering on address search field is : " + "'" + addressSearchField.getCssValue("cursor")+ "'");
    }
    public void moveCursorOnUnClickablePlaceOnHomePage(){
        //Here I will move the cursor on some unclickable place for identifying the default type of cursor
        WebElement typeOfCursorIsAuto = getElementByXpath("//section[@class='text-center landing-callout--image promo_text']");
        Actions actions = new Actions(driver);
        actions.moveToElement(typeOfCursorIsAuto).build().perform();
        System.out.println("Cursor type before hovering on address search field is : " + "'"+typeOfCursorIsAuto.getCssValue("cursor")+"'");

    }

    public void checkThatCursorHasDefaultTypeBeforeHoveringOnAddressSearchFieldOnHomePage() {
        waitForElementAppears("//section[@class='text-center landing-callout--image promo_text']",5);
        WebElement auto = getElementByXpath("//section[@class='text-center landing-callout--image promo_text']");

        String defaultTypeOfCursor = auto.getCssValue("cursor").toString();

        if (defaultTypeOfCursor.equals("auto")){
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

    }
    public void checkThatCursorWasChangedOnCorrectTypeAfterHoveringOnAddressSearchFieldOnHomePage(){
        waitForElementAppears("//input[@placeholder='Enter Your Address']",5);
        WebElement textTypeOfCursor = getElementByXpath("//input[@placeholder='Enter Your Address']");

        String typeOfCursorWasChanged = textTypeOfCursor.getCssValue("cursor").toString();

        if (typeOfCursorWasChanged.equals("text")){
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

    }

    public void moveCursorToUnclickablePlaceOnCatalogHomeForkful() {
        waitForElementAppears("//div[@style='transform: none;']",5);
        WebElement unclickablePlace = getElementByXpath("//div[@style='transform: none;']");
        Actions actions = new Actions(driver);
        actions.moveToElement(unclickablePlace).build().perform();

    }

    public void checkTypeOfCursorAtunclickablePlaceCatalogHomeForkful() {
        waitForElementAppears("//div[@style='transform: none;']",5);
        WebElement unclickablePlace = getElementByXpath("//div[@style='transform: none;']");

        String typeOFCursorAtUnclickablePlace = unclickablePlace.getCssValue("cursor");
        System.out.println("Type of cursor at unclickable place is :" +"'" + typeOFCursorAtUnclickablePlace + "'"+ " expected - auto");

        if (typeOFCursorAtUnclickablePlace.equals("auto")){
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    public void moveCursorAtCatalogHomeSearchField() {
        waitForElementAppears("//input[@placeholder='Search by brand or item name']",5);
        WebElement searchFieldAtCatalogHome = getElementByXpath("//input[@placeholder='Search by brand or item name']");

        Actions actions = new Actions(driver);
        actions.moveToElement(searchFieldAtCatalogHome).build().perform();
    }

    public void checkThatCursorWasChangedOnCorrectTypeAfterHoveringOnSearchFieldOnCatalogForkful() {
        waitForElementAppears("//input[@placeholder='Search by brand or item name']",5);
        WebElement searchField = getElementByXpath("//input[@placeholder='Search by brand or item name']");

        String typeOfCursorAtSearchField = searchField.getCssValue("cursor");
        System.out.println("Type of cursor at search field place is :" +"'" + searchField.getCssValue("cursor") + "'"+ " expected - text");

        if (typeOfCursorAtSearchField.equals("text")){
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    public void moveCursorAtMagnifyingGlass() {
        waitForElementAppears("//button[@class='search-button']",5);
        WebElement magnifyingGlass = getElementByXpath("//button[@class='search-button']");

        Actions actions = new Actions(driver);
        actions.moveToElement(magnifyingGlass).build().perform();
    }

    public void checkThatCursorWasChangedOnCorrectTypeAfterHoveringOnMagnifyingGlass() {
        waitForElementAppears("//button[@class='search-button']",5);
        WebElement magnifyingGlass = getElementByXpath("//button[@class='search-button']");

        String typeOfCursorAtMagnifyingGlass = magnifyingGlass.getCssValue("cursor");
        System.out.println("Type of cursor at search button place is :" +"'" + magnifyingGlass.getCssValue("cursor") + "'" + " expected - pointer");

        if (typeOfCursorAtMagnifyingGlass.equals("pointer")){
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }
}
