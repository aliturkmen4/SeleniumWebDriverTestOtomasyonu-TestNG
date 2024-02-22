package tests.Lesson09;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

    /* test case lere rakam vererek hangi sırada çalışacaklarını söyleyebilirim, sistem burada kafasına
    göre önce hepsiburada yı çalıştırabilir ve aynı class içindeysem bu sorun yaratabilir! */
    @Test(priority = -5)

    public void testAmazon() {
        driver.get("https://www.amazon.com.tr");
    }

    @Test //hiç priority vermezsem sistem bunu default olarak 0 kabul eder!

    public void testBestbuy() {
        driver.get("https://www.bestbuy.com");
    }
    @Test (priority = 1)

    public void testHepsiburada() {
        driver.get("https://www.hepsiburada.com");
    }
}
