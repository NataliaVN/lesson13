package test.java.tests.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasepageLesson12 {
    WebDriver driver;
    WebDriverWait wait;

    public BasepageLesson12(WebDriver driver ){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }


}