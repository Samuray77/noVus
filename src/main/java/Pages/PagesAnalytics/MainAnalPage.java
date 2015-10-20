package Pages.PagesAnalytics;

import Pages.PagesAdmin.AdminPage;
import Pages.PagesLMS.ObjectPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class MainAnalPage {

    //    Locators for MainAnalPage
    public WebElement analPageNovusLogo = $(By.xpath("id(\"header\")/a[1]"));
    public WebElement analPageAnalyticsLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[1]/a[1]"));
    public WebElement analPageEventReceiverLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[2]/a[1]"));
    public WebElement analPageLicenseLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[3]/a[1]"));
    public WebElement analPageSettingsLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[4]/a[1]"));
    public WebElement analPageBackToWebsiteLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[5]/a[1]"));
    public WebElement analPageChangePasswordLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[6]/a[1]"));
    public WebElement analPageLogoutLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[7]/a[1]"));
    public WebElement analPageLocalizationButton = $(By.xpath("id(\"header\")/div[3]/span[1]"));
    public WebElement analPageEnglishButton = $(By.xpath("id(\"header\")/div[3]/ul[1]/li[1]/a[1]"));

    public WebElement analPageCopyRightsText = $(By.xpath("/html/body/div[1]/footer[1]/p[1]"));
    public WebElement analPageVersionText = $(By.xpath("/html/body/div[1]/footer[1]/p[2]"));



    public AnalPage clickanalPageAnalyticsLink(){
        $(analPageAnalyticsLink).click();
        return new AnalPage();
    }

    public AnalLicensePage clickanalPageLicenseLink(){
        $(analPageLicenseLink).click();
        return new AnalLicensePage();
    }

    public AdminPage clickanalPageSettingsLink(){
        $(analPageSettingsLink).click();
        return new AdminPage();
    }

    public ObjectPage clickanalPageBackToWebsiteLink(){
        $(analPageBackToWebsiteLink).click();
        return new ObjectPage();
    }

    public AnalChangePasswordPage clickanalPageChangePasswordLink(){
        $(analPageChangePasswordLink).click();
        return new AnalChangePasswordPage();
    }

    public AnalLoginPage clickanalPageLogoutLink(){
        $(analPageLogoutLink).click();
        return new AnalLoginPage();
    }

    public MainAnalPage clickanalPageLocalizationButton(){
        $(analPageLocalizationButton).click();
        return new MainAnalPage();
    }

    public MainAnalPage clickanalPageEnglishButton(){
        $(analPageEnglishButton).click();
        return new MainAnalPage();
    }


}
