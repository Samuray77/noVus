package PositiveTests;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AddNewCameras {

//    Locators for registration
    WebElement loginField = $(By.xpath(".//*[@id='id_username']"));
    WebElement passwordField = $(By.xpath(".//*[@id='id_password']"));
    WebElement buttonLogin = $(By.xpath(".//*[@id='login-form']/div[4]/input"));

//    Locators for add floor
    WebElement leftObject = $(By.xpath(".//*[@id='left-nav']/ul/li[4]/a"));
    WebElement floorField = $(By.xpath(".//*[@id='id_object_floor-1-name']"));
    WebElement checkFloorDelete = $(By.xpath(".//*[@id='id_object_floor-0-DELETE']"));
    WebElement uploadFloor = $(By.xpath(".//*[@id='id_object_floor-1-scheme']"));

    WebElement addZone = $(By.xpath(".//*[@id='content-main']/div[2]/table/tbody/tr[4]/td[2]/a"));
    WebElement zoneNameField = $(By.xpath(".//*[@id='id_name']"));
    WebElement saveContEditButton = $(By.xpath(".//*[@id='objects_form']/div[1]/div/div/button[2]"));
    WebElement saveTextLocator = $(By.xpath(".//*[@id='suit-center']/div[1]"));
    String contEditText = "The object \"Novus\" was changed successfully. You may edit it again below.";
    WebElement leftEvents = $(By.xpath(".//*[@id='left-nav']/ul/li[3]/a"));
    WebElement leftAddZone = $(By.xpath(".//*[@id='left-nav']/ul/li[3]/ul/li[4]/a"));
    WebElement middleAddZone = $(By.xpath(".//*[@id='changelist-form']/div/a"));
    WebElement floor_1Field = $(By.xpath(".//*[@id='id_floor']/option[2]"));
    WebElement saveAddButton = $(By.xpath(".//*[@id='zone_form']/div[1]/div/div/button[3]"));
    WebElement Button = $(By.xpath(".//*[@id='zone_form']/div[1]/div/div/button[1]"));


    String saveAddText = "The zone #1 Novus was added successfully. You may add another zone below.";
    String saveText = "The zone #1 Bank was changed successfully.";
    String saveText2 = "The zone \"#2 Bank: 1\" was changed successfully.";

    WebElement saveButton = $(By.xpath(".//*[@id='objects_form']/div[1]/div/div/button[1]"));

    @Test
    public void AddNewObjectTest() throws Exception {


//        Open AdminPage
        open("http://127.0.1.1/admin/");
//        Autorization AdminPage
        $(loginField).setValue("lms");
        $(passwordField).setValue("lms");
        $(buttonLogin).click();

//      Add floor for object
        $(leftObject).click();
        $(floorField).setValue("floor_1");
        $(checkFloorDelete).click();
        uploadFloor.sendKeys("G:\\FF_Projects\\Novus_Win\\Automation_Tests\\Images\\floor1.png");
        $(saveContEditButton).click();
        $(saveTextLocator).equals(contEditText);
        $(leftEvents).click();
        $(leftAddZone).click();
        $(middleAddZone).click();
//        $(floorField).click();
        $(floor_1Field).click();

        $(zoneNameField).setValue("1");
        $(saveAddButton).click();
        $(saveTextLocator).equals(saveText);

        $(floor_1Field).click();
        $(zoneNameField).setValue("2");


        $(Button).click();
        $(saveTextLocator).equals(saveAddText);
        $(saveTextLocator).equals(saveText);




        System.out.println("AddNewZone Test - PASSED");

    }


}
