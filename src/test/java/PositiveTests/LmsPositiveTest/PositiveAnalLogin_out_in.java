package PositiveTests.LmsPositiveTest;

import Pages.AnalLoginPage;
import Pages.AnalPage;
import org.junit.Before;
import org.junit.Test;

public class PositiveAnalLogin_out_in extends AnalLoginPage{

    @Before
    public void preconditionsPositiveMALLogin_out_inTest() throws Exception {
        openAnalLoginPage();
    }

    @Test
    public void PositiveAnalLogin_out_inTest() throws Exception {
//      Enter valid "userName" and "password" in "userNameField" and "passwordField".
//      Check AnalLoginPage opened
        AnalPage resultPage = validAnalLoginPageRegistration().clickanalPageLogoutLink().validAnalLoginPageRegistration();
        resultPage.validateAnalPage();

        System.out.println("PositiveAnalLogin_out_in Test - PASSED");

    }



}
