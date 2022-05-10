package Tests;

import PageObject.AbstractBasePage;
import PageObject.EatStreetHomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C1308CheckFooterFunctionalityCheckThatMainSectionsArePresent extends AbstractTestInit{
    //Check footer functionality:Check that 'EatStreet', 'Support', 'Legal' and 'Get the App' section headers are present

    @Test
    public void CheckFooterFunctionalityCheckThatMainSectionsArePresent(){
        AbstractBasePage abstractBasePage = new AbstractBasePage(driver);
        EatStreetHomePageElements homePageElements = new EatStreetHomePageElements(driver);

        abstractBasePage.fullScreen();
        homePageElements.getEatStreetHomePage();

        abstractBasePage.scrollToBottom();
        //Check EatStreet section in the footer
        assertTrue(homePageElements.checkEatStreetSectionFromFooter().isDisplayed());
        assertTrue(homePageElements.checkAboutUsSectionOfEatStreetFooter().isDisplayed());
        assertTrue(homePageElements.checkContactUsSectionOfEatStreetFooter().isDisplayed());
        assertTrue(homePageElements.checkCareersSectionOfEatStreetFooter().isDisplayed());
        assertTrue(homePageElements.checkBlogSectionOfEatStreetFooter().isDisplayed());
        assertTrue(homePageElements.checkBecomeDriverSectionOfEatStreetFooter().isDisplayed());

        //Check Support section in the footer
        assertTrue(homePageElements.checkSupportSectionFromFooter().isDisplayed());
        assertTrue(homePageElements.checkForCustomersSectionOfSupportFooter().isDisplayed());
        assertTrue(homePageElements.checkAccessibilityStatementSectionOfSupportFooter().isDisplayed());
        assertTrue(homePageElements.checkRestaurantDashboardSectionOfSupportFooter().isDisplayed());
        assertTrue(homePageElements.checkAPISectionOfSupportFooter().isDisplayed());
        assertTrue(homePageElements.checkGetEatStreetSectionOfSupportFooter().isDisplayed());
        assertTrue(homePageElements.checkGetHelpSectionOfSupportFooter().isDisplayed());

        //Check Legal section in the footer
        assertTrue(homePageElements.checkLegalSectionFromFooter().isDisplayed());
        assertTrue(homePageElements.checkPrivacyPolicySectionOfLegalFooter().isDisplayed());
        assertTrue(homePageElements.checkTermsOfUseSectionOfLegalFooter().isDisplayed());
        assertTrue(homePageElements.checkRestaurantTermsSectionOfLegalFooter().isDisplayed());

        //Check Get the App section in the footer
        assertTrue(homePageElements.checkGetTheAppSectionFromFooter().isDisplayed());
        assertTrue(homePageElements.checkGetItOnGooglePlaySectionOfGetTheAppFooter().isDisplayed());
        assertTrue(homePageElements.checkDownloadOnTheAppStoreSectionOfGetTheAppFooter().isDisplayed());


    }

}
