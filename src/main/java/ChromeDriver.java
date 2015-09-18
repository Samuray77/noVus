import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriver {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","G:\\Progs\\chromedriver_win32\\chromedriver.exe");
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        baseUrl = "http://127.0.1.1/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
