package pages.component.verification;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxVerificationContainer {
    SelenideElement outputContainer = $("#output");

    public TextBoxVerificationContainer outputVerification(String key, String value){
        outputContainer.$(withText(key)).shouldHave(text(value));
        return this;
    }


}
