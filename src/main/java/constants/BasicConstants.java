package constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicConstants {
        private WebDriver driver;

        public BasicConstants(WebDriver driver) {
                this.driver = driver;
        }

        public BasicConstants(WebDriver driver, String BASE_URL) {
                this(driver);
                navigateToRandomWikiArticle(BASE_URL);
        }

        public void navigateToRandomWikiArticle(String BASE_URL) {
                driver.navigate().to(BASE_URL);
        }

        //--------- URL CONSTANTS

        public static final String BASE_URL = "https://en.wikipedia.org/wiki/War";
        public static final String URL_OF_PHILOSOPHY_PAGE = "https://en.wikipedia.org/wiki/Philosophy";
}
