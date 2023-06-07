package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    private final SelenideElement
            userName = $("#userName"),
            userEmail = $("#userEmail"),
            currentAddress = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submitButton = $("#submit");



    public TextBoxPage openPage(){
        open("text-box");
        return this;
    }

    public TextBoxPage setFullName(String name, String lastName){
        userName.setValue(name + " " + lastName);
        return this;
    }
    public TextBoxPage setEmail(String email){
        userEmail.setValue(email);
        return this;
    }
    public TextBoxPage setCurrentAddress(String address){
        currentAddress.setValue(address);
        return this;
    }
    public TextBoxPage setPermanentAddress(String address){
        permanentAddress.setValue(address);
        return this;
    }
    public TextBoxPage pressSubmitButton(){
        submitButton.click();
        return this;
    }




}
