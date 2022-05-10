package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalRestaurantsSearchListElements extends AbstractBasePage{

    public GlobalRestaurantsSearchListElements(WebDriver driver){
        super(driver);
    }

    public WebElement getForkfulMarket(){
        waitForElementAppears("//h2[contains(text(),'Forkful Market')]" , 8);
        WebElement getForkful = getElementByXpath("//h2[contains(text(),'Forkful Market')]");
        return getForkful;
    }


    public WebElement signButtonOnHomePage(){
        return waitUntillElementToBeClickable("//a[@id='menu-signin']");
    }

    public WebElement getForkfulBanner(){
        waitForElementAppears("//button[@class='forkful-button']",8);
        WebElement forkfulBanner = getElementByXpath("//button[@class='forkful-button']");
        return forkfulBanner;
    }

}
