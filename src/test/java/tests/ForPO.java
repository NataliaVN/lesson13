package test.java.tests;

import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.tests.PO.BasePage;
import test.java.tests.PO.HomePage;
import test.java.tests.PO.VacancyPage;

import static org.testng.Assert.assertEquals;
  @Epic("Cart")
   public class ForPO extends BaseTest {
    HomePage homePage;
    VacancyPage vacancyPage;
    BasePage basePage;

    @BeforeMethod
    public void PageLoad() {
        homePage = new HomePage(driver);
        vacancyPage = new VacancyPage(driver);
    }
    @Link ("https://www.google.com.ua/?hl=ru")
    @TmsLink("B-1")
    @Issues({@Issue("AAA-1"),
    @Issue("AAA -134")})
    @Story("Add to cart")
    @Feature("Add t-short")
    @Test
    // для перепрогона теста @TEST(retryAnalyzer = RetryAnalyzer.class)
    public void anyTest() {
        homePage.open()
                .selectLanguage("uk")
                .openAbout()
                .openVacancies();
        vacancyPage
                .selectVacancy("Викладач UX")
                .setName("Vova")
                .setEmail("email@email.com")
                .submit();
        String actualMsg = vacancyPage.getPhoneErrorMsg();
        String expectedMsg = "Поле не має бути пустим";
        //assertTrue(false); // для завала теста
        assertEquals(actualMsg, expectedMsg);
    }
      @Story("Add to cart")
      @Feature("Delete t-short")
      @Test
      // для перепрогона теста @TEST(retryAnalyzer = RetryAnalyzer.class)
      public void anyTest2() {
          homePage.open()
                  .selectLanguage("uk")
                  .openAbout()
                  .openVacancies();
          vacancyPage
                  .selectVacancy("Викладач UX")
                  .setName("Vova")
                  .setEmail("email@email.com")
                  .submit();
          String actualMsg = vacancyPage.getPhoneErrorMsg();
          String expectedMsg = "Поле не має бути пустим";
          //assertTrue(false); // для завала теста
          assertEquals(actualMsg, expectedMsg);
      }
}
