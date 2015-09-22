package PositiveTests;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class AddNewCameras {

//    Locators for registration
    WebElement loginField = $(By.xpath(".//*[@id='id_username']"));
    WebElement passwordField = $(By.xpath(".//*[@id='id_password']"));
    WebElement inputLogin = $(By.xpath(".//*[@id='login-form']/div[4]/input"));

//      Locators for add floor
    WebElement leftObject = $(By.xpath(".//*[@id='left-nav']/ul/li[4]/a"));
    WebElement floorField = $(By.xpath(".//*[@id='id_object_floor-1-name']"));
    WebElement checkFloorDelete = $(By.xpath(".//*[@id='id_object_floor-0-DELETE']"));
    WebElement uploadFloor = $(By.xpath(".//*[@id='id_object_floor-1-scheme']"));
    WebElement saveContEditButton = $(By.xpath(".//*[@id='objects_form']/div[1]/div/div/button[2]"));
    WebElement saveTextLocator = $(By.xpath(".//*[@id='suit-center']/div[1]"));
    String contEditText = "The object \"Novus\" was changed successfully. You may edit it again below.";
//      Locators for add and change Zones
    WebElement leftEvents = $(By.xpath(".//*[@id='left-nav']/ul/li[3]/a"));
    WebElement leftAddZone = $(By.xpath(".//*[@id='left-nav']/ul/li[3]/ul/li[4]/a"));
    WebElement zoneNameField = $(By.xpath(".//*[@id='id_name']"));

    WebElement coordX_1Field = $(By.xpath(".//*[@id='id_location_x_1']"));
    WebElement coordY_1Field = $(By.xpath(".//*[@id='id_location_y_1']"));
    WebElement coordX_2Field = $(By.xpath(".//*[@id='id_location_x_2']"));
    WebElement coordY_2Field = $(By.xpath(".//*[@id='id_location_y_2']"));

    WebElement middleAddZone = $(By.xpath(".//*[@id='changelist-form']/div/a"));
    WebElement floor_1Field = $(By.xpath(".//*[@id='id_floor']/option[2]"));
    WebElement SaveAddAnotherZoneButton = $(By.xpath(".//*[@id='zone_form']/div[1]/div/div/button[3]"));
    WebElement SaveContEditZoneButton = $(By.xpath(".//*[@id='zone_form']/div[1]/div/div/button[2]"));

    String AddAnotherButtonText = "The zone \"#1 Novus: 1\" was added successfully. You may add another zone below. ";
    String SaveContinueEditingButtonText = "The zone \"#2 Novus: 2\" was added successfully. You may edit it again below.";

    WebElement saveZoneButton = $(By.xpath(".//*[@id='zone_form']/div[1]/div/div/button[1]"));
    String changeZone2Text = "The zone \"#2 Novus: 2\" was changed successfully.";

    WebElement rightAddZone = $(By.xpath(".//*[@id='changelist']/div/div/a"));
    String addZoneText = "The zone \"#3 Novus: 3\" was added successfully.";

    WebElement checkBoxZone3 = $(By.xpath(".//*[@id='result_list']/tbody/tr[3]/td/input"));
    WebElement dellField = $(By.xpath(".//*[@id='changelist-form']/div[2]/label/select"));
    WebElement runSelectActionButton = $(By.xpath(".//*[@id='changelist-form']/div[2]/button"));
    WebElement confirmDellField = $(By.xpath(".//*[@id='content']/form/div/p"));
    String confirmDellText = "Are you sure you want to delete the selected zone? All of the following objects and their related items will be deleted:";
    WebElement confirmDellButton = $(By.xpath(".//*[@id='content']/form/div/div/input"));
    String dellZoneText = "Successfully deleted 1 zone.";

    WebElement zone1Field = $(By.xpath(".//*[@id='result_list']/tbody/tr[1]/th/a"));
    String changeZone1Text = "The zone \"#1 Novus: 1\" was changed successfully.";

//      Locators for add and change Cameras
    WebElement leftAddCamera = $(By.xpath(".//*[@id='left-nav']/ul/li[3]/ul/li[1]/a"));
    WebElement middleAddCamera = $(By.xpath(".//*[@id='changelist-form']/div/a"));
    WebElement cameraNameField = $(By.xpath(".//*[@id='id_number']"));
    WebElement changeZoneField = $(By.xpath(".//*[@id='id_zone']"));
    WebElement cameraTypeField = $(By.xpath(".//*[@id='id_camera_type']"));
    WebElement angleField = $(By.xpath(".//*[@id='id_rotate']"));
    WebElement coordXField = $(By.xpath(".//*[@id='id_location_x']"));
    WebElement coordYField = $(By.xpath(".//*[@id='id_location_y']"));
    WebElement camOrange = $(By.xpath(".//*[@id='floor-1']/a/span/span"));
    String addCam1Text = "The camera \"Novus - 1, camera ¹1\" was changed successfully.";
    WebElement saveCamButton = $(By.xpath(".//*[@id='camera_form']/div[1]/div/div/button[1]"));
    WebElement rightAddCamera = $(By.xpath(".//*[@id='changelist']/div/div/a"));
    WebElement saveContEditCamButton = $(By.xpath(".//*[@id='camera_form']/div[1]/div/div/button[2]"));
    String saveContEditCamText = "The camera \"Novus - 2, camera ¹2\" was added successfully. You may edit it again below.";
    WebElement saveAddAnotherCamButton = $(By.xpath(".//*[@id='camera_form']/div[1]/div/div/button[3]"));
    String saveAddAnotherCamText = "The camera \"Novus - 2, camera ¹2\" was changed successfully. You may add another camera below.";
    WebElement camGreen = $(By.xpath(".//*[@id='floor-1']/a/span/div/span"));
    WebElement addZoneFromCam = $(By.xpath(".//*[@id='add_id_zone']/img"));

    WebElement floorFieldPopUp = $(By.xpath(".//*[@id='id_floor']"));
    WebElement camNamePopup = $(By.xpath(".//*[@id='id_name']"));
    WebElement saveButtonPopup = $(By.xpath(".//*[@id='zone_form']/div[1]/div/div/button"));
    String saveCamText = "The camera \"Novus - 3, camera ¹3\" was added successfully.";
    WebElement listCam3 = $(By.xpath(".//*[@id='result_list']/tbody/tr[1]/th/a"));
    WebElement checkBoxCam = $(By.xpath(".//*[@id='action-toggle']"));
    WebElement checkBoxCam2 = $(By.xpath(".//*[@id='result_list']/tbody/tr[2]/td/input"));
    WebElement checkBoxCam1 = $(By.xpath(".//*[@id='result_list']/tbody/tr[3]/td/input"));



    @Test
    public void AddNewZoneTest() throws Exception {


//        Open AdminPage
        open("http://127.0.1.1/admin/");
//        Authorization AdminPage
        $(loginField).setValue("lms");
        $(passwordField).setValue("lms");
        $(inputLogin).click();

        System.out.println("Authorization AdminPage - PASSED");

//      Add floor for object
        $(leftObject).click();
        $(floorField).setValue("floor_1");
        $(checkFloorDelete).click();
        uploadFloor.sendKeys("G:\\FF_Projects\\Novus_Win\\Automation_Tests\\Images\\floor1.png");
        $(saveContEditButton).click();
//        Check Text Present: "The object \"Novus\" was changed successfully. You may edit it again below."
        $(saveTextLocator).shouldHave(text(contEditText));

        System.out.println("Add floor for object - PASSED");

//      Add and change Zones
//      Add Zone #1
        $(leftEvents).click();
        $(leftAddZone).click();
        $(middleAddZone).click();
        $(floor_1Field).click();
        $(zoneNameField).setValue("1");
        $(SaveAddAnotherZoneButton).click();
//        Check Text Present:  "The zone \"#1 Novus: 1\" was added successfully. You may add another zone below."
        $(saveTextLocator).shouldHave(text(AddAnotherButtonText));

        System.out.println("Add Zone #1 - PASSED");

//      Add and change Zone #2
//      Add
        $(floor_1Field).click();
        $(zoneNameField).setValue("2");
        $(SaveContEditZoneButton).click();
//        Check Text Present:  "The zone "#2 Novus: 2" was added successfully. You may edit it again below."
        $(saveTextLocator).shouldHave(text(SaveContinueEditingButtonText));
//      Change
        $(zoneNameField).clear();
        $(zoneNameField).setValue("2");
        $(coordX_1Field).setValue("100");
        $(coordY_1Field).setValue("75");
        $(coordX_2Field).setValue("1085");
        $(coordY_2Field).setValue("420");
        $(saveZoneButton).click();
//        Check Text Present:  "The zone \"#2 Novus: 2\" was changed successfully."
        $(saveTextLocator).shouldHave(text(changeZone2Text));

        System.out.println("Add and change Zone #2 - PASSED");

//      Add and delete Zone #3
//      Add
        $(rightAddZone).click();
        $(floor_1Field).click();
        $(zoneNameField).setValue("3");
        $(coordX_1Field).setValue("110");
        $(coordY_1Field).setValue("75");
        $(coordX_2Field).setValue("1080");
        $(coordY_2Field).setValue("800");
        $(saveZoneButton).click();
//        Check Text Present:  "The zone \"#3 Novus: 3\" was added successfully."
        $(saveTextLocator).shouldHave(text(addZoneText));
//      Delete
        $(checkBoxZone3).click();
        $(dellField).sendKeys(Keys.ARROW_DOWN);
        $(runSelectActionButton).click();
//        $(confirmDellField).shouldBe(visible);
//        Check Text Present:  "Are you sure you want to delete the selected zone? All of the following objects and their related items will be deleted:"
        $(confirmDellField).shouldHave(text(confirmDellText));
        $(confirmDellButton).click();
//        Check Text Present:  "Successfully deleted 1 zone."
        $(saveTextLocator).shouldHave(text(dellZoneText));

        System.out.println("Add and dell Zone #3 - PASSED");
//      Change Zone #1
        $(zone1Field).click();
        $(coordX_1Field).setValue("108");
        $(coordY_1Field).setValue("451");
        $(coordX_2Field).setValue("1086");
        $(coordY_2Field).setValue("793");
        $(saveZoneButton).click();
//        Check Text Present:  "The zone \"#1 Novus: 1\" was changed successfully."
        $(saveTextLocator).shouldHave(text(changeZone1Text));

        System.out.println("Change Zone #1 - PASSED");

        System.out.println("!!! AddNewZone Test - PASSED !!!");

//      Add and change Cameras
//      Add Camera #1
        $(leftAddCamera).click();
        $(middleAddCamera).click();
        $(cameraNameField).setValue("1");
        $(cameraTypeField).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
        $(changeZoneField).sendKeys(Keys.ARROW_DOWN);
        $(angleField).setValue("45");
        $(coordXField).setValue("300");
        $(coordYField).setValue("400");

//        Checks
        $(camOrange).shouldBe(visible); //camera is visible
        $(camOrange).shouldHave(hasAttribute("class", "camera cam-orange")); //camera has orange color
        $(camOrange).shouldHave(hasAttribute("style", "transform: rotate(45deg);")); //camera has rotate 45 degrees

        $(saveCamButton).click();
//        Check Text Present:  "The camera \"Novus - 1, camera ¹1\" was added successfully."
//        $(saveTextLocator).shouldHave(text(addCam1Text));

        System.out.println("Add Camera #1 - PASSED");

//      Add and change Camera #2
//      Add Camera #2
        $(rightAddCamera).click();
        $(cameraNameField).setValue("2");
        $(changeZoneField).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
        $(cameraTypeField).sendKeys(Keys.ARROW_DOWN);
        $(saveContEditCamButton).click();
//        Check Text Present:  "The camera \"Novus - 1, camera ¹1\" was added successfully."
//        $(saveTextLocator).shouldHave(exactText(saveContEditCamText));
//      Change Camera #2
        $(angleField).setValue("90");
        $(coordXField).setValue("536");
        $(coordYField).setValue("729");
//        Checks
//        $(camGreen).shouldBe(visible); //camera is visible
//        $(camGreen).shouldHave(hasAttribute("class", "ft-controls")); //camera has green color
//        $(camGreen).shouldHave(hasAttribute("style", "top: 711px; left: 518px; width: 36px; height: 41px; transform: matrix(0, 1, -1, 0, 0, 0); transform-origin: 50% 50% 0px;")); //camera has rotate 90 degrees

        $(saveAddAnotherCamButton).click();
//        Check Text Present:  "The camera \"Novus - 1, camera ¹1\" was added successfully."
//        $(saveTextLocator).shouldHave(text(saveAddAnotherCamText));

        System.out.println("Add and change Camera #2 - PASSED");

//      Add Camera #3
        $(cameraNameField).setValue("4");
//      Add Zone #3 from AddCameraWindow(across Popup)
        $(addZoneFromCam).click();
        switchTo().window("Add zone | noVus");
        $(floorFieldPopUp).sendKeys(Keys.ARROW_DOWN);
        $(camNamePopup).sendKeys("3");
        $(coordX_1Field).setValue("99");
        $(coordY_1Field).setValue("345");
        $(coordX_2Field).setValue("1099");
        $(coordY_2Field).setValue("855");
        $(saveButtonPopup).click();
        switchTo().window(0);

        System.out.println("Add Zone #4 from AddCameraWindow(across Popup) - PASSED");

//      Continuation add Camera #4
        $(angleField).setValue("0");
        $(coordXField).setValue("1059");
        $(coordYField).setValue("438");
        $(saveCamButton).click();
//        Check Text Present:  "The camera \"Novus - 3, camera ¹4\" was added successfully."
//        $(saveTextLocator).shouldHave(text(saveCamText));
        $$("#result_list>tbody tr").shouldHave(size(3));//Check create 3 row in result table
//        $(listCam3).shouldHave(exactText("Novus - 3, camera ¹4"));

        System.out.println("Add Camera #4 - PASSED");

//      Delete Camera #4
        $(checkBoxCam).click();
        $(checkBoxCam2).click();
        $(checkBoxCam1).click();
        $(dellField).sendKeys(Keys.ARROW_DOWN);
        $(runSelectActionButton).click();
        $(confirmDellButton).click();
//      Checks
        $$("#result_list>tbody tr").shouldHave(size(2));//Check create 2 row in result table

        System.out.println("Delete Camera #4 - PASSED");

//        Add Camera #3
        $(rightAddCamera).click();
        $(cameraNameField).setValue("3");
//      Add Zone #3 from AddCameraWindow(across Popup)
        $(changeZoneField).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN);
        $(angleField).setValue("180");
        $(coordXField).setValue("550");
        $(coordYField).setValue("85");
        $(saveCamButton).click();
//      Checks
        $$("#result_list>tbody tr").shouldHave(size(3));//Check create 3 row in result table
//        $(By.xpath(".//*[@id='result_list']/tbody/tr[1]/th/a")).shouldHave(exactText("Novus - 3, camera ¹3"));
//        $(By.xpath(".//*[@id='suit-center']/div[1]/text()[2]")).shouldHave(exactText("The camera \"Novus - 3, camera ¹3\" was added successfully."));
        System.out.println("Add Zone #3 - PASSED");

    }


}
