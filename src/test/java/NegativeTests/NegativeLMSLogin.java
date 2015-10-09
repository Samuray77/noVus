package NegativeTests;


import Pages.LMSLoginPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class NegativeLMSLogin extends LMSLoginPage{

    public void checkIncorrectLoginPassword() {
        $(lmsIncorrectLoginPassword).shouldHave(text(lmsIncorrectLoginPasswordText));
        $(lmsLoginForm).shouldBe(visible);
    }
    @Before
    public void preconditionNegativeLMSLoginTest() throws Exception {
//      Open LMSLoginPage
        openLMSLoginPage();
    }

    @Test
    public void emptyValueLMSLoginTest() throws Exception {
//      Test1: emptyValue "login" and "password"
//      Set "login" and "password" fields empty values
        $(lmsLoginField).setValue("");
        $(lmsPasswordField).setValue("");
//      Click button "ENTER"
        clickEnterButton();
//      Check text "Incorrect login or password"
        checkIncorrectLoginPassword();
        System.out.println("emptyValue (login and password) Test - PASSED");
    }

    @Test
    public void emptyValueLoginLMSLoginTest() throws Exception {
//      Test2: emptyValue "login"
//      Set "login" field empty value
        $(lmsLoginField).setValue("");
        enterValidLMSPassword();
        clickEnterButton();
        checkIncorrectLoginPassword();
        System.out.println("emptyValue (login) Test - PASSED");
    }

    @Test
    public void emptyValuePasswordLMSLoginTest() throws Exception {
//      Test3: emptyValue "password"
//      Set "password" field empty value
        enterValidLMSLogin();
        $(lmsPasswordField).setValue("");
        clickEnterButton();
        checkIncorrectLoginPassword();
        System.out.println("emptyValue (password) Test - PASSED");
    }

    @Test
     public void spaceValueLMSLoginTest() throws Exception {
//      Test4: " "Value "login" and "password"
        $(lmsLoginField).setValue(" ");
        $(lmsPasswordField).setValue(" ");
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValue (login and password) Test - PASSED");
    }
    @Test
    public void spaceValueLoginLMSLoginTest() throws Exception {
//      Test5: " "Value "login"
        $(lmsLoginField).setValue(" ");
        enterValidLMSPassword();
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValue (login) Test - PASSED");
    }

    @Test
    public void spaceValuePasswordLMSLoginTest() throws Exception {
//      Test6: " "Value "password"
        enterValidLMSLogin();
        $(lmsPasswordField).setValue(" ");
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValue (password) Test - PASSED");
    }

    @Test
    public void spaceValueBeforeLMSLoginTest() throws Exception {
//      Test7: " "Value before correct symbols in "login" and "password" fields
        $(lmsLoginField).setValue(" lms");
        $(lmsPasswordField).setValue(" lms");
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValueBefore (login and password) Test - PASSED");
    }

    @Test
    public void spaceValueBeforeLoginLMSLoginTest() throws Exception {
//      Test8: " "Value before correct symbols in "login" field
        $(lmsLoginField).setValue(" lms");
        enterValidLMSPassword();
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValueBefore (login) Test - PASSED");
    }

    @Test
    public void spaceValueBeforePasswordLMSLoginTest() throws Exception {
//      Test9: " "Value before correct symbols in "password" field
        enterValidLMSLogin();
        $(lmsPasswordField).setValue(" lms");
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValueBefore (password) Test - PASSED");
    }

    @Test
    public void spaceValueAfterLMSLoginTest() throws Exception {
//      Test10: " "Value after correct symbols in "login" and "password" fields
        $(lmsLoginField).setValue("lms ");
        $(lmsPasswordField).setValue("lms ");
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValueAfter (login and password) Test - PASSED");
    }

    @Test
    public void spaceValueAfterLoginLMSLoginTest() throws Exception {
//      Test11: " "Value after correct symbols in "lms" field
        $(lmsLoginField).setValue("lms ");
        enterValidLMSPassword();
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValueAfter (login) Test - PASSED");
    }

    @Test
    public void spaceValueAfterPasswordLMSLoginTest() throws Exception {
//      Test12: " "Value after correct symbols in "password" field
        enterValidLMSLogin();
        $(lmsPasswordField).setValue("lms ");
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValueAfter (password) Test - PASSED");
    }

    @Test
    public void spaceValueBetveenLMSLoginTest() throws Exception {
//      Test13: " "Value between correct symbols in "login" and "password" fields
        $(lmsLoginField).setValue("l m s");
        $(lmsPasswordField).setValue("l m s");
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValueBetveen (login and password) Test - PASSED");
    }

    @Test
    public void spaceValueBetveenLoginLMSLoginTest() throws Exception {
//      Test14: " "Value between correct symbols in "login" field
        $(lmsLoginField).setValue("l m s");
        enterValidLMSPassword();
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValueBetveen (login) Test - PASSED");
    }

    @Test
    public void spaceValueBetveenPasswordLMSLoginTest() throws Exception {
//      Test15: " "Value between correct symbols in "password" field
        enterValidLMSLogin();
        $(lmsPasswordField).setValue("l m s");
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("spaceValueBetveen (password) Test - PASSED");
    }

    @Test
    public void camelStyleValueLMSLoginTest1() throws Exception {
//      Test16: CamelStyleValue with correct symbols in "login" and "password" fields
        $(lmsLoginField).setValue("lMs");
        $(lmsPasswordField).setValue("LmS");
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("camelStyleValue (lMs and LmS) Test - PASSED");
    }

    @Test
    public void camelStyleValueLMSLoginTest2() throws Exception {
//      Test17: CamelStyleValue with correct symbols in "login" and "password" fields
        $(lmsLoginField).setValue("LmS");
        $(lmsPasswordField).setValue("lMs");
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("camelStyleValue (LmS and lMs) Test - PASSED");
    }

    @Test
    public void camelStyleValueLMSLoginTest3() throws Exception {
//      Test18: CamelStyleValue with correct symbols in "login" and "password" fields
        $(lmsLoginField).setValue("lMS");
        $(lmsPasswordField).setValue("Lms");
        $(lmsEnterButton).click();
        checkIncorrectLoginPassword();
        System.out.println("camelStyleValue (lMS and Lms) Test - PASSED");
    }

    @Test
    public void specificSymbolValueLMSLoginTest() throws Exception {
//      Test19: SpecificSymbolValue in "login" and "password" fields
        $(lmsLoginField).setValue("!@'#$%'&?*-+/{}[]");
        $(lmsPasswordField).setValue("\"!@'#$%'&?*-+/{}[]\"");
        System.out.println("specificSymbolValue (username and password) Test - PASSED");
    }

    @Test
    public void specificSymbolValueUserNameLMSLoginTest() throws Exception {
//      Test20: SpecificSymbolValue in "username" field
        $(lmsLoginField).setValue("!@'#$%'&?*-+/{}[]");
        enterValidLMSPassword();
        clickEnterButton();
        checkIncorrectLoginPassword();
        System.out.println("specificSymbolValue (username) Test - PASSED");
    }

    @Test
    public void specificSymbolValuePasswordAnalLoginTest() throws Exception {
//      Test21: SpecificSymbolValue in "password" field
        enterValidLMSLogin();
        $(lmsPasswordField).setValue("\"!@'#$%'&?*-+/{}[]\"");
        clickEnterButton();
        checkIncorrectLoginPassword();
        System.out.println("specificSymbolValueBetween (password) Test - PASSED");
    }
}
