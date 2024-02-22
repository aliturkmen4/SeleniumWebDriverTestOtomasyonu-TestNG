package tests.Lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_AmazonPageClass {
    @Test

    public void test() throws InterruptedException {
        AmazonPage amazonPage=new AmazonPage();
        //amazon anasayfasına git!
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL")); //configuration propeties deki amazon url in key değerini aldım! bana value sunu verecek!
        Thread.sleep(2000);
        amazonPage.cookie.click();
        //Selenium arat!
        amazonPage.search.sendKeys("Selenium"+ Keys.ENTER);
        //Sonuç yazısının selenium içerdiğini test et!
        Assert.assertTrue(amazonPage.seachresult.getText().contains("Selenium"));

        Driver.closeDriver();
    }
}
