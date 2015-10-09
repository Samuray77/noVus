package NegativeTests;


import Pages.MALLoginPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NegativeMALLogin extends MALLoginPage {

    public void checkLoginUnauthorized() {

        $(errorMessage).shouldHave(text(errorMessageText));
        $(loginForm).shouldBe(visible);
    }

    MALLoginPage loginPage = new MALLoginPage();

    @Before
    public void preconditionNegativeMALLoginTest() throws Exception {
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
        checkLoginUnauthorized();
        System.out.println("emptyValue (username and password) - PASSED");
    }

    @Test
    public void emptyValueUserNameTest() throws Exception {
//      Test2: emptyValue "username"
//      Set "username" field empty value
        $(userNameField).setValue("");
        $(passwordField).setValue(validPassword);
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("emptyValue (username) - PASSED");
    }

    @Test
    public void emptyValuePasswordTest() throws Exception {
//      Test3: emptyValue "password"
//      Set "password" field empty value
        $(userNameField).setValue(validUserName);
        $(passwordField).setValue("");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("emptyValue (password) - PASSED");
    }

    @Test
    public void spaceValueTest() throws Exception {
//      Test4: " "Value "username" and "password"
//      Set "username" and "password" fields values " "
        $(userNameField).setValue(" ");
        $(passwordField).setValue(" ");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValue (username and password) - PASSED");
    }

    @Test
    public void spaceValueUserNameTest() throws Exception {
//      Test5: " "Value "username"
//      Set "username" field value " "
        $(userNameField).setValue(" ");
        $(passwordField).setValue(validPassword);
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValue (username) - PASSED");
    }

    @Test
    public void spaceValuePasswordTest() throws Exception {
//        Test6: " "Value "password"
//      Set "password" field value " "
        $(userNameField).setValue(validUserName);
        $(passwordField).setValue(" ");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValue (password) - PASSED");
    }

    @Test
    public void spaceValueBeforeValidDataTest() throws Exception {
//      Test7: " "Value before correct symbols in "username" and "password" fields
        $(userNameField).setValue(" " + validUserName);
        $(passwordField).setValue(" " + validPassword);
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValueBefore (username and password) - PASSED");
    }

    @Test
    public void spaceValueBeforeUserNameTest() throws Exception {
//      Test8: " "Value before correct symbols in "username" field
        $(userNameField).setValue(" " + validUserName);
        enterValidMALPassword();
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValueBefore (username) - PASSED");
    }

    @Test
    public void spaceValueBeforePasswordTest() throws Exception {
//      Test9: " "Value before correct symbols in "password" field
        enterValidMALUser();
        $(passwordField).setValue(" " + validPassword);
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValueBefore (password) - PASSED");
    }

    @Test
    public void spaceValueAfterValidDataTest() throws Exception {
//      Test10: " "Value after correct symbols in "username" and "password" fields
        $(userNameField).setValue(validUserName + " ");
        $(passwordField).setValue(validPassword + " ");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValueAfter (username and password) - PASSED");
    }

    @Test
    public void spaceValueAfterUserNameTest() throws Exception {
//      Test11: " "Value after correct symbols in "username" field
        $(userNameField).setValue(validUserName + " ");
        enterValidMALPassword();
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValueAfter (username) - PASSED");
    }

    @Test
    public void spaceValueAfterPasswordTest() throws Exception {
//      Test12: " "Value after correct symbols in "password" field
        enterValidMALUser();
        $(passwordField).setValue(validPassword + " ");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValueAfter (password) - PASSED");
    }

    @Test
    public void spaceValueBetveenValidDataTest() throws Exception {
//      Test13: " "Value between correct symbols in "username" and "password" fields
        $(userNameField).setValue("u s e r");
        $(passwordField).setValue("p a s s w o r d");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValueBetveen (username and password) - PASSED");
    }

    @Test
    public void spaceValueBetveenUserNameTest() throws Exception {
//      Test14: " "Value between correct symbols in "username" field
        $(userNameField).setValue("u s e r");
        $(passwordField).setValue(validPassword);
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValueBetveen (username) - PASSED");
    }

    @Test
    public void spaceValueBetveenPasswordTest() throws Exception {
//      Test15: " "Value between correct symbols in "password" field
        $(userNameField).setValue(validUserName);
        $(passwordField).setValue("p a s s w o r d");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("spaceValueBetveen (password) - PASSED");
    }

    @Test
    public void camelStyleValueValidDataTest1() throws Exception {
//      Test16: CamelStyleValue with correct symbols in "username" and "password" fields
        $(userNameField).setValue("uSeR");
        $(passwordField).setValue("PaSsWoRd");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("camelStyleValue (uSeR and PaSsWoRd) - PASSED");
    }

    @Test
    public void camelStyleValueValidDataTest2() throws Exception {
//      Test17: CamelStyleValue with correct symbols in "username" and "password" fields
        $(userNameField).setValue("UsEr");
        $(passwordField).setValue("pAsSwOrD");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("camelStyleValue (UsEr and pAsSwOrD) - PASSED");
    }

    @Test
    public void camelStyleValueValidDataTest3() throws Exception {
//      Test18: CamelStyleValue with correct symbols in "username" and "password" fields
        $(userNameField).setValue("usER");
        $(passwordField).setValue("PASSword");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("camelStyleValue (usER and PASSword) - PASSED");
    }

    @Test
    public void specificSymbolValueTest() throws Exception {
//      Test19: SpecificSymbolValue in "username" and "password" fields
        $(userNameField).setValue("!@'#$%'&?*-+/{}[]");
        $(passwordField).setValue("\"!@'#$%'&?*-+/{}[]\"");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("SpecificSymbolValue Tests - PASSED");
    }

    @Test
    public void specificSymbolValueUserNameLMSLoginTest() throws Exception {
//      Test20: SpecificSymbolValue in "username" field
        $(userNameField).setValue("!@'#$%'&?*-+/{}[]");
        enterValidMALPassword();
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("specificSymbolValue (username) Test - PASSED");
    }

    @Test
    public void specificSymbolValuePasswordAnalLoginTest() throws Exception {
//      Test21: SpecificSymbolValue in "password" field
        enterValidMALUser();
        $(passwordField).setValue("\"!@'#$%'&?*-+/{}[]\"");
        clickLoginButton();
        checkLoginUnauthorized();
        System.out.println("specificSymbolValueBetween (password) Test - PASSED");
    }


}
