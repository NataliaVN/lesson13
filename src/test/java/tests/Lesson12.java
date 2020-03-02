package test.java.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.tests.PO.BasePage;
import test.java.tests.PO.POLessos12;

public class Lesson12 extends BaseTest {
    POLessos12 poLessos12;
    BasePage basePage;

    @BeforeMethod
    public void PageLoad() {
        poLessos12 = new POLessos12(driver);

    }

    @Test
    public void testlesson12() {
        poLessos12
                .open()
                .selectl("uk")
                .coursesList()
                .openCourses()
                .openrandomCourse();
                //.openpay();
    }
}