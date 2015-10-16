package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class AdminAuthGroupsPage extends AdminAuthPage {

    //    Texts for AdminAuthGroupsPage
    public String adminPageUrl = "http://127.0.1.1/admin/auth/group/";
    public String adminAuthGroupsKeywordFieldText = "Keyword";
    public String adminAuthGroupsSearchButtonText = "Search";
    public String adminAuthGroupsAddGroupLinkText = "Add group";
    public String adminPageAddText = "Groups are not created yet.";
    public String adminAuthGroupsAddGroupButtonText = "Add group";
    //    Locators for AdminAuthGroupsPage
    public WebElement adminAuthGroupsGroupsLabel = $(By.xpath("id(\"suit-center\")/ul[1]/li[3]"));
    public WebElement adminAuthGroupsKeywordField = $(By.xpath("id(\"searchbar\")"));
    public WebElement adminAuthGroupsSearchButton = $(By.xpath("id(\"changelist-search\")/div[1]/input[2]"));
    public WebElement adminAuthGroupsAddGroupLink = $(By.xpath("id(\"changelist-form\")/div[1]/a[1]"));
    public WebElement adminAuthAddGroupsButton = $(By.xpath("id(\"changelist\")/div[1]/div[1]/a[1]"));
    public WebElement adminAuthGroupsGroupAreNotCreatedYetLabel = $(By.xpath("id(\"changelist-form\")/div[1]"));

    public AdminAuthGroupsPage clickAdminAuthGroupsSearchButton(){
        $(adminAuthGroupsSearchButton).click();
        return new AdminAuthGroupsPage();
    }

    public AdminAuthGroupsAddGroup clickAdminAuthGroupsAddGroupLink(){
        $(adminAuthGroupsAddGroupLink).click();
        return new AdminAuthGroupsAddGroup();
    }

    public AdminAuthGroupsAddGroup clickAdminAuthGroupsAddGroupButton(){
        $(adminAuthAddGroupsButton).click();
        return new AdminAuthGroupsAddGroup();
    }

    public AdminAuthGroupsAddGroup setSearchValueAdminAuthGroupsKeywordField(String searchValue){
        $(adminAuthGroupsKeywordField).sendKeys(searchValue);
        return new AdminAuthGroupsAddGroup();
    }

}
