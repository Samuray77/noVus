package PositiveTests.LmsPositiveTest;

import Pages.PagesLMS.LMSLoginPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;


public class PositiveLMSLogin_out_in extends LMSLoginPage{

    @Before
    public void setUp() throws Exception {
//      Open LMSLoginPage
        openLMSLoginPage();
    }

    @Test
    public void PositiveLMSLogin_out_inTest() throws Exception {
//      Enter valid "login" and "password" in loginField and passwordField.
//      Check ObjectPage opened
        validLMSLoginPageRegistration().clickLogOutLink().validLMSLoginPageRegistration().objectPageObjectLogo.equals(text("object"));

        System.out.println("PositiveLMSLogin_out_in Test - PASSED");

    }

}
