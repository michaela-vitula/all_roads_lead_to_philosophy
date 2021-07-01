import constants.BasicConstants;
import constants.Methods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
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
    public void philosophyPageShouldAppearThenNumberOfClicksShouldPrint() {
        BasicConstants openBaseUrl = new BasicConstants(driver, BasicConstants.BASE_URL);

        Methods clickAndCountUntilThePhilosophyPageAppears = new Methods(driver);
        clickAndCountUntilThePhilosophyPageAppears.clickingAndCounting(0, driver.getCurrentUrl());
    }

    @AfterEach
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.close();
    }
}
