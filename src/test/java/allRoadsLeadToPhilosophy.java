import constants.BasicConstants;
import constants.Methods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class allRoadsLeadToPhilosophy {
    WebDriver driver;


    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Test
    public void ifTheFirstLinkOfEveryNextArticleIsClickedPageOfPhilosophyIsReached() {
     /*   driver.navigate().to(BasicConstants.BASE_URL);       --------origin
        int click = 0;
        String currentUrl = driver.getCurrentUrl();*/
        BasicConstants goToRandomWikiPage = new BasicConstants(driver, BasicConstants.BASE_URL);

        Methods countAndClickUntilThePhilosophyPageAppears = new Methods(driver);
        countAndClickUntilThePhilosophyPageAppears.clickingAndCounting(0, driver.getCurrentUrl());
        /*while (!currentUrl.equals(BasicConstants.URL_OF_PHILOSOPHY_PAGE)) {   ----origin
            navigateToNextUrl();
            click++;
            currentUrl = driver.getCurrentUrl();
            if (currentUrl.equals(BasicConstants.URL_OF_PHILOSOPHY_PAGE)) {
                System.out.println("To reach out Philosophy page it got " + click + " clicks. ");*/
            }

    @AfterEach
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.close();
    }

    // ----------------------------------------------------------------------------------------------------------

   /* public void navigateToNextUrl() {
        WebElement linkToNextPage = driver.findElement(By.xpath("//div/p/a[starts-with(@href, '/wiki/')][1]"));
        linkToNextPage.click();
    }*/
}
