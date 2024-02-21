package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeClassAfterClass {
    //junit ten farklı olarak statik olmasına gerek yok!
    protected WebDriver driver;

    protected String tarih;

    @BeforeClass

    public void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYYMMDDHHmmss");
        tarih=localDateTime.format(formatter);
    }

    @AfterClass

    public void tearDown() {
        //driver.quit();
    }
}
