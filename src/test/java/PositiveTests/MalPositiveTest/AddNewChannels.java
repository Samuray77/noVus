package PositiveTests.MalPositiveTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import static com.codeborne.selenide.Condition.hasText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AddNewChannels {

    //    Locators for MAL registration
    WebElement userNameField = $(By.xpath(".//*[@id='username']"));
    WebElement passField = $(By.xpath(".//*[@id='password']"));
    WebElement buttonLogin = $(By.xpath("html/body/div[2]/form/div[3]/button"));

    //      Locators for add channels
    WebElement buttonPlusChannel = $(By.xpath(".//*[@id='channels']/a[2]"));
//    WebElement channelsFields = $(By.xpath(".//*[@id='setting_instance']/div[1]"));
    Pattern sourceTypeField = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\sourceType.png");
    Pattern channelSovaLinux = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\channelSovaLinux.png");
    Pattern channelNovus = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\channelNovus.png");
    Pattern channelHikvisionNVR = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\channelHikvisionNVR.png");
    Pattern channelIpAddressField = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\channelIpAddressField.png");
    Pattern channelLoginField = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\channelLoginField.png");
    Pattern channelPasswordField = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\channelPasswordField.png");
    Pattern channelNumberField = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\channelNumberField.png");
    Pattern applyButton = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\aplyButton.png");
    Pattern resetButton = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\resetButton.png");
    Pattern deleteAllButton = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\deleteAllButton.png");
    Pattern checkAddChannel = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\checkAddChannel.png");
    Pattern screenshot_1 = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\screenshot_1.png");
//    WebElement sourceTypeField = $(By.xpath(".//*[@id='channel']"));
//    WebElement sourceTypeField = $(By.cssSelector(".select"));
//        WebElement sovaLinuxFields = $(By.xpath(".//*[@id='channel']/div[2]/ul/li[1]"));
//    WebElement sovaLinuxFields = $(byText("SOVA_Linux"));
//    WebElement novusField = $(By.xpath(".//*[@id='channel']/div[2]/ul/li[2]"));
//    WebElement hikNVRField = $(By.xpath(".//*[@id='channel']/div[2]/ul/li[3]"));
//    WebElement ipAddressField = $(By.xpath(".//*[@id='channel']/div[3]/input"));
//    WebElement loginChannelField = $(By.xpath(".//*[@id='channel']/div[4]/input"));
//    WebElement passChannelField = $(By.xpath(".//*[@id='channel']/div[5]/input"));
//    WebElement channelNumberField = $(By.xpath(".//*[@id='channel']/div[6]/input"));
    WebElement duplicateButton = $(By.xpath(".//*[@id='channel']/a[2]"));
    Screen mal = new Screen();



//    @Before
//    public void loginPageAuthorizationTest() throws Exception {
//
////        Open MALLoginPage
//        open("http://127.0.1.1/mal/");
////        Authorization AnalyticLoginPage
//        $(userNameField).setValue("user");
//        $(passField).setValue("password");
//        $(buttonLogin).click();
//
////        System.out.println("loginPageAuthorizationTest - PASSED");
//    }

    @Test
    public void userCanWorkingSovaLinuxChannelTest() throws Exception {

//        Preconditions:
        //        Open MALLoginPage
        open("http://127.0.1.1/mal/");
//        Authorization MALLoginPage
        $(userNameField).setValue("user");
        $(passField).setValue("password");
        $(buttonLogin).click();
        System.out.println("loginPageAuthorizationTest - PASSED");

//        Add new SovaLinuxChannel
        $(buttonPlusChannel).click();
        mal.click(sourceTypeField);
        mal.click(channelSovaLinux);
        mal.type(channelIpAddressField, "10.0.6.207");
        mal.type(channelLoginField, "admin");
        mal.type(channelPasswordField, "123456");
        mal.type(channelNumberField, "2");
        $(buttonPlusChannel).click();
//        Check Channel table have 2 lines
        $$(By.xpath(".//*[@id='channel']/div[1]")).shouldHaveSize(3);

        mal.click(applyButton);
//        Check Channel table have 2 lines
        $(By.xpath("html/body/div[4]/div/h2/center")).shouldBe(visible, hasText("Success!"));
        System.out.println("addNewSovaLinuxChannelTest - PASSED");
    }
    @Test
    public void userCanDuplacateSovaLinuxChannelTest() throws Exception {
//        Duplicate SovaLinuxChannel
        mal.click(sourceTypeField);
        mal.click(channelHikvisionNVR);
        mal.type(channelIpAddressField, "10.0.1.22");
        mal.type(channelLoginField, "admin");
        mal.type(channelPasswordField, "123456");
        mal.type(channelNumberField, "");
        mal.click(duplicateButton);
//        Check Channel table have 3 lines
        $$(By.xpath(".//*[@id='channel']/div[1]")).shouldHaveSize(4);

        System.out.println("addNewSovaLinuxChannelTest - PASSED");
    }

//    @Test
//    public void userCanWorkingHikvisionNVRChannelTest() throws Exception {
//
////        Preconditions. Look @Before
//        System.out.println("loginPageAuthorizationTest - PASSED");
//
////        Add new HikvisionNVRChannel
//        $(buttonPlusChannel).click();
//        mal.click(sourceTypeField);
//        mal.click(channelHikvisionNVR);
//        mal.type(channelIpAddressField, "10.0.6.207");
//        mal.type(channelLoginField, "admin");
//        mal.type(channelPasswordField, "123456");
//        mal.type(channelNumberField, "3");
//        $(buttonPlusChannel).click();
////        Check Channel table have 2 lines
//        $$(By.xpath(".//*[@id='channel']/div[1]")).shouldHaveSize(3);
//
//        System.out.println("addNewSovaLinuxChannelTest - PASSED");
//    }




}
