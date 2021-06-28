import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import static constants.BasicConstants.BASE_URL;
import static constants.BasicConstants.URL_OF_PHILOSOPHY_PAGE;

public class allRoadsLeadToPhilosophy {
    private static WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Test
    public void allRoadsLeadToPhilosophy() {
        driver.navigate().to(BASE_URL);     //open random article on Wiki
        navigateToNextUrl();
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.equals(URL_OF_PHILOSOPHY_PAGE)){
            System.out.println("hooray");
        }   else{
            navigateToNextUrl();
        }
    }

    @AfterTest
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.close();
    }

    // ------------------------------------------------------------

    public void navigateToNextUrl() {
        WebElement linkToNextPage = driver.findElement(By.className("mw-redirect"));
        linkToNextPage.click();
    }
}
