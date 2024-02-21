package tests.Lesson09;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {

    //ayrı ayrı browserlarda açar!
    @Test

    public void testAmazon() {
        driver.get("https://www.amazon.com.tr");
    }

    @Test

    public void testBestbuy() {
        driver.get("https://www.bestbuy.com");
    }
    @Test

    public void testHepsiburada() {
        driver.get("https://www.hepsiburada.com");
    }
}
