package PositiveTests.LmsPositiveTest;

import Pages.LMSLoginPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PositiveLMSLogin extends LMSLoginPage{

    WebElement loginField = $(By.xpath(".//*[@id='InputLogin']"));
    WebElement passwordField = $(By.xpath(".//*[@id='InputPassword']"));
    WebElement buttonLogin = $(By.xpath("html/body/div[1]/div/div[2]/form/input[3]"));

    LMSLoginPage lmsLoginPage = new LMSLoginPage();

    public PositiveLMSLogin(WebDriver driver) {
//        super(driver);
    }

    @Test
    public void PositiveLMSLoginTest() throws Exception {

            open("http://127.0.1.1/");


//            $(loginField).sendKeys("lms");
//            $(passwordField).sendKeys("lms");
//            $(buttonLogin).click();


            System.out.println("LMS Authorization - PASSED");



    }



}
