package NegativeTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class NegativeAnalLogin {

    WebElement userNameField = $(By.xpath(".//*[@id='username']"));
    WebElement passwordField = $(By.xpath(".//*[@id='password']"));
    WebElement buttonLogin1 = $(By.xpath("html/body/div[2]/form/div[3]/button"));
    WebElement buttonLogin2 = $(By.xpath("html/body/div[2]/form/div[4]/button"));
    String text1 = "Invalid username or password.";
    WebElement text1Locator = $(By.xpath("html/body/div[2]/form/div[1]/span"));


//    @Test
//    public void negativeAnalLoginTest() throws Exception {
//
////      Open AnalPage
//        open("http://127.0.1.1/am/login/");
//
////      Test1: emptyValue "username" and "password"
////      Set "username" and "password" fields empty values
//        $(userNameField).setValue("");
//        $(passwordField).setValue("");
////      Click bottom "LOGIN"
//        $(buttonLogin1).click();
////      Check text "Invalid username or password."
//        checIncorrectLoginPassword();
////      Test2: emptyValue "username"
////      Set "username" field empty value
//        $(userNameField).setValue("");
//        $(passwordField).setValue("password");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
////      Test3: emptyValue "password"
////      Set "password" field empty value
//        $(userNameField).setValue("user");
//        $(passwordField).setValue("");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
//        System.out.println();
//        System.out.println("Group Tests (emptyValue) - PASSED");
//
////      Test4: " "Value "username" and "password"
////      Set "username" and "password" fields values " "
//        $(userNameField).setValue(" ");
//        $(passwordField).setValue(" ");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
////      Test5: " "Value "username"
////      Set "username" field value " "
//        $(userNameField).setValue(" ");
//        $(passwordField).setValue("password");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
////        Test6: " "Value "password"
////      Set "password" field value " "
//        $(userNameField).setValue("user");
//        $(passwordField).setValue(" ");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
//        System.out.println("Group Tests (' 'Value) - PASSED");
//
////      Test7: " "Value before correct symbols in "username" and "password" fields
//        $(userNameField).setValue(" user");
//        $(passwordField).setValue(" password");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
////      Test8: " "Value before correct symbols in "username" field
//        $(userNameField).setValue(" user");
//        $(passwordField).setValue("password");
//        $(buttonLogin2).click();
//          checIncorrectLoginPassword();
////      Test9: " "Value before correct symbols in "password" field
//        $(userNameField).setValue("user");
//        $(passwordField).setValue(" password");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
//        System.out.println("Group Tests (Add ' 'Value before correct symbols) - PASSED");
//
////      Test10: " "Value after correct symbols in "username" and "password" fields
//        $(userNameField).setValue("user ");
//        $(passwordField).setValue("password ");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
////      Test11: " "Value after correct symbols in "username" field
//        $(userNameField).setValue("user ");
//        $(passwordField).setValue("password");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
////      Test12: " "Value after correct symbols in "password" field
//        $(userNameField).setValue("user");
//        $(passwordField).setValue("password ");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
//        System.out.println("Group Tests (Add ' 'Value after correct symbols) - PASSED");
//
////      Test13: " "Value between correct symbols in "username" and "password" fields
//        $(userNameField).setValue("u s e r");
//        $(passwordField).setValue("p a s s w o r d");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
////      Test14: " "Value between correct symbols in "username" field
//        $(userNameField).setValue("u s e r");
//        $(passwordField).setValue("password");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
////      Test15: " "Value between correct symbols in "password" field
//        $(userNameField).setValue("user");
//        $(passwordField).setValue("p a s s w o r d");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
//        System.out.println("Group Tests (Add ' 'Value between correct symbols) - PASSED");
//
////      Test16: CamelStyleValue with correct symbols in "username" and "password" fields
//        $(userNameField).setValue("uSeR");
//        $(passwordField).setValue("PaSsWoRd");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
////      Test17: CamelStyleValue with correct symbols in "username" and "password" fields
//        $(userNameField).setValue("UsEr");
//        $(passwordField).setValue("pAsSwOrD");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
////      Test18: CamelStyleValue with correct symbols in "username" and "password" fields
//        $(userNameField).setValue("usER");
//        $(passwordField).setValue("PASSword");
//        $(buttonLogin2).click();
//        checIncorrectLoginPassword();
//        System.out.println("Group Tests (CamelStyle with correct symbols) - PASSED");
//
////      Test19: SpecificSymbolValue in "username" and "password" fields
//        $(userNameField).setValue("!@'#$%'&?*-+/{}[]");
//        $(passwordField).setValue("\"!@'#$%'&?*-+/{}[]\"");
////      Click bottom "LOGIN"
//        $(buttonLogin2).click();
////      Check text text1
//        checIncorrectLoginPassword();
//        System.out.println("Group Tests (SpecificSymbolValue) - PASSED");
//
//        System.out.println("NegativeAnalLoginTests - PASSED");
//    }
//
//    private void checIncorrectLoginPassword() {
//    }

}