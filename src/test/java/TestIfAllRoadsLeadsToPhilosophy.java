import mypackage.TestMethods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestIfAllRoadsLeadsToPhilosophy {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void NumberOfClicksIsCountWhenPageOfPhilosophyIsReached() {
        TestMethods myMethod = new TestMethods(driver);

        myMethod.navigateToRandomWikiArticle();
        myMethod.goThroughArticlesUntilPhilosophyAppearsThenCountClicks();
    }

    @AfterEach
        public void tearDown() {
        driver.close();
    }
}
