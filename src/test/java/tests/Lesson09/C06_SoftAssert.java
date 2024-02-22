package tests.Lesson09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C06_SoftAssert extends TestBaseBeforeMethodAfterMethod {
    @Test

    public void test() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert(); //soft assert ten yararlanabilmek için!

        //amazon sayfasına git!
        driver.navigate().to("https://www.amazon.com.tr");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='a-autoid-1']")).click();

        //title ın amazon içerdiğini test et!
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"Girdiğiniz kelimeyi içermemektedir!"); //testim başarısız olursa bir hata mesajı bırakabiliyorum!

        //arama kutusnun erişilebilir oldugunu test edin
        softAssert.assertTrue(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isEnabled(),"Aradığınız web elemente erişilememektedir!");

        //arama kutusuna Iphone yazıp arat
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone", Keys.ENTER);

        //arama yapıldıgını test edin
        WebElement sonuc=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed(),"Arama başarısız!");

        //arama sonucunun Iphone içerdigini test
        softAssert.assertTrue(sonuc.getText().contains("Iphone"),"Test sonucu 'Iphone' içermiyor!");

        softAssert.assertAll(); //soft assert ü bu şekilde bitirmezsen çalışmaz!

        System.out.println("Eğer sistemde bir hata varsa bu yazı okunmayacak!");
    }
}
