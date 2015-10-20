package PositiveTests.LmsPositiveTest;

import Pages.PagesMAL.MALLoginPage;
import org.junit.Before;
import org.junit.Test;

public class PositiveMALLogin_out_in extends MALLoginPage{

    @Before
    public void setUp() throws Exception {
        openMALLoginPage();
    }

    @Test
    public void PositiveMALLogin_out_inTest() throws Exception {
//      Enter valid "userName" and "password" in "userNameField" and "passwordField".
//      Check MALLoginPage opened
        validMALLoginPageRegistration().clickLogOutLink().malLoginPageTitle.getText().equals("Video Source Settings");

        System.out.println("PositiveMALLogin_out_in Test - PASSED");

    }
}
