package test.java.tests.PO;

import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import test.java.utils.PropertyLoader;

public class HomePage extends BasePage{
    Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @Step("Open page")
    public HomePage open() {
        logger.info("Home page is opened");
        logger.debug("Home page is opened fsfasd fsdfsdfasdfas sdfafasfsdf sdfasfasdf asdafsdfafa fafasdf ");
        //driver.get("http://iteaua-develop.demo.gns-it.com/about-itea/");
        driver.get(PropertyLoader.getProperty("url")); // второй вариант что выше от 28.02

        WebElement spinner = driver.findElement(By.id("preload-it"));
        wait.until(ExpectedConditions.visibilityOf(spinner));
        wait.until(ExpectedConditions.invisibilityOf(spinner));
        return this;
    }
    @Step("Select language {lang}")
    public HomePage selectLanguage(String lang) {
        logger.info("Language is checked to " + lang);
        WebElement uaLang = driver.findElement(By.xpath("(//a[@hreflang='" + lang + "'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(uaLang));
        uaLang.click();
        return this;
    }
    @Step("Select language About")
    public HomePage openAbout() {
        System.out.println("Click About btn");
        WebElement aboutBtn = driver.findElement(By.xpath("//a[(contains(@href, 'about_itea')) and @class='parent']"));
        wait.until(ExpectedConditions.visibilityOf(aboutBtn));
        aboutBtn.click();
        return this;
    }
    @Step("Open Vacancies")
    public HomePage openVacancies() {
        WebElement vacancies = driver.findElement(By.xpath("//li[@id='menu-item-15362']/a"));
        wait.until(ExpectedConditions.elementToBeClickable(vacancies));
        vacancies.click();
        return this;
    }
}
