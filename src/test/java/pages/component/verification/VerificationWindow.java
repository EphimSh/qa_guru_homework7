package pages.component.verification;

import com.codeborne.selenide.SelenideElement;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class VerificationWindow {
    SelenideElement tableResponsive = $(".table-responsive");


    public VerificationWindow verifyStudentFullName(String fullName) {
        tableResponsive.$(byText("Student Name")).sibling(0).shouldHave(text(fullName));
        return  this;
    }
    public VerificationWindow verifyStudentEmail(String email) {
        tableResponsive.$(byText("Student Email")).sibling(0).shouldHave(text(email));
        return  this;
    }
    public VerificationWindow verifyStudentGender(String gender) {
        tableResponsive.$(byText("Gender")).sibling(0).shouldHave(text(gender));
        return  this;
    }
    public VerificationWindow verifyStudentMobileNumber(String mobNumber) {
        tableResponsive.$(byText("Mobile")).sibling(0).shouldHave(text(mobNumber));
        return  this;
    }
    public VerificationWindow verifyStudentBirthDate(String day, String month, String year) {
        String birthDate = day + " " + (month.substring(0, 1).toUpperCase() + month.substring(1)) + "," + year;
        tableResponsive.$(byText("Date of Birth")).sibling(0).shouldHave(text(birthDate));
        return  this;
    }
    public VerificationWindow verifyStudentSubject(String Subject) {
        tableResponsive.$(byText("Subjects")).sibling(0).shouldHave(text(Subject));
        return  this;
    }
    public VerificationWindow verifyStudentHobbies(String hobbies) {
        String formattedHobbies = Arrays.stream(hobbies.split("\\s*,\\s*|\\s+"))
                .map(String::trim)
                .collect(Collectors.joining(", "));
        tableResponsive.$(byText("Hobbies")).sibling(0).shouldHave(text(formattedHobbies));
        return  this;
    }
    public VerificationWindow verifyStudentUploadedPicture(String filePath) {
        String imgName = filePath.substring(filePath.lastIndexOf("/") + 1);
        tableResponsive.$(byText("Picture")).sibling(0).shouldHave(text(imgName));
        return  this;
    }
    public VerificationWindow verifyStudentAddress(String address) {
        tableResponsive.$(byText("Address")).sibling(0).shouldHave(text(address));
        return  this;
    }
    public VerificationWindow verifyStudentStateAndCity(String state, String city) {
        String stateAndCity = state + " " + city;
        tableResponsive.$(byText("State and City")).sibling(0).shouldHave(text(stateAndCity));
        return  this;
    }
}
