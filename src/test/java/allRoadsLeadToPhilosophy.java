import constants.BasicConstants;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class allRoadsLeadToPhilosophy extends BasicConstants {
    private static WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Test
    public void goFromRandomPageToPhilosophyPage() {
        driver.navigate().to(BASE_URL);
        int click = 1;
        String currentUrl = driver.getCurrentUrl();
        while(!currentUrl.equals(URL_OF_PHILOSOPHY_PAGE)){
            navigateToNextUrl();
            currentUrl = driver.getCurrentUrl();
            click++;
            if(currentUrl.equals(URL_OF_PHILOSOPHY_PAGE)) {
                System.out.println("To reach out Philosophy page it got " + click + " number of clicks. ");
            }
        }
    }
    @AfterEach
    public void tearDown() {
        // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        // driver.close();
    }

    // ----------------------------------------------------------------------------------------------------------
    ////html/body/div[3]/div[3]/div[5]/div[1]/p[3]/a[2]
    ///html/body/div[3]/div[3]/div[5]/div[1]/p[3]/a[1]
    public void navigateToNextUrl() {
        WebElement linkToNextPage = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p[3]/a[1]"));
        linkToNextPage.click();
    }
}
