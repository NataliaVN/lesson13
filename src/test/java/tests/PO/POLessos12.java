package test.java.tests.PO;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class POLessos12 extends BasepageLesson12 {
    Logger logger = LogManager.getLogger(POLessos12.class);

    public POLessos12(WebDriver driver) {
        super(driver);
    }

    public POLessos12 open() {
        logger.info("Зайти на главную страницу сайта");
        logger.log(Level.DEBUG, "Открыть список вечерних курсов");
        logger.error("Выбрать любой курс случайным образом ");
        logger.log(Level.WARN, "Нажать кнопку «Купить»\\");

        driver.get("http://iteaua-develop.demo.gns-it.com/about-itea/");

        return this;
    }

    public POLessos12 selectl(String lang) {
        //logger.info("Убедиться, что страница на украинском языке " + lang);
        WebElement langl = driver.findElement(By.xpath("//a[@hreflang='" + lang + "'][1]"));
        wait.until(ExpectedConditions.elementToBeClickable(langl));
        langl.click();
        return this;

    }

    public POLessos12 coursesList() {
        WebElement list = driver.findElement(By.xpath("//a[(contains(@href, 'courses_itea')) and @class='parent']"));
        wait.until(ExpectedConditions.visibilityOf(list));
        list.click();
        return this;

    }

    public POLessos12 openCourses() {
        WebElement course = driver.findElement(By.xpath("//li[@id='menu-item-7871']/a"));
        wait.until(ExpectedConditions.elementToBeClickable(course));
        course.click();
        return this;
    }

    public void openrandomCourse() {
        //WebElement courseEl = driver.findElement(By.xpath("//*[@id='" + course + "'][1]"));
        //List<WebElement> list = new ArrayList<course>();
        List<WebElement> courseElements = driver.findElements(By.xpath("(//div[@class='container_12 isotope 21'])/div/h2"));
        List<WebElement> list = new ArrayList<WebElement>();
        for (WebElement el : courseElements) {
            list.add(el.findElement(By.id("(//*[@id='course'])[1]")));
            /*list.add(0, "Frontend development");
            list.add(1, "Тестування");
            list.add(2, "JS development");
            list.add(3, "PHP");
            list.add(4, "Java programming");*/
            int rand = (int) (Math.random() * list.size());
            System.out.println(list.get(rand));
            //wait.until(ExpectedConditions.elementToBeClickable(courseEl));
            //courseEl.click();
            //return this;
        }
        //return null;
    }

    /*public POLessos12 openpay() {
        WebElement pay = driver.findElement(By.xpath("//*[@class = 'order-courses-btn'][1]"));
        wait.until(ExpectedConditions.elementToBeClickable(pay));
        pay.click();
        return this;*/
}

