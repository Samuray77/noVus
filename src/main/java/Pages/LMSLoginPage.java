package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LMSLoginPage {

        private WebDriver driver;

        @FindBy(xpath = ".//*[@id='InputLogin']")
        WebElement loginField;
        @FindBy(xpath = ".//*[@id='InputPassword']")
        WebElement passwordField;
        @FindBy(xpath = "html/body/div[1]/div/div[2]/form/input[3]")
        WebElement buttonEnter;
        @FindBy(xpath = "html/body/div[1]/div/div[2]/p")
        WebElement checkText;




}
