package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class AnalPage extends MainAnalPage{

    String analPageUrl = "http://127.0.1.1/am/";
    public WebElement analPageAnalyticsLabel =$(By.xpath("html/body/div[1]/div[1]/h1"));
    public String analPageAnalyticsLabelText = "Analytics";
    public WebElement analPagePlusButton =$(By.xpath("id(\"add-record\")"));
    public WebElement analPageAnalyticsNumber =$(By.xpath("/html/body/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[1]"));
    public String analPageAnalyticsNamberText = "#";
    public WebElement analPageAnalyticsType =$(By.xpath("/html/body/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[2]"));
    public String analPageAnalyticsTypeText = "Type";
    public WebElement analPageAnalyticsName =$(By.xpath("/html/body/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[3]"));
    public String analPageAnalyticsNameText = "Name";
    public WebElement analPageAnalyticsDescription =$(By.xpath("/html/body/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[4]"));
    public String analPageAnalyticsDescriptionText = "Description";
    public WebElement analPageAnalyticsStatus =$(By.xpath("/html/body/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[5]"));
    public String analPageAnalyticsStatusText = "Status";
    public WebElement analPageAnalyticsSettings =$(By.xpath("/html/body/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[6]"));
    public String analPageAnalyticsSettingsText = "Settings";
    public WebElement analPageAnalyticsDelete =$(By.xpath("/html/body/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[7]"));
    public String analPageAnalyticsDeleteText = "Delete";
    public WebElement analPageAnalyticsTableHead =$(By.xpath("html/body/div[1]/div[1]/div[2]/table/thead/tr"));
    public ElementsCollection analPageAnalyticsTableRows =$$(By.xpath("html/body/div[1]/div[1]/div[2]/table/tbody/tr"));


    public AnalPage   openAnalPage(){
        open(analPageUrl);
        AnalLoginPage analPage = new AnalLoginPage();
        analPage.validAnalLoginPageRegistration();
        return new AnalPage();
    }

    public void  validateAnalPage(){
        $(analPageAnalyticsLabel).shouldBe(Condition.visible).shouldHave(Condition.text(analPageAnalyticsLabelText));
    }
}
