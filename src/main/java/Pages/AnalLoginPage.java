package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AnalLoginPage {

    //    Locators for registration
    public WebElement analNovusLogo = $(By.xpath("/html/body/div[1]/a[1]/img[1]"));
    public WebElement analLoginForm = $(By.xpath("/html/body/div[2]"));
    public WebElement analLoginLabel = $(By.xpath("/html/body/div[2]/form[1]/h3[1]"));
    public String analLoginLabelText = "Sign in";
    public WebElement analUserNameField = $(By.xpath("id(\"username\")"));
    public String analUserNameFieldText = "Username";
    public WebElement analPasswordField = $(By.xpath("id(\"password\")"));
    public String analPasswordFieldText = "Password";
    public WebElement analLoginButton = $(By.xpath("/html/body/div[2]/form[1]/div[3]/button[1]"));
    public String analLoginButtonText = "Login";
    public WebElement analInvalidUsernamePassword = $(By.xpath("/html/body/div[2]/form[1]/div[1]"));
    public String analInvalidUsernamePasswordText = "Invalid username or password.";


    public String analLoginPageUrl = "http://127.0.1.1/am";
    String analValidUserName = "user";
    String analValidPassword = "password";

    public AnalLoginPage openAnalLoginPage(){
        open(analLoginPageUrl);
        return new AnalLoginPage();
    }

    public void   enterValidUserName(){
        $(analUserNameField).setValue(analValidUserName);;
    }

    public void   enterValidPassword(){
        $(analPasswordField).setValue(analValidPassword);;
    }

    public AnalPage validAnalLoginPageRegistration() {
        enterValidUserName();
        enterValidPassword();
        clickLoginButton();
        return  new AnalPage();
    }

    public void   clickLoginButton(){
        $(analLoginButton).click();
    }








}

