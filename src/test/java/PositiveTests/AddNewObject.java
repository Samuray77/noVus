package PositiveTests;


import org.junit.Test;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AddNewObject {

    WebElement loginField = $(By.xpath(".//*[@id='id_username']"));
    WebElement passwordField = $(By.xpath(".//*[@id='id_password']"));
    WebElement buttonLogin = $(By.xpath(".//*[@id='login-form']/div[4]/input"));
    WebElement leftObject = $(By.xpath(".//*[@id='left-nav']/ul/li[4]/a"));
    WebElement objectNameField = $(By.xpath(".//*[@id='id_name']"));
    WebElement objectIDField = $(By.xpath(".//*[@id='id_object_id']"));
    WebElement regionField = $(By.xpath(".//*[@id='id_state']"));
    WebElement cityField = $(By.xpath(".//*[@id='id_city']"));
    WebElement addressField = $(By.xpath(".//*[@id='id_address']"));
    WebElement saveConfButton = $(By.xpath(".//*[@id='objects_form']/div[1]/div/div/button[2]"));
    WebElement saveTextLocator = $(By.xpath(".//*[@id='suit-center']/div[1]"));
    String confText = "The object \"Bank\" was changed successfully. You may edit it again below.";
    String saveText = "The object \"Bank\" was changed successfully.";

    WebElement checkboxImageClear = $(By.xpath(".//*[@id='objects_form']/div[2]/div[1]/fieldset/div[8]/div/div[2]/p/span"));
    WebElement changeImageButton = $(By.xpath(".//*[@id='id_image']"));
    WebElement upload = $(By.xpath(".//*[@id='objects_form']/div[2]/div[1]/fieldset/div[8]/div/div[2]/p"));

//    File testFile = new File("G:\\FF_Projects\\Novus_Win\\Automation_Tests\\Images\bank.png");
//    WebElement employeeNameField = $(By.xpath(".//*[@id='id_object_staff-1-fio']"));
//    WebElement employeePostField = $(By.xpath(".//*[@id='id_object_staff-1-position']"));
//    WebElement employeeTelField = $(By.xpath(".//*[@id='id_object_staff-1-phone']"));
//    WebElement employeeEmailField = $(By.xpath(".//*[@id='id_object_staff-1-email']"));
//    WebElement addEmployee = $(By.xpath(".//*[@id='object_staff-group']/div/fieldset/table/tbody/tr[4]/td/a"));
//    WebElement delEmployee = $(By.xpath(".//*[@id='object_floor-2']/td[4]/div/a"));
    WebElement saveButton = $(By.xpath(".//*[@id='objects_form']/div[1]/div/div/button[1]"));

    @Test
    public void AddNewObjectTest() throws Exception {

//        leftObject = $(By.xpath(".//*[@id='left-nav']/ul/li[4]/a"));
//        passwordField = $(By.xpath(".//*[@id='InputPassword']"));
//        buttonEnter = $(By.xpath("html/body/div[1]/div/div[2]/form/input[3]"));
//        text1 = "Incorrect login or password";
//        text1Locator = $(By.xpath("html/body/div[1]/div/div[2]/p"));

//        Open AdminPage
        open("http://127.0.1.1/admin/");
//        Autorization AdminPage
        $(loginField).setValue("lms");
        $(passwordField).setValue("lms");
        $(buttonLogin).click();
        $(leftObject).click();
//      Input information of object
        $(objectNameField).setValue("Bank");
        $(objectIDField).clear();
        $(objectIDField).setValue("001");
        $(regionField).setValue("Poland");
        $(cityField).setValue("Warsaw");
        $(addressField).setValue("Concertowa, 51-A off. 578");
        $(saveConfButton).click();
        $(saveTextLocator).equals(confText);
        upload.sendKeys("G:\\FF_Projects\\Novus_Win\\Automation_Tests\\Images\\bank.png");
//        Change Image Object
//        $(changeImageButton).click();
//        $(By.xpath(".//*[@id='objects_form']/div[2]/div[1]/fieldset/div[8]/div/div[2]")).uploadFile(testFile);
//        $(employeeNameField).setValue("Kovalski Z.G.");
//        $(employeePostField).setValue("loshara lev. 80");
//        $(employeeTelField).setValue("+34-071-81-13");
//        $(employeeEmailField).setValue("krutyak@psheki.pl");
//        $(addEmployee).click();
//        $(delEmployee).click();
        $(saveButton).click();
        $(saveTextLocator).equals(saveText);

        System.out.println("AddNewObject Test - PASSED");

    }




}
