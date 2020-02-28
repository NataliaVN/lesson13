package test.java.tests.PO;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CoursesPage extends BasePage {
    Logger logger = LogManager.getLogger(CoursesPage.class);

    public CoursesPage(WebDriver driver) {
        super(driver);
    }

    public CoursesPage open() {
        logger.info("Courses page is opened");
        logger.log(Level.DEBUG, "Необходимо вывести в консоль 21 наименования курсов");
        logger.error("Error msg");
        logger.log(Level.WARN, "Pass");


        driver.get("http://iteaua-develop.demo.gns-it.com/about-itea/");
        //WebElement spinner = driver.findElement(By.id("preload-it"));
       // wait.until(ExpectedConditions.visibilityOf(spinner));
        //wait.until(ExpectedConditions.invisibilityOf(spinner));
        return this;
    }

    public CoursesPage selectl(String lang) {
        //logger.info("Убедиться, что страница на украинском языке " + lang);
        WebElement langl = driver.findElement(By.xpath("//a[@hreflang='" + lang + "'][1]"));
        wait.until(ExpectedConditions.elementToBeClickable(langl));
        langl.click();
        return this;

    }

    public CoursesPage coursesList() {
        WebElement list = driver.findElement(By.xpath("//a[(contains(@href, 'courses_itea')) and @class='parent']"));
        wait.until(ExpectedConditions.visibilityOf(list));
        list.click();
        return this;

    }

    public CoursesPage openCourses() {
        WebElement course = driver.findElement(By.xpath("//li[@id='menu-item-7871']/a"));
        wait.until(ExpectedConditions.elementToBeClickable(course));
        course.click();
        return this;
    }

}




