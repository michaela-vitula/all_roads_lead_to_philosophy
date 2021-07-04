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

    public void goThroughArticlesUntilPhilosophyAppearsThenCountClicks() {
        int clickCounter = 0;
        String currentUrl = driver.getCurrentUrl();
        String newCurrentUrl;

        try {
            while (!currentUrl.equals(URL_OF_PHILOSOPHY_PAGE)) {
                navigateToNextUrl();
                clickCounter++;

                newCurrentUrl = driver.getCurrentUrl();
                if(newCurrentUrl.equals(currentUrl)){
                    navigateThroughDifferentXpath();
                }

                if (newCurrentUrl.equals(URL_OF_LANGUAGE)) {
                    navigateThroughDifferentXpath();
                }

                newCurrentUrl = currentUrl;
                currentUrl = driver.getCurrentUrl();
                if (currentUrl.equals(URL_OF_PHILOSOPHY_PAGE)) {
                    System.out.println("It took " + clickCounter + " clicks to succesfully reach out Philosophy page. ");
                }

            }
        }catch (Exception e){
            System.out.println("The flow was broken by xpath that differs. ");
        }
    }

    public void navigateThroughDifferentXpath(){
        WebElement findNotLoopingXpath = driver.findElement(By.xpath("//*[@id='mw-content-text']/div[1]/p[4]/a[2]"));
        findNotLoopingXpath.click();
    }

    public void navigateToRandomWikiArticle() {
        driver.navigate().to(BASE_URL);
        WebElement randomArticle = driver.findElement(By.xpath("//*[@id='n-randompage']/a"));
        randomArticle.click();
    }

    public void navigateToNextUrl() {
        try {
            WebElement linkToNextPage = driver.findElement(By.xpath("//div/p/a[starts-with(@href, '/wiki/')][1]"));
            linkToNextPage.click();
        } catch (Exception e) {
            WebElement linkToNextPage = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p[1]/a[1]"));
            linkToNextPage.click();
        }
    }
}
