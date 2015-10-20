package UITest;

import Pages.PagesAnalytics.AnalPage;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class UIAnalPage extends AnalPage {

    public void  validateAnalPage(){
        $(analPageAnalyticsLabel).shouldBe(Condition.visible).shouldHave(Condition.text(analPageAnalyticsLabelText));
        $(analPagePlusButton).shouldBe(Condition.visible);
        $(analPageAnalyticsTableHead).shouldBe(Condition.visible);
        $(analPageAnalyticsNumber).shouldBe(Condition.visible).shouldHave(Condition.text(analPageAnalyticsNamberText));
        $(analPageAnalyticsType).shouldBe(Condition.visible).shouldHave(Condition.text(analPageAnalyticsTypeText));
        $(analPageAnalyticsName).shouldBe(Condition.visible).shouldHave(Condition.text(analPageAnalyticsNameText));
        $(analPageAnalyticsDescription).shouldBe(Condition.visible).shouldHave(Condition.text(analPageAnalyticsDescriptionText));
        $(analPageAnalyticsStatus).shouldBe(Condition.visible).shouldHave(Condition.text(analPageAnalyticsStatusText));
        $(analPageAnalyticsSettings).shouldBe(Condition.visible).shouldHave(Condition.text(analPageAnalyticsSettingsText));
        $(analPageAnalyticsDelete).shouldBe(Condition.visible).shouldHave(Condition.text(analPageAnalyticsDeleteText));
        $$(analPageAnalyticsTableRows).shouldHave(size(0));


    }
}
