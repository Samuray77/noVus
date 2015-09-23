package PositiveTests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class AddNewLicense {

    //    Locators for registration
    WebElement userNameField = $(By.xpath(".//*[@id='username']"));
    WebElement passField = $(By.xpath(".//*[@id='password']"));
    WebElement buttonLogin = $(By.xpath("html/body/div[2]/form/div[3]/button"));

    //      Locators for add license
    WebElement licenseLink = $(By.linkText("License"));
    WebElement licenseIdField = $(By.xpath(".//*[@id='password']"));
    String licenseNumber = "356300000044799227";
    WebElement saveLicenseButton = $(By.xpath("html/body/div[1]/div[2]/form/div[2]/button[1]"));
    WebElement popupMassage1 = $(By.xpath(".//*[@id='servermessage']/div[2]/div[1]/span"));
    WebElement popupMassage2 = $(By.xpath(".//*[@id='servermessage']/div[2]/div[2]/span"));
    String popupMassageText1 = "License code saved.";
    String popupMassageText2 = "Licenses updated.";
    WebElement analyticsLink = $(By.linkText("Analytics"));
    WebElement sensorLineLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[1]/td[1]/span"));
    WebElement plusAnalyticsButton = $(By.xpath(".//*[@id='add-record']/i"));
    WebElement lprLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[2]/td[1]/span"));
    WebElement crowdControlLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[3]/td[1]/span"));
    WebElement customerServiceLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[5]/td[1]/span"));
    WebElement peopleCountLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[4]/td[1]/span"));
    WebElement satelLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[6]/td[1]/span"));
    WebElement relayLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[7]/td[1]/span"));
    WebElement oneCLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[8]/td[1]/span"));
    WebElement numberOkLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[9]/td[1]/span"));
    WebElement customerLoyaltyLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[10]/td[1]/span"));
    WebElement poSLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[11]/td[1]/span"));
    WebElement rusGuardLocator = $(By.xpath(".//*[@id='record-popup']/div[3]/table/tbody/tr[12]/td[1]/span"));




    String contEditText = "The object \"Novus\" was changed successfully. You may edit it again below.";


    @Before
    public void AnalyticLoginPageAuthorizationTest() throws Exception {

//        Open AnalyticLoginPage
        open("http://127.0.1.1/am/login");
//        Authorization AnalyticLoginPage
        $(userNameField).setValue("user");
        $(passField).setValue("password");
        $(buttonLogin).click();

//        System.out.println("AnalyticLoginPageAuthorizationTest - PASSED");
    }


    @Test
    public void AddEmptyLicenseTest() throws Exception {

//        Preconditions. Look @Before
        System.out.println("AnalyticLoginPageAuthorizationTest - PASSED");

        $(licenseLink).click();
        $(saveLicenseButton).click();

//        Check popupMassage present and have texts  "License code saved.",  "Licenses updated."
        $(popupMassage1).shouldBe(visible);
        $(popupMassage2).shouldBe(visible);
        assertEquals(popupMassageText1, popupMassage1.getText());
        assertEquals("License is invalid.", popupMassage2.getText());

        $(analyticsLink).click();
        $(plusAnalyticsButton).click();
//        switchTo().window("Novus");

//        Check AnalyticsPopUp present, quantity and names analytics
//        $(By.xpath(".//*[@id='record-popup']")).shouldBe(visible);
//        $$(".record_content tr").shouldHave(size(13));
//        assertEquals("   FDC SensorLine", sensorLineLocator.getText());
//        assertEquals("   FDC LPR", lprLocator.getText());
//        assertEquals("   FDC Crowd Control", crowdControlLocator.getText());
//        assertEquals("   FDC People Count", peopleCountLocator.getText());
//        assertEquals("   FDC Customer Service", customerServiceLocator.getText());
//        assertEquals("   FDC Satel", satelLocator.getText());
//        assertEquals("   FDC Relay", relayLocator.getText());
//        assertEquals("   FDC 1C", oneCLocator.getText());
//        assertEquals("   NumberOk", numberOkLocator.getText());
//        assertEquals("   FDC Customer Loyalty", customerLoyaltyLocator.getText());
//        assertEquals("   FDC PoS", poSLocator.getText());
//        assertEquals("   FDC RusGuard", rusGuardLocator.getText());

        System.out.println("AddNewLicenseTest - PASSED");
    }
    @Test
    public void AddNewLicenseTest() throws Exception {

//        Preconditions. Look @Before
        System.out.println("AnalyticLoginPageAuthorizationTest - PASSED");

        $(licenseLink).click();
        $(licenseIdField).setValue(licenseNumber);
        $(saveLicenseButton).click();

//        Check popupMassage present and have texts  "License code saved.",  "Licenses updated."
        $(popupMassage1).shouldBe(visible);
        $(popupMassage2).shouldBe(visible);
        assertEquals(popupMassageText1, popupMassage1.getText());
        assertEquals(popupMassageText2, popupMassage2.getText());

        $(analyticsLink).click();
        $(plusAnalyticsButton).click();
        switchTo().window("Novus");

//        Check AnalyticsPopUp present, quantity and names analytics
        $(By.xpath(".//*[@id='record-popup']")).shouldBe(visible);
        $$(".record_content tr").shouldHave(size(13));
        assertEquals("   FDC SensorLine", sensorLineLocator.getText());
        assertEquals("   FDC LPR", lprLocator.getText());
        assertEquals("   FDC Crowd Control", crowdControlLocator.getText());
        assertEquals("   FDC People Count", peopleCountLocator.getText());
        assertEquals("   FDC Customer Service", customerServiceLocator.getText());
        assertEquals("   FDC Satel", satelLocator.getText());
        assertEquals("   FDC Relay", relayLocator.getText());
        assertEquals("   FDC 1C", oneCLocator.getText());
        assertEquals("   NumberOk", numberOkLocator.getText());
        assertEquals("   FDC Customer Loyalty", customerLoyaltyLocator.getText());
        assertEquals("   FDC PoS", poSLocator.getText());
        assertEquals("   FDC RusGuard", rusGuardLocator.getText());

        System.out.println("AddNewLicenseTest - PASSED");
    }

    @Test
    public void AddNewSensorLineAnalyticTest() throws Exception {

//        Preconditions. Look @Before
        System.out.println("AnalyticLoginPageAuthorizationTest - PASSED");

        $(analyticsLink).click();
        $(plusAnalyticsButton).click();
        $(sensorLineLocator).click();
//
//        $(plusAnalyticsButton).click();
//        switchTo().window("Novus");
////        Check AnalyticsPopUp present, quantity and names analytics
//        $(By.xpath(".//*[@id='record-popup']")).shouldBe(visible);
//        $$(".record_content tr").shouldHave(size(13));
//        assertEquals("   FDC SensorLine", sensorLineLocator.getText());
//        assertEquals("   FDC LPR", lprLocator.getText());
//        assertEquals("   FDC Crowd Control", crowdControlLocator.getText());
//        assertEquals("   FDC People Count", peopleCountLocator.getText());
//        assertEquals("   FDC Customer Service", customerServiceLocator.getText());
//        assertEquals("   FDC Satel", satelLocator.getText());
//        assertEquals("   FDC Relay", relayLocator.getText());
//        assertEquals("   FDC 1C", oneCLocator.getText());
//        assertEquals("   NumberOk", numberOkLocator.getText());
//        assertEquals("   FDC Customer Loyalty", customerLoyaltyLocator.getText());
//        assertEquals("   FDC PoS", poSLocator.getText());
//        assertEquals("   FDC RusGuard", rusGuardLocator.getText());
//
//        System.out.println("AddNewLicenseTest - PASSED");
    }

}