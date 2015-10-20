package Pages.PagesLMS;

import Pages.PagesAdmin.AdminPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class MainObjectPage {

    //    Locators for MainObjectPage
    String objectPageTitle = "noVus";
    public WebElement objectPageNovusLogo = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
    public WebElement objectPageObjectLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
    public WebElement objectPageSearchLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
    public WebElement objectPageChartsLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ul[1]/li[3]/a[1]"));
    public WebElement objectPageReportsLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
    public WebElement objectPageLogOutLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/a[1]"));
    public WebElement objectPageAdminLink = $(By.xpath("id(\"header\")/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/a[2]/span[1]"));
    public WebElement objectPageCopyrightText = $(By.xpath("/html/body/div[3]/footer[1]/div[1]/div[1]/div[1]/p[1]"));

    public ObjectPage clickObjectLink(){
        $(objectPageObjectLink).click();
        return new ObjectPage();
    }

    public SearchPage clickSearchLink(){
        $(objectPageSearchLink).click();
        return new SearchPage();
    }

    public ChartsPage clickChartsLink(){
        $(objectPageChartsLink).click();
        return new ChartsPage();
    }

    public LMSLoginPage clickLogOutLink(){
        $(objectPageLogOutLink).click();
        return new LMSLoginPage();
    }
    public AdminPage clickAdminLink(){
        $(objectPageAdminLink).click();
        return new AdminPage();
    }


}
