package PositiveTests.LmsPositiveTest;

import Pages.LMSLoginPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;

public class PositiveLMSLogin extends LMSLoginPage{


    @Before
    public void preconditionPositiveLMSLoginTest() throws Exception {
//      Open LMSLoginPage
        openLMSLoginPage();
    }

    @Test
    public void positiveLMSLoginTest() throws Exception {

//      Enter valid "login" and "password" in loginField and passwordField.
//      Check ObjectPage opened
        validLMSLoginPageRegistration().objectPageObjectLogo.equals(text("object"));

        System.out.println("PositiveLMSLogin Test - PASSED");


    }



}
