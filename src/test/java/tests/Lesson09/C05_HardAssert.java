package tests.Lesson09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C05_HardAssert extends TestBaseBeforeMethodAfterMethod {
    @Test

    public void test() throws InterruptedException {
        //amazon sayfasına git!
        driver.navigate().to("https://www.amazon.com.tr");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='a-autoid-1']")).click();

        //title ın amazon içerdiğini test et!
        Assert.assertTrue(driver.getTitle().contains("Amazon"));

        //arama kutusnun erişilebilir oldugunu test edin
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isEnabled());

        //arama kutusuna Iphone yazıp arat
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone", Keys.ENTER);

        //arama yapıldıgını test edin
        WebElement sonuc=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonuc.isDisplayed());

        //arama sonucunun Iphone içerdigini test
        Assert.assertTrue(sonuc.getText().contains("Iphone"));
    }
}
