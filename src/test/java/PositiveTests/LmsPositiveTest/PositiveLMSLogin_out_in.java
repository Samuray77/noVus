package PositiveTests.LmsPositiveTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class PositiveLMSLogin_out_in {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","G:\\Progs\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http://127.0.1.1/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void PositiveLMSLogin_out_inTest() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.id("InputLogin")).clear();
        driver.findElement(By.id("InputLogin")).sendKeys("lms");
        driver.findElement(By.id("InputPassword")).clear();
        driver.findElement(By.id("InputPassword")).sendKeys("lms");
        driver.findElement(By.cssSelector("input.btn.btn-dark-gray")).click();
        driver.findElement(By.linkText("lms")).click();
        assertTrue(isElementPresent(By.xpath("html/body/div[1]/div/div[2]")));
        driver.findElement(By.id("InputLogin")).clear();
        driver.findElement(By.id("InputLogin")).sendKeys("lms");
        driver.findElement(By.id("InputPassword")).clear();
        driver.findElement(By.id("InputPassword")).sendKeys("lms");
        driver.findElement(By.cssSelector("input.btn.btn-dark-gray")).click();
        assertTrue(isElementPresent(By.xpath("html/body/div[3]/div")));



    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

}
