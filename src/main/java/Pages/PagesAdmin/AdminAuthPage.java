package Pages.PagesAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class AdminAuthPage extends AdminPage {

    //    Texts for AdminAuthPage
    public String adminAuthPageUrl = "http://127.0.1.1/admin/auth/";

    //    Locators for AdminAuthPage
    public WebElement adminAuthAuthLabel = $(By.xpath(".//*[@id='suit-center']/ul/li[2]"));
    String url=adminAuthPageUrl;


}
