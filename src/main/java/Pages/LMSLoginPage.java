package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LMSLoginPage {


        //    Locators for registration
        public WebElement lmsNovusLogo = $(By.xpath("/html/body/div[1]/div[1]/img[1]"));
        public WebElement lmsLoginForm = $(By.xpath("/html/body/div[1]/div[1]/div[2]"));
        public WebElement lmsLoginField = $(By.xpath("id(\"InputLogin\")"));
        public WebElement lmsLoginLabel = $(By.xpath("/html/body/div[1]/div[1]/div[2]/form[1]/div[1]/label[1]"));
        public String lmsLoginLabelText = "Login";
        public WebElement lmsPasswordField = $(By.xpath("id(\"InputPassword\")"));
        public WebElement lmsPasswordLabel = $(By.xpath("/html/body/div[1]/div[1]/div[2]/form[1]/div[2]/label[1]"));
        public String lmsPasswordLabelText = "Password";
        public WebElement lmsIncorrectLoginPassword = $(By.xpath("/html/body/div[1]/div[1]/div[2]/p[1]"));
        public String lmsIncorrectLoginPasswordText = "Incorrect login or password";
        public WebElement lmsEnterButton = $(By.xpath("/html/body/div[1]/div[1]/div[2]/form[1]/input[3]"));
        String lmsEnterButtonText = "Enter";

        public String lmsLoginPageUrl = "http://127.0.1.1/";
        String lmsValidLogin = "lms";
        String lmsValidPassword = "lms";

        public LMSLoginPage   openLMSLoginPage(){
                open(lmsLoginPageUrl);
                return new LMSLoginPage();
        }

        public void   enterValidLMSLogin(){
                $(lmsLoginField).setValue(lmsValidLogin);
        }

        public void   enterValidLMSPassword(){
                $(lmsPasswordField).setValue(lmsValidPassword);
        }

        public void   clickEnterButton(){
                $(lmsEnterButton).click();
        }

        public  ObjectPage validLMSLoginPageRegistration(){
                $(lmsLoginField).setValue(lmsValidLogin);
                $(lmsPasswordField).setValue(lmsValidPassword);
                $(lmsEnterButton).click();
                return new ObjectPage();
        }

}
