package test.java.tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGhome  {

    @BeforeMethod
    public void cycle() {
        System.out.println("Start program");
    }

    @Test
    public void cycle2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Natalia ");
            }
            System.out.println();
        }
    }

    @Test
    public void returnstatic() {

        System.out.println(min(1, 2, 3));
        System.out.println(min(5, 2, 3));
        System.out.println(min(5, 2, 1));
    }

    static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        if (b < c) {
            return b;
        } else {
            return c;
        }

    }

    @Test
    public void text() {
        System.out.println(reverse("Hello world"));
        revers1("Hello java");
    }

    public static String reverse(String str) {
        char[] data = new char[str.length()];
        data = str.toCharArray();
        String word = "";
        for (int i = data.length - 1; i >= 0; i--) {
            word += data[i];

        }
        return word;
    }

    public void revers1(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    @AfterMethod
    public void cycle3() {
        System.out.println("End program");
    }


//    @DataProvider(name = "provider")
//    public Object[][] provider() {
//        return new Object[][]{
//                {0,  "First"},
//                {1,  "Second"},
//                {2,  "Third"},
//                       };


    //}
}

