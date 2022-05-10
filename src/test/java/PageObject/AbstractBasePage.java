package PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.util.List;

public class AbstractBasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getElementByXpath(String locator) {
        return driver.findElement(By.xpath(locator));
    }

    public List<WebElement> getElementsByXpath(String locator) {
        return driver.findElements(By.xpath(locator));
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fullScreen() {
        driver.manage().window().maximize();
    }

    public void navigate(String url) {
        driver.get(url);
    }

    public WebElement waitUntilElementToBeClickeble(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return getElementByXpath(locator);
    }

    public WebElement waitVisibilityOfElement(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void scrollToForkfulMarket() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",
                getElementByXpath("//h2[contains(text(),'Forkful Market')]"));
    }


    public WebElement waitUntillElementToBeClickable(String locator) {

        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public void sendKeysJSAlternative() {
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("document.getElementById('gsc-i-id1').value='apple'");
    }

    public List<WebElement> waitUntillElementsToBeClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }

    public void scrollDown100px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
    }

    public void scrollDown200px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
    }

    public void scrollDown300px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }

    public void scrollDown400px() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,400)");

    }

    public void scrollDown500px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    public void scrollDown600px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
    }

    public void scrollDown700px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
    }

    public void scrollDown800px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
    }

    public void scrollDown900px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
    }

    public void scrollDown1000px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToTop() {
        JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
        jsExecuter.executeScript("window.scrollTo(0,document.body.scrollTop)");
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    public void waitForElementAppears(String locator, int seconds) {
        for (int i = 0; i < seconds; i++) {
            if (driver.findElements(By.xpath(locator)).size() > 0) {
                break;
            } else {
                sleep(1);
                System.out.println("No such element  \n  The X-Path name of the locator is: " + locator);
            }
        }
    }

    public WebElement getElementByCssLocator(String cssLocator) {
        WebElement getElementByCssLocator = driver.findElement(By.cssSelector(cssLocator));
        return getElementByCssLocator;
    }

    public List<WebElement> getElementsByCssLocators(String cssLocator) {
        List<WebElement> getElementsByCssLocator = driver.findElements(By.cssSelector(cssLocator));
        return getElementsByCssLocator;
    }

    public void navigateBackInBrowser() {
        driver.navigate().back();
    }

    public WebElement getSrcOfTheElement(String cssLocator) {
        WebElement getSrc = driver.findElement(By.cssSelector(cssLocator));
        return getSrc;
    }

    public void waitForElementDisappear(String locator) {
        for (int i = 0; i < 8; i++) {
            if (driver.findElements(By.xpath(locator)).size() == 0) {
                sleep(1);
                Assert.assertTrue(true);
                System.out.println("The element disappear");
                break;
            } else {
                Assert.assertTrue(false);
                sleep(1);
            }
        }
    }

    public void changeResolutionTo1024x768() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("resolution","1024x768");
    }
}
