import mypackage.GenericPage;
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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void philosophyPageShouldAppearThenNumberOfClicksShouldPrint() {
        GenericPage openBaseUrl = new GenericPage(driver, GenericPage.BASE_URL);

        TestMethods clickAndCountUntilThePhilosophyPageAppears = new TestMethods(driver);
        clickAndCountUntilThePhilosophyPageAppears.clickCountAndPrint();
    }

    @AfterEach
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.close();
    }
}
