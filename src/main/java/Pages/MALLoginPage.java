package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class MALLoginPage {

    WebElement loginForm = $(By.xpath("/html/body/div[2]/form[1]"));
    WebElement loginText = $(By.xpath("/html/body/div[2]/form[1]/h3[1]"));
    WebElement userNameField = $(By.xpath(".//*[@id='username']"));
    String userNameFieldText = "Username";
    WebElement passwordField = $(By.xpath(".//*[@id='password']"));
    String passwordFieldText = "Password";
    WebElement loginButton = $(By.xpath("html/body/div[2]/form/div[3]/button"));
    String loginButtonText = "Login";
    WebElement errorMessage = $(By.xpath(".//*[@id='servermessage']/div/div/span"));
    String errorMessageText = "login:Unauthorized";







}
