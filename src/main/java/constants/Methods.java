package constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Methods extends BasicConstants {

    WebDriver driver;

    public Methods(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickingAndCounting(int click, String currentUrl) {
        while (!currentUrl.equals(URL_OF_PHILOSOPHY_PAGE)) {
            navigateToNextUrl();
            currentUrl = driver.getCurrentUrl();
            click++;

            if (currentUrl.equals(URL_OF_PHILOSOPHY_PAGE)) {
                    System.out.println("To succesfully reach out Philosophy page " + click + " number of clicks has been used. ");
            }
        }
    }

    public void navigateToNextUrl() {
        WebElement linkToNextPage = driver.findElement(By.xpath("//div/p/a[starts-with(@href, '/wiki/')][1]"));
        linkToNextPage.click();
    }
}
