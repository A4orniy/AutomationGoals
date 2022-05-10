package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AbstractTestInit {

    WebDriver driver;

    @BeforeMethod

    public void allSet() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void closeBrowser(){
        try {
            Thread.sleep(0000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
