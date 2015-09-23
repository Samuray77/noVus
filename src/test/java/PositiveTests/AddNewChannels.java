package PositiveTests;

import com.codeborne.selenide.Selectors;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.junit.Assert.assertEquals;

public class AddNewChannels {

    //    Locators for MAL registration
    WebElement userNameField = $(By.xpath(".//*[@id='username']"));
    WebElement passField = $(By.xpath(".//*[@id='password']"));
    WebElement buttonLogin = $(By.xpath("html/body/div[2]/form/div[3]/button"));

    //      Locators for add channels
    WebElement buttonPlusChannel = $(By.xpath(".//*[@id='channels']/a[2]"));
    WebElement channelsFields = $(By.xpath(".//*[@id='setting_instance']/div[1]"));
    WebElement sourceTypeField = $(by("source", "Hikvision_NVR"));
//    WebElement sourceTypeField = $(By.cssSelector(".select"));
    //    WebElement sovaLinuxFields = $(By.xpath(".//*[@id='channel']/div[2]/ul/li[1]"));
    WebElement sovaLinuxFields = $(byText("SOVA_Linux"));
    WebElement novusField = $(By.xpath(".//*[@id='channel']/div[2]/ul/li[2]"));
    WebElement hikNVRField = $(By.xpath(".//*[@id='channel']/div[2]/ul/li[3]"));
    WebElement ipAddressField = $(By.xpath(".//*[@id='channel']/div[3]/input"));
    WebElement loginChannelField = $(By.xpath(".//*[@id='channel']/div[4]/input"));
    WebElement passChannelField = $(By.xpath(".//*[@id='channel']/div[5]/input"));
    WebElement channelNumberField = $(By.xpath(".//*[@id='channel']/div[6]/input"));
    WebElement duplicateButton = $(By.xpath(".//*[@id='channel']/a[2]"));




    @Before
    public void loginPageAuthorizationTest() throws Exception {

//        Open MALLoginPage
        open("http://127.0.1.1/mal/");
//        Authorization AnalyticLoginPage
        $(userNameField).setValue("user");
        $(passField).setValue("password");
        $(buttonLogin).click();

//        System.out.println("loginPageAuthorizationTest - PASSED");
    }

    @Test
    public void addNewChannelsTest() throws Exception {

//        Preconditions. Look @Before
        System.out.println("loginPageAuthorizationTest - PASSED");

        $(buttonPlusChannel).click();

//        $(sourceTypeField).click();
//        $(sovaLinuxFields).click();
        $$(By.xpath(".//*[@id='channels']")).get(2).setValue("10.0.6.207");
        $(sovaLinuxFields).click();
//        Check popupMassage present and have texts  "License code saved.",  "Licenses updated."
        $(channelsFields).shouldBe(visible);
//        $(popupMassage2).shouldBe(visible);
//        assertEquals(popupMassageText1, popupMassage1.getText());
//        assertEquals(popupMassageText2, popupMassage2.getText());
//
//        $(analyticsLink).click();
//        $(plusAnalyticsButton).click();
//        switchTo().window("Novus");
//
//
    }
}
