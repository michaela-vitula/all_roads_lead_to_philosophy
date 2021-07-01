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
        while (!currentUrl.equals(BasicConstants.URL_OF_PHILOSOPHY_PAGE)) {
            navigateToNextUrl();
            currentUrl = driver.getCurrentUrl();
            int click2 = click++;
            //ifPhilosophyPageAppearsPrintNumberOfClicks(click2, driver.getCurrentUrl());
        }
    }

    public void navigateToNextUrl() {
        WebElement linkToNextPage = driver.findElement(By.xpath("//div/p/a[starts-with(@href, '/wiki/')][1]"));
        linkToNextPage.click();
    }

    public void ifPhilosophyPageAppearsPrintNumberOfClicks(int click, String currentUrl) {
        int click2 = click++;
        if (currentUrl.equals(BasicConstants.URL_OF_PHILOSOPHY_PAGE)) {
            System.out.println("To succesfully reach out Philosophy page " + click2 + " number of clicks has been used. ");
        }
    }
}
