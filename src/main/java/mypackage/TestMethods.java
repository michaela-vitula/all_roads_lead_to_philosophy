package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestMethods extends GenericPage {

    WebDriver driver;

    public TestMethods(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickCountAndPrint(int clickCounter, String currentUrl) {
        while (!currentUrl.equals(URL_OF_PHILOSOPHY_PAGE)) {
        navigateToNextUrl();
        currentUrl = driver.getCurrentUrl();
        clickCounter++;

            if (currentUrl.equals(URL_OF_PHILOSOPHY_PAGE)) {
            System.out.println("It took " + clickCounter + " clicks to succesfully reach out Philosophy page. ");
            }
        }
    }

    public void navigateToNextUrl() {
        WebElement linkToNextPage = driver.findElement(By.xpath("//div/p/a[starts-with(@href, '/wiki/')]"));
        linkToNextPage.click();
    }
}
