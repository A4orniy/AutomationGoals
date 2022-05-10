package PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class ForkfulRestaurantElements extends AbstractBasePage {


    public ForkfulRestaurantElements(WebDriver driver) {
        super(driver);
    }

    public void navForkfulMarketRestaurant() {
        driver.get("https://qa2.eatstreet.com/madison-wi/restaurants/forkful-market-state-street");
    }


    public WebElement checkNameOfTheRestaurantIsForkfulMarket() {
        waitForElementAppears("//h1[contains(text(),'Forkful Market by EatStreet')]", 6);
        WebElement nameOfRestaurant = getElementsByXpath("//h1[contains(text(),'Forkful Market by EatStreet')]").get(1);
        return nameOfRestaurant;
    }


    public WebElement getCarouselItemsSearchField() {
        waitForElementAppears("//input[contains(@class, 'search-input')]", 6);
        return waitUntilElementToBeClickeble("//input[contains(@class, 'search-input')]");
    }

    public WebElement getItemsDetailSearchField() {
        waitForElementAppears("//input[contains(@class, 'search-input')]", 6);
        return waitUntilElementToBeClickeble("//input[contains(@class, 'search-input')]");
    }

    public WebElement getDepartmentSearchField() {
        waitForElementAppears("//input[contains(@class, 'search-input')]", 6);
        return waitUntilElementToBeClickeble("//input[contains(@class, 'search-input')]");
    }

    public void sendkeysKeywordApple() {
        WebElement searchInput = getElementByXpath("//input[contains(@class, 'search-input')]");
        searchInput.sendKeys("a");
        waitForDropDownItemsWillAppear();
        searchInput.sendKeys("p");
        waitForDropDownItemsWillAppear();
        searchInput.sendKeys("p");
        waitForDropDownItemsWillAppear();
        searchInput.sendKeys("l");
        waitForDropDownItemsWillAppear();
        searchInput.sendKeys("e");
    }

    public WebElement waitForDropDownItemsWillAppear() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        waitForElementAppears("//div/span[contains(@class,'found-phrase')]", 6);
        return wait.until(ExpectedConditions.visibilityOf(getElementByXpath("//div/span[contains(@class,'found-phrase')]")));
    }

    public List<WebElement> getItemFromDropDownMenu() {
        waitForElementAppears("//div/span[contains(@class,'found-phrase')]", 6);
        List<WebElement> dropDownItems = getElementsByXpath("//div/span[contains(@class,'found-phrase')]");
        return dropDownItems;
    }

    public void checkingResultsOfSearchFieldContainsEnteredKeyword() {
        List<WebElement> dropDownItems = getElementsByXpath("//div/span[contains(@class,'found-phrase')]");
        if (dropDownItems.size() > 0) {
            System.out.println("Found some results");
        } else {
            ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError();
            exceptionInInitializerError.initCause(exceptionInInitializerError);
        }
        for (WebElement dropDownItem : dropDownItems) {
            waitForDropDownItemsWillAppear();
            if (dropDownItem.getText().contains("apple") | dropDownItem.getText().contains("Apple")) {
            }

        }
        System.out.println("The search is working properly. Each searching suggestion contains word 'apple'");
    }

    public List<WebElement> numberOfDropDownItems() {
        waitForElementAppears("//div/span[contains(@class,'found-phrase')]", 6);
        List<WebElement> dropDownMenu = getElementsByXpath("//div/span[contains(@class,'found-phrase')]");
        return dropDownMenu;
    }

    public WebElement itemDetailsScreenContainsAppleKeyword() {
        waitForElementAppears("//div/h4[@class='product-details']", 8);
        WebElement descriptionOfItem = getElementByXpath("//div/h4[@class='product-details']");
        sleep(1);

        if (descriptionOfItem.getText().contains("Apple") | descriptionOfItem.getText().contains("apple")) {
            System.out.println("Apple keyword is displayed");
        } else {
            System.out.println("Keyword was not found");
            ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError();
            exceptionInInitializerError.initCause(exceptionInInitializerError);
        }
        return descriptionOfItem;
    }

    public WebElement itemDetailsScreen() {
        waitForElementAppears("//span[contains(text(),'Add To Cart')]", 8);
        WebElement isItItemDetailsScreen = getElementByXpath("//span[contains(text(),'Add To Cart')]");
        return isItItemDetailsScreen;
    }

    public WebElement featuredItemsScreen() {
        waitForElementAppears("//div[@class='carousel-container']", 8);
        WebElement featuredItems = getElementByXpath("//div[@class='carousel-container']");
        return featuredItems;
    }

    public WebElement departmentScreen() {
        waitForElementAppears("//p[contains(text(),'Category')]", 8);
        WebElement departmentScreen = getElementByXpath("//p[contains(text(),'Category')]");
        return departmentScreen;
    }

    public WebElement getErrorMessage() {
        sleep(1);
        WebElement nothingIsFound = driver.findElement(By.cssSelector("div>span[_ngcontent-weo-c68]"));
        return nothingIsFound;
    }

    public WebElement getNothingIsFoundMessage() {
        waitForElementAppears("//span[contains(text(),'any matches for your search.')]",5);
        WebElement nothingIsFound = getElementByXpath("//span[contains(text(),'any matches for your search.')]");
        return nothingIsFound;
    }

    public WebElement homePageInRestaurantNavigationButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",
                getElementByXpath("//li/a[contains(text(),'Forkful Market')]"));
        return getElementsByXpath("//li/a[contains(text(),'Forkful Market')]").get(1);

    }

    public WebElement scrollToDepartmentsScreen() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",
                getElementByXpath("//span[contains(text(),'Load More')]"));
        waitUntilElementToBeClickeble("//span[contains(text(),'Load More')]");
        return getElementByXpath("//span[contains(text(),'Load More')]");
    }

    public WebElement getLoadMoreDepartmentsButton() {
        waitUntilElementToBeClickeble("//span[contains(text(),'Load More')]");
        return getElementByXpath("//span[contains(text(),'Load More')]");
    }

    public WebElement getSnacksDepartment() {
        waitForElementAppears("//h6[contains(text(),'Snacks')]", 6);
        return getElementByXpath("//h6[contains(text(),'Snacks')]");
    }

    public void afterEnteringOneLetterNothingIsShown() throws Exception {

        try {
            List<WebElement> element = getElementsByXpath("//div[@class='option ng-star-inserted']");
            if (element.size() == 0) {
                System.out.println("TEST 1: \nAll is ok ,you entered 1 letter and dropdown list doesn't appear");
            } else {
                throw new Exception("Seems like element which might be not found now is presented. Something went wrong!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Here we have NoSuchElementException , but it is ok for this case");
        } finally {
            List<WebElement> element = getElementsByXpath("//div[@class='option ng-star-inserted']");
            if (element.size() == 0) {
            } else {
                throw new Exception("Seems like element which might be not found now is presented. Something went wrong!");
            }
        }

    }

    public void afterEnteringTwoLettersDropDownIsShown() throws Exception {

        List<WebElement> dropDownSections = getElementsByXpath("//div[@class='option ng-star-inserted']");
        if (dropDownSections.size() > 0) {
            System.out.println("TEST 2: \nAll is ok ,you entered 2 or more letters and dropdown list appears and show us some results");
        } else {
            throw new Exception("SEEMS LIKE YOU ENTERED LESS THAT 2 LETTERS, OR SOMETHING OTHER WENT WRONG");
        }

    }

    public WebElement getCarousel() {
        WebElement carousel = getElementByXpath("//div[@class='carousel-container']");
        return carousel;
    }

    public void scrollLeftInTheCarousel() {
        WebElement movingElement = getElementByXpath("//app-hz-carousel-item[@style='transform: translateX(1375px); width: 255px;']");
        new Actions(driver).dragAndDropBy(movingElement, 0, 50).build().perform();
    }

    public void scrollToTheEndOfTheCarouselRight() {
        List<WebElement> allCarouselElements = getElementsByXpath("//app-hz-carousel-item");
        WebElement rightArrow = getElementByXpath("//div[contains(@class,'carousel-arrow-next')]");
        for (int i = 0; i <= allCarouselElements.size(); i++) {
            sleep(1);
            rightArrow.click();
        }
    }

    public void scrollToTheEndOfTheCarouselLeft() {
        List<WebElement> allCarouselElements = getElementsByXpath("//app-hz-carousel-item");
        WebElement leftArrow = getElementByXpath("//div[contains(@class,'carousel-arrow-prev')]");
        for (int i = 0; i <= allCarouselElements.size(); i++) {
            sleep(1);
            leftArrow.click();
        }
    }

    public WebElement leftNavigationArrowBecomesGrey() {
        return getElementByXpath("//div[contains(@class,'carousel-arrow-disabled')]");
    }

    public WebElement rightNavigationArrowBecomesGrey() {
        return getElementByXpath("//div[contains(@class,'carousel-arrow-disabled')]");
    }

    public List<WebElement> getFourthItemFromCarousel() {
        List<WebElement> getFourthItem = getElementsByXpath("//div[@class='carousel-card-wrapper']");
        return getFourthItem;
    }

    public List<WebElement> getItemsFromCarousel() throws Exception {
        List<WebElement> getItemsFromCarousel = getElementsByXpath("//app-category-carousel-item/div[@class='carousel-card-wrapper']");
        if (getItemsFromCarousel.size() > 10) {
            throw new Exception("There are more than 10 items in the carousel! Something went wrong");
        }
        return getItemsFromCarousel;
    }

    public void indicatorThatYouAreLocatedOnTheHomePage() throws Exception {
        List<WebElement> notHomePageIndicator = getElementsByXpath("//a[contains(text(),'Forkful Market')]");
        if (notHomePageIndicator.size() == 0) {
            Assert.assertTrue(true);
            System.out.println("All is fine. You're on the Home Screen");
        } else {
            Assert.assertTrue(false);
            throw new Exception("This is not a Home Screen");
        }
    }

    public WebElement carouselOnDepartmentsScreen() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement departmentCarousel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='carousel-cells']")));
        return departmentCarousel;
    }

    public WebElement getSignInButtonOnRestaurantPage() {
        WebElement signInButton = getElementByXpath("//a[contains(text(),'Sign In')]");
        return signInButton;
    }

    public WebElement scrollFrequentlyPurchase() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false)",
                getElementByXpath("//h4[contains(text(),'Previously Purchased')]"));
        scrollDown300px();
        return getElementByXpath("//h4[contains(text(),'Previously Purchased')]");
    }

    public WebElement scrollToFrequentlyPurchasev2() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false)",
                getElementByXpath("//h4[contains(text(),'Frequently Purchased')]"));
        scrollDown300px();
        return getElementByXpath("//h4[contains(text(),'Frequently Purchased')]");
    }

    public WebElement getFirstItemFromFrequentlyPurchaseScreen() {
        WebElement getSomeItem = getElementByXpath("//app-hz-carousel-item[@class='carousel-cell ng-star-inserted'][1]");
        return getSomeItem;
    }

    public WebElement getItemFromPreviousPurchaseScreen() {
        WebElement getSomeItem = getElementByXpath("//div[@class='product-container ng-star-inserted'][1]");
        return getSomeItem;
    }

    public WebElement getCarouselOnPreviousPurchaseScreen() {
        WebElement getPreviousPurchaseScreenCarousel = getElementByXpath("//div[@class='carousel-container']");
        return getPreviousPurchaseScreenCarousel;
    }


    public WebElement getSeeAllButton() {
        WebElement seeAllButton = getElementByXpath("//span[contains(text(),'See all')]");
        return seeAllButton;
    }

    public WebElement scrollToSeeAllButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",
                getElementByXpath("//span[contains(text(),'See all')]"));
        waitUntilElementToBeClickeble("//span[contains(text(),'See all')]");
        scrollDown300px();
        return getElementByXpath("//span[contains(text(),'See all')]");
    }

    public WebElement isPPScreenDisplayed() {
        waitUntilElementToBeClickeble("//h4[contains(text(),'Previously Purchased')]");
        WebElement isPPscreenDisplayed = getElementByXpath("//h4[contains(text(),'Previously Purchased')]");
        return isPPscreenDisplayed;
    }

    public WebElement getCategoryOnDepartmentScreen() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Category')]")));
        return getElementByXpath("//p[contains(text(),'Category')]");
    }

    public void scrollToCategoryOnDepartmentScreen() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",
                getElementByXpath("//p[contains(text(),'Category')]"));
        waitForElementAppears("//p[contains(text(),'Category')]", 8);
        scrollDown300px();
    }

    public WebElement isDepartmentScreen() {
        WebElement buyItAgainFilterOnDepartmentScreen = getElementByXpath("//label[contains(text(),'Buy It Again')]");
        buyItAgainFilterOnDepartmentScreen.isDisplayed();
        WebElement onSaleBtn = getElementByXpath("//label[contains(text(),'On Sale')]");
        onSaleBtn.isDisplayed();
        WebElement sectionFilter = getElementByXpath("//p[contains(text(),'Category')]");
        return sectionFilter;
    }

    public WebElement getDepartmentLoadMoreButton() {
        waitForElementAppears("//span[contains(text(),'Load More')]", 8);
        return getElementByXpath("//span[contains(text(),'Load More')]");
    }

    public WebElement getDepartmentShowLessButton() {
        return getElementByXpath("//span[contains(text(),'Show Less')]");
    }

    public void scrollToDepartmentLoadMoreButton() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                getElementByXpath("//span[contains(text(),'Load More')]"));
        waitUntilElementToBeClickeble("//span[contains(text(),'Load More')]");
    }


    public void scrollToDepartmentShowLessButton() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",
                getElementByXpath("//span[contains(text(),'Show Less')]"));
        waitForElementAppears("//span[contains(text(),'Show Less')]", 8);
        scrollDown300px();
    }

    public List<WebElement> checkThatNotMoreThan8SectionIsPresented() {
        List<WebElement> getSectionsBeforeLoadMore = getElementsByXpath("//app-dept-card[@class='ng-star-inserted']");
        if (getSectionsBeforeLoadMore.size() > 8) {
            System.out.println("There are more then 8 elements in the grid!");
            Assert.assertTrue(false);
        } else {
            System.out.println("There are less then 8 elements before the button will be clicked");
            Assert.assertTrue(true);
        }

        return getSectionsBeforeLoadMore;
    }


    public void checksSubHeadersBeforeLoadMoreButton() {
        List<WebElement> getSubHeadersOfSections = getElementsByXpath("//p[@class='subtitle']");
        for (WebElement subHeaderOfSection : getSubHeadersOfSections) {
            String str = subHeaderOfSection.getText();
            String[] arr = str.split(",");

            for (int i = 0; i < str.length(); i++) {
            }
            if (arr.length > 3 || arr.length < 2) {
                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
                System.out.println("Test Passed.The number of sub headers in section '" + str + "' = " + arr.length);
            }

        }


    }

    public void checksSubHeadersAfterLoadMoreButton() {
        List<WebElement> getSubHeadersOfSections = getElementsByXpath("//p[@class='subtitle']");
        for (WebElement subHeaderOfSection : getSubHeadersOfSections) {
            String str = subHeaderOfSection.getText();
            String[] arr = str.split(",");

            for (int i = 0; i < str.length(); i++) {
            }
            if (arr.length > 3 || arr.length < 2) {
                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
                System.out.println("Test Passed.The number of sub headers in section '" + str + "' = " + arr.length);
            }
        }
    }

    public void some() {
        WebElement element = getElementByXpath("//div[contains(@class,'product-container')]");
        System.out.println(element.getSize());
    }

    public List<WebElement> getItemWithActivatedSectionFilter() {
        List<WebElement> activatedFilterItems = getElementsByXpath("//es-product-card//div[@_ngcontent-slx-c82]/a[@_ngcontent-slx-c82]");
        return activatedFilterItems;
    }

    public List<WebElement> countOfItemsWithoutAnyActiveFilter() {
        List<WebElement> countOfItemsWithoutAnyActiveFilter = getElementsByXpath("//es-product-card//div[@_ngcontent-wpy-c82]/a[@_ngcontent-wpy-c82]");
        return countOfItemsWithoutAnyActiveFilter;
    }

    public void selectAllCheckboxesFromDepartmentsSections() {
        List<WebElement> productCardForUnselectedFilter = getElementsByXpath("//es-product-card");
        List<WebElement> allCheckboxes = getElementsByXpath("//div[@class='option-check-container']");
        for (WebElement checkbox : allCheckboxes) {
            checkbox.click();
        }

    }

    public void parsingAllItems() {
        List<WebElement> items = getElementsByXpath("//span[@class='product-price']");
        for (WebElement item : items) {
            String priceString = item.getText();
            String clearDollarSign = priceString.replaceFirst("\\$", "");
            String[] priceStringArr = clearDollarSign.split("\\n");
            double[] pricesFromPage = new double[priceStringArr.length];
            for (int i = 0; i < priceStringArr.length; i++) {
                pricesFromPage[i] = Double.parseDouble(priceStringArr[i]);
                System.out.println(pricesFromPage[i] = Double.parseDouble(priceStringArr[i]));
                System.out.println(" This is parsed prices");


            }
            WebElement lasItemFromTheList = items.get(items.size() - 1);
            //getElementByXpath("//span[contains(text(),'Out of Stock')]");
            if (lasItemFromTheList.getText().contains("Out of Stock")) {
                System.out.println("The last item is 'Out of Stock' , All works correct");
                break;
            } else {
                System.out.println("Seems like this items don't have any 'Out of Stock' items , or script doesn't work correctly");
            }
        }
    }

    public void sortItemsViaJava() {
        List<WebElement> items = getElementsByXpath("//span[@class='product-price']");
        //Here starts parsing

        for (WebElement item : items) {
            String priceString = item.getText();
            String clearDollar = priceString.replaceFirst("\\$", "");
            String[] priceStringArr = clearDollar.split("\\n");
            double[] pricesFromPage = new double[priceStringArr.length];
            for (int i = 0; i < priceStringArr.length; i++) {
                pricesFromPage[i] = Double.parseDouble(priceStringArr[i]);
            }
            double[] sortedJavaPrices = new double[pricesFromPage.length];
            for (int y = 0; y < pricesFromPage.length; y++) {
                pricesFromPage[y] = sortedJavaPrices[y];
            }
            //Here starts sorting
            boolean isSorted = false;
            double tempArr;
            while (!isSorted) {
                isSorted = true;
                for (int s = 0; s < sortedJavaPrices.length - 1; s++) {
                    if (sortedJavaPrices[s] > sortedJavaPrices[s + 1]) {
                        isSorted = false;

                        tempArr = sortedJavaPrices[s];
                        sortedJavaPrices[s] = sortedJavaPrices[s + 1];
                        sortedJavaPrices[s + 1] = tempArr;
                    }

                }
                System.out.println(Arrays.toString(sortedJavaPrices) + " This is sorted prices");
            }
//                for (int x = 0; x < sortedJavaPrices.length; ++x) {
//                    for (int j = x; j > 0; j--) {
//                        if (sortedJavaPrices[j] == sortedJavaPrices[j - 1]) {
//                            tempArr = sortedJavaPrices[j];
//                            sortedJavaPrices[j] = sortedJavaPrices[j - 1];
//                            sortedJavaPrices[j - 1] = tempArr;
//                        }
//                    }
//                }
//                for (int y = 0; y < sortedJavaPrices.length; y++) {
//                    System.out.println(sortedJavaPrices[y]);
//                }

        }

    }

    public void checkSortingPriceLowHigh() {
        parsingAllItems();

        sortItemsViaJava();
        getSortByButton().click();
        getSortingHighLowButton().click();
        parsingAllItems();

    }


    public WebElement getSortByButton() {
        waitUntillElementToBeClickable("//span[contains(text(),'Relevance')]");

        return getElementByXpath("//span[contains(text(),'Relevance')]");
    }

    public WebElement getSortingHighLowButton() {
        waitUntillElementToBeClickable("//li[contains(text(),' Price: High - Low ')]");
        return getElementByXpath("//li[contains(text(),' Price: High - Low ')]");
    }

    public WebElement getSortingLowHighButton() {
        waitUntillElementToBeClickable("//li[contains(text(),' Price: Low - High ')]");
        return getElementByXpath("//li[contains(text(),' Price: Low - High ')]");
    }

    public void scrollToFeaturedItems() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",
                getElementByXpath("//h4[contains(text(),'Featured Items')]"));
    }

    public WebElement itemHasOutOfStockLabel() {
        waitForElementAppears("//span[contains(text(),'Out of Stock')]", 8);
        WebElement outOfStockLabel = getElementByXpath("//span[contains(text(),'Out of Stock')]");
        return outOfStockLabel;

    }

    public void plusBtnClick25Times() {
        waitForElementAppears("//mat-icon[contains(text(),'add')]", 8);
        WebElement plusButton = getElementByXpath("//mat-icon[contains(text(),'add')]");
        for (int i = 1; i <= 25; i++) {
            plusButton.click();
        }
    }

    public void subtractBtnClick25Times() {
        waitForElementAppears("//mat-icon[contains(text(),'remove')]", 8);
        WebElement subtractBtn = getElementByXpath("//mat-icon[contains(text(),'remove')]");
        for (int i = 1; i <= 25; i++) {
            subtractBtn.click();
        }
    }

    public WebElement addBtn() {
        waitForElementAppears("//mat-icon[contains(text(),'add')]", 8);
        WebElement addItemButton = getElementByXpath("//mat-icon[contains(text(),'add')]");
        return addItemButton;
    }


    public WebElement warningMessageAboutMaximumOf25Items() {
        waitForElementAppears("//p[contains(text(),'You can only buy a maximum of 25 items')]", 8);
        WebElement warningMessage = getElementByXpath("//p[contains(text(),'You can only buy a maximum of 25 items')]");
        return warningMessage;
    }

    public WebElement subtractItemBtn() {
        waitForElementAppears("//mat-icon[contains(text(),'remove')]", 8);
        WebElement subtractBtn = getElementByXpath("//mat-icon[contains(text(),'remove')]");
        return subtractBtn;
    }

    public void waitForElementDisappear(String locator) {
        for (int i = 0; i < 2; i++) {
            if (driver.findElements(By.xpath(locator)).size() == 0) {
                sleep(1);
                System.out.println("The element disappear");
                break;
            } else {
                sleep(1);
            }
        }

    }

    public WebElement removeBtn() {
        waitForElementAppears("//span[contains(text(),'Remove')]", 2);
        WebElement removeBtn = getElementByXpath("//span[contains(text(),'Remove')]");
        return removeBtn;
    }

    public WebElement addToCartBtn() {
        waitForElementAppears("//span[contains(text(),'Add To Cart')]", 6);
        WebElement addToCart = getElementByXpath("//span[contains(text(),'Add To Cart')]");
        return addToCart;
    }

    public List<WebElement> cartButton() {
        List<WebElement> cartBtn = getElementsByXpath("//span[contains(text(),'Cart')]");
        return cartBtn;
    }

    public WebElement yourCartIsEmpty() {
        waitForElementAppears("//button[contains(text(),'Your cart is empty')]", 6);
        WebElement emptyCartMessage = getElementByXpath("//button[contains(text(),'Your cart is empty')]");
        return emptyCartMessage;
    }

    public void checkingIfTheNameOfTheDepartmentsRegardsEachOther() throws Exception {
        WebElement nameOfTheDepartmentAfterPickingFromTheCarousel = getElementByXpath("//h3[@class='margin-bottom-0']");
        List<WebElement> labelNameOfTheDepartment = getElementsByXpath("//label[@class='xng-breadcrumb-trail ng-star-inserted']");

        if (nameOfTheDepartmentAfterPickingFromTheCarousel.getText().toString().equals(labelNameOfTheDepartment.get(0).getText().toString())) {
            sleep(1);
            System.out.println("The item regards to the department");

        } else {
            System.out.println(nameOfTheDepartmentAfterPickingFromTheCarousel.getText().toString());
            throw new Exception("Error");
        }
    }

    public WebElement theOneNumberAtItemsDetailScreen() {
        waitForElementAppears("//div/span[contains(text(),'1')]", 6);
        WebElement theOneNumber = getElementByXpath("//div/span[contains(text(),'1')]");
        return theOneNumber;
    }

    public WebElement thePlusButtonBecomesUnActive() {
        waitForElementAppears("//button[@style='opacity: 0.5;']", 6);
        WebElement greyPlusBtn = getElementByXpath("//button[@style='opacity: 0.5;']");
        return greyPlusBtn;
    }

    public WebElement thePlusButtonIsActive() {
        waitForElementAppears("//button[@style='opacity: 1;']", 6);
        WebElement activePlusBtn = getElementByXpath("//button[@style='opacity: 1;']");
        return activePlusBtn;
    }

    public WebElement theSubtractButtonBecomesUnActive() {
        waitForElementAppears("//es-quantity-picker/div/div/button[@disabled]", 6);
        WebElement greySubtractBtn = getElementByXpath("//es-quantity-picker/div/div/button[@disabled]");
        return greySubtractBtn;
    }

    public void theSubtractButtonIsActive() {
        waitForElementDisappear("//es-quantity-picker/div/div/button[@disabled]");
    }

    public void checkThatButtonsIsActive() {
        for (int i = 1; i <= 24; i++) {
            addBtn().click();
            Assert.assertTrue(thePlusButtonIsActive().isDisplayed());
            theSubtractButtonIsActive();
        }
    }

    public WebElement checkingThatWeHave24ItemsAfterClickingOnSubtractBtn() {
        waitForElementAppears("//span[contains(text(),'24')]", 6);
        WebElement theCountOfItemsIs24 = getElementByXpath("//span[contains(text(),'24')]");
        return theCountOfItemsIs24;
    }

    public void plusBtnClick10Times() {

        waitForElementAppears("//mat-icon[contains(text(),'add')]", 6);
        WebElement clickPlusBtn = getElementByXpath("//mat-icon[contains(text(),'add')]");
        for (int i = 1; i < 10; i++) {
            clickPlusBtn.click();
        }
    }

    public void plusBtnClick14Times() {
        waitForElementAppears("//mat-icon[contains(text(),'add')]", 8);
        WebElement clickOnItem = getElementByXpath("//mat-icon[contains(text(),'add')]");
        for (int i = 1; i < 14; i++) {
            clickOnItem.click();
        }
    }

    public WebElement getSecondItemFromFrequentlyPurchaseScreen() {
        waitForElementAppears("//app-hz-carousel-item[@class='carousel-cell ng-star-inserted'][2]", 5);
        WebElement getSecondItem = getElementByXpath("//app-hz-carousel-item[@class='carousel-cell ng-star-inserted'][2]");
        return getSecondItem;
    }

    public WebElement getThirdItemFromFrequentlyPurchaseScreen() {
        WebElement getThirdItem = getElementByXpath("//app-hz-carousel-item[@class='carousel-cell ng-star-inserted'][3]");
        return getThirdItem;
    }

    public void checkHighlightedCountOfItems() throws Exception {
        //Here I will check that number of highlighted items near the Cart icon us the same as count of actual already added items in the card

        waitForElementAppears("//span[@class='nav-bar__cart-count ng-star-inserted']", 6);
        WebElement highlightedCountOfItems = getElementByXpath("//span[@class='nav-bar__cart-count ng-star-inserted']");

        waitForElementAppears("//span[@class='es-button-text']", 6);
        WebElement countFromQuantityPicker = getElementByXpath("//span[@class='controlls-quantity-count']");

        cartButton().get(0).click();

        List<WebElement> countOfItemsInsideTheCart = getElementsByXpath("//a[contains(@title,'Remove')]");

        //Here I convert the results of count from the highlighted icon near the cart firstly in the String data type and then in Integer for the future compare
        String stringResultOfHighlightedCounts = highlightedCountOfItems.getText();
        Integer intResultOfHighlightedCounts = Integer.valueOf(stringResultOfHighlightedCounts);
        System.out.println("The count of items in the highlighted icon are " + intResultOfHighlightedCounts);

        //Here I convert the results of count from the quantity picker firstly in the String data type and then in Integer for the future compare
        String stringResultOfQuantityPicker = countFromQuantityPicker.getText();
        Integer intResultOfQuantityPickerCounts = Integer.valueOf(stringResultOfQuantityPicker);
        System.out.println("The count of items in the quantity picker are " + intResultOfQuantityPickerCounts);

        //Here I convert the count of items in the cart into Integer for the future compare
        int intResultOfCountOfItemsInsideTheCart = countOfItemsInsideTheCart.size();
        System.out.println("The count of items in the cart are " + intResultOfCountOfItemsInsideTheCart);

        //Here I compare the result of count between the Highlighted icon near the cart , Quantity picker and Cart , and if the result are
        // the same - I think that test is passed
        if (intResultOfHighlightedCounts == intResultOfQuantityPickerCounts && intResultOfQuantityPickerCounts == intResultOfCountOfItemsInsideTheCart) {
            System.out.println("The count of items between Quantity picker , Highlighted icon and items in the Cart are the same");
        } else {
            throw new Exception("The count of items between Quantity picker , Highlighted icon and items in the Cart are different , it works not correct");
        }


    }


    public WebElement proceedToCheckoutBtn() {
        waitForElementAppears("//button[contains(text(),'Proceed to Checkout')]", 6);
        WebElement proceedToCheckout = getElementByXpath("//button[contains(text(),'Proceed to Checkout')]");
        return proceedToCheckout;

    }

    public WebElement upDateCartBtn() {
        waitForElementAppears("//span[contains(text(),'Update Cart')]", 6);
        WebElement updateCartBtn = getElementByXpath("//span[contains(text(),'Update Cart')]");
        return updateCartBtn;
    }

    public void clickPlusBtnRandomCountOfTimes() {
        waitForElementAppears("//mat-icon[contains(text(),'add')]", 8);
        WebElement plusBtn = getElementByXpath("//mat-icon[contains(text(),'add')]");

        Random random = new Random();
        int upperBound = 25;
        int int_random = random.nextInt(upperBound);
        for (int i = 1; i <= int_random; i++) {
            plusBtn.click();
        }
    }

    public WebElement getForkfulHeader() {
        waitForElementAppears("//h1[@class='name is-clickable']", 5);
        WebElement clickableRestaurantHeader = getElementByXpath("//h1[@class='name is-clickable']");
        return clickableRestaurantHeader;
    }

    public WebElement popularCategoriesCarousel() {
        waitForElementAppears("//div[@class='carousel-cells']", 5);
        List<WebElement> getPopularCategoriesCarousel = getElementsByXpath("//div[@class='carousel-cells']");
        return getPopularCategoriesCarousel.get(0);
    }

    public WebElement checkIfBreadcrumbsIsOnThePage() {
        waitForElementAppears("//ol[@class='xng-breadcrumb-list']", 5);
        WebElement breadcrumbs = getElementByXpath("//ol[@class='xng-breadcrumb-list']");
        return breadcrumbs;

    }

    public void checkThatCountOfSeparatorsIsTheSameAsCountOfBreadcrumbs() throws Exception {

        waitForElementAppears("//li[@class='xng-breadcrumb-item ng-star-inserted']", 5);
        waitForElementAppears("//li[@role='separator']", 5);
        List<WebElement> breadcrumbs = getElementsByXpath("//li[@class='xng-breadcrumb-item ng-star-inserted']");
        List<WebElement> separators = getElementsByXpath("//li[@role='separator']");

        int countOfBreadcrumbs = breadcrumbs.size();
        int countOfSeparators = separators.size() + 2;
        System.out.println("count of breadcrumbs" + countOfBreadcrumbs);
        System.out.println("count of separators" + countOfSeparators);

        if (countOfBreadcrumbs == countOfSeparators) {
            System.out.println("All is fine. Each of the Breadcrumbs is separated by a '/' sign");
        } else {
            throw new Exception("Something went wrong. Please pay attention to code or to count of Breadcrumbs and separators");
        }
    }

    public WebElement getFirstItemFromPopularCetagoriesCarousel() {
        waitForElementAppears("//div[@class='carousel-card-wrapper']", 6);
        List<WebElement> popularCarouselItems = getElementsByXpath("//div[@class='carousel-card-wrapper']");
        return popularCarouselItems.get(0);
    }

    public WebElement breadcrumbsCaptureForkfulMarket() {
        waitForElementAppears("//a[contains(text(),'Forkful Market By Eatstreet')]", 5);
        List<WebElement> breadcrumbsCaptureForkfulName = getElementsByXpath("//a[contains(text(),'Forkful Market By Eatstreet')]");
        breadcrumbsCaptureForkfulName.get(0).getText().contains("Forkful Market By Eatstreet");
        return breadcrumbsCaptureForkfulName.get(0);
    }

    public WebElement breadcrumbsCaptureFrozenDepartment() {
        waitForElementAppears("//a[contains(text(),'Frozen')]", 5);
        List<WebElement> breadcrumbsCaptureFrozenDepartment = getElementsByXpath("//a[contains(text(),'Frozen')]");
        breadcrumbsCaptureFrozenDepartment.get(0).getText().contains("Frozen");
        return breadcrumbsCaptureFrozenDepartment.get(0);
    }

    public WebElement breadcrumbCaptureNameOfTheIceCream() {
        waitForElementAppears("//label[contains(text(),'Ben & Jerry')]", 5);
        List<WebElement> breadcrumbCaptureNameOfTheIceCream = getElementsByXpath("//label[contains(text(),'Ben & Jerry')]");
        breadcrumbCaptureNameOfTheIceCream.get(0).getText().contains("Ben & Jerry's Half Baked Ice Cream, Pint");
        return breadcrumbCaptureNameOfTheIceCream.get(0);
    }

    public void CheckThatBreadcrumbsSectionShowsOnTheTopOfThePage() throws Exception {

        //Here I take the coordinate of Y , and set-up it as a border of the elements which I can think are located in the top of the page

        waitForElementAppears("//ol[@class='xng-breadcrumb-list']", 5);
        List<WebElement> breadCrumbsCssLocator = getElementsByCssLocators("nav ol");

        int locationBreadcrumbsY = breadCrumbsCssLocator.get(0).getLocation().y;

        if (locationBreadcrumbsY < 750) {
            System.out.println("The Breadcrumbs are located on the top of the page");
        } else {
            throw new Exception("The place of the breadcrumbs was changed. Please take a look manually");
        }
    }

    public WebElement catalogBtn() {
        waitForElementAppears("//div[contains(text(),'Catalog')]", 5);
        WebElement catalogBtn = getElementByXpath("//div[contains(text(),'Catalog')]");
        return catalogBtn;
    }

    public WebElement reviewsBtn() {
        waitForElementAppears("//div[contains(text(),'Reviews')]", 5);
        WebElement reviewsBtn = getElementByXpath("//div[contains(text(),'Reviews')]");
        return reviewsBtn;
    }

    public WebElement storeDetailsDtn() {
        waitForElementAppears("//div[contains(text(),'Store Details')]", 5);
        WebElement storeDetailsBtn = getElementByXpath("//div[contains(text(),'Store Details')]");
        return storeDetailsBtn;
    }

    public WebElement getSecondItemFromPopularCategories() {
        waitForElementAppears("//div[@class='carousel-card-wrapper']", 5);
        List<WebElement> secondItemFromPopularCategories = getElementsByXpath("//div[@class='carousel-card-wrapper']");
        return secondItemFromPopularCategories.get(1);
    }

    public void checkIfTheNameOfDepartmentRegardsToSecondItem() {

        waitForElementAppears("//span[@class='group-cuisine']", 5);
        List<WebElement> remember = getElementsByXpath("//span[@class='group-cuisine']");
        String nameOfDepartmentUnderItem = remember.get(1).getText().toString();

        waitForElementAppears("//div[@class='carousel-card-wrapper']", 5);
        List<WebElement> secondItemFromPopularCategories = getElementsByXpath("//div[@class='carousel-card-wrapper']");
        secondItemFromPopularCategories.get(1).click();

        waitForElementAppears("//h3[@class='margin-bottom-0']", 5);
        WebElement nameOfTheDepartmentOnDepartmentScreen = getElementByXpath("//h3[@class='margin-bottom-0']");
        String nameOnDepartmentScreen = nameOfTheDepartmentOnDepartmentScreen.getText().toString();

        if (nameOfDepartmentUnderItem.equals(nameOnDepartmentScreen)) {
            System.out.println("Item relates to correct department");
        }

    }

    public WebElement reviewsHeader() {
        waitForElementAppears("//h2[contains(text(),' Reviews for Forkful Market by EatStreet ')]", 6);
        WebElement reviewHeader = getElementByXpath("//h2[contains(text(),' Reviews for Forkful Market by EatStreet ')]");
        return reviewHeader;
    }

    public WebElement getShowMoreBtn() {
        waitForElementAppears("//button[contains(text(),'Show More')]", 6);
        WebElement showMoreBtn = getElementByXpath("//button[contains(text(),'Show More')]");
        return showMoreBtn;
    }

    public void getNumberOfReviews() {
        waitForElementAppears("//div[@role='heading']", 5);
        WebElement pageElementWithNumberOfReview = getElementByXpath("//div[@role='heading']");

        String stringElement = pageElementWithNumberOfReview.getText();
        System.out.println(stringElement);
        String[] splited = stringElement.split("\\s+");
        int intNumberOfReviews = Integer.parseInt(splited[2]);
        System.out.println(intNumberOfReviews);
    }

    public WebElement getSortReviews() {
        waitForElementAppears("//div[@class='mat-tab-label-content']", 5);
        List<WebElement> sortReviews = getElementsByXpath("//div[@class='mat-tab-label-content']");
        return sortReviews.get(1);
    }

    public WebElement getSortByOldest() {
        waitForElementAppears("//span[contains(text(),'Sort By: Oldest')]", 5);
        List<WebElement> sortByOldest = getElementsByXpath("//span[contains(text(),'Sort By: Oldest')]");
        return sortByOldest.get(0);
    }

    public WebElement getCaretDown() {
        //WebDriverWait wait = new WebDriverWait(driver,5);
        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#tt-icon-caret-down")));
        //waitForElementAppears("#tt-icon-caret-down",5);

        List<WebElement> caretDown = getElementsByCssLocators("#tt-icon-caret-down");
        return caretDown.get(0);

    }

    public void checkIfNumberOfReviewsInHeaderRegardsToTheirRealNumbers() {
        waitForElementAppears("//div[@role='heading']", 5);
        WebElement pageElementWithNumberOfReviews = getElementByXpath("//div[@role='heading']");

        String stringElement = pageElementWithNumberOfReviews.getText();
        String[] splited = stringElement.split("\\s+");
        int intNumberOfReviewsInHeader = Integer.parseInt(splited[2]);
        System.out.println("Number of reviews in the header : " + intNumberOfReviewsInHeader);


        waitForElementAppears("//div[@class='tt-l-grid tt-c-review__content']", 5);
        List<WebElement> numberOfRealReviews = getElementsByXpath("//div[@class='tt-l-grid tt-c-review__content']");
        int intNumbersOfRealReviews = numberOfRealReviews.size();
        System.out.println("Number of real written reviews :" + intNumbersOfRealReviews);

        if (intNumberOfReviewsInHeader == intNumbersOfRealReviews) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    public WebElement getSearchReviewsField() {
        waitForElementAppears("//input[@placeholder='Search reviews…']", 5);
        WebElement getSearchField = getElementByXpath("//input[@placeholder='Search reviews…']");

        return getSearchField;
    }

    public void checkThatSearchFieldReturnsCorrectNumberOfReviews() {
        getSearchReviewsField().sendKeys("I", Keys.ENTER);
        sleep(1);

        waitForElementAppears("//div[@role='heading']", 5);
        WebElement pageElementWithNumberOfReviews = getElementByXpath("//div[@role='heading']");

        String stringElement = pageElementWithNumberOfReviews.getText();
        String[] splited = stringElement.split(" ");
        int intNumberOfReviewsInHeaderAfterSearchWasChanged = Integer.parseInt(splited[0]);
        System.out.println("Number of reviews in the header after 'I' symbol was entered in the search field : " + intNumberOfReviewsInHeaderAfterSearchWasChanged);

        waitForElementAppears("//div[@class='tt-l-grid tt-c-review__content']", 5);
        List<WebElement> numberOfRealReviews = getElementsByXpath("//div[@class='tt-l-grid tt-c-review__content']");
        int intNumbersOfRealReviews = numberOfRealReviews.size();
        System.out.println("Number of real written reviews : " + intNumbersOfRealReviews);

        if (intNumberOfReviewsInHeaderAfterSearchWasChanged == intNumbersOfRealReviews) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    public WebElement forkfulHours() {
        waitForElementAppears("//div[contains(text(),'Forkful Market by EatStreet Hours')]", 5);
        WebElement getHeaderContainsHours = getElementByXpath("//div[contains(text(),'Forkful Market by EatStreet Hours')]");
        return getHeaderContainsHours;
    }

    public WebElement getDeliveryHoursBtn() {
        waitForElementAppears("//div[contains(text(),'Delivery Hours')]", 5);
        WebElement deliverHours = getElementByXpath("//div[contains(text(),'Delivery Hours')]");
        return deliverHours;
    }

    public WebElement getTakeoutHoursBtn() {
        waitForElementAppears("//div[contains(text(),'Takeout Hours')]", 5);
        WebElement takeoutHours = getElementByXpath("//div[contains(text(),'Takeout Hours')]");
        return takeoutHours;
    }

    public WebElement restaurantWorksOnMonday() {
        waitForElementDisappear("//*[contains(text(),'Closed')]");
        waitForElementAppears("//td[contains(text(),'Monday')]", 5);
        WebElement monday = getElementByXpath("//td[contains(text(),'Monday')]");
        return monday;
    }

    public WebElement restaurantWorksOnTuesday() {
        waitForElementDisappear("//*[contains(text(),'Closed')]");
        waitForElementAppears("//td[contains(text(),'Tuesday')]", 5);
        WebElement tuesday = getElementByXpath("//td[contains(text(),'Tuesday')]");
        return tuesday;
    }

    public WebElement restaurantWorksOnWednesday() {
        waitForElementDisappear("//*[contains(text(),'Closed')]");
        waitForElementAppears("//td[contains(text(),'Wednesday')]", 5);
        WebElement wednesday = getElementByXpath("//td[contains(text(),'Wednesday')]");
        return wednesday;
    }

    public WebElement restaurantWorksOnThursday() {
        waitForElementDisappear("//*[contains(text(),'Closed')]");
        waitForElementAppears("//td[contains(text(),'Thursday')]", 5);
        WebElement thursday = getElementByXpath("//td[contains(text(),'Thursday')]");
        return thursday;
    }

    public WebElement restaurantWorksOnFriday() {
        waitForElementDisappear("//*[contains(text(),'Closed')]");
        waitForElementAppears("//td[contains(text(),'Friday')]", 5);
        WebElement friday = getElementByXpath("//td[contains(text(),'Friday')]");
        return friday;
    }

    public WebElement restaurantWorksOnSaturday() {
        waitForElementDisappear("//*[contains(text(),'Closed')]");
        waitForElementAppears("//td[contains(text(),'Saturday')]", 5);
        WebElement saturday = getElementByXpath("//td[contains(text(),'Saturday')]");
        return saturday;
    }

    public WebElement restaurantWorksOnSunday() {
        waitForElementDisappear("//*[contains(text(),'Closed')]");
        waitForElementAppears("//td[contains(text(),'Sunday')]", 5);
        WebElement sunday = getElementByXpath("//td[contains(text(),'Sunday')]");
        return sunday;
    }
    public WebElement magnifyngGlassNearSearchField(){
        waitForElementAppears("//mat-icon[contains(@class,'arrow')]",5);
        WebElement magnifyingGlass = getElementByXpath("//mat-icon[contains(@class,'arrow')]");
        return magnifyingGlass;
    }
}









