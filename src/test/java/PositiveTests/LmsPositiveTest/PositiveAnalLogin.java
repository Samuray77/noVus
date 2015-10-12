package PositiveTests.LmsPositiveTest;

import Pages.AnalLoginPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;

public class PositiveAnalLogin extends AnalLoginPage{
    @Before
    public void preconditionPositiveLMSLoginTest() throws Exception {
//      Open AnalLoginPage
        openAnalLoginPage();
    }

    @Test
    public void positiveAnalLoginTest() throws Exception {

//      Enter valid "login" and "password" in userNameField and passwordField.
//      Check AnalPage opened
        validAnalLoginPageRegistration().analPageAnalyticsText.equals(text("Analytics"));

        System.out.println("PositiveAnalLogin Test - PASSED");


    }



}
