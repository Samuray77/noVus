package Pages.PagesAnalytics;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class AnalLicensePage extends MainAnalPage {

    String analLicensePageUrl = "http://127.0.1.1/am/license";
    public WebElement analLicensePageLicenseLabel =$(By.xpath("/html/body/div[1]/div[1]/h1[1]"));
    String analLicensePageLicenseLabelText = "License";
    public WebElement analLicensePageLicenseCodeLabel =$(By.xpath("/html/body/div[1]/div[2]/form[1]/div[1]/label[1]"));
    String analLicensePageLicenseCodeLabelText = "License code (18 digits)";
    public WebElement analLicensePageLicenseField =$(By.xpath("id(\"password\")"));
    String validLicenseCode = "356300000044799227";
    public WebElement analLicensePageSaveButton =$(By.xpath("/html/body/div[1]/div[2]/form[1]/div[2]/button[1]"));
    String analLicensePageSaveButtonText = "Save";
    public WebElement analLicensePageActivateOfflineButton =$(By.xpath("id(\"activate_offline\")"));
    String analLicensePageActivateOfflineButtonText = "Activate offline";
    public ElementsCollection analLicensePagePopUpMessage =$$(By.xpath(".//*[@id='servermessage']/div[2]"));
    public WebElement analLicensePagePopUpMessage1 =$(By.xpath("id(\"servermessage\")/div[2]/div[1]"));
    String analLicensePagePopUpMessage1Text = "License code saved.";
    public WebElement analLicensePagePopUpMessage2 =$(By.xpath("id(\"servermessage\")/div[2]/div[2]"));
    String analLicensePagePopUpMessage2Text = "Licenses updated.";

    public AnalLicensePage   openAnalLicensePage(){
        open(analLicensePageUrl);
        AnalLoginPage analLicensePage = new AnalLoginPage();
        analLicensePage.validAnalLoginPageRegistration();
        return new AnalLicensePage();
    }

    public AnalLicensePage clickanalLicensePageSaveButton(){
        $(analLicensePageSaveButton).click();
        return new AnalLicensePage();
    }

    public void  validateAnalLicensePage(){
        $(analLicensePageLicenseCodeLabel).shouldBe(Condition.visible).shouldHave(Condition.text(analLicensePageLicenseLabelText));
    }

}
