package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class AdminPage extends MainAdminPage{

    //    Texts for AdminPage
    public String adminPageUrl = "http://127.0.1.1/admin/";
    public String adminPageMyActionsText = "My Actions";
    public String adminPageChangeText = "Change";
    public String adminPageAddText = "Add";
    //    Locators for MainAdminPage
    public WebElement adminPageAuthLink = $(By.xpath("id(\"content-main\")/div[1]/table[1]/caption[1]/a[1]"));
    public WebElement adminPageAuthGroupsLabel = $(By.xpath("id(\"content-main\")/div[1]/table[1]/tbody[1]/tr[1]/th[1]"));
    public WebElement adminPageAuthGroupChangeLink = $(By.xpath("id(\"content-main\")/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
    public WebElement adminPageAuthGroupsAddLink = $(By.xpath("id(\"content-main\")/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]"));
    public WebElement adminPageAuthUserLabel = $(By.xpath("id(\"content-main\")/div[1]/table[1]/tbody[1]/tr[2]/th[1]"));
    public WebElement adminPageAuthUsersChangeLink = $(By.xpath(".//*[@id='content-main']/div[1]/table/tbody/tr[2]/td[1]/a"));
    public WebElement adminPageAuthUsersAddLink = $(By.xpath("id(\"content-main\")/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]"));
    public WebElement adminPageEventsLink = $(By.xpath("id(\"content-main\")/div[2]/table[1]/caption[1]/a[1]"));
    public WebElement adminPageEventsCamerasLabel = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[1]/th[1]"));
    public WebElement adminPageEventsCamerasChangeLink = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
    public WebElement adminPageEventsCamerasAddLink = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]"));
    public WebElement adminPageEventsEventTypesLabel = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[2]/th[1]"));
    public WebElement adminPageEventsEventTypesChangeLink = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[2]/td[1]/a[1]"));
    public WebElement adminPageEventsEventTypesAddLink = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[2]/td[2]/a[1]"));
    public WebElement adminPageEventsEventsLabel = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[3]/th[1]"));
    public WebElement adminPageEventsEventsChangeLink = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[3]/td[1]"));
    public WebElement adminPageEventsEventsAddLink = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[3]/td[2]/a[1]"));
    public WebElement adminPageEventsZonesLabel = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[4]/th[1]"));
    public WebElement adminPageEventsZoneChangeLink = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[4]/td[1]/a[1]"));
    public WebElement adminPageEventsZoneAddLink = $(By.xpath("id(\"content-main\")/div[2]/table[1]/tbody[1]/tr[4]/td[2]/a[1]"));
    public WebElement adminPageObjectsLink = $(By.xpath("id(\"content-main\")/div[3]/table[1]/caption[1]/a[1]"));
    public WebElement adminPageObjectsObjectsLabel = $(By.xpath("id(\"content-main\")/div[3]/table[1]/tbody[1]/tr[1]/th[1]"));
    public WebElement adminPageObjectsObjectsChangeLink = $(By.xpath("id(\"content-main\")/div[3]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
    public WebElement adminPageObjectsObjectsAddLink = $(By.xpath("id(\"content-main\")/div[3]/table[1]/tbody[1]/tr[1]/td[2]/a[1]"));
    public WebElement adminPageMyActionsLabel = $(By.xpath("id(\"recent-actions-module\")/h4[1]"));

    public AdminAuthPage clickAdminPageAuthLink(){
        $(adminPageAuthLink).click();
        return new AdminAuthPage();
    }

    public AdminAuthGroupsPage clickAdminPageAuthGroupChangeLink(){
        $(adminPageAuthGroupChangeLink).click();
        return new AdminAuthGroupsPage();
    }

    public AdminAuthGroupsAddGroup clickAdminPageAuthGroupsAddLink(){
        $(adminPageAuthGroupsAddLink).click();
        return new AdminAuthGroupsAddGroup();
    }

    public AdminAuthUserPage clickAdminPageAuthUsersChangeLink(){
        $(adminPageAuthUsersChangeLink).click();
        return new AdminAuthUserPage();
    }

    public AdminAuthUserAddUserPage clickAdminPageAuthUsersAddLink(){
        $(adminPageAuthUsersAddLink).click();
        return new AdminAuthUserAddUserPage();
    }

    public AdminEventsPage clickAdminPageEventsLink(){
        $(adminPageEventsLink).click();
        return new AdminEventsPage();
    }

    public AdminEventsCamerasPage clickAdminPageEventsCamerasChangeLink(){
        $(adminPageEventsCamerasChangeLink).click();
        return new AdminEventsCamerasPage();
    }

    public AdminEventsCamerasAddCameraPage clickAdminPageEventsCamerasAddLink(){
        $(adminPageEventsCamerasAddLink).click();
        return new AdminEventsCamerasAddCameraPage();
    }

    public AdminEventsEventTypePage clickAdminPageEventsEventTypesChangeLink(){
        $(adminPageEventsEventTypesChangeLink).click();
        return new AdminEventsEventTypePage();
    }

    public AdminEventsEventTypeAddEventTypePage clickAdminPageEventsEventTypesAddLink(){
        $(adminPageEventsEventTypesAddLink).click();
        return new AdminEventsEventTypeAddEventTypePage();
    }

    public AdminEventsEventsPage clickAdminPageEventsEventsChangeLink(){
        $(adminPageEventsEventsChangeLink).click();
        return new AdminEventsEventsPage();
    }

    public AdminEventsEventsAddEvents clickAdminPageEventsEventsAddLink(){
        $(adminPageEventsEventsAddLink).click();
        return new AdminEventsEventsAddEvents();
    }

    public AdminEventsZonesPage clickAdminPageEventsZoneChangeLink(){
        $(adminPageEventsZoneChangeLink).click();
        return new AdminEventsZonesPage();
    }

    public AdminEventsZonesAddZone clickAdminPageEventsZoneAddLink(){
        $(adminPageEventsZoneAddLink).click();
        return new AdminEventsZonesAddZone();
    }

    public AdminObjectPage clickAdminPageObjectsLink(){
        $(adminPageObjectsLink).click();
        return new AdminObjectPage();
    }

    public AdminObjectPage clickAdminPageObjectsObjectsChangeLink(){
        $(adminPageObjectsObjectsChangeLink).click();
        return new AdminObjectPage();
    }

    public AdminObjectAddObjectPage clickAdminPageObjectsObjectsAddLink(){
        $(adminPageObjectsObjectsAddLink).click();
        return new AdminObjectAddObjectPage();
    }

}
