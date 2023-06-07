package pages.component.verification;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxVerificationContainer {
    SelenideElement outputContainer = $("#output");


    public TextBoxVerificationContainer verifyFullName(String name, String lastName){
        String fullName = name + " " + lastName;
        outputContainer.$(withText("Name")).shouldHave(Condition.text(fullName));
        return this;
    }
    public TextBoxVerificationContainer verifyEmail(String email){

        outputContainer.$(withText("Email")).shouldHave(Condition.text(email));
        return this;
    }
    public TextBoxVerificationContainer verifyCurrAddress(String address){

        outputContainer.$(withText("Curr")).shouldHave(Condition.text(address));
        return this;
    }
    public TextBoxVerificationContainer verifyPermanentAddress(String address){
        outputContainer.$(withText("Perman")).shouldHave(Condition.text(address));
        return this;
    }




}
