package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MALLoginPage {

    public WebElement loginForm = $(By.xpath("/html/body/div[2]/form[1]"));
    public WebElement loginText = $(By.xpath("/html/body/div[2]/form[1]/h3[1]"));
    public WebElement userNameField = $(By.xpath(".//*[@id='username']"));
    public String userNameFieldText = "Username";
    public WebElement passwordField = $(By.xpath(".//*[@id='password']"));
    public String passwordFieldText = "Password";
    public WebElement loginButton = $(By.xpath("html/body/div[2]/form/div[3]/button"));
    public String loginButtonText = "Login";
    public WebElement errorMessage = $(By.xpath(".//*[@id='servermessage']/div/div/span"));
    public String errorMessageText = "login:Unauthorized";

    public String malLoginPageUrl = "http://127.0.1.1/mal/";
    public  String validUserName = "user";
    public  String validPassword = "password";


    public void   openMALLoginPage(){
        open(malLoginPageUrl);
    }

}
