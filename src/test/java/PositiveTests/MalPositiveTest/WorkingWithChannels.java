package PositiveTests.MalPositiveTest;

import Pages.MALLoginPage;
import Pages.MALPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WorkingWithChannels extends MALPage {


    @Test
    public void userCanWorkingSovaLinuxChannelTest() throws Exception {


        MALLoginPage loginPage = new MALLoginPage();
        open("http://127.0.1.1/mal/");
//        Authorization MALLoginPage
        $(loginPage.userNameField).setValue("user");
        $(loginPage.passwordField).setValue("password");
        $(loginPage.loginButton).click();
        System.out.println("loginPageAuthorizationTest - PASSED");

    }
}
