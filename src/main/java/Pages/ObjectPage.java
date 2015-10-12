
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ObjectPage {

    //    Locators for ObjectPage
    String objectPageTitle = "noVus";
    String objectPageUrl = "http://127.0.1.1/object/";

    public WebElement objectPageNovusLogo = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
    public WebElement objectPageObjectLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
    public WebElement objectPageSearchLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
    public WebElement objectPageChartsLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ul[1]/li[3]/a[1]"));
    public WebElement objectPageReportsLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
    public WebElement objectPageLogOutLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/a[1]"));
    public WebElement objectPageAdminLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/a[2]/span[1]"));
    public WebElement objectPageObjectLogo = $(By.xpath("/html/body/div[3]/div[1]/h1[1]"));
    public WebElement objectPageObjectNameLabel = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/div[1]/p[1]"));
    public WebElement objectPageObjectNameText = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/div[1]/p[2]"));
    public WebElement objectPageObjectPhoto = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/div[2]/img[1]"));
    public WebElement objectNameAddressLabel = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/div[3]/p[1]"));
    public WebElement objectPageAddressText = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/div[3]/p[2]"));
    public WebElement objectPageObjectContactsLabel = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/p[1]"));
    public WebElement objectPagePositionText = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/div[4]/p[1]"));
    public WebElement objectPageNameText = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/div[4]/p[2]"));
    public WebElement objectPageTelNumberText = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/div[4]/p[3]"));
    public WebElement objectPageEmailText = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/div[4]/p[4]"));
    public WebElement objectPageFloor1Label = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]"));
    public WebElement objectPageFloor1Photo = $(By.xpath(".//*[@id='floor0']/img"));
    public WebElement objectPageEventsLabel = $(By.xpath("/html/body/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/h2[1]"));
    public WebElement objectPageCopyrightText = $(By.xpath("/html/body/div[3]/footer[1]/div[1]/div[1]/div[1]/p[1]"));
    //    Locators for objectPageEventsTable
    public WebElement objectPageEventsTable = $(By.xpath("html/body/div[3]/div/div/div[2]/div[3]/div[2]/div/*"));//All rows in eventsTable
    public WebElement objectPageEventsTableAnalLogo = $(By.xpath("html/body/div[3]/div/div/div[2]/div[3]/div[2]/div/*//div[1]"));//All analLogo in eventsTable
    public WebElement objectPageEventsTableAnalNameText = $(By.xpath("html/body/div[3]/div/div/div[2]/div[3]/div[2]/div/*//div[2]"));//All analNameText in eventsTable
    public WebElement objectPageEventsTableTimeText = $(By.xpath("html/body/div[3]/div/div/div[2]/div[3]/div[2]/div/*//div[3]"));//All timeText in eventsTable
    public WebElement objectPageEventsTableZoneNumberText = $(By.xpath("html/body/div[3]/div/div/div[2]/div[3]/div[2]/div/*//div[4]"));//All zoneNumberText in eventsTable

    public LMSLoginPage   openObjectPage(){
        open(objectPageUrl);
        return new LMSLoginPage();
    }


}
