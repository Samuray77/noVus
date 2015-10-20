package Pages.PagesAdmin;

import Pages.PagesAnalytics.AnalLoginPage;
import Pages.PagesMAL.MALLoginPage;
import Pages.PagesLMS.LMSLoginPage;
import Pages.PagesLMS.ObjectPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class MainAdminPage {

    //    Texts for MainAdminPage
    public String mainAdminPageNovusText = "noVus";
    public String mainAdminPageLmsText = "lms";
    public String mainAdminPageBackToSiteText = "Back to site";
    public String mainAdminPageVideoAnalyticsText = "Video analytics";
    public String amainAdminPageVideoChannelsText = "Video channels";
    public String mainAdminPageLogOutText = "Log out";
    public String mainAdminPageAuthText = "Auth";
    public String mainAdminPageGroupsText = "Groups";
    public String mainAdminPageUsersText = "Users";
    public String mainAdminPageEventsText = "Events";
    public String mainAdminPageCamerasText = "Cameras";
    public String mainAdminPageEventTypesText = "Event types";
    public String mainAdminPageZonesText = "Zones";
    public String mainAdminPageObjectsText = "Objects";
    public String mainAdminPageHomeText = "Home";
    public String mainAdminPageVersionText = "v0.6.4.1b-25-g461f265 | 0.66";
    public String mainAdminPageCopyRightText = "©2015 — «noVus» All rights reserved";
    //    Locators for MainAdminPage
    public WebElement mainAdminPageNovusLogoLink = $(By.xpath("id(\"site-name\")"));
    public WebElement mainAdminPageDateTimeLabel = $(By.xpath("id(\"header\")/div[2]"));
    public WebElement mainAdminPageLmsLabel = $(By.xpath("id(\"user-tools\")/strong[1]"));
    public WebElement mainAdminPageBackToWebsiteLink = $(By.xpath("id(\"user-tools\")/span[1]/a[1]"));
    public WebElement mainAdminPageVideoAnalyticsLink = $(By.xpath("id(\"user-tools\")/span[1]/a[2]"));
    public WebElement mainAdminPageVideoChannelLink = $(By.xpath("id(\"user-tools\")/span[1]/a[3]"));
    public WebElement mainAdminPageLogOutLink = $(By.xpath("id(\"user-tools\")/span[1]/a[4]"));
    public WebElement mainAdminPageSearchField = $(By.xpath("id(\"quick-search\")"));
    public WebElement mainAdminPageSearchButton = $(By.xpath("id(\"suit-left\")/form[1]/input[2]"));
    public WebElement mainAdminPageHomeLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[1]/a[1]"));
    public WebElement mainAdminPageAuthLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[2]/a[1]"));
    public WebElement mainAdminPageGroupDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[2]/a[1]"));
    public WebElement mainAdminPageUsersDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
    public WebElement mainAdminPageEventLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[3]/a[1]"));
    public WebElement mainAdminPageCamerasDropDawnLink = $(By.xpath(".//*[@id='left-nav']/ul/li[3]/ul/li[1]/a"));
    public WebElement mainAdminPageEventsTypeDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[3]/ul[1]/li[2]/a[1]"));
    public WebElement mainAdminPageEventsDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[3]/ul[1]/li[3]/a[1]"));
    public WebElement mainAdminPageZonesDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[3]/ul[1]/li[4]/a[1]"));
    public WebElement mainAdminPageObjectsDropDawnLink = $(By.xpath("id(\"left-nav\")/ul[1]/li[4]/a[1]"));
    public WebElement mainAdminPageVersion = $(By.xpath("id(\"footer\")/div[1]/div[2]"));
    public WebElement mainAdminPageCopyRight = $(By.xpath(".//*[@id='footer']/div/div[1]"));


    public AdminPage clickadminPageNovusLogoLink(){
        $(mainAdminPageNovusLogoLink).click();
        return new AdminPage();
    }

    public AnalLoginPage clickMainAdminPageVideoAnalyticsLink(){
        $(mainAdminPageVideoAnalyticsLink).click();
        return new AnalLoginPage();
    }

    public ObjectPage clickMainAdminPageBackToWebsiteLink(){
        $(mainAdminPageBackToWebsiteLink).click();
        return new ObjectPage();
    }

    public MALLoginPage clickMainAdminPageVideoChannelLink(){
        $(mainAdminPageVideoChannelLink).click();
        return new MALLoginPage();
    }

    public LMSLoginPage clickMainAdminPageLogOutLink(){
        $(mainAdminPageLogOutLink).click();
        return new LMSLoginPage();
    }

    public AdminAuthGroupsPage clickMainAdminPageSearchButton(){
        $(mainAdminPageSearchButton).click();
        return new AdminAuthGroupsPage();
    }

    public AdminPage clickMainAdminPageHomeLink(){
        $(mainAdminPageHomeLink).click();
        return new AdminPage();
    }

    public AdminAuthGroupsPage clickMainAdminPageAuthLink(){
        $(mainAdminPageAuthLink).click();
        return new AdminAuthGroupsPage();
    }

    public AdminAuthGroupsPage clickMainAdminPageGroupDropDawnLink(){
        $(mainAdminPageGroupDropDawnLink).click();
        return new AdminAuthGroupsPage();
    }

    public AdminAuthGroupsPage clickMainAdminPageUsersDropDawnLink(){
        $(mainAdminPageUsersDropDawnLink).click();
        return new AdminAuthGroupsPage();
    }

    public AdminEventsCameraPage clickMainAdminPageEventLink(){
        $(mainAdminPageEventLink).click();
        return new AdminEventsCameraPage();
    }

    public AdminEventsCameraPage clickMainAdminPageCamerasDropDawnLink(){
        $(mainAdminPageCamerasDropDawnLink).click();
        return new AdminEventsCameraPage();
    }

    public AdminEventsEventTypePage clickMainAdminPageEventsTypeDropDawnLink(){
        $(mainAdminPageEventsTypeDropDawnLink).click();
        return new AdminEventsEventTypePage();
    }

    public AdminEventsEventsPage clickMainAdminPageEventsDropDawnLink(){
        $(mainAdminPageEventsDropDawnLink).click();
        return new AdminEventsEventsPage();
    }

    public AdminEventsZonesPage clickMainAdminPageZonesDropDawnLink(){
        $(mainAdminPageZonesDropDawnLink).click();
        return new AdminEventsZonesPage();
    }

    public ObjectPage clickMainAdminPageObjectsDropDawnLink(){
        $(mainAdminPageObjectsDropDawnLink).click();
        return new ObjectPage();
    }





}
