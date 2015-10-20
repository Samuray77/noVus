package PositiveTests.LmsPositiveTest;

import Pages.PagesAnalytics.AnalLoginPage;
import Pages.PagesAnalytics.AnalPage;
import org.junit.Before;
import org.junit.Test;

public class PositiveAnalLogin extends AnalLoginPage{
    @Before
    public void preconditionPositiveLMSLoginTest() throws Exception {
//      Open AnalLoginPage
        openAnalLoginPage();
    }

    @Test
    public void positiveAnalLoginTest() throws Exception {

//      Enter valid "login" and "password" in userNameField and passwordField.
        AnalPage resultPage = validAnalLoginPageRegistration();
//      Check AnalPage opened
//        resultPage.analPageAnalyticsLabel.shouldHave();
//        $(resultPage.analPageAnalyticsLabel).shouldBe(Condition.visible);
        resultPage.validateAnalPage();
        System.out.println("PositiveAnalLogin Test - PASSED");


    }



}
