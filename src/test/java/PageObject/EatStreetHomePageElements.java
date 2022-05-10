package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class EatStreetHomePageElements extends AbstractBasePage {
    public EatStreetHomePageElements(WebDriver driver) {
        super(driver);
    }

    String EatStreetHP = "https://qa2.eatstreet.com";

    public void getEatStreetHomePage() {
        navigate(EatStreetHP);
    }

    public WebElement isDeliveryDisplayedByDefaultOnHomePage() {
        waitForElementAppears("//label[@for='home-checkbox-delivery']", 6);
        return getElementByXpath("//label[@for='home-checkbox-delivery']");
    }

    public WebElement getHomePageAddressSearchField() {
        waitForElementAppears("//input[@id='input-food-search']", 6);
        return getElementByXpath("//input[@id='input-food-search']");
    }

    public void searchInMadison() {
        getElementByXpath("//input[@id='input-food-search']").sendKeys("Madison , WI", Keys.ENTER, Keys.ENTER);
    }

    public WebElement getSignInButtonOnHomePage() {
        waitForElementAppears("//a[@id='menu-signin']", 6);
        return getElementByXpath("//a[@id='menu-signin']");
    }

    public WebElement getMyAccountButton() {
        waitForElementAppears("//a[@id='menu-my-account']", 8);
        return getElementByXpath("//a[@id='menu-my-account']");
    }

    public WebElement WaitAndGetGotItBanner() {
        waitForElementAppears("//button[@class='btn']", 6);
        return getElementByXpath("//button[@class='btn']");
    }

    public void checkIfSrcOfLogoIsCorrect() {
        waitForElementAppears("//img[@alt='EatStreet Logo']", 5);
        WebElement altEatStreetLogo = getElementByXpath("//img[@alt='EatStreet Logo']");
        String currentSrcOfLogo = getElementByCssLocator("img").getAttribute("src");
        System.out.println("Current sources of logo is : " + currentSrcOfLogo);

        String whatSrcShouldToBe = "https://static.eatstreet.com/redesign/img/logos/es-logo-with-trademark.svg";
        System.out.println("The sources of logo what it should be is : " + whatSrcShouldToBe);

        if (currentSrcOfLogo.equals(whatSrcShouldToBe)) {
            System.out.println("The sources of current logo and logo which should to be is the same");
        } else {
            Assert.assertTrue(false);
            System.out.println("The sources of logo are different. Please check it");
        }
    }

    public List<WebElement> numberOfItemsInTheCart() {
        waitForElementAppears("//a[@id='remove-item']", 5);
        List<WebElement> numberOfItems = getElementsByXpath("//a[@id='remove-item']");
        return numberOfItems;
    }

    public void checkLocationOfEatStreetLogo() {
        waitForElementAppears("//img[@alt='EatStreet Logo']", 5);
        int locationLogoX = getElementByXpath("//img[@alt='EatStreet Logo']").getLocation().x;
        int locationLogoY = getElementByXpath("//img[@alt='EatStreet Logo']").getLocation().y;
        System.out.println("X location of logo is: " + locationLogoX);
        System.out.println("Y location of logo is : " + locationLogoY);

        if (locationLogoX <= 380 && locationLogoY <= 80) {
            Assert.assertTrue(true);
            System.out.println("I can say that location of the logo is in the top left corner of the page");
        } else {
            Assert.assertTrue(false);
            System.out.println("The location of logo is wrong or was changed. Please check it");
        }
    }

    public WebElement eatStreetLogo() {
        waitForElementAppears("//img[@alt='EatStreet Logo']", 5);
        WebElement logo = getElementByXpath("//img[@alt='EatStreet Logo']");
        return logo;
    }

    public WebElement cartButton() {
        waitForElementAppears("//a[contains(text(),'Cart')]", 5);
        WebElement cartBtn = getElementByXpath("//a[contains(text(),'Cart')]");
        return cartBtn;
    }

    public void checkThatNumberOfItemsIsTheSameAsHighlightedIconShows() {
        waitForElementAppears("//span[contains(@class,'navbar__cart-count')]", 5);
        WebElement highlightedIcon = getElementByXpath("//span[contains(@class,'navbar__cart-count')]");

        String numberOfItemsInHighlightedIcon = highlightedIcon.getText();
        int intNumberOfItemsInHighlightedIcon = Integer.parseInt(numberOfItemsInHighlightedIcon);

        cartButton().click();

        int intNumberOfItemsInTheCart = numberOfItemsInTheCart().size();

        if (highlightedIcon.isDisplayed() && intNumberOfItemsInHighlightedIcon == intNumberOfItemsInTheCart) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

    }

    public WebElement yourCartIsEmptyMessage() {
        waitForElementAppears("//a[contains(text(),'Your Cart is Empty')]", 8);
        WebElement yourCartIsEmptyMessage = getElementByXpath("//a[contains(text(),'Your Cart is Empty')]");
        return yourCartIsEmptyMessage;
    }

    public void yourCartIsEmptyMessageDisappeared() {
        waitForElementDisappear("//a[contains(text(),'Your Cart is Empty')]");
    }

    public WebElement yourOrderHeader() {
        waitForElementAppears("//h2[contains(text(),'Your Order')]", 6);
        WebElement yourOrderHeaderMessage = getElementByXpath("//h2[contains(text(),'Your Order')]");
        return yourOrderHeaderMessage;
    }

    public void checkThatMyAccountButtonIsPresentedOnTopRightCornerOfThePage() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("resolution", "1024x768");
        int locationOfMyAccountBtnByX = getMyAccountButton().getLocation().x;
        int locationOfMyAccountBtnByY = getMyAccountButton().getLocation().y;
        System.out.println("The coordinates of 'My Account' button is :" + locationOfMyAccountBtnByX + " for X, and : " + locationOfMyAccountBtnByY + " for Y");

        if (locationOfMyAccountBtnByX < 1705 & locationOfMyAccountBtnByX > 1410 & locationOfMyAccountBtnByY < 25 & locationOfMyAccountBtnByY >= 0) {
            Assert.assertTrue(true);
            System.out.println("Regards to coordinates for X and Y I can say that the 'My Account' button is located in the top right corner of the page");
        } else {
            Assert.assertTrue(false);
            System.out.println("Seems like regards to coordinates for X and Y , the 'My Account' button is located not in the top right corner");
        }
    }

    public WebElement editYourInfoButton() {
        waitForElementAppears("//a[@id='edit-info']", 8);
        WebElement editYourInfoBtn = getElementByXpath("//a[@id='edit-info']");
        return editYourInfoBtn;
    }

    public void checkLocationOfSignInBtnOnHomePage() {
        int locationOfSignInBtnOnHomePageByX = getSignInButtonOnHomePage().getLocation().x;
        int locationOfSignInBtnOnHomePageByY = getSignInButtonOnHomePage().getLocation().y;
        System.out.println("The coordinates of 'Sign In' button for X is : " + locationOfSignInBtnOnHomePageByX +
                " and for Y is : " + locationOfSignInBtnOnHomePageByY);

        if (locationOfSignInBtnOnHomePageByX > 1300 && locationOfSignInBtnOnHomePageByX < 1920
                && locationOfSignInBtnOnHomePageByY >= 0 && locationOfSignInBtnOnHomePageByY < 30) {
            System.out.println("Given the regarding coordinates of the button I can say that 'Sign In' button is located in the right top corner of the page");
            Assert.assertTrue(true);
        } else {
            System.out.println("Given the regarding coordinates of the button I can say that 'Sign In' button is located in wrong place. Please check it");
            Assert.assertTrue(false);
        }
    }

    public WebElement enterYourAddressText() {
        waitForElementAppears("//input[@placeholder='Enter Your Address']", 6);
        WebElement enterYourAddress = getElementByXpath("//input[@placeholder='Enter Your Address']");
        return enterYourAddress;
    }

    public void checkThatEnterYourAddressDisappeared() {
        waitForElementDisappear("//autocomplete/div/input[contains(@class,'ng-empty')]");
    }

    public void checkIfUseMyLocationTitleShowsWhenUserHoverCursorOnLocationIcon() {
        waitForElementAppears("//div[@title='Use my location']", 6);
        WebElement locationIcon = getElementByXpath("//div[@title='Use my location']");

        Actions actions = new Actions(driver);
        actions.moveToElement(locationIcon).build().perform();

        String expectedTitle = "Use my location";
        String actualTitle = locationIcon.getAttribute("title");
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void checkThatLocationIconIsLocatedInCorrectPlace() {
        waitForElementAppears("//div[@title='Use my location']", 6);
        WebElement locationIcon = getElementByXpath("//div[@title='Use my location']");

        int coordinatesOfLocationIconByX = locationIcon.getLocation().x;
        int coordinatesOfLocationIconByY = locationIcon.getLocation().y;
        System.out.println("Coordinates of X for location icon is : " + coordinatesOfLocationIconByX);
        System.out.println("Coordinates of Y for location icon is : " + coordinatesOfLocationIconByY);

        if (coordinatesOfLocationIconByX > 1080 && coordinatesOfLocationIconByX < 1150 &&
                coordinatesOfLocationIconByY > 340 && coordinatesOfLocationIconByY < 410) {
            System.out.println("Regards given coordinates I can think that icon is located correctly");
            Assert.assertTrue(true);
        } else {
            System.out.println("Regards given coordinates I can say that location icon located in wrong place. Please take attention");
            Assert.assertTrue(false);
        }
    }

    public WebElement getDeliveryBtn() {
        waitForElementAppears("//label[@for='home-checkbox-delivery']", 6);
        WebElement deliveryBtn = getElementByXpath("//label[@for='home-checkbox-delivery']");
        return deliveryBtn;
    }

    public WebElement getTakeoutBtn() {
        waitForElementAppears("//label[@for='home-checkbox-takeout']", 6);
        WebElement takeoutBtn = getElementByXpath("//label[@for='home-checkbox-takeout']");
        return takeoutBtn;
    }

    public void checkThatUserSwitchToTakeout() {
        waitForElementDisappear("//input[contains(@class, 'ng-valid-parse') and contains(@id, 'home-checkbox-delivery')]");
    }

    public void checkThatUserSwitchToDelivery() {
        waitForElementDisappear("//input[contains(@class, 'ng-valid-parse') and contains(@id, 'home-checkbox-takeout')]");
    }


    public void CheckThatGedFedBtnIsPresentNearSearchField() {
        waitForElementAppears("//*[div[contains(@class,'food-search--home')]/a[contains(text(),'Get Fed')]]", 5);
        waitForElementAppears("//input[@placeholder='Enter Your Address']", 5);
        waitForElementAppears("//a[contains(text(),'Get Fed')]", 5);
        WebElement getFedBtn = getElementByXpath("//a[contains(text(),'Get Fed')]");
        WebElement searchField = getElementByXpath("//input[@placeholder='Enter Your Address']");
        WebElement checkThatGetFedBtnIncludedInTheSameWebElementAsSearchField =
                getElementByXpath("//*[div[contains(@class,'food-search--home')]/a[contains(text(),'Get Fed')]]");
        Assert.assertTrue(checkThatGetFedBtnIncludedInTheSameWebElementAsSearchField.isDisplayed());


        int locationOfGetFedBtnByX = getFedBtn.getLocation().x;
        int locationOfGetFedBtnByY = getFedBtn.getLocation().y;

        int locationOfSearchFieldByX = searchField.getLocation().x;
        int locationOfSearchFieldByY = searchField.getLocation().y;

        int actualDifferenceByX = locationOfGetFedBtnByX - locationOfSearchFieldByX;
        int actualDifferenceByY = locationOfSearchFieldByY - locationOfGetFedBtnByY;

        System.out.println("The location of 'Get Fed' button by X is : " + locationOfGetFedBtnByX);
        System.out.println("The location of 'Ged Fed' button by Y is : " + locationOfGetFedBtnByY);
        System.out.println("The location of search field by X is : " + locationOfSearchFieldByX);
        System.out.println("The location of search field by Y is : " + locationOfSearchFieldByY);

        if (locationOfGetFedBtnByX - locationOfSearchFieldByX < 600
                && locationOfSearchFieldByY - locationOfGetFedBtnByY < 100) {
            System.out.println("Difference between X coordinates of 'Ged Fed' button and search field is " +
                    actualDifferenceByX);
            System.out.println("And by Y is " + actualDifferenceByY);
            System.out.println("I set-up the maximum of difference for X - 600 , and for Y - 100");
            System.out.println("So I can think that 'Ged Fed' button placed near the search field");
            Assert.assertTrue(true);
        } else {
            System.out.println("Difference between X coordinates of 'Ged Fed' button and search field is" +
                    actualDifferenceByX);
            System.out.println("And by Y is " + actualDifferenceByY);
            System.out.println("I set-up the maximum of difference for X - 600 , and for Y - 100");
            System.out.println("So I can't say that 'Ged Fed' button placed near the search field. Please take a look on it");
            Assert.assertTrue(false);
        }

    }

    public WebElement checkEatStreetSectionFromFooter() {
        waitForElementAppears("//h6[contains(text(),'EatStreet')]", 5);
        WebElement eatStreetFooter = getElementByXpath("//h6[contains(text(),'EatStreet')]");
        return eatStreetFooter;
    }

    public WebElement checkAboutUsSectionOfEatStreetFooter() {
        waitForElementAppears("//a[contains(text(),'About Us')]", 5);
        WebElement aboutUs = getElementByXpath("//a[contains(text(),'About Us')]");
        return aboutUs;
    }

    public WebElement checkContactUsSectionOfEatStreetFooter() {
        waitForElementAppears("//a[contains(text(),'Contact Us')]", 5);
        WebElement contactUs = getElementByXpath("//a[contains(text(),'Contact Us')]");
        return contactUs;
    }

    public WebElement checkCareersSectionOfEatStreetFooter() {
        waitForElementAppears("//a[contains(text(),'Careers')]", 5);
        WebElement careers = getElementByXpath("//a[contains(text(),'Careers')]");
        return careers;
    }

    public WebElement checkBlogSectionOfEatStreetFooter() {
        waitForElementAppears("//a[contains(text(),'Blog')]", 5);
        WebElement blog = getElementByXpath("//a[contains(text(),'Blog')]");
        return blog;
    }

    public WebElement checkBecomeDriverSectionOfEatStreetFooter() {
        waitForElementAppears("//a[contains(text(),'Become a Driver!')]", 5);
        WebElement becomeADriver = getElementByXpath("//a[contains(text(),'Become a Driver!')]");
        return becomeADriver;
    }

    public WebElement checkSupportSectionFromFooter() {
        waitForElementAppears("//h6[contains(text(),'Support')]", 5);
        WebElement support = getElementByXpath("//h6[contains(text(),'Support')]");
        return support;
    }

    public WebElement checkForCustomersSectionOfSupportFooter() {
        waitForElementAppears("//a[contains(text(),'For Customers')]", 5);
        WebElement forCustomers = getElementByXpath("//a[contains(text(),'For Customers')]");
        return forCustomers;
    }

    public WebElement checkAccessibilityStatementSectionOfSupportFooter() {
        waitForElementAppears("//a[contains(text(),'Accessibility Statement')]", 5);
        WebElement accessibilityStatement = getElementByXpath("//a[contains(text(),'Accessibility Statement')]");
        return accessibilityStatement;
    }

    public WebElement checkRestaurantDashboardSectionOfSupportFooter() {
        waitForElementAppears("//a[contains(text(),'Restaurant Dashboard')]", 5);
        WebElement restaurantDashboard = getElementByXpath("//a[contains(text(),'Restaurant Dashboard')]");
        return restaurantDashboard;
    }

    public WebElement checkAPISectionOfSupportFooter() {
        waitForElementAppears("//a[@href='http://developers.eatstreet.com']", 5);
        WebElement api = getElementByXpath("//a[@href='http://developers.eatstreet.com']");
        return api;
    }

    public WebElement checkGetEatStreetSectionOfSupportFooter() {
        waitForElementAppears("//a[contains(text(),'Get EatStreet')]", 5);
        WebElement getEatStreet = getElementByXpath("//a[contains(text(),'Get EatStreet')]");
        return getEatStreet;
    }

    public WebElement checkGetHelpSectionOfSupportFooter() {
        waitForElementAppears("//a[contains(text(),'Get Help')]", 5);
        WebElement getHelp = getElementByXpath("//a[contains(text(),'Get Help')]");
        return getHelp;
    }

    public WebElement checkLegalSectionFromFooter() {
        waitForElementAppears("//h6[contains(text(),'Legal')]", 5);
        WebElement legal = getElementByXpath("//h6[contains(text(),'Legal')]");
        return legal;
    }

    public WebElement checkPrivacyPolicySectionOfLegalFooter() {
        waitForElementAppears("//a[contains(text(),'Privacy Policy')]", 5);
        WebElement privacyPolicy = getElementByXpath("//a[contains(text(),'Privacy Policy')]");
        return privacyPolicy;
    }

    public WebElement checkTermsOfUseSectionOfLegalFooter() {
        waitForElementAppears("//a[contains(text(),'Terms of Use')]", 5);
        WebElement termsOfUse = getElementByXpath("//a[contains(text(),'Terms of Use')]");
        return termsOfUse;
    }

    public WebElement checkRestaurantTermsSectionOfLegalFooter() {
        waitForElementAppears("//a[contains(text(),'Restaurant Terms')]", 5);
        WebElement restaurantTerms = getElementByXpath("//a[contains(text(),'Restaurant Terms')]");
        return restaurantTerms;
    }

    public WebElement checkGetTheAppSectionFromFooter() {
        waitForElementAppears("//h6[contains(text(),'Get the App')]", 5);
        WebElement getTheApp = getElementByXpath("//h6[contains(text(),'Get the App')]");
        return getTheApp;
    }

    public WebElement checkGetItOnGooglePlaySectionOfGetTheAppFooter() {
        waitForElementAppears("//a[@aria-label='Get app in Google Play']", 5);
        WebElement getItOnGooglePlay = getElementByXpath("//a[@aria-label='Get app in Google Play']");
        return getItOnGooglePlay;
    }

    public WebElement checkDownloadOnTheAppStoreSectionOfGetTheAppFooter() {
        waitForElementAppears("//a[@aria-label='Get app in App Store']", 5);
        WebElement downloadOnTheAppStore = getElementByXpath("//a[@aria-label='Get app in App Store']");
        return downloadOnTheAppStore;

    }

    public void aboutUsUrlAndPageCheck() {
        waitForElementAppears("//h1[contains(text(),'About Us')]", 5);
        WebElement aboutUsHeader = getElementByXpath("//h1[contains(text(),'About Us')]");
        String aboutUsUrl = "https://qa2.eatstreet.com/about-us";
        String currentUrl = driver.getCurrentUrl();

        if (aboutUsUrl.equals(currentUrl) && aboutUsHeader.isDisplayed()) {
            System.out.println("After clicking on 'About Us' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'About us' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    aboutUsUrl);
            Assert.assertTrue(false);
        }

    }

    public void contactUsUrlAndPageCheck() {
        waitForElementAppears("//h1[contains(text(),'Contact Us')]", 5);
        WebElement contactUsHeader = getElementByXpath("//h1[contains(text(),'Contact Us')]");
        String contactUsUrl = "https://qa2.eatstreet.com/contact";
        String currentUrl = driver.getCurrentUrl();

        if (contactUsUrl.equals(currentUrl) && contactUsHeader.isDisplayed()) {
            System.out.println("After clicking on 'Contact Us' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'Contact Us' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    contactUsUrl);
            Assert.assertTrue(false);
        }

    }

    public void careersUrlAndPageCheck() {
        waitForElementAppears("//h1[contains(text(),'Become a part of EatStreet!')]", 5);
        WebElement careersHeader = getElementByXpath("//h1[contains(text(),'Become a part of EatStreet!')]");
        String careersUrl = "https://qa2.eatstreet.com/careers";
        String currentUrl = driver.getCurrentUrl();

        if (careersUrl.equals(currentUrl) && careersHeader.isDisplayed()) {
            System.out.println("After clicking on 'Careers' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on 'Careers' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    careersUrl);
            Assert.assertTrue(false);
        }

    }

    public void blogUrlAndPageCheck() {
        waitForElementAppears("//a[contains(text(),'Blog Home') and contains(@role,'menuitem')]", 5);
        WebElement blogHomeBtn = getElementByXpath("//a[contains(text(),'Blog Home') and contains(@role,'menuitem')]");
        String blogUrl = "https://blog.eatstreet.com/";
        String currentUrl = driver.getCurrentUrl();

        if (blogUrl.equals(currentUrl) && blogHomeBtn.isDisplayed()) {
            System.out.println("After clicking on 'Blog' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'Blog' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    blogUrl);
            Assert.assertTrue(false);
        }

    }

    public void becomeADriverUrlAndPageCheck() {
        waitForElementAppears("//h1[contains(text(),'Earn your way, Drive for Eatstreet')]", 5);
        WebElement becomeADriverHeader = getElementByXpath("//h1[contains(text(),'Earn your way, Drive for Eatstreet')]");
        String becomeADriverUrl = "https://qa2.eatstreet.com/driver-careers";
        String currentUrl = driver.getCurrentUrl();

        if (becomeADriverUrl.equals(currentUrl) && becomeADriverHeader.isDisplayed()) {
            System.out.println("After clicking on 'Become a Driver' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'Become a Driver' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    becomeADriverUrl);
            Assert.assertTrue(false);
        }

    }

    public void forCustomersUrlAndPageCheck() {
        waitForElementAppears("//h2[contains(text(),'Hungry. Happy. EatStreet.')]", 5);
        WebElement forCustomersHeader = getElementByXpath("//h2[contains(text(),'Hungry. Happy. EatStreet.')]");
        String forCustomersUrl = "https://eatst.force.com/customers/s/";
        String currentUrl = driver.getCurrentUrl();

        if (forCustomersUrl.equals(currentUrl) && forCustomersHeader.isDisplayed()) {
            System.out.println("After clicking on 'For Customers' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'For Customers' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    forCustomersUrl);
            Assert.assertTrue(false);
        }

    }

    public void accessibilityStatementUrlAndPageCheck() {
        waitForElementAppears("//h2[contains(text(),'Accessibility Statement')]", 5);
        WebElement accessibilityStatementHeader = getElementByXpath("//h2[contains(text(),'Accessibility Statement')]");
        String accessibilityStatementUrl = "https://qa2.eatstreet.com/accessibility";
        String currentUrl = driver.getCurrentUrl();

        if (accessibilityStatementUrl.equals(currentUrl) && accessibilityStatementHeader.isDisplayed()) {
            System.out.println("After clicking on 'Accessibility Statement' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'Accessibility Statement' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    accessibilityStatementUrl);
            Assert.assertTrue(false);
        }

    }

    public void restaurantDashboardUrlAndPageCheck() {
        waitForElementAppears("//div[@behavior='SigninBehavior']", 5);
        WebElement signInFormForDashboard = getElementByXpath("//div[@behavior='SigninBehavior']");
        String restaurantDashboardUrl = "https://qa2.eatstreet.com/restaurant-dashboard/signin?next=support";
        String currentUrl = driver.getCurrentUrl();

        if (restaurantDashboardUrl.equals(currentUrl) && signInFormForDashboard.isDisplayed()) {
            System.out.println("After clicking on 'Restaurant Dashboard' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'Restaurant Dashboard' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    restaurantDashboardUrl);
            Assert.assertTrue(false);
        }

    }

    public void apiUrlCheck() {
        String apiUrl = "https://developers.eatstreet.com/";
        String currentUrl = driver.getCurrentUrl();

        if (apiUrl.equals(currentUrl) ) {
            System.out.println("After clicking on 'API' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'API' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    apiUrl);
            Assert.assertTrue(false);
        }

    }

    public void getEatStreetUrlCheck() {
        String getEatStreet = "http://geteatstreet.com/";
        String getEatStreetBroken = "https://qa2.eatstreet.com/";
        String currentUrl = driver.getCurrentUrl();

        if (getEatStreet.equals(currentUrl) | getEatStreet.equals(getEatStreetBroken)) {
            System.out.println("After clicking on 'Get EatStreet' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'Get EatStreet' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    getEatStreet);
            Assert.assertTrue(false);
        }

    }

    public void getHelpPageCheck() {
        waitForElementAppears("//span[contains(@id,'clientChatWindow')]", 8);
        WebElement getHelp = getElementByXpath("//span[contains(@id,'clientChatWindow')]");

        if (getHelp.isDisplayed()) {
            System.out.println("After clicking on 'Get Help' section user sees the chat with EatStreet Bot");
            Assert.assertTrue(true);
        } else {
            System.out.println("After clicking on 'Get Help' section user doesn't see the chat with EatStreet Bot. Please take a look manually");
            Assert.assertTrue(false);
        }

    }

    public void privacyPolicyUrlAndPageCheck() {
        waitForElementAppears("//h2[contains(text(),'Privacy Policy')]", 5);
        WebElement privacyPolicyHeader = getElementByXpath("//h2[contains(text(),'Privacy Policy')]");
        String privacyPolicyUrl = "https://qa2.eatstreet.com/privacy";
        String currentUrl = driver.getCurrentUrl();

        if (privacyPolicyUrl.equals(currentUrl) && privacyPolicyHeader.isDisplayed()) {
            System.out.println("After clicking on 'Privacy Policy' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'Privacy Policy' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    privacyPolicyUrl);
            Assert.assertTrue(false);
        }

    }

    public void termsOfUseUrlAndPageCheck() {
        waitForElementAppears("//h2[contains(text(),'Terms of Use')]", 5);
        WebElement termsOfUse = getElementByXpath("//h2[contains(text(),'Terms of Use')]");
        String termsOfUseUrl = "https://qa2.eatstreet.com/terms";
        String currentUrl = driver.getCurrentUrl();

        if (termsOfUseUrl.equals(currentUrl) && termsOfUse.isDisplayed()) {
            System.out.println("After clicking on 'Terms of Use' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'Terms of Use' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    termsOfUseUrl);
            Assert.assertTrue(false);
        }

    }

    public void restaurantTermsUrlAndPageCheck() {
        waitForElementAppears("//h2[contains(text(),'Merchant Terms and Conditions')]", 5);
        WebElement restaurantTerms = getElementByXpath("//h2[contains(text(),'Merchant Terms and Conditions')]");
        String restaurantTermsUrl = "https://qa2.eatstreet.com/restaurant-terms-of-service";
        String currentUrl = driver.getCurrentUrl();

        if (restaurantTermsUrl.equals(currentUrl) && restaurantTerms.isDisplayed()) {
            System.out.println("After clicking on 'Restaurant Terms' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'Restaurant Terms' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    restaurantTermsUrl);
            Assert.assertTrue(false);
        }

    }

    public void getItOnGooglePlayUrlAndPageCheck() {
        //waitForElementAppears("//span[contains(text(),'EatStreet:')]", 5);
        //WebElement getItOnGooglePlay = getElementByXpath("//span[contains(text(),'EatStreet:')]");
        String getItOnGooglePlayUrl = "https://play.google.com/store/apps/details?id=com.eatstreet.android&hl=en";
        String currentUrl = driver.getCurrentUrl();

        if (getItOnGooglePlayUrl.equals(currentUrl)) {
            System.out.println("After clicking on 'Get It On Google Play' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'Get It On Google Play' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    getItOnGooglePlayUrl);
            Assert.assertTrue(false);
        }

    }

    public void downloadOnTheAppStoreUrlAndPageCheck() {
        waitForElementAppears("//h1[contains(text(),'EatStreet ')]", 5);
        WebElement downloadOnTheAppStore = getElementByXpath("//h1[contains(text(),'EatStreet ')]");
        String downloadOnTheAppStoreUrl = "https://apps.apple.com/us/app/eatstreet-food-delivery-take-out-app/id664697933";
        String currentUrl = driver.getCurrentUrl();

        if (downloadOnTheAppStoreUrl.equals(currentUrl) && downloadOnTheAppStore.isDisplayed()) {
            System.out.println("After clicking on 'Download On The App Store' section user sees this URL :" + "'" + currentUrl + "'." + "Correct page is displayed");
            Assert.assertTrue(true);
        } else {
            System.out.println("The current URL after clicking on the 'Download On The App Store' section is :" + "'" + currentUrl + "' " + "but it should be this: " +
                    downloadOnTheAppStoreUrl);
            Assert.assertTrue(false);
        }

    }
}



