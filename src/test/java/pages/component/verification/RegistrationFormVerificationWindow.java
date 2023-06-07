package pages.component.verification;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormVerificationWindow {
    SelenideElement tableResponsive = $(".table-responsive");


    public RegistrationFormVerificationWindow formVerificationWindow(String key, String value){
        tableResponsive.$(byText(key)).sibling(0).shouldHave(text(value));
        return this;
    }


//    public RegistrationFormVerificationWindow verifyStudentFullName(String fullName) {
//        tableResponsive.$(byText("Student Name")).sibling(0).shouldHave(text(fullName));
//        return  this;
//    }
//    public RegistrationFormVerificationWindow verifyStudentEmail(String email) {
//        tableResponsive.$(byText("Student Email")).sibling(0).shouldHave(text(email));
//        return  this;
//    }
//    public RegistrationFormVerificationWindow verifyStudentGender(String gender) {
//        tableResponsive.$(byText("Gender")).sibling(0).shouldHave(text(gender));
//        return  this;
//    }
//    public RegistrationFormVerificationWindow verifyStudentMobileNumber(String mobNumber) {
//        tableResponsive.$(byText("Mobile")).sibling(0).shouldHave(text(mobNumber));
//        return  this;
//    }
//    public RegistrationFormVerificationWindow verifyStudentBirthDate(String day, String month, String year) {
//        String birthDate = day + " " + (month.substring(0, 1).toUpperCase() + month.substring(1)) + "," + year;
//        tableResponsive.$(byText("Date of Birth")).sibling(0).shouldHave(text(birthDate));
//        return  this;
//    }
//    public RegistrationFormVerificationWindow verifyStudentSubject(String Subject) {
//        tableResponsive.$(byText("Subjects")).sibling(0).shouldHave(text(Subject));
//        return  this;
//    }
//    public RegistrationFormVerificationWindow verifyStudentHobbies(String hobbies) {
//        String formattedHobbies = Arrays.stream(hobbies.split("\\s*,\\s*|\\s+"))
//                .map(String::trim)
//                .collect(Collectors.joining(", "));
//        tableResponsive.$(byText("Hobbies")).sibling(0).shouldHave(text(formattedHobbies));
//        return  this;
//    }
//    public RegistrationFormVerificationWindow verifyStudentUploadedPicture(String filePath) {
//        String imgName = filePath.substring(filePath.lastIndexOf("/") + 1);
//        tableResponsive.$(byText("Picture")).sibling(0).shouldHave(text(imgName));
//        return  this;
//    }
//    public RegistrationFormVerificationWindow verifyStudentAddress(String address) {
//        tableResponsive.$(byText("Address")).sibling(0).shouldHave(text(address));
//        return  this;
//    }
//    public RegistrationFormVerificationWindow verifyStudentStateAndCity(String state, String city) {
//        String stateAndCity = state + " " + city;
//        tableResponsive.$(byText("State and City")).sibling(0).shouldHave(text(stateAndCity));
//        return  this;
//    }
}
