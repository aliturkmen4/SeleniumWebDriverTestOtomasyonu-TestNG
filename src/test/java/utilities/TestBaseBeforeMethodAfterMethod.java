package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeMethodAfterMethod {
    //JUnit eki before/after annotation ı TestNG de before method/after method bir farkı yok!
    //extend edeceğim için abstract class yaptım!
    protected WebDriver driver;

    protected String tarih;

    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYYMMDDHHmmss");
        tarih=localDateTime.format(formatter);
    }

    @AfterMethod

    public void tearDown() {
        //driver.quit();
    }
}
