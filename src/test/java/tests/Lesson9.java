package test.java.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.tests.BaseTest;
import test.java.tests.PO.BasePage;
import test.java.tests.PO.CoursesPage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class Lesson9 extends BaseTest {

    CoursesPage coursesPage;
    BasePage basePage;

    @BeforeMethod
    public void PageLoad() {
        coursesPage = new CoursesPage(driver);

    }

    @Test
    public void testList() {
        coursesPage
                .open()
                .selectl("uk")
                .coursesList()
                .openCourses();

        /*wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='course']/div"))));
        List<WebElement> list1 = driver.findElements(By.xpath("(//div[@class ='container_12 isotope 21'])"));

        Iterator<WebElement> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/


        String str[] = {"Тестування", "Frontend development", "JS development", "Веб-дизайн", "PHP", "Java programming", "Python", "Data Science/Machine Learning", "C# /.NET development", "C++", "Game Development", "DEVOPS", "Digital Marketing", "Управління персоналом", "Управління проектами", "Mobile development", "Відеомонтаж", "Cisco", "Go development", "Кібербезпека", "Менеджмент"};

        driver.navigate().to("http://iteaua-develop.demo.gns-it.com/uk/courses_itea/");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='grid_3 item qa']/h2"))));

        List<WebElement> courseElements = driver.findElements(By.xpath("(//div[@class='container_12 isotope 21'])/div/h2"));
        List<String> courseActual = new ArrayList<String>();

        for (WebElement el : courseElements) {
            courseActual.add(el.getText());
        }

        for (String el : courseActual) {
            System.out.println(el);
        }

        for (String course : str) {
            boolean isContains = courseActual.contains(course);
            assertTrue(isContains, String.format("Expected course '%s' 21 on the page", course));


        }


    }

}




