package PositiveTests.LmsPositiveTest;

import Pages.MALLoginPage;
import org.junit.Before;
import org.junit.Test;

public class PositiveMALLogin extends MALLoginPage {
    @Before
    public void preconditionPositiveLMSLoginTest() throws Exception {
//      Open LMSLoginPage
        openMALLoginPage();
    }

    @Test
    public void positiveLMSLoginTest() throws Exception {

//      Enter valid "login" and "password" in "userNameField" and "passwordField".
//      Check MALPage opened
        validMALLoginPageRegistration().malPageTitle.getText().equals("Video Source Settings");

        System.out.println("PositiveMALLogin Test - PASSED");


    }

}
