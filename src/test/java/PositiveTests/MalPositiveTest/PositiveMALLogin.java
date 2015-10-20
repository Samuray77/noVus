package PositiveTests.MalPositiveTest;

import Pages.PagesMAL.MALLoginPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class PositiveMALLogin extends MALLoginPage{

    @Test
    public void userCanLoginTest() throws Exception {


        MALLoginPage loginPage = new MALLoginPage();
        loginPage.openMALLoginPage();
//        Authorization MALLoginPage
        $(userNameField).setValue(validUserName);
        $(passwordField).setValue(validPassword);
        $(loginButton).click();
        System.out.println();
        System.out.println("loginPageAuthorizationTest - PASSED");

    }


}
