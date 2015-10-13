package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AnalChangePasswordPage extends MainAnalPage{

    String analChangePasswordPageUrl = "http://127.0.1.1/am/change_pass";
    public WebElement analChangePasswordPageLabel =$(By.xpath("/html/body/div[1]/h1[1]"));
    String analChangePasswordPageLabelText = "Change password";
    public WebElement analChangePasswordPageOldPasswordField =$(By.xpath("id(\"old_pass\")"));
    String analChangePasswordPageOldPasswordFieldText = "Old password";
    public WebElement analChangePasswordPageNewPasswordField =$(By.xpath("id(\"new_pass\")"));
    String analChangePasswordPageNewPasswordFieldText = "New password";
    public WebElement analChangePasswordPageChangePasswordButton =$(By.xpath("html/body/div/div[1]/form/div[3]/button"));
    String analChangePasswordPageChangePasswordButtonText = "Change password";
    public WebElement analChangePasswordPagePopUpInvalidPwdMessage =$(By.xpath(".//*[@id='servermessage']/div[2]/div/span"));
    String analChangePasswordPagePopUpInvalidPwdMessageText = "Invalid password.";
//    public WebElement analChangePasswordPagePopUpInvalidPwdMessage =$(By.xpath(".//*[@id='servermessage']/div[2]/div/span"));
//    String analChangePasswordPagePopUpInvalidPwdMessageText = "Invalid password.";

    public AnalChangePasswordPage   openAnalChangePasswordPage(){
        open(analChangePasswordPageUrl);
        AnalLoginPage page = new AnalLoginPage();
        page.validAnalLoginPageRegistration();
        return new AnalChangePasswordPage();
    }

    public AnalLicensePage clickanalLicensePageSaveButton(){
        $(analChangePasswordPageChangePasswordButton).click();
        return new AnalLicensePage();
    }
}
