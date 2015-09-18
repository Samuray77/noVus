package NegativeTests;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NegativeMALLogin {

    WebElement passwordField = $(By.xpath(".//*[@id='password']"));
    WebElement userNameField = $(By.xpath(".//*[@id='username']"));
    WebElement buttonLogin = $(By.xpath("html/body/div[2]/form/div[3]/button"));
    String text1 = "login:Unauthorized";
    WebElement text1Locator = $(By.xpath(".//*[@id='servermessage']/div/div/span"));


    @Test
    public void negativeMALLoginTest() throws Exception {

//      Open LMSLoginPage
        open("http://127.0.1.1/mal/");

//      Test1: emptyValue "username" and "password"
//      Set "username" and "password" fields empty values
        $(userNameField).setValue("");
        $(passwordField).setValue("");
//      Click bottom "LOGIN"
        $(buttonLogin).click();
//      Check text "Invalid username or password."
        $(text1Locator).shouldHave(text(text1));
//      Test2: emptyValue "username"
//      Set "username" field empty value
        $(userNameField).setValue("");
        $(passwordField).setValue("password");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
//      Test3: emptyValue "password"
//      Set "password" field empty value
        $(userNameField).setValue("user");
        $(passwordField).setValue("");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
        System.out.println();
        System.out.println("Group Tests (emptyValue) - PASSED");

//      Test4: " "Value "username" and "password"
//      Set "username" and "password" fields values " "
        $(userNameField).setValue(" ");
        $(passwordField).setValue(" ");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
//      Test5: " "Value "username"
//      Set "username" field value " "
        $(userNameField).setValue(" ");
        $(passwordField).setValue("password");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
//        Test6: " "Value "password"
//      Set "password" field value " "
        $(userNameField).setValue("user");
        $(passwordField).setValue(" ");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
        System.out.println("Group Tests (' 'Value) - PASSED");

//      Test7: " "Value before correct symbols in "username" and "password" fields
        $(userNameField).setValue(" user");
        $(passwordField).setValue(" password");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
//      Test8: " "Value before correct symbols in "username" field
        $(userNameField).setValue(" user");
        $(passwordField).setValue("password");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
//      Test9: " "Value before correct symbols in "password" field
        $(userNameField).setValue("user");
        $(passwordField).setValue(" password");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
        System.out.println("Group Tests (Add ' 'Value before correct symbols) - PASSED");

//      Test10: " "Value after correct symbols in "username" and "password" fields
        $(userNameField).setValue("user ");
        $(passwordField).setValue("password ");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
//      Test11: " "Value after correct symbols in "username" field
        $(userNameField).setValue("user ");
        $(passwordField).setValue("password");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
//      Test12: " "Value after correct symbols in "password" field
        $(userNameField).setValue("user");
        $(passwordField).setValue("password ");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
        System.out.println("Group Tests (Add ' 'Value after correct symbols) - PASSED");

//      Test13: " "Value between correct symbols in "username" and "password" fields
        $(userNameField).setValue("u s e r");
        $(passwordField).setValue("p a s s w o r d");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
//      Test14: " "Value between correct symbols in "username" field
        $(userNameField).setValue("u s e r");
        $(passwordField).setValue("password");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
//      Test15: " "Value between correct symbols in "password" field
        $(userNameField).setValue("user");
        $(passwordField).setValue("p a s s w o r d");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
        System.out.println("Group Tests (Add ' 'Value between correct symbols) - PASSED");

//      Test16: CamelStyleValue with correct symbols in "username" and "password" fields
        $(userNameField).setValue("uSeR");
        $(passwordField).setValue("PaSsWoRd");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
//      Test17: CamelStyleValue with correct symbols in "username" and "password" fields
        $(userNameField).setValue("UsEr");
        $(passwordField).setValue("pAsSwOrD");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
//      Test18: CamelStyleValue with correct symbols in "username" and "password" fields
        $(userNameField).setValue("usER");
        $(passwordField).setValue("PASSword");
        $(buttonLogin).click();
        $(text1Locator).shouldHave(text(text1));
        System.out.println("Group Tests (CamelStyle with correct symbols) - PASSED");

//      Test19: SpecificSymbolValue in "username" and "password" fields
        $(userNameField).setValue("!@'#$%'&?*-+/{}[]");
        $(passwordField).setValue("\"!@'#$%'&?*-+/{}[]\"");
//      Click bottom "LOGIN"
        $(buttonLogin).click();
//      Check text text1
        $(text1Locator).shouldHave(text(text1));
        System.out.println("Group Tests (SpecificSymbolValue) - PASSED");

        System.out.println("NegativeAnalLoginTests - PASSED");

    }





}
