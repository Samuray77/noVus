package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LMSLoginPage {

//        private WebDriver driver;
//
//        @FindBy(xpath = ".//*[@id='InputLogin']")
//        WebElement loginField;
//        @FindBy(xpath = ".//*[@id='InputPassword']")
//        WebElement passwordField;
//        @FindBy(xpath = "html/body/div[1]/div/div[2]/form/input[3]")
//        WebElement buttonEnter;
//        @FindBy(xpath = "html/body/div[1]/div/div[2]/p")
//        WebElement checkText;

        //    Locators for registration
        WebElement logo = $(By.xpath("html/body/div[1]/div/img"));
        WebElement loginField = $(By.xpath(".//*[@id='id_username']"));
        WebElement passwordField = $(By.xpath(".//*[@id='id_password']"));
        WebElement inputLogin = $(By.xpath(".//*[@id='login-form']/div[4]/input"));

        public void userCanRegistration(){



        }
}
