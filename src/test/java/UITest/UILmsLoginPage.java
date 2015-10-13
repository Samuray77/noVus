package UITest;


import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UILmsLoginPage {

    //    Locators for registration
    WebElement loginField = $(By.xpath(".//*[@id='id_username']"));
    WebElement passwordField = $(By.xpath(".//*[@id='id_password']"));
    WebElement inputLogin = $(By.xpath(".//*[@id='login-form']/div[4]/input"));

    @Before
    public void loginPageAuthorizationTest() throws Exception {

//        Open AdminPage
        open("http://127.0.1.1/admin/");
        //        Authorization AdminPage
        $(loginField).setValue("lms");
        $(passwordField).setValue("lms");
        $(inputLogin).click();

        System.out.println("Authorization AdminPage - PASSED");
    }

}
