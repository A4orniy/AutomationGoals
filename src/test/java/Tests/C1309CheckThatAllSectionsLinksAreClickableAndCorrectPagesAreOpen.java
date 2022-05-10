package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import PageObject.ForkfulRestaurantElements;
import org.testng.Assert;
import org.testng.annotations.Test;

;import static org.testng.Assert.assertTrue;

public class C1309CheckThatAllSectionsLinksAreClickableAndCorrectPagesAreOpen extends AbstractTestInit {
    //Check footer functionality: Check that all sections' links are clickable and correct pages are open

    @Test
    public void CheckThatAllSectionsLinksAreClickableAndCorrectPagesAreOpen() {

        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);


        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();
        homePageElements.WaitAndGetGotItBanner().click();


        abstractBasePage.scrollToBottom();
        //Check EatStreet section in the footer
        assertTrue(homePageElements.checkEatStreetSectionFromFooter().isDisplayed());
        homePageElements.checkAboutUsSectionOfEatStreetFooter().click();
        homePageElements.aboutUsUrlAndPageCheck();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.scrollToBottom();

        homePageElements.checkContactUsSectionOfEatStreetFooter().click();
        homePageElements.contactUsUrlAndPageCheck();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.scrollToBottom();

        homePageElements.checkCareersSectionOfEatStreetFooter().click();
        homePageElements.careersUrlAndPageCheck();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.scrollToBottom();

        homePageElements.checkBecomeDriverSectionOfEatStreetFooter().click();
        homePageElements.becomeADriverUrlAndPageCheck();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.scrollToBottom();

        //Check Support section in the footer
        assertTrue(homePageElements.checkSupportSectionFromFooter().isDisplayed());
        homePageElements.checkForCustomersSectionOfSupportFooter().click();
        homePageElements.forCustomersUrlAndPageCheck();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.scrollToBottom();

        homePageElements.checkAccessibilityStatementSectionOfSupportFooter().click();
        homePageElements.accessibilityStatementUrlAndPageCheck();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.scrollToBottom();

        homePageElements.checkRestaurantDashboardSectionOfSupportFooter().click();
        homePageElements.restaurantDashboardUrlAndPageCheck();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.scrollToBottom();

        homePageElements.checkAPISectionOfSupportFooter().click();
        homePageElements.apiUrlCheck();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.scrollToBottom();

        assertTrue(homePageElements.checkGetEatStreetSectionOfSupportFooter().isDisplayed());//It opens in the new tab so I cant check it right now
        //homePageElements.getEatStreetUrlCheck();
        //abstractBasePage.navigateBackInBrowser();
        //abstractBasePage.scrollToBottom();


        assertTrue(homePageElements.checkGetHelpSectionOfSupportFooter().isDisplayed()); //Also opens in the new tab
        //homePageElements.getHelpPageCheck();
        //abstractBasePage.navigateBackInBrowser();
        //abstractBasePage.scrollToBottom();

        //Check Legal section in the footer
        assertTrue(homePageElements.checkLegalSectionFromFooter().isDisplayed());
        homePageElements.checkPrivacyPolicySectionOfLegalFooter().click();
        homePageElements.privacyPolicyUrlAndPageCheck();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.scrollToBottom();

        homePageElements.checkTermsOfUseSectionOfLegalFooter().click();
        homePageElements.termsOfUseUrlAndPageCheck();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.scrollToBottom();

        homePageElements.checkRestaurantTermsSectionOfLegalFooter().click();
        homePageElements.restaurantTermsUrlAndPageCheck();
        abstractBasePage.navigateBackInBrowser();
        abstractBasePage.scrollToBottom();

        //Check Get the App section in the footer
        assertTrue(homePageElements.checkGetTheAppSectionFromFooter().isDisplayed());
        homePageElements.checkGetItOnGooglePlaySectionOfGetTheAppFooter().click();
        homePageElements.getItOnGooglePlayUrlAndPageCheck();
        homePageElements.getEatStreetHomePage();
        abstractBasePage.scrollToBottom();

        homePageElements.checkDownloadOnTheAppStoreSectionOfGetTheAppFooter().click();
        homePageElements.downloadOnTheAppStoreUrlAndPageCheck();

    }
}
