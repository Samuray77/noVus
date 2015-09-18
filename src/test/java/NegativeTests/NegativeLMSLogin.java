package NegativeTests;


import org.junit.Test;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class NegativeLMSLogin {

    WebElement passwordField = $(By.xpath(".//*[@id='InputPassword']"));
    WebElement loginField = $(By.xpath(".//*[@id='InputLogin']"));
    WebElement buttonEnter = $(By.xpath("html/body/div[1]/div/div[2]/form/input[3]"));
    String text1 = "Incorrect login or password";
    WebElement text1Locator = $(By.xpath("html/body/div[1]/div/div[2]/p"));


    @Test
    public void negativeLMSLoginTest() throws Exception {

//      Open LMSLoginPage
        open("http://127.0.0.1/accounts/login/?lang=en");

//      Test1: emptyValue "username" and "password"
//      Set "username" and "password" fields empty values
        $(loginField).setValue("");
        $(passwordField).setValue("");
//      Click button "ENTER"
        $(buttonEnter).click();
//      Check text "Incorrect login or password"
        $(text1Locator).shouldHave(text(text1));
//      Test2: emptyValue "username"
//      Set "username" field empty value
        $(loginField).setValue("");
        $(passwordField).setValue("lms");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
//      Test3: emptyValue "password"
//      Set "password" field empty value
        $(loginField).setValue("lms");
        $(passwordField).setValue("");
//      Click bottom "LOGIN"
        $(buttonEnter).click();
//      Check text "Incorrect login or password"
        $(text1Locator).shouldHave(text(text1));
        System.out.println();
        System.out.println("Group Tests (emptyValue) - PASSED");

//      Test4: " "Value "username" and "password"
        $(loginField).setValue(" ");
        $(passwordField).setValue(" ");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
//      Test5: " "Value "username"
        $(loginField).setValue(" ");
        $(passwordField).setValue("lms");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
//      Test6: " "Value "password"
        $(loginField).setValue("lms");
        $(passwordField).setValue(" ");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
        System.out.println("Group Tests (' 'Value) - PASSED");

//      Test7: " "Value before correct symbols in "username" and "password" fields
        $(loginField).setValue(" lms");
        $(passwordField).setValue(" lms");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
//      Test8: " "Value before correct symbols in "username" field
        $(loginField).setValue(" lms");
        $(passwordField).setValue("lms");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
//      Test9: " "Value before correct symbols in "password" field
        $(loginField).setValue("lms");
        $(passwordField).setValue(" lms");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
        System.out.println("Group Tests (Add ' 'Value before correct symbols) - PASSED");

//      Test10: " "Value after correct symbols in "username" and "password" fields
        $(loginField).setValue("lms ");
        $(passwordField).setValue("lms ");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
//      Test11: " "Value after correct symbols in "username" field
        $(loginField).setValue("lms ");
        $(passwordField).setValue("lms");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
//      Test12: " "Value after correct symbols in "password" field
        $(loginField).setValue("lms");
        $(passwordField).setValue("lms ");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
        System.out.println("Group Tests (Add ' 'Value after correct symbols) - PASSED");

//      Test13: " "Value between correct symbols in "username" and "password" fields
        $(loginField).setValue("l m s");
        $(passwordField).setValue("l m s");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
//      Test14: " "Value between correct symbols in "username" field
        $(loginField).setValue("l m s");
        $(passwordField).setValue("lms");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
//      Test15: " "Value between correct symbols in "password" field
        $(loginField).setValue("lms");
        $(passwordField).setValue("l m s");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
        System.out.println("Group Tests (Add ' 'Value between correct symbols) - PASSED");

//      Test16: CamelStyleValue with correct symbols in "username" and "password" fields
        $(loginField).setValue("lMs");
        $(passwordField).setValue("LmS");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
//      Test17: CamelStyleValue with correct symbols in "username" and "password" fields
        $(loginField).setValue("LmS");
        $(passwordField).setValue("lMs");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
//      Test18: CamelStyleValue with correct symbols in "username" and "password" fields
        $(loginField).setValue("lMS");
        $(passwordField).setValue("Lms");
        $(buttonEnter).click();
        $(text1Locator).shouldHave(text(text1));
        System.out.println("Group Tests (CamelStyle with correct symbols) - PASSED");

//      Test19: SpecificSymbolValue in "username" and "password" fields
        $(loginField).setValue("!@'#$%'&?*-+/{}[]");
        $(passwordField).setValue("\"!@'#$%'&?*-+/{}[]\"");
        System.out.println("Group Tests (SpecificSymbolValue) - PASSED");


    }

}
