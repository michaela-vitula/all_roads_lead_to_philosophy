package constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods extends BasicConstants {
    WebDriver driver;

    public Methods(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickingAndCounting(int click, String currentUrl) {
      /*  click = 0;
        currentUrl = driver.getCurrentUrl();*/
        while (!currentUrl.equals(BasicConstants.URL_OF_PHILOSOPHY_PAGE)) {
            navigateToNextUrl();
            click++;
            currentUrl = driver.getCurrentUrl();
            if (currentUrl.equals(BasicConstants.URL_OF_PHILOSOPHY_PAGE)) {
                System.out.println("To reach out Philosophy page it got " + click + " clicks. ");
            }
        }
    }
    public void navigateToNextUrl() {
        WebElement linkToNextPage = driver.findElement(By.xpath("//div/p/a[starts-with(@href, '/wiki/')][1]"));
        linkToNextPage.click();
    }
}
