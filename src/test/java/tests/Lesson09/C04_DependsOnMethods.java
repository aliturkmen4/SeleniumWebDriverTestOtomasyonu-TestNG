package tests.Lesson09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C04_DependsOnMethods extends TestBaseBeforeClassAfterClass {
    @Test

    public void test1() throws InterruptedException {
        //amazon sayfasına git!
        driver.navigate().to("https://www.amazon.com.tr");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='a-autoid-1']")).click();
    }
    @Test(dependsOnMethods = "test1") //bağlamak istedğim test annotation ın ismini yazıyorum

    public void test2() {
        //Iphone aratalım
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone", Keys.ENTER);
    }
    @Test(dependsOnMethods = "test2") //test2 ye bağlı dedim test2 den sonra test3 ü yapacak!

    public void test3() {
        //sonuç yazısı Iphone içeriyor mu?
        WebElement result=driver.findElement(By.xpath("//*[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(result.getText().contains("Iphone"));
    }
}
