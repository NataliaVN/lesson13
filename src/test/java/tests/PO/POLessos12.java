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

        //List<WebElement> courseElements = driver.findElements(By.xpath("(//div[@class='container_12 isotope 21'])/div/h2"));
        List<WebElement> courseElements = driver.findElements(By.xpath("(//*[@id='course'])[1]"));

        List<WebElement> list = new ArrayList<>();
        for (WebElement el : courseElements) {
            for (int i = 0; i < 1; i++) {
                list.add(el.findElement(By.xpath("(//*[@id='course'])[1]")));
            }
        }
        //for (String el : courseElements) {
            //System.out.println(el);
        //}

        int rand = (int)( Math.random() * list.size() );
        System.out.println(list.get(rand));



    }

}



