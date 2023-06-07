import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.component.verification.VerificationWindow;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTestsWithPOM extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    VerificationWindow verificationWindow = new VerificationWindow();

    @Test
    void mySuccessfulRegistrationFormTest(){

        registrationPage.openPage()
                .setFirstName("Addis")
                .setLastName("Ababa")
                .setEmail("addisababa@mail.com")
                .selectGender("other") // male, female, other
                .setUserMobNumber("1010101010") // 10 digits
                .setDateOfBirth("16", "february", "1992")
                .subjectSet("Computer Science")
                .pickHobbies("Sports,Reading, Music") // there are only: Sports, Reading, Music
                .uploadPicture(imgFilePath)
                .setCurrentAddress("Russia, Saint-Petersburg")
                .selectStateAndCity("NCR", "Gurgaon") // NCR : Delhi, Gurgaon, Noida; Uttar Pradesh : Arga, Lucknow, Merrut
                .pressSubmitButton();

        verificationWindow
                .verifyStudentFullName("Addis Ababa")
                .verifyStudentEmail("addisababa@mail.com")
                .verifyStudentGender("other")
                .verifyStudentMobileNumber("1010101010")
                .verifyStudentBirthDate("16", "february", "1992")
                .verifyStudentSubject("Computer Science")
                .verifyStudentHobbies("Sports,Reading, Music")
                .verifyStudentUploadedPicture(imgFilePath)
                .verifyStudentAddress("Russia, Saint-Petersburg")
                .verifyStudentStateAndCity("NCR", "Gurgaon");
    }
}
