package Pages.PagesAdmin;

import Pages.PagesLMS.LMSLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AdminAuthUserPage extends AdminAuthPage {

    //    Texts for AdminAuthUserPage
    public String adminAutUsersPageUrl = "http://127.0.1.1/admin/auth/user/";

    //    Locators for AdminAuthUserPage
    public WebElement adminAuthUsersLabel = $(By.xpath(".//*[@id='suit-center']/ul/li[3]"));

    public AdminAuthUserPage   openAdminAuthUserPage(){
        open(adminAutUsersPageUrl);
        LMSLoginPage page = new LMSLoginPage();
        page.validLMSLoginPageRegistration();
        return new AdminAuthUserPage();
    }



}
