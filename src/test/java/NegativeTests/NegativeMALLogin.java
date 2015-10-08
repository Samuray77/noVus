package NegativeTests;


import Pages.MALLoginPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class NegativeMALLogin extends MALLoginPage{

    public void checkLoginUnauthorizedText(){
        $(errorMessage).shouldHave(text(errorMessageText));
    }

    MALLoginPage loginPage = new MALLoginPage();

    @Before
    public void preconditionNegativeMALLogin() throws Exception {
//      Open MALLoginPage
        openMALLoginPage();
    }
    @Test
    public void emptyValueTest() throws Exception {
//      Test1: emptyValue "username" and "password"
//      Set "username" and "password" fields empty values
        $(userNameField).setValue("");
        $(passwordField).setValue("");
//      Click bottom "LOGIN"
        $(loginButton).click();
//      Check text "login:Unauthorized"
        checkLoginUnauthorizedText();
        System.out.println();
        System.out.println("emptyValue (username and password) - PASSED");
    }
    @Test
    public void emptyValueUserNameTest() throws Exception {
//      Test2: emptyValue "username"
//      Set "username" field empty value
        $(userNameField).setValue("");
        $(passwordField).setValue(validPassword);
        $(loginButton).click();
        checkLoginUnauthorizedText();
        System.out.println("emptyValue (username) - PASSED");
    }
    @Test
    public void emptyValuePasswordTest() throws Exception {
//      Test3: emptyValue "password"
//      Set "password" field empty value
        $(userNameField).setValue(validUserName);
        $(passwordField).setValue("");
        $(loginButton).click();
        checkLoginUnauthorizedText();
        System.out.println("emptyValue (password) - PASSED");
    }
    @Test
    public void spaceValueTest() throws Exception {
//      Test4: " "Value "username" and "password"
//      Set "username" and "password" fields values " "
        $(userNameField).setValue(" ");
        $(passwordField).setValue(" ");
        $(loginButton).click();
        checkLoginUnauthorizedText();
        System.out.println();
        System.out.println("spaceValue (username and password) - PASSED");
    }
    @Test
    public void spaceValueUserNameTest() throws Exception {
//      Test5: " "Value "username"
//      Set "username" field value " "
        $(userNameField).setValue(" ");
        $(passwordField).setValue(validPassword);
        $(loginButton).click();
        checkLoginUnauthorizedText();
//        Test6: " "Value "password"
//      Set "password" field value " "
        $(userNameField).setValue(validUserName);
        $(passwordField).setValue(" ");
        $(loginButton).click();
        checkLoginUnauthorizedText();
        System.out.println("Group Tests (' 'Value) - PASSED");

//      Test7: " "Value before correct symbols in "username" and "password" fields
        $(userNameField).setValue(" "+validUserName);
        $(passwordField).setValue(" "+validPassword);
        $(loginButton).click();
        checkLoginUnauthorizedText();
//      Test8: " "Value before correct symbols in "username" field
        $(userNameField).setValue(" "+validUserName);
        $(passwordField).setValue(validPassword);
        $(loginButton).click();
        checkLoginUnauthorizedText();
//      Test9: " "Value before correct symbols in "password" field
        $(userNameField).setValue(validUserName);
        $(passwordField).setValue(" "+validPassword);
        $(loginButton).click();
        checkLoginUnauthorizedText();
        System.out.println("Group Tests (Add ' 'Value before correct symbols) - PASSED");

//      Test10: " "Value after correct symbols in "username" and "password" fields
        $(userNameField).setValue(validUserName+" ");
        $(passwordField).setValue(validPassword+" ");
        $(loginButton).click();
        checkLoginUnauthorizedText();
//      Test11: " "Value after correct symbols in "username" field
        $(userNameField).setValue(validUserName+" ");
        $(passwordField).setValue(validPassword);
        $(loginButton).click();
        checkLoginUnauthorizedText();
//      Test12: " "Value after correct symbols in "password" field
        $(userNameField).setValue(validUserName);
        $(passwordField).setValue(validPassword+" ");
        $(loginButton).click();
        checkLoginUnauthorizedText();
        System.out.println("Group Tests (Add ' 'Value after correct symbols) - PASSED");

//      Test13: " "Value between correct symbols in "username" and "password" fields
        $(userNameField).setValue("u s e r");
        $(passwordField).setValue("p a s s w o r d");
        $(loginButton).click();
        checkLoginUnauthorizedText();
//      Test14: " "Value between correct symbols in "username" field
        $(userNameField).setValue("u s e r");
        $(passwordField).setValue(validPassword);
        $(loginButton).click();
        checkLoginUnauthorizedText();
//      Test15: " "Value between correct symbols in "password" field
        $(userNameField).setValue(validUserName);
        $(passwordField).setValue("p a s s w o r d");
        $(loginButton).click();
        checkLoginUnauthorizedText();
        System.out.println("Group Tests (Add ' 'Value between correct symbols) - PASSED");

//      Test16: CamelStyleValue with correct symbols in "username" and "password" fields
        $(userNameField).setValue("uSeR");
        $(passwordField).setValue("PaSsWoRd");
        $(loginButton).click();
        checkLoginUnauthorizedText();
//      Test17: CamelStyleValue with correct symbols in "username" and "password" fields
        $(userNameField).setValue("UsEr");
        $(passwordField).setValue("pAsSwOrD");
        $(loginButton).click();
        checkLoginUnauthorizedText();
//      Test18: CamelStyleValue with correct symbols in "username" and "password" fields
        $(userNameField).setValue("usER");
        $(passwordField).setValue("PASSword");
        $(loginButton).click();
        checkLoginUnauthorizedText();
        System.out.println("Group Tests (CamelStyle with correct symbols) - PASSED");

//      Test19: SpecificSymbolValue in "username" and "password" fields
        $(userNameField).setValue("!@'#$%'&?*-+/{}[]");
        $(passwordField).setValue("\"!@'#$%'&?*-+/{}[]\"");
//      Click bottom "LOGIN"
        $(loginButton).click();
//      Check text text1
        checkLoginUnauthorizedText();
        System.out.println("Group Tests (SpecificSymbolValue) - PASSED");

        System.out.println("NegativeMALLoginTests - PASSED");

    }



}
