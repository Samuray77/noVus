package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class AdminEventsCameraPage extends MainAdminPage{

    //    Texts for AdminEventsCameraPage
    public String AdminEventsCameraPageUrl = "http://127.0.1.1/admin/events/camera/";

    //    Locators for AdminEventsCameraPage
    public WebElement adminEventsCameraCamerasLabel = $(By.xpath(".//*[@id='suit-center']/ul/li[3]"));



}
