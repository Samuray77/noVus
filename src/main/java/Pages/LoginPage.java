package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage (WebDriver driver){
        this.driver = driver;
        // Check that we're on the right page.
        if (!"noVus".equals(driver.getTitle())) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the login page");
        }
    }
    // The login page contains several HTML elements that will be represented as WebElements.
    //    Locators for registration
    public String lmsLoginPageUrl = "127.0.1.1";
    WebElement logo = $(By.xpath("html/body/div[1]/div/img"));
    WebElement loginField = $(By.xpath(".//*[@id='id_username']"));
    String login = "lms";
    WebElement passwordField = $(By.xpath(".//*[@id='id_password']"));
    String password = "lms";
    WebElement inputLogin = $(By.xpath(".//*[@id='login-form']/div[4]/input"));
    WebElement buttonEnter = $(By.xpath("html/body/div[1]/div/div[2]/form/input[3]"));



//        WebElement  = $(By.xpath("html/body/div[1]/div/div[2]/form/input[3]"));

//    public LoginPage openLMSLoginPage(){
//        open(lmsLoginPageUrl);
//        return this;
//    }
//
//    public LoginPage typeLogin(String login) {
//        // This is the only place that "knows" how to enter a login
//        $(loginField).sendKeys(login);
//        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
//        return this;
//    }
//
//    // The login page allows the user to type their password into the password field
//    public LoginPage typePassword(String password) {
//        // This is the only place that "knows" how to enter a password
//        $(passwordField).sendKeys(password);
//        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
//        return this;
//    }
//
//    // The login page allows the user to submit the login form
//    public ObjectPage submitLogin() {
//        // This is the only place that submits the login form and expects the destination to be the home page.
//        // A seperate method should be created for the instance of clicking login whilst expecting a login failure.
//        $(buttonEnter).click();
//        // Return a new page object representing the destination. Should the login page ever
//        // go somewhere else (for example, a legal disclaimer) then changing the method signature
//        // for this method will mean that all tests that rely on this behaviour won't compile.
//        return new ObjectPage(driver);
//    }
//
//    // The login page allows the user to submit the login form knowing that an invalid username and / or password were entered
////    public LMSLoginPage submitLoginExpectingFailure() {
//        // This is the only place that submits the login form and expects the destination to be the login page due to login failure.
////        $(buttonEnter).click();
//
//        // Return a new page object representing the destination. Should the user ever be navigated to the home page after submiting a login with credentials
//        // expected to fail login, the script will fail when it attempts to instantiate the LoginPage PageObject.
////        return new LMSLoginPage(driver);
////    }
//
//    // Conceptually, the login page offers the user the service of being able to "log into"
//    // the application using a user name and password.
//    public ObjectPage loginAs(String username, String password) {
//        // The PageObject methods that enter username, password & submit login have already defined and should not be repeated here.
//        typeLogin(username);
//        typePassword(password);
//        return submitLogin();
//    }
//
//    public void typeLogin() {
//        $(loginField).sendKeys(login);
//    }
}
