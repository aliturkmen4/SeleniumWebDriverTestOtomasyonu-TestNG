package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='a-autoid-1']")
    public WebElement cookie;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement search;

    @FindBy(xpath = "//*[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement seachresult;
}
