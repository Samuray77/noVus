package Pages.PagesMAL;

import Pages.PagesMAL.MALLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class MALPage {

    public WebElement malPageTitle = $(By.xpath("html/head/title"));
    WebElement novusLogo = $(By.xpath("id(\"header\")/a[1]"));
    WebElement videoSourceSettingsText = $(By.xpath("/html/body/div[1]/div[1]/h1[1]"));
    public WebElement videoSorceSettingsLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[1]/a[1]"));
    WebElement settingsLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[2]/a[1]"));
    WebElement backToWebsiteLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[3]/a[1]"));
    WebElement changePasswordLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[4]/a[1]"));
    WebElement logoutLink = $(By.xpath("id(\"header\")/div[1]/ul[1]/li[5]/a[1]"));
    WebElement plusButton = $(By.xpath("id(\"channels\")/a[2]"));
    WebElement channelsLicenseText = $(By.xpath("/html/body/div[1]/footer[1]/p[1]"));
    WebElement versionText = $(By.xpath("/html/body/div[1]/footer[1]/p[2]"));
    WebElement applyButton = $(By.xpath("id(\"save\")"));
    WebElement resetButton = $(By.xpath("id(\"setting_instance\")/div[2]/input[2]"));
    WebElement deleteAllButton = $(By.xpath("id(\"setting_instance\")/div[2]/input[3]"));
    WebElement minusButton = $(By.xpath("id(\"channels\")/div[3]/a[1]"));
    WebElement channelNumberText = $(By.xpath("id(\"channels\")/div[3]/div[1]"));
    WebElement sourceTypeField = $(By.xpath("id(\"channels\")/div[3]/div[2]/input[1]"));
    WebElement sourceTypeSovaLinux = $(By.xpath("id(\"channels\")/div[3]/div[2]/ul[1]/li[1]"));
    WebElement sourceTypeNovus = $(By.xpath("id(\"channels\")/div[3]/div[2]/ul[1]/li[2]"));
    WebElement sourceTypeHikvisionNVR = $(By.xpath("id(\"channels\")/div[3]/div[2]/ul[1]/li[3]"));
    WebElement ipAddressField = $(By.xpath("id(\"channels\")/div[3]/div[3]/input[1]"));
    WebElement loginField = $(By.xpath("id(\"channels\")/div[3]/div[4]/input[1]"));
    WebElement passwordField = $(By.xpath("id(\"channels\")/div[3]/div[5]/input[1]"));
    WebElement channelNumberField = $(By.xpath("id(\"channels\")/div[3]/div[6]/input[1]"));
    WebElement duplicateButton = $(By.xpath("id(\"channels\")/div[3]/a[2]"));
    WebElement channellTable = $(By.xpath("id(\"setting_instance\")/div[1]"));
    WebElement changePasswordPopUp = $(By.xpath("/html/body/div[3]/form[1]"));
    WebElement changePasswordPopUpCloseButton = $(By.xpath("/html/body/div[3]/form[1]/div[1]"));
    WebElement newPasswordField = $(By.xpath("id(\"new_pass\")"));
    WebElement changePasswordButton = $(By.xpath("/html/body/div[3]/form[1]/div[3]/button[1]"));
    WebElement successChangePasswordText = $(By.xpath("/html/body/div[3]/form[1]/div[3]/div[2]"));
    WebElement errorChangePasswordText = $(By.xpath("/html/body/div[3]/form[1]/div[3]/div[1]"));
    WebElement sorryPopUp = $(By.xpath("id(\"servermessage\")/div[1]"));
    WebElement sorryText = $(By.xpath("id(\"servermessage\")/div[1]/div[1]/span[1]"));
    WebElement sorryIcon = $(By.xpath("id(\"servermessage\")/div[1]/div[1]/i[1]"));


    public MALLoginPage clickLogOutLink() {
        $(logoutLink).click();
        return new  MALLoginPage();
    }
}
