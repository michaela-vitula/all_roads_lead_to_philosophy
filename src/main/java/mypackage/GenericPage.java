package mypackage;

import org.openqa.selenium.WebDriver;

public class GenericPage {
        private WebDriver driver;

        public GenericPage(WebDriver driver) {
                this.driver = driver;
        }

        public GenericPage(WebDriver driver, String BASE_URL) {
                this(driver);
                navigateToWikiArticle(BASE_URL);
        }

        public void navigateToWikiArticle(String BASE_URL) {
                driver.navigate().to(BASE_URL);
        }

        //--------- URL CONSTANTS

        public static final String BASE_URL = "https://en.wikipedia.org/wiki/War";
        public static final String URL_OF_PHILOSOPHY_PAGE = "https://en.wikipedia.org/wiki/Philosophy";
}
