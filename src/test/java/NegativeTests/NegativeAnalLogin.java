package NegativeTests;


import Pages.PagesAnalytics.AnalLoginPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NegativeAnalLogin extends AnalLoginPage {

    public void checkInvalidUserNamePassword() {
        $(analInvalidUsernamePassword).shouldHave(text(analInvalidUsernamePasswordText));
        $(analLoginForm).shouldBe(visible);
    }
    @Before
    public void preconditionNegativeAnalLoginTest() throws Exception {
//      Open AnalLoginPage
        openAnalLoginPage();
    }

//    System.out.println("");
    @Test
    public void emptyValueAnalLoginTest() throws Exception {
//      Test1: emptyValue "username" and "password"
//      Set "username" and "password" fields empty values
        $(analUserNameField).setValue("");
        $(analPasswordField).setValue("");
//      Click bottom "LOGIN"
        clickLoginButton();
//      Check text "Invalid username or password."
        checkInvalidUserNamePassword();
        System.out.println("emptyValue (username and password) Test - PASSED");
    }

    @Test
    public void emptyValueUserNameAnalLoginTest() throws Exception {
//      Test2: emptyValue "username"
//      Set "username" field empty value
        $(analUserNameField).setValue("");
        enterValidPassword();
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("emptyValue (username) Test - PASSED");
    }

    @Test
        public void emptyValuePasswordAnalLoginTest() throws Exception {
//      Test3: emptyValue "password"
//      Set "password" field empty value
        enterValidUserName();
        $(analPasswordField).setValue("");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("emptyValue (password) Test - PASSED");
    }

    @Test
        public void spaceValueAnalLoginTest() throws Exception {
//      Test4: " "Value "username" and "password"
//      Set "username" and "password" fields values " "
        $(analUserNameField).setValue(" ");
        $(analPasswordField).setValue(" ");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValue (username and password) Test - PASSED");
    }

    @Test
    public void spaceValueUserNameAnalLoginTest() throws Exception {
//      Test5: " "Value "username"
//      Set "username" field value " "
        $(analUserNameField).setValue(" ");
        enterValidPassword();
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValue (username) Test - PASSED");
    }

    @Test
    public void spaceValuePasswordAnalLoginTest() throws Exception {
//      Test6: " "Value "password"
//      Set "password" field value " "
        enterValidUserName();
        $(analPasswordField).setValue(" ");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValue (password) Test - PASSED");
    }

    @Test
    public void spaceValueBeforeAnalLoginTest() throws Exception {
//      Test7: " "Value before correct symbols in "username" and "password" fields
        $(analUserNameField).setValue(" user");
        $(analPasswordField).setValue(" password");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValueBefore (username and password) Test - PASSED");
    }

    @Test
    public void spaceValueBeforeUserNameAnalLoginTest() throws Exception {
//      Test8: " "Value before correct symbols in "username" field
        $(analUserNameField).setValue(" user");
        enterValidPassword();
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValueBefore (username) Test - PASSED");
    }

    @Test
    public void spaceValueBeforePasswordAnalLoginTest() throws Exception {
//      Test9: " "Value before correct symbols in "password" field
        enterValidUserName();
        $(analPasswordField).setValue(" password");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValueBefore (password) Test - PASSED");
    }

    @Test
    public void spaceValueAfterAnalLoginTest() throws Exception {
//      Test10: " "Value after correct symbols in "username" and "password" fields
        $(analUserNameField).setValue("user ");
        $(analPasswordField).setValue("password ");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValueAfter (username and password) Test - PASSED");
    }

    @Test
    public void spaceValueAfterUserNameAnalLoginTest() throws Exception {
//      Test11: " "Value after correct symbols in "username" field
        $(analUserNameField).setValue("user ");
        enterValidPassword();
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValueAfter (username) Test - PASSED");
    }

    @Test
    public void spaceValueAfterPasswordAnalLoginTest() throws Exception {
//      Test12: " "Value after correct symbols in "password" field
        enterValidUserName();
        $(analPasswordField).setValue("password ");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValueAfter (password) Test - PASSED");
    }

    @Test
    public void spaceValueBetweenAnalLoginTest() throws Exception {
//      Test13: " "Value between correct symbols in "username" and "password" fields
        $(analUserNameField).setValue("u s e r");
        $(analPasswordField).setValue("p a s s w o r d");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValueBetween (username and password) Test - PASSED");
    }

    @Test
    public void spaceValueBetweenUserNameAnalLoginTest() throws Exception {
//      Test14: " "Value between correct symbols in "username" field
        $(analUserNameField).setValue("u s e r");
        enterValidPassword();
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValueBetween (username) Test - PASSED");
    }

    @Test
    public void spaceValueBetweenPasswordAnalLoginTest() throws Exception {
//      Test15: " "Value between correct symbols in "password" field
        enterValidUserName();
        $(analPasswordField).setValue("p a s s w o r d");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("spaceValueBetween (password) Test - PASSED");
    }

    @Test
    public void camelStyleValueAnalLoginTest1() throws Exception {
//      Test16: CamelStyleValue with correct symbols in "username" and "password" fields
        $(analUserNameField).setValue("uSeR");
        $(analPasswordField).setValue("PaSsWoRd");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("camelStyleValueBetween (uSeR and PaSsWoRd) Test - PASSED");
    }

    @Test
    public void camelStyleValueAnalLoginTest2() throws Exception {
//      Test17: CamelStyleValue with correct symbols in "username" and "password" fields
        $(analUserNameField).setValue("UsEr");
        $(analPasswordField).setValue("pAsSwOrD");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("camelStyleValueBetween (UsEr and pAsSwOrD) Test - PASSED");
    }

    @Test
    public void camelStyleValueAnalLoginTest3() throws Exception {
//      Test18: CamelStyleValue with correct symbols in "username" and "password" fields
        $(analUserNameField).setValue("usER");
        $(analPasswordField).setValue("PASSword");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("camelStyleValueBetween (usER and PASSword) Test - PASSED");
    }

    @Test
    public void specificSymbolValueAnalLoginTest() throws Exception {
//      Test19: SpecificSymbolValue in "username" and "password" fields
        $(analUserNameField).setValue("!@'#$%'&?*-+/{}[]");
        $(analPasswordField).setValue("\"!@'#$%'&?*-+/{}[]\"");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("specificSymbolValue (username and password) Test - PASSED");
    }

    @Test
    public void specificSymbolValueUserNameAnalLoginTest() throws Exception {
//      Test20: SpecificSymbolValue in "username" field
        $(analUserNameField).setValue("!@'#$%'&?*-+/{}[]");
        enterValidPassword();
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("specificSymbolValue (username) Test - PASSED");
    }

    @Test
    public void specificSymbolValuePasswordAnalLoginTest() throws Exception {
//      Test21: SpecificSymbolValue in "password" field
        enterValidUserName();
        $(analPasswordField).setValue("\"!@'#$%'&?*-+/{}[]\"");
        clickLoginButton();
        checkInvalidUserNamePassword();
        System.out.println("specificSymbolValue (password) Test - PASSED");
    }
}