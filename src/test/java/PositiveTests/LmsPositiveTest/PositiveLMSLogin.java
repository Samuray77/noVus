package PositiveTests.LmsPositiveTest;

import Pages.LMSLoginPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class PositiveLMSLogin extends LMSLoginPage{


    @Test
    public void userCanRegistrationWithValidDataTest() throws Exception {

        openLMSLoginPage();

        validLMSLoginPageRegistration(); // Enter valid "login" and "password" in loginField and passwordField.

//      Checks:
//      Check ObjectPage opened

        $(title()).getText().equals("noVus");


        System.out.println("LMS Authorization - PASSED");



    }



}
