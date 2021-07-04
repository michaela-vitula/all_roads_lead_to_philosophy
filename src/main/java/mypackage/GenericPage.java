package mypackage;

import org.openqa.selenium.WebDriver;

public class GenericPage {
        private WebDriver driver;

        public GenericPage(WebDriver driver) {
                this.driver = driver;
        }

//--------- URL CONSTANTS ---------------------------------------------------------------------------------

        public static final String URL_OF_PHILOSOPHY_PAGE = "https://en.wikipedia.org/wiki/Philosophy";
        public static final String BASE_URL = "https://en.wikipedia.org/wiki/Main_Page";
        public static final String URL_OF_LANGUAGE = "https://en.wikipedia.org/wiki/Language";
}
