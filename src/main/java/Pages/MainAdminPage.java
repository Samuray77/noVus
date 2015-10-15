package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class MainAdminPage {

    //    Locators for MainAdminPage
    String adminPageUrl = "http://127.0.1.1/admin/";
    public String adminPageVersionText = "v0.6.4.1b-25-g461f265 | 0.66";
    public String adminPageCopyRightText = "©2015 — «noVus» All rights reserved";


    public WebElement adminPageNovusLogoLink = $(By.xpath("id(\"site-name\")"));
    public WebElement adminPageDateTimeLabel = $(By.xpath("id(\"header\")/div[2]"));
    public WebElement adminPageLmsLabel = $(By.xpath("id(\"user-tools\")/strong[1]"));
    public WebElement adminPageBackToWebsiteLink = $(By.xpath("id(\"user-tools\")/span[1]/a[1]"));
    public WebElement adminPageVideoAnalyticsLink = $(By.xpath("id(\"user-tools\")/span[1]/a[2]"));
    public WebElement adminPageVideoChannelLink = $(By.xpath("id(\"user-tools\")/span[1]/a[3]"));
    public WebElement adminPageLogOutLink = $(By.xpath("id(\"user-tools\")/span[1]/a[4]"));
    public WebElement adminPageSearchField = $(By.xpath("id(\"quick-search\")"));
    public WebElement adminPageSearchButton = $(By.xpath("id(\"suit-left\")/form[1]/input[2]"));
    public WebElement adminPageHomeLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[1]/a[1]"));
    public WebElement adminPageAuthLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[2]/a[1]"));
    public WebElement adminPageGroupDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[2]/a[1]"));
    public WebElement adminPageUsersDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
    public WebElement adminPageEventLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[3]/a[1]"));
    public WebElement adminPageCamerasDropDawnLink = $(By.xpath(".//*[@id='left-nav']/ul/li[3]/ul/li[1]/a"));
    public WebElement adminPageEventsTypeDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[3]/ul[1]/li[2]/a[1]"));
    public WebElement adminPageEventsDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[3]/ul[1]/li[3]/a[1]"));
    public WebElement adminPageZonesDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[3]/ul[1]/li[4]/a[1]"));
    public WebElement adminPageObjectsDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[4]/a[1]"));
    public WebElement adminPageVersion = $(By.xpath("id(\"footer\")/div[1]/div[2]"));
    public WebElement adminPageCopyRight = $(By.xpath(".//*[@id='footer']/div/div[1]"));


    public AdminPage clickadminPageNovusLogoLink(){
        $(adminPageNovusLogoLink).click();
        return new AdminPage();
    }

    public AnalLoginPage clickadminPageVideoAnalyticsLink(){
        $(adminPageVideoAnalyticsLink).click();
        return new AnalLoginPage();
    }

    public ObjectPage clickadminPageBackToWebsiteLink(){
        $(adminPageBackToWebsiteLink).click();
        return new ObjectPage();
    }

    public MALLoginPage clickadminPageVideoChannelLink(){
        $(adminPageVideoChannelLink).click();
        return new MALLoginPage();
    }

    public LMSLoginPage clickadminPageLogOutLink(){
        $(adminPageLogOutLink).click();
        return new LMSLoginPage();
    }

    public AdminAuthGroupPage clickadminPageSearchButton(){
        $(adminPageSearchButton).click();
        return new AdminAuthGroupPage();
    }

    public AdminPage clickadminPageHomeLink(){
        $(adminPageHomeLink).click();
        return new AdminPage();
    }

    public AdminAuthGroupPage clickadminPageAuthLink(){
        $(adminPageAuthLink).click();
        return new AdminAuthGroupPage();
    }

    public AdminAuthGroupPage clickadminPageGroupDropDawnLink(){
        $(adminPageGroupDropDawnLink).click();
        return new AdminAuthGroupPage();
    }

    public AdminAuthGroupPage clickadminPageUsersDropDawnLink(){
        $(adminPageUsersDropDawnLink).click();
        return new AdminAuthGroupPage();
    }

    public AdminEventsCameraPage clickadminPageEventLink(){
        $(adminPageEventLink).click();
        return new AdminEventsCameraPage();
    }

    public AdminEventsCameraPage clickadminPageCamerasDropDawnLink(){
        $(adminPageCamerasDropDawnLink).click();
        return new AdminEventsCameraPage();
    }

    public AdminEventsEventTypePage clickadminPageEventsTypeDropDawnLink(){
        $(adminPageEventsTypeDropDawnLink).click();
        return new AdminEventsEventTypePage();
    }

    public AdminEventsEventPage clickadminPageEventsDropDawnLink(){
        $(adminPageEventsDropDawnLink).click();
        return new AdminEventsEventPage();
    }

    public AdminEventsZonePage clickadminPageZonesDropDawnLink(){
        $(adminPageZonesDropDawnLink).click();
        return new AdminEventsZonePage();
    }

    public ObjectPage clickadminPageObjectsDropDawnLink(){
        $(adminPageObjectsDropDawnLink).click();
        return new ObjectPage();
    }





}
